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

   //Problem 1
    Person p = new Person();
    System.out.println("Enter the person's first name: ");
    p.setFirstName(sc.nextLine());
    System.out.println("Enter the person's last name: ");
    p.setLastName(sc.nextLine());
    System.out.println("Enter the person's age: ");
    p.setAge(sc.nextInt());
    sc.nextLine();
    System.out.println("Enter the person's social security number: ");
    p.setSSN(sc.nextInt());
    sc.nextLine();
    System.out.println(p.toString());

    //Problem 2
    String input="";
    Oven o = new Oven();
    System.out.println("Maximum oven temperature: ");
    o.setMaxTemp(sc.nextInt());
    sc.nextLine();
    System.out.println("Starting oven temperature: ");
    o.setCurrentTemp(sc.nextInt());
    sc.nextLine();
    System.out.println(o.toString());
    while (!(input.equals('q'))){
      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter \"o\", to restart enter \"r\", to quit enter \"q\"");
      input = sc.nextLine();
      if (input.equals('p')){
        System.out.println("Enter the temperature to preheat the oven to: ");
        o.preheat(sc.nextInt());
      }
      if (input.equals('o')){
        o.turnOff();
      }
    }
  }
}
