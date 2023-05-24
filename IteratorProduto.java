
import java.util.Iterator;
import java.util.List;


public class IteratorProduto implements Iterator<Produto>{
    private List<Produto> produtos;
    private int indiceAtual;

    public IteratorProduto(List<Produto> produtos) {
        this.produtos = produtos;
        this.indiceAtual = 0;
    }

    public boolean hasNext() {
        return indiceAtual < produtos.size();
    }

    public Produto next(){
        if (hasNext()) {
            Produto produto = produtos.get(indiceAtual);
            indiceAtual++;
            return produto;
        }
        throw new IndexOutOfBoundsException("Não há mais produtos.");
    }
}
