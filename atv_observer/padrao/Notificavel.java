public interface Notificavel {
    void atualizar(String evento, double valor);
}

class NotificacaoEmail implements Notificavel {
    @Override
    public void atualizar(String evento, double valor) {
        System.out.println("[EMAIL] " + evento + " de R$ " + valor);
    }
}

class NotificacaoSMS implements Notificavel {
    @Override
    public void atualizar(String evento, double valor) {
        System.out.println("[SMS] " + evento + " de R$ " + valor);
    }
}

class NotificacaoApp implements Notificavel {
    @Override
    public void atualizar(String evento, double valor) {
        System.out.println("[APP] " + evento + " de R$ " + valor);
    }
}