public class Itens {

    // Table Of Itens

    // Drinks
    private static String[] drinks = {"0 - Extreme Coffee", "1 - Coffee", "2 - Capuccino", "3 - LonfShake", "4 - Lonf Tonf Soda"};
    protected static double[] priceDrinks = {2.50, 2.0, 4.75, 8.0, 4.0};
    // Food
    private static String[] food = {"0 - LonfBurguer", "1 - LonfDonuts", "2 - French Fries"};
    protected static double[] priceFood = {4.0, 2.75, 5.0};
    // Candy
    private static String[] candy = {"0 - Lonf Chocolate", "1 - Lonf Gum", "2 - Coconut and Chocolate Cake", "3 - Lonf Misterious Candy"};
    protected static double[] priceCandy = {5.0, 1.75, 8.0, 12.50};
    // Exclusive
    private static String[] exclusiveItens = {"0 - Package 500g Coffee Lonf", "1 - Ticket for Battle Robots", "2 - Lonf Hackaton", "3 - Misterious Box"};
    protected static double[] priceExclusive_Itens = {26.50, 5.50, 10.0, 20.0};

    // Methods

    public static void showOptions_To_Select_Category(){
        System.out.println("1 - Drinks");
        System.out.println("2 - Food");
        System.out.println("3 - Candy");
        System.out.println("4 - Exclusive Itens");
    }

    public static void showDrinks(){
        for (int i = 0; i < drinks.length; i++){
            System.out.println(drinks[i] + " - $" + priceDrinks[i]);
        }
    }

    public static void showFood(){
        for (int i = 0; i < food.length; i++){
            System.out.println(food[i] + " - $" + priceFood[i]);
        }
    }

    public static void showCandy(){
        for (int i = 0; i < candy.length; i++){
            System.out.println(candy[i] + " - $" + priceCandy[i]);
        }
    }

    public static void showExclusiveItens(){
        for (int i = 0; i < exclusiveItens.length; i++){
            System.out.println(exclusiveItens[i] + " - $" + priceExclusive_Itens[i]);
        }
    }

    // Getters to Itens

    public String[] getDrinks() {
        return drinks;
    }

    public double[] getPriceDrinks() {
        return priceDrinks;
    }

    public String[] getFood() {
        return food;
    }

    public double[] getPriceFood() {
        return priceFood;
    }

    public String[] getCandy() {
        return candy;
    }

    public double[] getPriceCandy() {
        return priceCandy;
    }

    public String[] getExclusiveItens() {
        return exclusiveItens;
    }

    public double[] getPriceExclusive_Itens() {
        return priceExclusive_Itens;
    }  
}
