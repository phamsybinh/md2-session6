package BTVN;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private Float sellPrice;
    private Float importPrice;

    public Product() {
    }

    public Product(String productId, String productName, Float sellPrice, Float importPrice) {
        this.productId = productId;
        this.productName = productName;
        this.sellPrice = sellPrice;
        this.importPrice = importPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Float importPrice) {
        this.importPrice = importPrice;
    }
//    phương thức nhập thông tin sản phẩm
    public void enterInfo(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap thong tin san pham ");
            System.out.println("Ten san pham");
            productName = sc.nextLine();
            System.out.println("Ma san pham");
            productId = sc.nextLine();
            System.out.println("Gia nhap");
            importPrice = new Scanner(System.in).nextFloat();
            System.out.println("Gia ban");
            sellPrice = new Scanner(System.in).nextFloat();
            System.out.println("Ban co muon nhap tiep tuc? (c/k)");
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("k"))
                break;
        } while (true);
    }
    public void showInfo(){
        System.out.println("Ten san pham: "+productName+" Ma san pham: "+productId+" Gia ban: "+sellPrice+" $"+" Gia nhap: "+importPrice+" $");
    }
    public Float interestRate(){
        return sellPrice-importPrice;
    }
}
