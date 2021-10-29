import java.util.Scanner;
class calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        calculator c=new calculator();
        int loop=1;
        while(loop==1)
        {
            System.out.println("1.ADD");
            System.out.println("2.SUBTRACT");
            System.out.println("3.EXIT");
            int ch=s.nextInt();
            System.out.println("ENTER NUM 1 : ");
            int n1=s.nextInt();
            System.out.println("ENTER NUM 2 : ");
            int n2=s.nextInt();
            switch(ch)
            {
                case 1:
                      System.out.println("ADD : "+c.add(n1,n2)); 
		      break;
                case 2:
                     System.out.println("MULtiPLICATION : "+c.mul(n1,n2)); 
		     break;
                case 3:
                     loop=0;
		     break;
                default:
                    System.out.println("INVALID CHOSE"); 
                      
            }
        }
    }
}
