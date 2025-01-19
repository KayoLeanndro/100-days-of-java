import java.util.ArrayList;
import java.util.List;

public class Day11 {

    public static void main(String[] args) {
        Estoque manager = new Estoque();
        manager.addProduto(new Produto(1, "Produto 1", 10.0, 5));
        manager.addProduto(new Produto(2, "Produto 2", 20.0, 3));

        Produto novoProduto = new Produto(null, "Produto 1 Atualizado", 15.0, 10);
        Produto atualizado = manager.atualizarProduto(1, novoProduto);

        System.out.println("Produto atualizado: " + atualizado.getNome());
        System.out.println("Lista de produtos: ");
        for (Produto p : manager.getProdutos()) {
            System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getPreco() + " - " + p.getQuantidade());
        }
    }
}

class Produto {
    private Integer id;
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(Integer id, String nome, Double preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(Integer id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }

    public Produto atualizarProduto(Integer id, Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);

            if (p.getId().equals(id)) {
                if (produto.getNome() == null || produto.getNome().isEmpty()) {
                    throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
                }
                if (produto.getPreco() == null || produto.getPreco() < 0) {
                    throw new IllegalArgumentException("O preço do produto não pode ser nulo ou negativo.");
                }
                if (produto.getQuantidade() == null) {
                    throw new IllegalArgumentException("A quantidade do produto não pode ser nula.");
                }

                produto.setId(id);
                produtos.set(i, produto); 
                return produto;
            }
        }
        throw new IllegalArgumentException("Produto com o ID " + id + " não encontrado.");
    }
}
