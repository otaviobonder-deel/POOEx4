import java.util.ArrayList;

public class Loja {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja() {
    }
    public void add(Produto produto) {
        produtos.add(produto);
    }
}
