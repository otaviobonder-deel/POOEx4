public class Main {
    public static void main(String[] args){

        Produto bola = new Produto(1, "Bola", 10);
        Produto patinete = new Produto(2, "Patinete", 50);
        Produto computador = new Produto(3, "Computador", 2000);
        Produto mouse = new Produto(4, "Mouse", 25);

        Loja n = new Loja();
        n.add(String.valueOf(bola.getCodigo()), bola);
        n.add(String.valueOf(patinete.getCodigo()), patinete);
        n.add(String.valueOf(computador.getCodigo()), computador);
        n.add(String.valueOf(mouse.getCodigo()), mouse);

        String[] vendas = {"3", "2", "3", "3"};

        Venda venda1 = new Venda(vendas);

        System.out.println(venda1);
    }
}
