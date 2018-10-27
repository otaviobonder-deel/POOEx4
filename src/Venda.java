import java.util.HashMap;
import java.util.Map;

public class Venda {
    private Map<String, Integer> venda = new HashMap<>();
    public Venda(String[] codigos) {
        for (String codigo : codigos){
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
        double total = 0;
        for (String quantidade : venda.keySet()) {
            x = x + "\n" + "Produto: " + Loja.produtos.get(quantidade).getNome() + ", Quantidade: " + venda.get(quantidade) + ", Preço Unitário: " + Loja.produtos.get(quantidade).getPreco() + ", Subtotal: " + Loja.produtos.get(quantidade).getPreco()*venda.get(quantidade);
            total = total + (Loja.produtos.get(quantidade).getPreco()*venda.get(quantidade));
        }
        x = x + "\nTotal da Compra: " + total;
        return x;
    }
}
