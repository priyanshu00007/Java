public class condition
{
   public static void main(String args[])
   {
        int a = 20,b = 10,c = 30;
        if(a  > b)
        {
            if(a > c)
            {
                System.out.println("The A is greater then all the numbers");
            }
        }
         if(b  > a)
        {
            if(b > c)
            {
                System.out.println("The B is greater then all the numbers");
            }
        }
         if(c  > a)
        {
            if(c > b)
            {
                System.out.println("The C is greater then all the numbers");
            }
        }
        
   }
}