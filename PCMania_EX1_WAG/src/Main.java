import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do cliente
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        long cpf = scanner.nextLong();

        Cliente cliente = new Cliente(nome, cpf);

        int matricula = 2014;
        int escolha;

        do {
            // Menu de compra
            System.out.println("\nEscolha uma promoção:");
            System.out.println("1 - Promoção Apple");
            System.out.println("2 - Promoção Samsung");
            System.out.println("3 - Promoção Dell");
            System.out.println("0 - Finalizar compra");
            System.out.print("Opção: ");
            escolha = scanner.nextInt();

            if (escolha >= 1 && escolha <= 3) {
                Computador pc = criarPromocao(escolha, matricula);
                cliente.compraComputador(pc);
                System.out.println("Computador adicionado ao carrinho!");
            }
            else if ( escolha != 0 && escolha != 1 && escolha != 2 && escolha != 3 ) {
                System.out.println("Essa opção de promoção não está disponível!");
            }

        } while (escolha != 0);


        cliente.mostraCompras();
        scanner.close();
    }

    public static Computador criarPromocao(int codigo, int matricula) {
        switch (codigo) {
            case 1:
                return new Computador(
                        "Apple",
                        matricula,
                        new SistemaOperacional("Linux Ubuntu", 32),
                        new HardwareBasico[]{
                                new HardwareBasico("Pentium Core i3", 2200),
                                new HardwareBasico("Memória RAM", 8),
                                new HardwareBasico("HD", 500)
                        },
                        new MemoriaUSB("Pen-drive", 16)
                );

            case 2:
                return new Computador(
                        "Samsung",
                        matricula + 1234,
                        new SistemaOperacional("Windows 8", 64),
                        new HardwareBasico[]{
                                new HardwareBasico("Pentium Core i5", 3370),
                                new HardwareBasico("Memória RAM", 16),
                                new HardwareBasico("HD", 1000)
                        },
                        new MemoriaUSB("Pen-drive", 32)
                );

            case 3:
                return new Computador(
                        "Dell",
                        matricula + 5678,
                        new SistemaOperacional("Windows 10", 64),
                        new HardwareBasico[]{
                                new HardwareBasico("Pentium Core i7", 4500),
                                new HardwareBasico("Memória RAM", 32),
                                new HardwareBasico("HD", 2000)
                        },
                        new MemoriaUSB("HD Externo", 1000)
                );

            default:
                return null;
        }
    }
}
