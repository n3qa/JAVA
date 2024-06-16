package encapsulation.clasicDemo;

public class Animal {
    private double weight;
    protected dobule height;

    public Animal(){

    };

    public Animal(double weight, dobule height) {
        this.weight = weight ;
        this.height = height;
    };

    public double getWeight() {
        return weight;
    };


    public dobule getHeight() {
        return height;
    }




}
