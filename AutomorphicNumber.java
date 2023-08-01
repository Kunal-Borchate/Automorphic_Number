import java.util.Scanner;
class AutomorphicNumber 
{
	public static int count(int num)
	{
		int ct=0;
		while (num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int base,int raise)
	{
		int pow=1;
		for (int i=0;i<raise ;i++ )
		{
			pow*=base;
		}
		return pow;
	}
	public static boolean isAutomorphic(int num)
	{
		int ct=count(num);
		int square=power(num,2);
		int rem=square%power(10,ct);

		if (rem==num)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start=sc.nextInt();

		System.out.println("Enter Ending Number");
		int end=sc.nextInt();

		while (start<=end)
		{
			if (isAutomorphic(start))
			{
				System.out.println(start+" "+"is an Automorphic Number");
			}
			start++;
		}
	}
}
