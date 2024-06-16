package abstraction.season;

public class Season {
    private String[] months;
    private String name;
    private double averageTemperature;

    public Season (String name, double averageTemperature,String... month) {
        this.months = month;
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public String[] getMonths(){
      return months;
    };

    public String getName (){
        return  name;
    }

    public Double getAverageTemperature(){
        return averageTemperature;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
