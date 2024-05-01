import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println(Pedido.calculatingPrice_Drinks(3));
        
        System.out.println(Pedido.calculatingPrice_Food(2));
        
        System.out.println(Pedido.calculatingPrice_Candy(3));

        System.out.println(Pedido.calculatingPrice_ExclusiveItens(3));

        System.out.println(Pedido.calculatingPrice_Total());
        reader.close();
    }
}
