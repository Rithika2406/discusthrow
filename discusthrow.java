import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int x=S.nextInt();
		    int y=S.nextInt();
		    int z=S.nextInt();
		    if(x>=y && x>=z)
		    {
		        System.out.println(x);
		    }
		    else if(y>=x && y>=z)
		    {
		        System.out.println(y);
		    }
		    else if(z>=x && z>=y)
		    {
		        System.out.println(z);
		    }
		    else if(x==y && x==z)
		    {
		        System.out.println(x);
		    }
		}

	}
}
