package timeComplexity;

public class PalindromNumComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i = 1110;
		 * 
		 * boolean flag=palin(i);
		 * 
		 * System.out.println(flag);
		 * 
		 * int arry[] = {1,2,-3};
		 * 
		 * System.out.println(arry.length);
		 */
		
		boolean flag2 = palinTwo(12560);
		System.out.println(flag2);
		
		boolean flag3 = palinThree(121);
		System.out.println(flag3);
		
	}
	
	public static boolean palin(int i) // this method having time complexity O(n)
	{
		if(i < 0) return false;
		if(i%10 == 0) return false;
		int palin=0;
		int temp =i;
		while(i > 0) 
		{
			palin = palin*10 + i%10; 
			i = i/10;
		}
		
		return (palin == i);
	}
	
	public static boolean palinTwo(int i) 
	{
		if(i < 0) return false;
		if(i%10 == 0) return false;
		
		String s = String.valueOf(i);
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) 
		{
			if(s.charAt(start) != s.charAt(end)) 
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
	}
	
	public static boolean palinThree(int i) 
	{
		if(i < 0) return false;
		if(i%10 == 0) return false;
		int temp = 0;
		while(i>0) 
		{
			temp = temp*10 + i%10;
			i= i/10;
			if(i == temp) return true;
		}
		return false;

		
	}

}
