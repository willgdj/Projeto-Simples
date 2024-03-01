package entities;

public class Produto {
    public String nome;
    public int quantidade;

    public Produto() {

    }

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }


    public void addProduto(int quant, String nome1) {
        quantidade += quant;
        nome = nome1;
        if (quant < 3) {
            System.out.println("Estoque baixo, reponha os produtos! \n");
        }
    }

    public void removeProduto(int quant, String nome1) {
        quantidade -= quant;
        nome = nome1;
        if (quant < 3) {
            System.out.println("Estoque baixo, reponha os produtos! \n");
        }
    }

    @Override
    public String toString() {
        return "O produto " + nome +  " tem: " + quantidade + "\n";
    }
}
