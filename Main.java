import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create objects and test your classes in here
    Scanner sc = new Scanner(System.in);
    /*
    //Classwork: 

    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();
    System.out.println("Give me two numbers:");
    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

    //(0,1)
    p1.setX(in_x);
    p1.setY(in_y);

    p2.setX(1);
    p2.setY(2);

    System.out.println(p1.toString());
    System.out.println(p1.equals(p2));
    sc.nextLine();

    Dog d1 = new Dog();
    System.out.println("Give me a name for a dog: ");
    String in_name = sc.nextLine();
    d1.setName(in_name);
    System.out.println("Give me a breed for the dog: ");
    String in_breed = sc.nextLine();
    d1.setBreed(in_breed);
    System.out.println("Give me a size for the dog: ");
    int in_size = sc.nextInt();
    d1.setSize(in_size);
    sc.nextLine();
    System.out.println("Give me the dog's fur color: ");
    String in_furColor = sc.nextLine();
    d1.setFurColor(in_furColor);

    System.out.println("Your dog: \n" + d1.getName() + "\n" + d1.getBreed() + "\n" + d1.getSize() + "\n" + d1.getFurColor());
    */
    Person p = new Person();
    System.out.println("Enter the person's first name: ");
    input_firstN = sc.nextLine();
    System.out.println("Enter the person's last name: ");
    input_lastN = sc.nextLine();
    System.out.println("Enter the person's age: ");
    input_age = sc.nextInt();
    System.out.println("Enter the person's social security number: ");
    input_SSN = sc.nextInt();
   
  }
}
