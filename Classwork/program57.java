import java.util.Scanner;
class program57
{
    public static void main(String A[])
    {
        Scanner scanner=null;
        scanner=new Scanner(System.in);

        int iValue=0; 
    
        Iteration iteration=new Iteration();

        System.out.println("Enter the frequenecy");
        iValue=scanner.nextInt();

        iteration.display(iValue);
    }
}
class Iteration
{
     public void display(int iNo)
        {
            int iCnt=0;
            for(iCnt=1; iCnt<=iNo; iCnt++)
            {
                System.out.println("Jay Ganesh..");
            }
        }
}

