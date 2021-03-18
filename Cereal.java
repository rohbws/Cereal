public class Cereal
{
    private String name;
    private double carbs;

    public Cereal(String name, double carbs){
        this.name = name;
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarbs(double carbs){
        this.carbs = carbs;
    }

    @Override
    public String toString(){
        return (name + " has " + carbs + " carbs.");
    }

}