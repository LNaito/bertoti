public class ClienteCenario1 {
    // Isso aqui é ruim pois faz todas as classes filhas herdar esse método, mesmo não o utilizando
    public void emprestimo(){
        System.out.println("Empréstimo disponível");
    }
}

class ClienteComum extends ClienteCenario1 {
    // Isso aqui é ruim pois sobrescreve o método
    public void emprestimo(){
        System.out.println("Empréstimo indisponível");
    }

    public static void main(String [] args) {
        ClienteComum novoCliente = new ClienteComum();

        novoCliente.emprestimo();
    }
}

class Empresa extends ClienteCenario1 {
    public static void main(String [] args) {
        Empresa novaEmpresa = new Empresa();

        novaEmpresa.emprestimo();
    }
}

class Aposentado extends ClienteCenario1 {
    public static void main(String [] args) {
        Aposentado novAposentado = new Aposentado();

        novAposentado.emprestimo();
    }
}

class Estudante extends ClienteCenario1 {
    public void emprestimo(){
        System.out.println("Empréstimo indisponível");
    }
    public static void main(String [] args) {
        Estudante novoEstudante = new Estudante();

        novoEstudante.emprestimo();
    }
}