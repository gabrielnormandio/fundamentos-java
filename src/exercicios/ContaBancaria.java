package exercicios;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) throws ExcecaoAmigavel {
        if(valor > this.saldo) {
            throw new ExcecaoAmigavel("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + String.format("%.2f", this.saldo));
    }
}
