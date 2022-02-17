public class Empregado extends Pessoa {
    protected double salario;

    public Empregado(String nome, double salario, int idade) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumentarSalario() {
        this.salario = this.salario * 1.2;
    }
}