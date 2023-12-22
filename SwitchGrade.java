class SwitchGrade
{
	public static void main(String args[])
	{
		char d;
		d=args[0].charAt(0);
		switch(d)
		{
			case 'A':
			case 'a':
				System.out.println("Excellent");
				System.out.println("Your grade is "+d);
				break;
			case 'B':
			case 'b':
				System.out.println("Very Good");
				System.out.println("Your grade is "+d);
				break;
			case 'C':
			case 'c':
				System.out.println("Good");
				System.out.println("Your grade is "+d);
				break;
			default:
				System.out.println("Please Enter Grade from A-C or a-c only.");
				break;
		}
	}
}	