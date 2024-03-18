import java.util.Scanner;

public class EsCondicionalN4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código da operação (1 para perímetro, 2 para área, 3 para volume):");
        int codigoOperacao = input.nextInt();

        System.out.println("Digite o raio:");
        double raio = input.nextDouble();

        if (codigoOperacao == 1) {
            double perimetro = 2 * Math.PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
        } else if (codigoOperacao == 2) {
            double area = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
        } else if (codigoOperacao == 3) {
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
        } else {
                System.out.println("Código de operação inválido. Por favor, escolha 1, 2 ou 3.");
        }

        input.close();
    }
}