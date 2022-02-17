public class Analista extends Empregado {

    public Analista (String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    public double getBonusAnual() {
        return this.salario * 0.05;
    }
}