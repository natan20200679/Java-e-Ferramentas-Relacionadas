/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Crie uma classe Login com a seguinte modelagem:
 
Login:

private String usuario -> Determina o nome do usuário
  
private String senha -> Determina a senha do usuário.
 
E os métodos:
  
public Login(String _usuario, String _senha) {} -> Construtor padrão 

public void setSenha (String _senha) {} -> Troca a senha do usuário
        
public boolean fazerLogin(String _usuario, String _senha) {} -> Deve receber informações de 
usuário e senha e compara-las com as da classe. Caso sejam realmente iguais, deve retornar 
verdadeiro, ou então deve lançar uma nova exceção dizendo qual credencial está errada, tratar 
essa exceção dentro do próprio método imprimindo o erro em tela e por fim retornar false.

Ex:

try {
    if(<<usuário incorreto>>) { 
        throw new Exception(“Usuário incorreto”); 
    } 
    catch(Exception e) { 
        System.out.println(“Erro”); 
    } 
}
 
Feito isso, crie uma classe para testar a inicialização de um objeto do tipo Login e que utilize o 
método fazerLogin, com informações digitadas pelo usuário.
 */
package excecoes;

public class E3 {

    public static void main(String[] args) throws Exception {
        
        Login login = new Login("natan", "1234");
        
        login.fazerLogin("natan", "");
        System.out.println("Usuário Está Logado");
    
    }

}

class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {

        this.usuario = usuario;
        this.senha = senha;

    }

    public void setSenha(String senha) {

        this.senha = senha;

    }

    public boolean fazerLogin(String usuario, String senha) throws Exception {

        if (usuario != this.usuario && senha != this.senha) {

            throw new Exception("Usuário e Senhas Incorretos");

        } else if (usuario != this.usuario) {

            throw new Exception("Usuário Incorreto");

        } else if (senha != this.senha) {

            throw new Exception("Senha Incorreta");

        }

        return true;

    }

    @Override
    public String toString() {

        return "Login{" + "usuario=" + usuario + ", senha=" + senha + '}';

    }

}
