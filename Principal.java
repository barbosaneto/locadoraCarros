import java.util.Scanner;

public class Principal {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        GerenciaLocadora gerencia = new GerenciaLocadora();
        gerencia.criaLocadoras();

        System.out.println("Bem vindo ao sistema da Locadora de Veiculos!");
        System.out.println("");
        System.out.println("Para fazer um orçamento, entre com os dados no formato a seguir:");
        System.out.println("<TipoCliente>:<Quantidade_Passageiros>:<Data1>,<Data2>...");
        System.out.println("");
        System.out.println("- Onde \"TipoCliente\" pode ser \"Normal\" ou \"Fidelidade\".");
        System.out.println("- Onde \"Quantidade_Passageiros\" deve ser um número inteiro entre 1 e 7.");
        System.out.println("- Onde \"data\" deve seguir o formato de DD-MM-AAAA.");
        System.out.println("");
        System.out.print(">");
        String comando = scan.nextLine();

        gerencia.processaEntrada(comando);

    }
}