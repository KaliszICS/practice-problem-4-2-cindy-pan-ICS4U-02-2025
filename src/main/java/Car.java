/**
    * This is a program that collects the make, model, year, and price of a car
    * @author Cindy Pan 
    * @version 17.0.1
 */
class Car{
    private String make;
    private String model;
    private int year;
    private double price;
    /**
 * Constructor: Special method that is called to make a variable initialized
 * @param make1  String, a data that is being put into the make variable
 * @param model1 String, this is being recorded into the model variable
 * @param year1 int, data that is put into the year variable
 * @param price1 double, data that is put into the price variable
 */
    public Car(String make1, String model1, int year1, double price1){
        this.make=make1;
        this.model=model1;
        this.year=year1;
        this.price=price1;
    }
/**
 * Getter: used to access or *get* the private/instance variable
 * @return getMake: outputs the make of the car, String
 * @return getModel: returns the model of the car, String
 * @return getYear: returns the year of the car, int
 * @return getPrice: returns the price of the car, double
 */
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

/**
 * settters: a method that sets and updates the instance variables 
 * @param make2 a String variable used to replace the value stored in the make variable
 * @param model2 a String variable used to replace the value stored in the model variable
 * @param year2 an int variable used to replace the value stored in the year variable
 * @param price2 a double variable used to replace the value stored in the price variable
 */
    public void setMake(String make2){
        this.make=make2;
    }
    public void setModel(String model2){
        this.model=model2;
    }
    public void setYear(int year2){
        this.year=year2;
    }
    public void setPrice(double price2){
        this.price=price2;
    }

}