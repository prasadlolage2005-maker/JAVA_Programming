//Approch 3  final

import java.util.Scanner;

class Arithemetic
{
    public int Addition(int iNo1,int iNo2)
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }
}

class program38
{
    public static void main(String A[])
    {
        Scanner scanner=null;      
        Arithemetic arithemetic=null;
        int ivalue1=0, ivalue2=0, iResult=0;

        scanner=new Scanner(System.in);

        System.out.println("Enter First Number : ");
        ivalue1=scanner.nextInt();

        System.out.println("Enter Second Number : ");
        ivalue2=scanner.nextInt();

        arithemetic=new Arithemetic();

        iResult=arithemetic.Addition(ivalue1,ivalue2);                           

        System.out.println("Addition is : "+iResult);
    }
}








