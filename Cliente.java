import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Celular", 1500.0));
        produtos.add(new Produto("Notebook", 3000.0));
        produtos.add(new Produto("TV", 2000.0));
        produtos.add(new Produto("Fones de Ouvido", 100.0));

        
        Iterator<Produto> iterator = new IteratorProduto(produtos);

        
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println("Nome: " + produto.getNome() + ", Preço: R$" + produto.getPreco());
        }
    }
}
