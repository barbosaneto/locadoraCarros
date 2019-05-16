import java.util.ArrayList;

public class GerenciaLocadora{

    ArrayList<Locadora> locadoras = new ArrayList<>();

    public void criaLocadoras(){
        //cria locadora southcar
        Veiculo compacto = new Veiculo(4, "Ford Ka", "compacto");
        Locadora southCar = new Locadora("SouthCar", compacto, 210.00, 150.00, 200.00, 90.00);

        //cria locadora westcar
        Veiculo esportivo = new Veiculo(2, "Lamborghini Gallardo", "esportivo");
        Locadora westCar = new Locadora("WestCar", esportivo, 530.00, 150.00, 200.00, 90.00);

        //cria locadora southcar
        Veiculo suv = new Veiculo(7, "Land Rover Discovery", "SUV");
        Locadora northCar = new Locadora("NorthCar", suv, 630.00, 580.00, 600.00, 590.00);

        //salva locadoras criadas no array de locadoras
        locadoras.add(southCar);
        locadoras.add(westCar);
        locadoras.add(northCar);

    }

    // busca uma locadora dada o seu nome. Caso não encontre, retorna null
    public Locadora getLocadora(String nomeLocadora){
        for (Locadora loc : locadoras) {
            if(loc.getNomeLocadora().equalsIgnoreCase(nomeLocadora)){
                return loc;
            }
        }
        return null;
    }

    // calcula o preco do aluguel em todas locadoras com base na entrada do usuario
    public void cotacaoAluguel(){

    }

    // compara as cotacoes e ve qual a mais barata para o usuario
    public void comparadaCotacao(){

    }

    // pega a string inteira que o usuario digita e a processa para obter toda informacao necessaria
    public void processaEntrada(String entrada){

        String[] comandos = entrada.split(":");
        String tipoCliente = comandos[0];
        if(tipoCliente == null || !tipoCliente.equalsIgnoreCase("Normal") || !tipoCliente.equalsIgnoreCase("Fidelidade")){
            System.out.println("Tipo de cliente inválido!");
        }

        int numPassageiros = -1;
        numPassageiros = Integer.parseInt(comandos[1]);
        if(numPassageiros == -1 || numPassageiros < 1 || numPassageiros > 7){
            System.out.println("Quantidade de passageiros invalída!");
        }

        String datas = comandos[2];
        if(datas == null){
            System.out.println("Datas inválidas!");
        }
        
        processaData(datas);

    }
    //descobre qual o dia da semana de determinada data
    public void processaData(String data){

    }
}