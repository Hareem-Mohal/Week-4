import java.util.Scanner;

public class Shop {
    private String shopName;
    private String shopAddress;
    private Person owner;
    private Product[] productList=new Product[500];
    private static int productCount=0;
    private static double revenue;
    {
        productList[0]=new Product("Burger", 650,10);
        productCount++;
        productList[1]=new Product("Bread",60,267);
        productCount++;
        productList[2]=new Product("chicken",700,15);
        productCount++;
        productList[3] = new Product("mutton", 2000, 80);
        productCount++;
        productList[4]=new Product("coffee",1570,18);
        productCount++;

    }
    public Shop(String shopName, String shopAddress, Person owner) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.owner = owner;
    }
    public Shop(  Person owner , String shopAddress) {
        this.owner = owner;
        this.shopAddress = shopAddress;
        //this.productList = new Product[100];
    }

    public Shop(Person owner){
        this.owner = owner;
    }

    public Shop(String shopName){
        this.shopName = shopName;
    }

    public int findProduct(String id){
            for (int i = 0; i < productCount; i++) {
                if (productList[i] != null && productList[i].getId().equals(id)) {
                    return i;
                }
            }
            return -1;
        }
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ADD MENU");
        int x;

        do{ System.out.println("Enter product details");
            System.out.println("Enter product name");
            String name = sc.nextLine();
            System.out.println("Enter product price");
            float price = sc.nextFloat();
            System.out.println("Enter product quantity");
            int quantity = sc.nextInt();
            Product product = new Product(name, price, quantity);
            productList[productCount++] =product;
            System.out.println("Product added successfully:)");
            System.out.println("To add another product Enter 1");
            sc.nextLine();
            x = sc.nextInt();
            sc.nextLine();
        }while (x==1);

    }
    public void saleProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SALE MENU");
        System.out.println("Enter product ID you want to sale");
        String id = sc.nextLine();
        int index = findProduct(id);
        if (index != -1) {
        if (productList[index] != null) {
            productList[index].setQuantity(productList[index].getQuantity()-1);
            revenue= revenue+productList[index].getProductPrice();
            System.out.println("Product sold successfully");
        }}
        else System.out.println("Product not found");

    }
    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Menu");
        System.out.println("To search by id press 1");
        System.out.println("To search by name press 2");
        int x = sc.nextInt();
        sc.nextLine();
        switch (x) {
            case 1:
                System.out.print("Enter product ID: ");
                String id1 = sc.nextLine();
                for (int i = 0; i < productCount; i++) {

                    if (productList[i] != null && productList[i].getId().equals(id1)) {
                        System.out.println("Product found.");
                        System.out.println(productList[i].toString());
                        return ;
                    }
                }
                break;
            case 2:
                System.out.print("Enter product Name: ");
                String name = sc.nextLine();
                for (int i = 0; i < productCount; i++) {

                    if (productList[i] != null && productList[i].getProductName().equalsIgnoreCase(name)) {
                        System.out.println("Product Found:).");
                        System.out.println(productList[i].toString());
                        return;
                    }
                }
                System.out.println("Product not found:(");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    public void displayProducts() {
        for (int i = 0; i < productCount; i++) {
            if (productList[i] != null) {
                System.out.println(productList[i]);
                System.out.println("__________________");
            }
        }
    }

    public void removeProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remove Menu");
        System.out.println("Enter product ID you want to remove");
        String id = sc.nextLine();
        int index=findProduct(id);
        if( index != -1){
        if (productList[index] != null) {
            System.out.println(productList[index]);
            productList[index]=null;
            System.out.println("Product removed successfully:)");
        }}
        else System.out.println("Product not found");

    }
    public void modifyProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Modify Menu");
        System.out.println("Enter product ID you want to modify");
        String id = sc.nextLine();
        int index=findProduct(id);
        if (index != -1) {
        if (productList[index] != null) {
            productList[index].setProductName(sc.nextLine());
            productList[index].setProductPrice(sc.nextFloat());
            productList[index].setQuantity(sc.nextInt());
            System.out.println("Product Modified Successfully:)");
        }}
        else System.out.println("Product not found");
    }
    public void revenue(){
        System.out.println("Total Revenue:"+revenue);
    }
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void shopOwner(){
        System.out.println("Owner Details:"+new Person(owner.getName(), owner.getEmail()));
    }


}

