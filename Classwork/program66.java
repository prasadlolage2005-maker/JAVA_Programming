import java.util.Scanner;
class program66
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

            while(iCnt<=iNo)          //head Checking loop
            {
                System.out.println("------------");
                System.out.println(iCnt + " jay Ganesh...");
                System.out.println("------------");
                iCnt++;
            }
        }
}


