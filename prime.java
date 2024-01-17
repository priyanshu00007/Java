public class prime
{
    public static void main(String args[])
    {
        int n = 3,i,prime = 0;
        for(i = 2 ;i <= n/2;i++)
        {
            if(n % i == 0)
            {
                prime = 1;
            }
        }
        if(prime == 0)
        {
            System.out.println("the number is  prime ");
        }
        else{
            System.out.println("The number is  not prime ");
        }
    }
}