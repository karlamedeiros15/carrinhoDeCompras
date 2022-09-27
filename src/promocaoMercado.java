import java.util.Arrays;
import java.util.Scanner;

public class promocaoMercado {
    public static void main(String[] args) {
        String[] promoFrutas = { "banana", "maçã", "abacaxi", "melão", "mamão" };
        System.out.println("Qual fruta você deseja comprar hoje? ");
        Scanner scan = new Scanner(System.in);
        String compra = scan.nextLine();
        boolean frutaEmPromocao = false;
        for (String promoFruta : promoFrutas) {
            if (promoFruta.equalsIgnoreCase(compra)) {
                frutaEmPromocao = true;
                break;
            }
        }
        if (frutaEmPromocao) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Sua fruta não está em promoção hoje.");
        }
    }
}
