package AV2Interfaces.Q1GerenciadorDepos;

public class PessoaFisica implements Gerenciador{

    private String name;
    private double salary;

    public PessoaFisica(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double GerenciadorDeImpostoDeRenda() {
      return this.salary * 0.45;
    }
}
