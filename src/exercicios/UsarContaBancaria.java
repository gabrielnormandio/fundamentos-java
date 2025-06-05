package exercicios;

public class UsarContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Gabriel Normandio", 5000);

        try {
            conta.mostrarSaldo();
            conta.sacar(7500);
            conta.mostrarSaldo();
            conta.sacar(5000);
            conta.mostrarSaldo();
            conta.sacar(2500);
            conta.mostrarSaldo();
        }
        catch (ExcecaoAmigavel e) {
            System.out.println(e.getMessage());
        }

    }
}
