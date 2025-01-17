import java.util.ArrayList;
import java.util.List;

public class Day11 {

    public static void main(String[] args) {
    
    }

    public static class Produto{
        private Integer id = 0;
        private String nome;
        private double preco;
        private Integer quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.id = id + 1;
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

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public static class Estoque{
            private List<Produto> produtos = new ArrayList<Produto>();
            
            public void addProduto(Produto produto) {
                produtos.add(produto);
            }

            public void removeProduto(Integer id){
                for(Produto produto : produtos){
                    if(produto.getId() == id){
                        produtos.remove(produto);
                    }
                }
            }

            public Produto atualizarProduto(Integer id){
                return 
            }



        }

    }



}
