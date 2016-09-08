import java.util.Scanner;


public class cost {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		//String b=sc.nextLine();
		int cost=0;
		String b="";
		for(int i=0;i<3;i++)
		{
			int c=sc.nextInt();
			switch(c)
			{
			case 3:
				b=a.replace("as", "");
				cost=cost+3;
				break;
			case 4:
				for(int i1=0;i1<a.length();i1++)
				{
					b=a+"a";
				}
				cost=cost+4;
				break;
			case 5:
				b=a.replace(a,b);
				cost=cost+5;
				break;
			}
			
		}
		System.out.println(cost);
	}
	
}
