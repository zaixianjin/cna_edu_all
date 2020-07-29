package com.example.demo;

public class ProductChanged {

    Long   productId;
    String productName;
    int    productStock;
    String eventType;

    // get/set 메서드

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public ProductChanged(){
        this.eventType = this.getClass().getSimpleName();
    }
}
