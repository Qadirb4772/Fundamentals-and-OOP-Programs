class DiscountedProduct extends Product{
    private double discountPercent;
    
    //parameterized constructor
    DiscountedProduct(String productName, double price, double discountPercent){
            super(productName, price);
            if(discountPercent > 0){
                this.discountPercent = discountPercent;
            }else{
                System.out.println("Discount Percent must be positive!!");
            }
    }
    
    @Override
    public double getPrice(){
        return (super.getPrice()*(100-discountPercent)/100);
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Discount Percent = "+this.discountPercent);
        System.out.println("Final Price = "+this.getPrice());        
    }
    
    

}
