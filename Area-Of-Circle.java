/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.*;
public class Main
{
    static float findareaofCir(int r)
    {
        return (float)(Math.PI*r*r);
    }
	public static void main(String[] args)
	{
	    int n=5;
		System.out.printf("%.4f",(findareaofCir(n)));
	}
}
