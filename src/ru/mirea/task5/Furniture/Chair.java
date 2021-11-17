package ru.mirea.task5.Furniture;

public class Chair extends Furniture {
    private int price;
    private String material;
    public Chair(String company, int price, String material){
        super(company);
        this.price = price;
        this.material = material;
    }
    public int getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }
    public void dispInfo(){
        System.out.println("Chair from " + "Company - " + super.getCompany() + "will cost " + getPrice());
    }
}
