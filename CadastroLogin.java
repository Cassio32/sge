package sge;
import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRAR USUÁRIO");

        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite sua Senha, no mínimo 8 carateres: ");
        String senha = scanner.nextLine();

        //transformando em array a string Nome Completo
        String[] usuario = nomeCompleto.split(" ");

        //pegando o último valor do array
        Integer valor = usuario.length - 1;

        //pegando a primeira letra do nome, dexando letras minusculas
        String letraNome = usuario[0];
        String letra = String.valueOf(letraNome.charAt(0));
        String UserletraMinuscula = letra+"_"+usuario[valor];
        UserletraMinuscula = UserletraMinuscula.toLowerCase();

        System.out.println("Nome Completo: "+nomeCompleto);
        System.out.println("Usuário: "+UserletraMinuscula);

        if(senha.length()>=8 && senha.matches("(.*)[A-Z]||(.*)[0-9]||(.*)[-, !, @](.*)")) {
            if(senha == senha.toLowerCase() || senha == senha.toUpperCase() ){
                System.out.println("Senha Invalida / Fraca!");
            }else {
                System.out.println("Senha Valida / Forte!");
            }

        }else {

            System.out.println("Senha Valida / Forte!");

        }


     }
    }

