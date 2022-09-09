import java.util.Hashtable;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int escolha;
        boolean sair_menu = false;

        System.out.println(CriarConta());

        do {
            MenuPrincipal();
            escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Cadastrar-se");
                    break;
                case 2:
                    System.out.println("Criar conta corrente");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (sair_menu == false);
    }
    private static void MenuPrincipal(){
        System.out.println(
        "******************************\n" +
        "*            MENU            *\n" +
        "*----------------------------*\n" +
        "* 1 - Cadastrar-se           *\n" +
        "* 2 - Criar conta correr     *\n" +
        "* 3 - Criar conta poupança   *\n" +
        "* 4 - Fazer deposito         *\n" +
        "* 5 - Sacar                  *\n" +
        "* 6 - Fazer transferência    *\n" +
        "* 7 - Sair                   *\n" +
        "******************************"
        );
        System.out.println(">");
    }

    private static Hashtable<String, String> CriarConta(){
        Hashtable<String, String> teste = new Hashtable<String, String>();

        teste.put("Um", "1");
        teste.put("Dois", "2");
        teste.put("Três", "3");

        return teste;

    }

}
