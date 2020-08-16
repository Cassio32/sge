package sge;
import java.util.Scanner;

public class ValidarUsuarioSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ///EXEMPLO 'SUPERFICIAL' DE UMA BASE DE DADOS PARA VALIDAÇÃO
        String usuario = "c_silva";
        String senha = "123@cAss";

        //PEGANDO DADOS DE ENTRADA "USUARIO" E "SENHA"
        System.out.println("Digite o seu nome de Usuario: ");
        String usuarioValidar = scanner.nextLine();

        System.out.println("Digite sua Senha: ");
        String senhaValidar = scanner.nextLine();

        //VERIFICANDO OS DADOS NA BASE DE DADOS
        if (usuarioValidar.equals(usuario) && senhaValidar.equals(senha)){
            System.out.println("Parabéns Você está logado: "+usuario);
        }else{
            System.out.println("Desculpe, usuario ou senha Inválido(s)!");
        }

    }
}
