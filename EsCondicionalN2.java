
import java.util.Scanner;

public class EsCondicionalN2 {
    public static void main(String[] args) {
        double valorPago, valorCompra, troco;
        int qtdNptas, notas; 
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        valorCompra = input.nextDouble();

        System.out.println("Digite o valor pago: ");
        valorPago = input.nextDouble();

        troco = valorPago - valorCompra;

        if (valorPago < valorCompra) { 
            System.out.println("Quantia insuficiente para realizar a compra");
    } else { 
        int nota[] = {50, 20, 10, 5, 2, 1};

            System.out.println("Troco em R$ " + troco);
        
    
    input.close();
    }
 }
 }