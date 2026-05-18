package eng3.observer.padrao;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private double saldo;
    private List<Notificavel> assinantes = new ArrayList<>();

    // Assinar notificações
    public void assinar(Notificavel n) {
        assinantes.add(n);
    }

    // Cancelar assinatura
    public void cancelar(Notificavel n) {
        assinantes.remove(n);
    }

    // Notifica todos os assinantes — sem saber quem são
    private void notificar(String evento, double valor) {
        for (Notificavel n : assinantes) {
            n.atualizar(evento, valor);
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        notificar("Depósito", valor);
    }

    public void sacar(double valor) {
        saldo -= valor;
        notificar("Saque", valor);
    }

    public double getSaldo() {
        return saldo;
    }
}