import java.util.Scanner;

public class Initial
{
    public static void main(String []args)
    {
        Scanner UserInput = new Scanner(System.in);
        String Choice;
        System.out.println("Calculator or Scientific Calculator?");
        Choice = UserInput.nextLine();   //Save user input
        switch(Choice.toUpperCase())
        {
            case "CALCULATOR":
                Calculator test = new Calculator(1,1);
                System.out.println("Creating Calculator.");
                test.UserInquiry(test);
                break;
            case "SCIENTIFIC CALCULATOR":
                 ScientificCalculator SciCal = new ScientificCalculator(1,1,1);
                 System.out.println("Creating Scientific Calculator.");
                 SciCal.UserSciInquiry(SciCal);
                 break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
    }
}