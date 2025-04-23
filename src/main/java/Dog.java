/**
    * This is a program that collects the name, breed, and weight of a dog
    * @author Cindy Pan 
    * @version 17.0.1
 */

class Dog{
    // instance var
    private String breed;
    private String name;
    private int weight;
/**
 * Constructor: Special method that is called to make a variable initialized
 * @param name1 A string, it records the name of the dog
 * @param breed1 A string, recording the breed of the dog
 * @param weight1 Int value, this is the weight of the dog 
 */

// constructor
    public Dog(String name1, String breed1, int weight1){
        this.name=name1;
        this.breed=breed1;
        this.weight=weight1;
    }


/**
 * Getter: used to access or *get* the private/instance variable
 * @return getName returns the String stored in the name variable
 * @return getBreed returns the String stored in the breed Variable
 * @return getWeight returns the int stored in the weight variable
 */

 // getters
    public String getName(){
        return name;
 }
    public String getBreed(){
        return breed;
    }
    public int getWeight(){
        return weight;
    }

    /**
     * Setters: A method that is used to *update* a variable within this program
     * @param name2 the new String variable used to replace the current name variable
     * @param breed2 the new String variable used to replace the current breed variable
     * @param weight2 the new int variable used to replace the current weight variable
     */
    public void setName(String name2){
        this.name=name2;
    }
    public void setBreed(String breed2){
        this.breed=breed2;
    }
    public void setWeight(int weight2){
        this.weight=weight2;
    }
}