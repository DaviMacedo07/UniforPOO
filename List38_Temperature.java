import java.util.Scanner;

public class List38_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma certa temperatura: ");
        double temp = scanner.nextDouble();
        System.out.println(temp);
     //   System.out.println(String.format("%.2f", temp));
        System.out.println("Digite o número correspondente do que fazer com a temperatura: 1- Celsius -> Fahrenheit // 2-Fahrenheit -> Celsius  // 3 Kelvin -> Celsius //  4- Celsius -> Kelvin // 5- Kelvin -> Fahrenheit");
        int opt = scanner.nextInt();

        switch (opt) {
            case 1:  // Celsius to Fahr
                System.out.println(String.format("%.2f", (temp * 1.8) + 32) + " Fahrenheit");
                break;
            case 2: // Fahrenheit to Celsius
                System.out.println(String.format("%.2f", (temp - 32) / 1.8) + " Celsius");
                break;
            case 3: // Kelvin to Celsius
                System.out.println(String.format("%.2f", (temp - 273.15)) + " Celsius");
                break;
            case 4: // Celsius to Kelvin
                System.out.println(String.format("%.2f", (temp + 273.15)) + " Kelvin");
                break;
            case 5: // Kelvin to Fahrenheit
                System.out.println(String.format("%.2f", (1.8 * (temp - 273) + 32)) + " Fahrenheit");
                break;
            default:
                System.out.println("Opção Inválida");
                break;

        }

    }
}
