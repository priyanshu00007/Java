public class fibonacci
{
   public static void main(String args[])
   {
        int a = 1,b =1,c,i,n = 10;
         System.out.println("The fibonacci series :");
         System.out.println(a+"");
         System.out.println(b+"");
               for(i = 0;i<=n;i++)
                {
                  c = a + b;
                  System.out.println( c );
                  a = b;
                  b = c;
               }
   }
}