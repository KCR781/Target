import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cadeia de caractéres a serem invertidas");
        String original = scanner.nextLine();
        
        
    // Convertendo a string para um array de caracteres
        char[] chars = original.toCharArray();
        
    // Obtem o tamanho da string
        int extensao = chars.length;

    // Itera sobre a metade da string
        for (int i = 0; i < extensao / 2; i++) {
    // Troca os caracteres da posição i com os da posição comprimento - 1 - i

            // Armazena temporariamente o caractere na posição atual
            char temp = chars[i];
            // Substitui o caractere na posição atual pelo caractere na posição oposta
            chars[i] = chars[extensao - 1 - i];
            // Substitui o caractere na posição oposta pelo caractere armazenado temporariamente
            chars[extensao - 1 - i] = temp;
        }
        
    // Crias uma nova string a partir do array de caracteres invertido
        String invertida = new String(chars);
        
 
        System.out.println("Cadeia original: " + original);
        System.out.println("Cadeia invertida: " + invertida);
    }
}
// operação realizada pela inversão de ponteiros, ao invés de usar o StringBuilder.reverse()