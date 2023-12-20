class Automatic_test
{
	public static void main(String args[])
	{
		int num=6,sum=0,temp=num,rem=0;
				sum=num*num;
				num++;
			
			System.out.println(sum);
				for(;sum>0;sum/=10)
				{
					rem=sum%100;
					break;
				}
				System.out.println(rem);
				if(rem==temp)
				{
					System.out.println("automatic num");			
				}
				else
				{
					System.out.println("not automatic num");
				}
				
	}
}