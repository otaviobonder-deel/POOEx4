import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        String nota = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
        double total = 0;
        for (String quantidade : venda.keySet()) {
            x = x + "\n" + "Produto: " + Loja.produtos.get(quantidade).getNome() + ",   Quantidade: " + venda.get(quantidade) + ",  Preço Unitário: " + Loja.produtos.get(quantidade).getPreco() + ",   Subtotal: " + Loja.produtos.get(quantidade).getPreco()*venda.get(quantidade);
            total = total + (Loja.produtos.get(quantidade).getPreco()*venda.get(quantidade));
        }
        nota = "Olá! Hoje é dia "+ LocalDate.now().format(formatter) + "\n" + "Aqui está a lista dos seus produtos comprados:\n" + x + "\nTotal da Compra: " + total;
        return nota;
    }
}
