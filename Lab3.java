import java.util.Random;
import java.util.Scanner;

class Lab3
{
	public static void main(String[] args)
	{
		Random random=new Random();
		int licznikProb=0, liczba,userLiczba;
		Boolean win=false;
		Scanner scanner=new Scanner(System.in);
		String continueGame="n";
		do
		{
			liczba=random.nextInt(101);
			System.out.println("TEST: "+liczba);
			do
			{
				try
				{
					System.out.println("Podaj liczbe: ");
					userLiczba=Integer.parseInt(scanner.nextLine());
					if(userLiczba==liczba) win=true;
					else if(userLiczba>liczba) System.out.println("Wylosowana liczba jest mniejsza");
					else System.out.println("Wylosowana liczba jest większa");
				}
				catch(Exception e)
				{
					System.out.println(e.toString());
				}
			licznikProb++;
			}while(!win);
			StringByilder
			System.out.println("Brawo!!! Liczba prob="+licznikProb+"\nChcesz grac dalej?\nT/t-tak \ndowolny klawisz-nie");
			continueGame=scanner.nextLine();
			if(continueGame.equals("t")||continueGame.equals("T"))
			{
				win=false;
				licznikProb=0;
			}
		}while(!win);
	}
}
