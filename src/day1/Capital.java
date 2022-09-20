package day1;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i love java";
		
		char c = str.charAt(0);
		String newStr = String.valueOf(Character.toUpperCase(c));
		String result = newStr;
		
		for(int i=1; i<str.length(); i++)
		{
			if(str.charAt(i)==32)
			{
				c = str.charAt(i+1);
				newStr = String.valueOf(Character.toUpperCase(c));
				result += " "+newStr;
				i++;
			}
			else
				result += str.charAt(i);
		}
		System.out.println(result);
	}
}
