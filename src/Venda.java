import java.util.HashMap;
import java.util.Map;

public class Venda {
    private Map<String, Integer> venda = new HashMap<>();
    private Map<String, Produto> produtos = new HashMap<>();
    public Venda(String[] codigos) {
        for (String codigo : codigos){
            produtos.put(codigo, Produto())
            if (!venda.containsKey(codigo)){
                venda.put(codigo,1);
            } else {
                venda.put(codigo,venda.get(codigo)+1);
            }
        }
    }

    @Override
    public String toString() {
        String x = "";
        for (String quantidade : venda.keySet()) {
            x = x + "\n" + "Código: " + quantidade + " Quantidade: " + venda.get(quantidade) + " Preço: ";
        }
        return x;
    }
}
