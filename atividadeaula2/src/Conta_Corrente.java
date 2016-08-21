import java.util.Scanner;

/**
 * Created by Gustimba on 12/08/2016.
 */
public class Conta_Corrente {
   private double saldo;
    private int numero_conta;
    private int senha;
    private double limite;
    private Cliente Titular;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Cliente getTitular() {
        return Titular;
    }

    public void setTitular(Cliente titular) {
        Titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta_Corrente that = (Conta_Corrente) o;

        if (numero_conta != that.numero_conta) return false;
        return Titular.equals(that.Titular);

    }

    @Override
    public int hashCode() {
        int result = numero_conta;
        result = 31 * result + Titular.hashCode();
        return result;
    }
    public void criar_conta(int idade) {
        Cliente cli = new Cliente();

        if ( idade >= 60) {
            limite = 300;
        }else {
            limite = 200;
        }
    }
    boolean sacar(double v) {
        this.saldo -= v;
        if (saldo > 0) {
            System.out.println("saque efetuado" + v);
            System.out.println("saldo da conta é:" + this.saldo);
        }
        return true;
    }




      boolean  deposito(double v){
          this.saldo += v;
          System.out.println("depositar ok"+v);
          System.out.println("quanto depositor"+v);
          return true;
      }
      boolean transferir (Conta_Corrente destino,double v){
          this.saldo -= v;
          destino.deposito(v);
          System.out.println("saldo da conta é:"+this.saldo);
          return true;
      }
      boolean transferir(double v,Conta_Corrente destino){
          this.sacar(v);
          destino.deposito(v);
          System.out.println("saldo da conta é:"+this.saldo);
          return true;
      }

      public void mostrar_saldo(){

          System.out.println("saldo atual"+this.getSaldo());
      }
}
