package model;

/*
Các quy tắc đặt tên:
Fields: 
- idProduct: int
- nameProduct: String
- categoryProduct: String
- price: double
- stockQuantity: int
Method:  
+ updateStockQuantity(): void 
*/

public class Product {
    private int idProduct;
    private String nameProduct;
    private String categoryProduct; 
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(int idProduct, String nameProduct, String categoryProduct, double price, int stockQuantity) {
        this.idProduct=idProduct;
        this.nameProduct=nameProduct;
        this.categoryProduct=categoryProduct;
        this.price=price;
        this.stockQuantity=stockQuantity; 
    }
    //get để đọc 
    //setter sửa giá trị
    
    
    public int getidProduct() {
        return idProduct;
    }
    public void setteridProduct(int idProduct){
        if (idProduct > 0){
            this.idProduct=idProduct;
        }
    }
    public String getnameProduct(){
        return nameProduct;
    }
    public void setternameProduct(String nameProduct){
        if (nameProduct != null){ //khong de rong
            this.nameProduct=nameProduct;
        }
    }
    public String getcategoryProduct(){
        return categoryProduct;
    }
    public void settercategoryProduct(String categoryProduct){
        this.categoryProduct=categoryProduct;
    }
    public double getprice(){
        return price;
    }
    public void setterprice (double price){
        if (price > 0)
        {
            this.price=price;
        }
    }
    public int getstockQuantity(){
        return stockQuantity;
    }
    public void setterstockQuantity(int stockQuantity){
        if (stockQuantity > 0)
        {
            this.stockQuantity=stockQuantity;
        }
    }
    //method
    public void updateStockQuantity(int quantity) {
        if (stockQuantity + quantity >= 0) //kho khong am
        this.stockQuantity=stockQuantity;
    }
}

