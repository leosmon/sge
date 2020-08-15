import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

             String log = Login.getUser();
             String senha = Login.getSenha();



        System.out.println("deseja seguir para o login ? (S/N)");
        var resposta = scanner.next();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println(" ");
            System.out.println("=================Bem  vindo=====================");
            System.out.println("==================Ao Nosso======================");
            System.out.println("=======Sistema de Gerenciamento de Estoque======");
            boolean condicao = false;
            while (condicao == false) {
                System.out.print("Usuario :");
                String usuario = scanner.next();
                System.out.print("Senha   :");
                String password = scanner.next();

                if (usuario.equals(log) && password.equals(senha)) {
                    System.out.println("Login Realizado co sucesso");
                    condicao = true;
                }else {
                    System.out.println("Usuario ou senha invalidos");
                }
                }

            } else {
            System.out.println("Saindo.");
        }
        }
    }

