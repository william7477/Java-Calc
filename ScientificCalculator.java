import java.util.Scanner;

public class ScientificCalculator extends Calculator
{
    public int SpecialNum;
    public ScientificCalculator(int A, int B, int C)
    {
        super(A,B);
        SpecialNum = C;
    }
    
    public void Operands(int A, int B, int C)
    {
        First = A;
        Second = B;
        SpecialNum = C;
    }
    //Special Operations
    public int RaisedTo()
    {
        int counter;
        int result=1;
        for(counter = 1;counter<=SpecialNum;counter++)
        {
            result = result*First;
        }
        return result;
    }
    //Special Operations End
    
    public void UserSciInquiry(ScientificCalculator test)
    {
        String operation;
        Scanner UserInput = new Scanner(System.in);
        boolean ExitFlag = false;
        int result;
        int A,B;
        while (ExitFlag == false)
        {
            System.out.println("Available Commands: Input, Add, Subtract, Multiply, Divide, Special, QuitCalc. Enter choice:");
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
                case "SPECIAL":
                    test.SpecialOperations(test);
                    break;
                case "QUITCALC":
                    ExitFlag = true;
                    break;
                default:
                    break;
            
            }   
        }
    }
    
    public void SpecialOperations(ScientificCalculator test)
    {
        boolean ExitFlag = false;
        String operation;
        Scanner UserInput = new Scanner(System.in); 
        int A,B,C;
        while(ExitFlag == false)
        {
            System.out.println("To display/edit operands: Display/EditOps. Available Special Commands: Exponent. Enter choice:");
            operation = UserInput.nextLine();
            switch (operation.toUpperCase())
            {
                case "DISPLAY":
                    System.out.println("Operands: " + test.First + " and " + test.Second + ". Special Number: " + test.SpecialNum + ".");
                    break;
                case "EDITOPS":
                    System.out.println("Enter First Operand: ");
                    A = UserInput.nextInt();
                    System.out.println("Enter Second Operand: ");
                    B = UserInput.nextInt();
                    System.out.println("Enter Special Number: ");
                    C = UserInput.nextInt();
                    operation = UserInput.nextLine();
                    test.Operands(A,B,C);
                    break;
                case "EXPONENT":
                    System.out.println(test.First + "^" + test.SpecialNum + " = " + test.RaisedTo());
                    ExitFlag = true;
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void main(String []args)
    {
        ScientificCalculator test = new ScientificCalculator(1,1,1);
        System.out.println("Creating Scientific Calculator.");
        test.UserSciInquiry(test);
    }
}