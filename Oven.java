public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public void setMaxTemp(int in_max){
        maxTemp = in_max;
    }
    public void setCurrentTemp(int in_current){
        currentTemp = in_current;
    }
    public int getMaxTemp(){
        return maxTemp;
    }
    public int getCurrentTemp(){
        return currentTemp;
    }
    public void turnOff(){
        if (currentTemp > 0){
            currentTemp = 0;
            System.out.println("Turned off oven.");
        }
    }
    public boolean isOn(){
        if (currentTemp > 0){
            return true;
        } else {
            return false;
        }
    }
    public void preheat(int temp){
        currentTemp = temp;
        if (temp > 0){
            if (temp > maxTemp){
            currentTemp = maxTemp;
            }
            System.out.println("Preheated to " + currentTemp);
        }
    }
    public String toString(){
        String output = "New oven with a maximum temperature of " + Integer.toString(maxTemp) + " and a starting temperature of " + Integer.toString(currentTemp);
        return output;

    }
}
