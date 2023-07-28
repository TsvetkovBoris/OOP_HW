import java.util.List;
import java.util.Scanner;

public class Avtomat {
    public List<Product> product;
    public Scanner sc = new Scanner(System.in);

    public Avtomat(List<Product> product) {
        this.product = product;
    }

    public int numberPD() {
        System.out.println("Please number product(0 or 1): ");
        int numberPD = sc.nextInt();
        return numberPD;
    }
    public Product GetNumberPD (int numberPD) {
        System.out.printf("Selected product: %s", product.get(numberPD));
        return product.get(numberPD);
    }

    public void buyProduct (Product product) {
        System.out.printf("Please cash in machine %d: ", product.GetCash());
        int check = 0;
        while (true) {
            int cash = sc.nextInt();
            check += cash;
            if (check < product.GetCash()) {
                System.out.printf("not enough money, please more %d:", product.GetCash() - check);
            } else {
                System.out.println("Please your product. Bye Bye ");
                break;
            }
        }
    }
}