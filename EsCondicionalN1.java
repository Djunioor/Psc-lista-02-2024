import java.util.Scanner;

public class EsCondicionalN1 {
    public static void main(String[] args) throws Exception {
        int numero1, numero2, numero3, maior, menor, media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        numero1 = input.nextInt();

        System.out.println("Digite o segudo nimero:" );
        numero2 = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numero3 = input.nextInt();
        maior = numero1;

        if (numero2 > maior) { 
            maior = numero2;
         }
         if (numero3 > maior) { 
            maior = numero3;
         } 
         menor = numero1;
         if (numero2 < menor) { 
            menor = numero2;
         }
        if (numero3 < menor) { 
            menor = numero3;
         }
      
            media = (numero1 + numero2 + numero3) / 3;
        

         System.out.println("O maior numero é: " + maior);     
         System.out.println("O menor numero é: " + menor);
         System.out.println("A media dos numero é: " + media);

         input.close();
    }
}
