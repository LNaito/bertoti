public class ClienteCenario2 {

}

class ClienteComum extends ClienteCenario2 {
    public static void main(String [] args) {
        ClienteComum novoCliente = new ClienteComum();

    }
}

class Empresa extends ClienteCenario2 {
    // Isso aqui é ruim pois há a duplicação de código, dificultando mudanças e adições ao código
    public void emprestimo(){
        System.out.println("Empréstimo disponível");
    }
    
    public static void main(String [] args) {
        Empresa novaEmpresa = new Empresa();

        novaEmpresa.emprestimo();
    }
}

class Aposentado extends ClienteCenario2 {
    // Isso aqui é ruim pois há a duplicação de código, dificultando mudanças e adições ao código
    public void emprestimo(){
        System.out.println("Empréstimo disponível");
    }
    public static void main(String [] args) {
        Aposentado novAposentado = new Aposentado();

        novAposentado.emprestimo();
    }
}

class Estudante extends ClienteCenario2 {
    public static void main(String [] args) {
        Estudante novoEstudante = new Estudante();

    }
}