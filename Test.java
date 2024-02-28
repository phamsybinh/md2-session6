package BTVN;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" =============MEnu===========\n" +
                    "    \n" +
                    "1.Nhập vào thông tin sản phâm\n" +
                    "2.Hiển thị thông tin \n" +
                    "3.Hiển thị lãi xuất \n" +
                    "4.Thoát");
            System.out.println("\nNhap vao muc ban muon chon");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    product.enterInfo();
                    break;
                case 2:
                    product.showInfo();
                    break;
                case 3:
                    System.out.println("Lai tren mot don vi san pham la: "+product.interestRate()+"$");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai dinh dang");
                    break;
            }
        } while (true);
    }
}
