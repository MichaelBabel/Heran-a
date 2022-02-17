public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, double salario,  int idade,
                    double comissao) {
        super(nome, salario, idade);
        this.comissao = comissao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void aumentarComissao() {
        if (this.comissao < 0.30) {
            this.comissao = this.comissao * 1.2;
        }
    }
}