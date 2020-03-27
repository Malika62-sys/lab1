import java.util.Scanner;

class L1_19 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 5, 78, -10, -5, 0, 15, -42, -13, 14};
		String text = "";
		//Scanner in = new Scanner(System.in);
		int i = 0;
		for ( i = 0; i < arr.length; i++)
		{
			if(arr[i]>0)
			{
				System.out.print("     " + arr[i]);
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
		System.out.println("\nVvedite text dlya proverki:");
		text = in.nextLine();
		int spaceCount = 0;
		for (char c : text.toCharArray()) 
		{
    			if (c == ' ')
    			{
         			spaceCount++;
    			}
    		}
    		System.out.print("Kollichestvo probelov v texte =" + spaceCount);
		System.out.println("\nVvedite stroku dlya proverki:");
		text = in.nextLine();
    		String separators = "[ ,;.:]+";
    		String[] words = text.split(separators);
    		System.out.println("\nNechetnye slova texta");
    		for ( i = 0; i < words.length; i++)
    		{
    			if ( i % 2 == 0)
    			{
    				System.out.print(words[i] + " ");
    			}
    		}
    		System.out.println("\nChetnye slova texta");
    		for ( i = 0; i < words.length; i++)
    		{
    			if ( i % 2 == 1)
    			{
    				System.out.print(words[i] + " ");
    			}
    		}
	}
}