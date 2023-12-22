class Additionarg
{
   public static void main(String args[])
   {
       int a,b,count,sum;
       count=args.length;
       System.out.println("Number of Arguments entered are " +count);
       if(count==2)
       {
          System.out.println("First Argument is "+args[0]);
          System.out.println("Second Argument is "+args[1]);
          a=Integer.parseInt(args[0]);
          b=Integer.parseInt(args[1]);
          sum=a+b;
          System.out.println("The sum is "+sum);
       }
       else
       {
     System.out.println("you hv not entered cmd line arguments, pls enter two cmd line arguments while running program");
          
       }
    }
}
