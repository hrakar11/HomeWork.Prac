package HomeWork;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        Write a code where it checks if a person is eligible to join military.
The code should have name, height, and weight of the person. (hint string, double data types)
In order for a person to join military,
person should have height of 5.5 ft or more and have weight between 140 - 250 lb.
if person is eligible to join than ==> print "<Person Name> is eligible to join military"
if not ==> print <Person Name> is NOT eligible to join military"
         */
        String name = "Hrakar";
        double Height = 5.11;
        double weight = 155;

        if (Height > 5.5 && weight > 140 && weight < 250){
            System.out.println(name+" is eligible to join the military.");
        }else  {
            System.out.println(name+ " is NOT eligible to join the military");
        }


    }
}
