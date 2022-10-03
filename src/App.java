import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor em metros para coverter para centimetro: ");
        double metro = scan.nextDouble();
        
        scan.close();
        double metroCm = metro*100;
        System.out.println(metro + " e equivalente a " + metroCm + " cm");

    }
}
