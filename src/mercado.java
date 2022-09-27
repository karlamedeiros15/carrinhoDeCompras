import java.util.Arrays;
import java.util.Scanner;

public class mercado {
    public static void main(String[] args) {
        String[] frutas = new String[5];
        System.out.println("Insira a sua lista de compras:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            frutas[i] = scan.nextLine();
        }
        System.out.println("As frutas no seu carrinho são:");
        System.out.println(Arrays.toString(frutas));
    }
}
