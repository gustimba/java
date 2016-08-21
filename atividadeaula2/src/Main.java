import java.util.Scanner;
/**
 *
 * Created by Gustimba on 10/08/2016.
 */
public class Main {
      public static void main(String[]args) {

          Scanner tc = new Scanner(System.in);
          Conta_Corrente conta = new Conta_Corrente();
          Conta_Corrente conta2 = new Conta_Corrente();
          conta.setSaldo(45);
          conta.setNumero_conta(001);
          Cliente cli = new Cliente();
          cli.setNome("gustavo");
          conta.setTitular(cli);

          conta2.setSaldo(00);
          conta2.setNumero_conta(002);
          conta2.setTitular(cli);
          conta.criar_conta(20);
          System.out.println("saldo: "+conta.getLimite());
          conta.mostrar_saldo();

          conta.equals(007);

          conta.sacar(45);

      }
}
