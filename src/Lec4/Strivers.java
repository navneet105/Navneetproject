package Lec4;

public class Strivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		for (int j=N;j>=1;j--)
		{
		    for(int i =N;i>=1;i--)
		    {
		        if(j>i)
		        System.out.print(j);
		        else
		        System.out.print(i);
		    }
		    for(int i =2;i<=N;i++)
		    {
		        if(j>i)
		        System.out.print(j);
		        else
		        System.out.print(i);
		    }
		    System.out.println(" ");
		}
		for (int j=2;j<=N;j++)
		{
		    for(int i =N;i>=1;i--)
		    {
		        if(j>i)
		        System.out.print(j);
		        else
		        System.out.print(i);
		    }
		    for(int i =2;i<=N;i++)
		    {
		        if(j>i)
		        System.out.print(j);
		        else
		        System.out.print(i);
		    }
		    System.out.println(" ");
		}

	}

}
