import java.util.Scanner;

public class Calculator
{
    public int First;
    public int Second;
    //Initialization
    public Calculator(int FirstOperand, int SecondOperand)
    {
       First = FirstOperand;
       Second = SecondOperand;
    }
    
    //user Input of Operands
    public void Operands(int FirstOperand, int SecondOperand)
    {
        First = FirstOperand;
        Second = SecondOperand;
    }
    
    //Basic Arithmetic Start
    public int Addition()
    {
        return First+Second;
    }
    public int Subtraction()
    {
        return First-Second;
    }
    public int Multiplication()
    {
        return First*Second;
    }
    public int Division()
    {
        return First/Second;
    }
    //Basic Arithmetic End
    public void UserInquiry(Calculator test)
    {
        String operation;
        Scanner UserInput = new Scanner(System.in);
        boolean ExitFlag = false;
        int result;
        int A,B;
        while (ExitFlag == false)
        {
            System.out.println("Available Commands: Input, Add, Subtract, Multiply, Divide, QuitCalc. Enter choice:");
            operation = UserInput.nextLine();
            switch (operation.toUpperCase())
            {
                case "INPUT":
                    System.out.println("Enter First Operand: ");
                    A = UserInput.nextInt();
                    System.out.println("Enter Second Operand: ");
                    B = UserInput.nextInt();
                    operation = UserInput.nextLine();
                    test.Operands(A,B);
                    System.out.println("Operands are now: " + test.First + " and " + test.Second);
                    break;
                case "ADD":
                    System.out.println("Adding: " + test.First + " + " + test.Second + " = " + test.Addition() );
                    break;
                case "SUBTRACT":
                    System.out.println("Subtracting: " + test.First + " - " + test.Second + " = " + test.Subtraction() );
                    break;
                case "MULTIPLY":
                    System.out.println("Multiplying: " + test.First + " * " + test.Second + " = " + test.Multiplication() );
                    break;
                case "DIVIDE":
                    System.out.println("Dividing: " + test.First + " / " + test.Second + " = " + test.Division() );
                    break;
                case "QUITCALC":
                    ExitFlag = true;
                    break;
                default:
                    break;
            
            }   
        }
    }
    
    
    
    public static void main(String []args)
    {
                Calculator test = new Calculator(1,1);
                System.out.println("Creating Calculator.");
                test.UserInquiry(test);
    }
}
