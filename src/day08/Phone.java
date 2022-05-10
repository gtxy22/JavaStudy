package day08;

public class Phone {

    String brand;
    double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call(){
        System.out.println("��绰");
    }
    public void playGame(){
        System.out.println("����Ϸ");
    }


    /**
     * ��ȡ
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * ����
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * ��ȡ
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * ����
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{brand = " + brand + ", price = " + price + "}";
    }
}
