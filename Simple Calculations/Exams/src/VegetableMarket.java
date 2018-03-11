import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     double priceveg = Double.parseDouble(console.nextLine());
     double pricefruits = Double.parseDouble(console.nextLine());
     int kgveg = Integer.parseInt(console.nextLine());
     int kgfruits = Integer.parseInt(console.nextLine());
     System.out.printf("%.14f", ((priceveg * kgveg) + (pricefruits * kgfruits))/1.94);
    }
}


