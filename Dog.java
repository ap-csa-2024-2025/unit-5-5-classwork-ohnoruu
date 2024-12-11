public class Dog
{
    private String name;
    private String breed;
    private double size;
    private String furColor;

    //Setters
    public void setName (String inputName){
        name = inputName;
    }

    public void setBreed(String inputBreed){
        breed = inputBreed;
    }

    public void setSize(double inputSize){
        size = inputSize;
    }

    public void setFurColor(String inputColor){
        furColor = inputColor;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public double getSize(){
        return size;
    }

    public String getFurColor(){
        return furColor;
    }
}
