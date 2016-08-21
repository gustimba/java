import java.util.Scanner;

/**
 * Created by Gustimba on 12/08/2016.
 */
public class Cliente {
     private String cpf;
      private String nome;
      private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    Conta_Corrente conta = new Conta_Corrente();
       Scanner tc = new Scanner(System.in);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return cpf.equals(cliente.cpf);

    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }

    public void dados_cliente(){
         System.out.println("informe cpf");
         cpf = tc.next();
         System.out.println("informe seu nome:");
         nome = tc.next();
         System.out.println("informe sua idade:");
         idade = tc.nextInt();
         }
      public void mostrar_dados_cliente(){
          
     }
}
