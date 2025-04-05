public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores;
    int totalComprados;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10]; // Máximo de 10 computadores comprados
        this.totalComprados = 0;
    }

    public void compraComputador(Computador pc) {
        if (totalComprados < computadores.length) {
            computadores[totalComprados] = pc;
            totalComprados++;
        } else {
            System.out.println("Limite de compras atingido!");
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < totalComprados; i++) {
            total += computadores[i].preco;
        }
        return total;
    }

    public void mostraCompras() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        System.out.println("Computadores adquiridos:");
        for (int i = 0; i < totalComprados; i++) {
            computadores[i].mostraPCConfigs();
        }
        System.out.println("Total da compra: R$" + calculaTotalCompra());
    }
}
