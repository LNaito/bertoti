public interface Emprestimo {
    void emprestar(double valor);
}

class EmprestimoDisponivel implements Emprestimo {
    @Override
    public void emprestar(double valor) {
        System.out.println("Empréstimo disponível! Valor solicitado: R$ " + valor);
    }
}

class EmprestimoIndisponivel implements Emprestimo {
    @Override
    public void emprestar(double valor) {
        System.out.println("Empréstimo indisponível para este tipo de cliente.");
    }
}