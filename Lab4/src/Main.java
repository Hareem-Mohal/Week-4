import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Shop shop=new Shop("Khan Grocery store","Green chowk Mingora,Swat",new Person("Hareem Mohal","hareemmohal@gmail.com"));
        System.out.println("Welcome to :"+shop.getShopName());
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.println("-----------------------");
            System.out.println("         Menu          ");
            System.out.println("-----------------------");
            System.out.println("Press 1 to Add Product:");
            System.out.println("Press 2 to Sale Product:");
            System.out.println("Press 3 to Remove Product:");
            System.out.println("Press 4 to Display Product:");
            System.out.println("Press 5 to Modify Product");
            System.out.println("Press 6 to Search Product");
            System.out.println("Press 7 to View Revenue");
            System.out.println("_______________________\n");

            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    shop.addProduct();
                    break;
                case 2:
                    shop.saleProduct();
                    break;
                case 3:
                    shop.removeProduct();
                    break;

                case 4:
                    shop.displayProducts();
                    break;

                case 5:
                    shop.modifyProduct();
                    break;

                case 6:
                    shop.searchProduct();
                    break;

                case 7:
                    shop.revenue();
                    break;


                case 0:
                    System.exit(0);
                    break;
                default:
            }


        }



    }

}