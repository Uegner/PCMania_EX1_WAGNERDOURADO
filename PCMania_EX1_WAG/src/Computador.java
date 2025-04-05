public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistema;
    HardwareBasico[] hardwares;
    MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistema, HardwareBasico[] hardwares, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardwares = hardwares;
        this.memoriaUSB = memoriaUSB;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (HardwareBasico hw : hardwares) {
            System.out.println("Hardware: " + hw.nome + " - " + hw.capacidade);
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " - " + sistema.tipo + " bits");
        System.out.println("Acompanha: " + memoriaUSB.nome + " - " + memoriaUSB.capacidade + "GB");
        System.out.println("---------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
