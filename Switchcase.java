class Switchcase
{
   public static void main(String args[])
     {
        int d;
	d=Integer.parseInt(args[0]);
switch(d)
	{
		case 1:
			System.out.println("Monday");
			   break;
		case 2:
			System.out.println("Tuesday");
			   break;
		case 3:
			System.out.println("Wedsday");
			   break;
		case 4:
			System.out.println("Tursday");
			   break;
		case 5:
			System.out.println("Friday");
			   break;
		case 6:
			System.out.println("Satday");
			   break;
		case 7:
			System.out.println("Snday");
			   break;
		default :
			System.out.println("Please Enter value between 1 to 7");
			   break;
	}
   }
}