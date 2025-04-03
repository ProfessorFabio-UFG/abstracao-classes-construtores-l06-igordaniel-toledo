
public class Produto {
    String nome;
    int  codseq;
    String tipo;
    int quant;
    int valor;

    public Produto(int codseq) {
        this.codseq = codseq;
    }

    public Produto(int codseq, String nome) {
        this(codseq);
        this.nome = nome;
    }

    public Produto(int codseq, String nome, int quant) {
        this(codseq, nome);
        this.quant = quant;
    }

    public Produto(int codseq, String nome, int quant, String tipo, int valor) {
        this(codseq, nome, quant);
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int qtd) {
        if (qtd > quant) {
            System.out.println("Estoque insuficiente!\n");
        } else {
            quant -= qtd;
            int total = qtd * valor;
            System.out.println("Venda realizada! Total: R$" + total + "\n");
        }
    }

    public void comprar(int qtd, int novoValor) {
        quant += qtd;
        valor = novoValor;
        System.out.println("Compra realizada! Nova quantidade: " + quant + ", Novo valor: R$" + valor + "\n");
    }

    public void comprar(int qtd) {
        quant += qtd;
        System.out.println("Compra realizada! Nova quantidade: " + quant + "\n");
    }

    public void inserir(String nome, int quant, String tipo, int valor) {
        this.nome = nome;
        this.quant = quant;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto outro) {
        return this.nome.equals(outro.nome) && this.tipo.equals(outro.tipo);
    }

    @Override
    public String toString() {
        return "Código: " + codseq + ", Nome: " + nome + ", Quantidade: " + quant + ", Tipo: " + tipo + ", Valor: R$" + valor+ "\n";
    }
}
