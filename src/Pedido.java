public class Pedido extends Itens {

    private int id_Pedido = 0;
    private String nome;
    private int qtdPedidos;
    private static Double priceTotal = 0.0;
    private static Double priceDrinks = 0.0;
    private static Double priceFood = 0.0;
    private static Double priceCandy = 0.0;
    private static Double priceExclusiveItens = 0.0;

    // Extends

    public Pedido(String[] drinks, double[] priceDrinks, String[] food, double[] priceFood, String[] candy, double[] priceCandy, String[] exclusiveItens, double[] priceExclusive_Itens, String nome){
        super();
        this.nome = nome;
    }

    // Metodos

    public static double calculatingPrice_Drinks(int option){
        switch (option) {
            case 0:
                priceDrinks += Itens.priceDrinks[0];
                break;
            case 1:
                priceDrinks += Itens.priceDrinks[1];
                break;
            case 2:
                priceDrinks += Itens.priceDrinks[2];
                break;
            case 3:
                priceDrinks += Itens.priceDrinks[3];
                break;
            case 4:
                priceDrinks += Itens.priceDrinks[4];
                break;
            default:
                break;
        }
        return priceDrinks;
    }

    public static double calculatingPrice_Food(int option){
        switch (option) {
            case 0:
                priceFood += Itens.priceFood[0];
                break;
            case 1:
                priceFood += Itens.priceFood[1];
                break;
            case 2:
                priceFood += Itens.priceFood[2];
                break;
        }
        return priceFood;
    }
    
    public static double calculatingPrice_Candy(int option){
        switch (option) {
            case 0:
                priceCandy += Itens.priceCandy[0];
                break;
            case 1:
                priceCandy += Itens.priceCandy[1];
                break;
            case 2:
                priceCandy += Itens.priceCandy[2];;
                break;
            case 3:
                priceCandy += Itens.priceCandy[3];
                break;
        }
        return priceCandy;
    }

    public static double calculatingPrice_ExclusiveItens(int option){
        switch (option) {
            case 0:
                priceExclusiveItens += Itens.priceExclusive_Itens[0];
                break;
            case 1:
                priceExclusiveItens += Itens.priceExclusive_Itens[1];;
                break;
            case 2:
                priceExclusiveItens += Itens.priceExclusive_Itens[2];
                break;
            case 3:
                priceExclusiveItens += Itens.priceExclusive_Itens[3];
                break;
        }
        return priceExclusiveItens;
    }

    public static double calculatingPrice_Total(){
        priceTotal = priceDrinks + priceCandy + priceExclusiveItens + priceFood;
        return priceTotal;
    }

    public void statusPedido(){
        System.out.println("Em Andamento...");
    }

    public void formaDePagamento(){
        
    }


    // Getters and Setters

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPedidos() {
        return qtdPedidos;
    }

    public void setQtdPedidos(int qtdPedidos) {
        this.qtdPedidos = qtdPedidos;
    }

    public Double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(Double priceTotal) {
        Pedido.priceTotal = priceTotal;
    }


    
}
