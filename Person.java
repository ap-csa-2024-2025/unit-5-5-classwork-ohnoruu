public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int SSN;

    public void setFirstName(in_firstN){
        firstName = in_firstN;
    }
    public void setLastName(in_lastN){
        lastName = in_lastN;
    }
    public void setAge(in_age){
        age = in_age;
    }
    public void setSSN(in_SSN){
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
        String output = SSN;
        output += "\tName: " + firstName + " " + lastName + "\nAge: " + age;
        return output;
    }
}
