class ProductsAndDiscountedProducts{
    public static void main(String[] args){
        DiscountedProduct product = new DiscountedProduct("Mouse", 2000, 15);
        
        product.displayInfo();
        System.out.println("Final Price = "+product.getPrice());
    }
}
