package oops;
class Car {
    private String car_name;
    private int model_year;
    private double car_price;

    public Car(String name, int model_year, double car_price){
        this.car_name= name;
        this.model_year= model_year;
        this.car_price= car_price;
    }
    public String getCarname(){
        return car_name;
    }
    public int getModelyear(){
        return model_year;
    }
    public double getCarprice(){
        return car_price;
    }

    public void setCarname(String car_name){
        this.car_name=car_name;
    }
    public void setModelyear(int model_year){
        this.model_year=model_year;
    }
    public void setCarprice(double car_price){
        this.car_price=car_price;
    }
}

public class oops_19 {
    public static void main(String[] args) {
        Car obj = new Car("curvv",2025,1500000);
        System.out.println("initial detail values of Car");
        System.out.println(obj.getCarname()+", "+obj.getModelyear()+", "+obj.getCarprice());

        obj.setCarname("BMW");
        obj.setModelyear(2024);
        obj.setCarprice(6000000);

        System.out.println("car updated detail values");
        System.out.println(obj.getCarname()+", "+obj.getModelyear()+", "+obj.getCarprice());
    }
}
