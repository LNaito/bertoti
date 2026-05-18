public class ClientePadrao {
    private String nome;
    private Emprestimo estrategiaEmprestimo; // referência à estratégia
 
    public ClientePadrao(String nome, Emprestimo estrategiaEmprestimo) {
        this.nome = nome;
        this.estrategiaEmprestimo = estrategiaEmprestimo;
    }
 
    // Permite trocar a estratégia em tempo de execução
    public void setEstrategiaEmprestimo(Emprestimo estrategiaEmprestimo) {
        this.estrategiaEmprestimo = estrategiaEmprestimo;
    }
 
    // Delega a execução para a estratégia configurada
    public void solicitarEmprestimo(double valor) {
        System.out.print(nome + ": ");
        estrategiaEmprestimo.emprestar(valor);
    }
 
    public String getNome() {
        return nome;
    }
}
