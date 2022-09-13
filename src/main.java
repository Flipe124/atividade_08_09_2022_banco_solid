import java.util.Hashtable;
import java.util.Scanner;

// MINHA
import conta.conta;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        conta conta = new conta();
        int escolha;
        boolean sair_menu = false;

        System.out.println(conta.getContas());

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
        "********************************\n" +
        "*              MENU            *\n" +
        "*------------------------------*\n" +
        "* 1 - Cadastrar-se             *\n" +
        "* 2 - Cadastrar conta corrente *\n" +
        "* 3 - Cadastrar conta poupança *\n" +
        "* 4 - Fazer deposito           *\n" +
        "* 5 - Sacar                    *\n" +
        "* 6 - Fazer transferência      *\n" +
        "* 7 - Sair                     *\n" +
        "********************************"
        );
        System.out.println(">");
    }

//    private static Hashtable<String, String> setCriarConta(String cpf, String nome){
//        Hashtable<String, String> conta = new Hashtable<String, String>();
//
//        conta.put(cpf, nome);
//
//        return conta;
//    }

//    private static void getCriarConta(){
//
//    }


}
