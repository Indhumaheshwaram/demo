/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	static int oppositeFaceOfDice(int n)
	{
	    int ans=7-n;
	    return ans;
	}
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1 && n<=6)
		    System.out.println(oppositeFaceOfDice(n));
		else
		    System.out.println("invalid");
	}
}
