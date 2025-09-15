package sistema_pc;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 500, 4, 2.5f);

        SistemaOperacional so = new SistemaOperacional(pc);

        Programa p1 = new Programa(8, 100, 2, 5000);   
        Programa p2 = new Programa(4, 600, 2, 2000);   
        Programa p3 = new Programa(32, 100, 2, 3000);  

        System.out.println("=== Teste Programa 1 ===");
        so.executarPrograma(p1);

        System.out.println("\n=== Teste Programa 2 ===");
        so.executarPrograma(p2);

        System.out.println("\n=== Teste Programa 3 ===");
        so.executarPrograma(p3);
    }
}