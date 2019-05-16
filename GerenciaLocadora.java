import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GerenciaLocadora{

    private ArrayList<Locadora> locadoras = new ArrayList<>();
    private String tipoCliente;
    private int numPassageiros = -1;
    private ArrayList<Date> datasSeparadas = new ArrayList<>();
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");
    private int qtdMeioSemana; // quantidade de dias que são do meio da semana (considerando as dadas que o usuario forneceu)
    private int qtdFds; // quantidade de dias que são fds (considerando as dadas que o usuario forneceu)

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

    // pega a string inteira que o usuario digita e a processa para obter toda informacao necessaria
    public void processaEntrada(String entrada) throws ParseException{

        String[] comandos = entrada.split(":");
        if(comandos[0] == null || !comandos[0].equalsIgnoreCase("Normal") || !comandos[0].equalsIgnoreCase("Fidelidade")){
            System.out.println("Tipo de cliente inválido!");
        }
        else{
            setTipoCliente(comandos[0]);
        }

        if(Integer.parseInt(comandos[1]) == -1 || Integer.parseInt(comandos[1]) < 1 || Integer.parseInt(comandos[1]) > 7){
            System.out.println("Quantidade de passageiros invalída!");
        }
        else{
            setNumPassageiros(Integer.parseInt(comandos[1]));
        }

        if(comandos[2] == null){
            System.out.println("Datas inválidas!");
        }
        else{
            String datas = comandos[2];
            String[] datasSeparadasString = datas.split(",");

            // pega as datas em formato string, e as converte salvando em formato "DATE" num array de datas.
            for (String data : datasSeparadasString) {
                datasSeparadas.add(formatoData.parse(data));
            }

        }

    }

     //descobre qual o dia da semana de determinada data
     public void processaData(){
        
    }

    // calcula o preco do aluguel em todas locadoras com base na entrada do usuario
    public void cotacaoAluguel(){

    }

     // compara as cotacoes e ve qual a mais barata para o usuario
     public void comparaCotacao(){

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


    // ----------------------gets e sets dos atributos da classe----------------------//

    public String getTipoCliente(){
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    public int getNumPassageiros(){
        return numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
    public ArrayList<Date> getDatas(){
        return datasSeparadas;
    }
    public int getQtdMeioSemana(){
        return qtdMeioSemana;
    }
    public void setQtdMeioSemana(int qtdMeioSemana){
        this.qtdMeioSemana = qtdMeioSemana;
    }
    public int getQtdFds(){
        return qtdFds;
    }
    public void setQtdFds(int qtdFds){
        this.qtdFds = qtdFds;
    }
}