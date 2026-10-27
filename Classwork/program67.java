import java.util.Scanner;
class program67
{
    public static void main(String A[])
    {
        Scanner scanner=new Scanner(System.in);

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
            int iCnt=0;       //Default Value

            iCnt=1;           //Starting Point
            do
            {
                System.out.println("------------");
                System.out.println(iCnt + " jay Ganesh...");
                System.out.println("------------");
                iCnt++;
            } while(iCnt<=iNo);     //Tail Checking loop
        } // Wrong code
}
