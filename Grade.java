class Grade
{
public static void main(String args[])
{
int m1,m2,m3,m4,m5,tot;
float per;
m1=Integer.parseInt(args[0]);
m2=Integer.parseInt(args[1]);
m3=Integer.parseInt(args[2]);
m4=Integer.parseInt(args[3]);
m5=Integer.parseInt(args[4]);
tot= m1+ m2+m3+ m4+ m4+ m5;
per=tot/5;
System.out.println("The total" +tot);
System.out.println("The percentage is " +per);
if(per>=75)
System.out.println("Distinction");
else if(per>=60 && per<=74)
System.out.println("First class");
else if(per>=50 && per<=59)
System.out.println("Second class");
else if(per>=40 && per<=49)
System.out.println("Pass class");
else 
System.out.println("Fail");
}
}