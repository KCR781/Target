import java.util.*;

public class App {

    public static void main(String[] args) {
        int fib0 = 0, fib1 = 1, proxfib = 0;
        
        Scanner dado = new Scanner(System.in);
        System.out.println("Digite um número e descubra se ele faz parte da sequência de Fibonacci: ");
        int nump = dado.nextInt();
        
        if (nump == 0) {
            System.out.println("O número "+ nump + " pertence à sequência de Fibonacci.");
            return;
        }
        
        while (proxfib <= nump) {
            proxfib = fib0 + fib1;
            fib0 = fib1;
            fib1 = proxfib;    
            
            if (nump == proxfib) {     
                System.out.println("O número "+ nump + " pertence à sequência de Fibonacci.");
                return;
            }
        }
        
        System.out.println("O número "+ nump + " não pertence à sequência de Fibonacci.");
    }
}
