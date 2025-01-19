# Day 11

## Desafio:
Crie uma classe em Java para representar um sistema de gestão de estoque com operações de adicionar, remover e atualizar itens.

**Resultado:**

```java

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