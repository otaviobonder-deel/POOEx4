import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Loja {

    public static Map<String, Produto> produtos = new HashMap<>();

    public Loja() {
    }
    public void add(String codigo, Produto produto) {
        produtos.put(codigo, produto);
    }


}
