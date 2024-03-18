import java.util.Scanner;;

public class EsCondicionalN3 {
    public static void main(String[] args) {
        double a, b, c, delta, raiz1, raiz2, raiz;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = input.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = input.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = input.nextDouble();

    if (a ==0) { 
         System.out.println("O coeficiente nao pode ser zero. ");
     return;
             }

         delta = Math.pow(b, 2) -4 * a * c; 

     if (delta < 0) { 
        System.out.println("Não possui raiz real. ");
        }
    else if (delta == 0)  { 
         raiz = - b / (2 * a);
         System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            
        raiz1 =(- b + Math.sqrt(delta)) / (2 * a);
        raiz2 =(- b - Math.sqrt(delta)) / (2 * a);
        System.out.println("A equação possui duas raízes reais:");
        System.out.println(" O valor da Raiz 1: " + raiz1);
        System.out.println("O valor da Raiz 2: " + raiz2);

        input.close();
    
         }

    }
}
