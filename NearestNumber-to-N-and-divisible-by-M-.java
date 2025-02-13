/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	static int closestNum(int n,int m)
	{
	   int q=n/m;
	   int n1=m*q;
	   int n2=n*m >0 ? (m*(q+1)):(m*(q-1));
	   
	   if(Math.abs(n-n1) < Math.abs(n-n2))
	        return n1;
	   else
	        return n2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		if(m==0)
		    System.out.println("invalid");
		else
	    	System.out.println(closestNum(n,m));
		
	}
}
