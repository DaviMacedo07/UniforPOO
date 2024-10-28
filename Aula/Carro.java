package Aula;

public class Carro {
    // alt + insert
    private String nameCar;
    private String corCar;
    private double anoCar;

    public double getAnoCar() {
        return anoCar;
    }

    public void setAnoCar(double anoCar) {
        this.anoCar = anoCar;
    }

    public Carro(String nameCar, String corCar, double anoCar) {
        this.nameCar = nameCar;
        this.corCar = corCar;
        this.anoCar = anoCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getCorCar() {
        return corCar;
    }

    public void setCorCar(String corCar) {
        this.corCar = corCar;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nameCar='" + nameCar + '\'' +
                ", corCar='" + corCar + '\'' +
                ", anoCar=" + anoCar +
                '}';
    }

    public void ligarCarro() {
        System.out.println("O carro está ligado ! VRUM VRUM");
    }
}
