
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

        System.out.println(conta);// TESTE

        do {
            MenuPrincipal();
            escolha = scan.nextInt();

            switch (escolha){
                case 1:
                    scan.nextLine();// PREVENIR ERRO;

                    System.out.println("Informe seu CPF:");
                    conta.setCpf(scan.nextLine());

                    System.out.println("Informe seu nome:");
                    conta.setNome(scan.nextLine());

                    System.out.println(conta.getCpf());
                    break;
                case 2:
                    System.out.println("Criar conta corrente");
                    break;

                case 7:
                    sair_menu = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (sair_menu == false);
        System.out.println("Saiu.");
    }

    public static void MenuPrincipal() {
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
    }
}
