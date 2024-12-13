public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int SSN;

    public void setFirstName(String in_firstN){
        firstName = in_firstN;
    }
    public void setLastName(String in_lastN){
        lastName = in_lastN;
    }
    public void setAge(int in_age){
        age = in_age;
    }
    public void setSSN(int in_SSN){
        SSN = in_SSN;
    }

    public String getFirstN(){
        return firstName;
    }
    public String getLastN(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public int getSSN(){
        return SSN;
    }

    public String toString(){
        String output = "SSN: " + Integer.toString(SSN);
        output += "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age + "\n";
        return output;
    }
}
