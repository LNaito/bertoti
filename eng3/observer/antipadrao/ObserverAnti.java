package eng3.observer.antipadrao;
class NotificacaoEmail {
    public void enviarEmail(String evento, double valor) {
        System.out.println("[EMAIL] " + evento + " de R$ " + valor);
    }
}

class NotificacaoSMS {
    public void enviarSMS(String evento, double valor) {
        System.out.println("[SMS] " + evento + " de R$ " + valor);
    }
}

class NotificacaoApp {
    public void enviarPush(String evento, double valor) {
        System.out.println("[APP] " + evento + " de R$ " + valor);
    }
}

public class ObserverAnti {
    private double saldo;

    // Ruim: a Conta depende concretamente de cada classe de notificação
    private NotificacaoEmail email = new NotificacaoEmail();
    private NotificacaoSMS sms = new NotificacaoSMS();
    private NotificacaoApp app = new NotificacaoApp();

    public void depositar(double valor) {
        saldo += valor;
        // Ruim: para adicionar um novo canal, tem que mexer aqui
        email.enviarEmail("Depósito", valor);
        sms.enviarSMS("Depósito", valor);
        app.enviarPush("Depósito", valor);
    }

    public void sacar(double valor) {
        saldo -= valor;
        email.enviarEmail("Saque", valor);
        sms.enviarSMS("Saque", valor);
        app.enviarPush("Saque", valor);
    }

    public static void main(String[] args) {
        ObserverAnti conta = new ObserverAnti();
        conta.depositar(500.0);
        conta.sacar(200.0);
    }
}