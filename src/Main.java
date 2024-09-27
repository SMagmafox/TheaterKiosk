import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final var  AGE_REQUIREMENT = 21;
        var age = 0;

        System.out.print("Input your age: ");
        age = console.nextInt();
        if (age >= AGE_REQUIREMENT)
        {
            System.out.println("You get a wrist band!");
        }
    }
}