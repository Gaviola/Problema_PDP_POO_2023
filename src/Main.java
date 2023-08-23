public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Facu", "Gaviola");
        Cliente cliente2 = new Cliente();

        System.out.println(cliente);
        System.out.println();
        System.out.println(cliente2);
    }
}