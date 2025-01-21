package varEx;

import java.util.Arrays;
import java.util.Scanner;

class ProductOrder {
    String productName;
    int price;
    int quantity;
}
public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요.");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번쨰 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();


            productOrders[i] =  createProduct(productName, price, quantity);
        }

        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결재 금액 : " + totalAmount);
    }

    static ProductOrder createProduct(String productName, int price, int quantity) {

        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.quantity * productOrder.price;
        }

        return totalAmount;
    }
}
