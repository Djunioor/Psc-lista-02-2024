import java.util.Scanner;

public class EsCondicionalN5 {
     
     
    public static void main(String[] args) {
        double numero1, numero2, resultado;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        numero1 = input.nextDouble();
        System.out.println("Informe o segundo numero: ");
        numero2 = input.nextDouble();
        System.out.println("Informe a tipo de operação: +, -, *, /");
        char operacao = input.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("O resultado a Adição: " + resultado);
                break;
            case '-':
            resultado = numero1 - numero2;
            System.out.println("O resultado a subtração: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("O resultado de multiplicação: " + resultado);
                break;
            case '/':
            if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
            System.out.println("O valor da divisão: " + resultado);




        input.close();
   }   
 }
  }