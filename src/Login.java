import java.util.Scanner;

public class Login {

    static String getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Seu nome completo:");
        //variavel nome vai receber o nome do usuario
        String nome = scanner.nextLine();

        // aqui vamos quebrar o nome para juntar a primeira letra no primeiro nome com o sobrenome
        String[] qubraNome = nome.split(" ");
        String letra = String.valueOf(qubraNome[0].charAt(0));


        // variavel log recebe o nome gerado para o usuario
        String log = letra + "_" + qubraNome[qubraNome.length-1];
        System.out.println("Seu nome de usuario é :"+log);

        return log;

    }

    static String getSenha() {
        Scanner scanner = new Scanner(System.in);


         System.out.print("Digite uma senha: ");

         // condição do whlie
        boolean condicao = false;
        while (condicao == false) {


            //string senha recebe a senha do usuario
            String senha = scanner.next();


            // checando e validando a senha do usuario
            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
            System.out.println("Senha valida Usurio cadastrado");
            return senha;
            } else {
            System.out.println("A Senha Precisa Ter 8 caracteres e precisa conter ao menos 1 dos caracteres # ou @ ou !");
            System.out.print("Digite uma senha valida : ");

            }

        }

        return null;

    }



}