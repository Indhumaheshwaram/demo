class simple
{
  static byte b;
  static short s;
  static char c;
  static int a;
  static long l;
  static float f;
  static double d;
  static boolean bb;
  static String ss;
  public static void main(String[] args)
  {
    simple obj=new simple();
    b=10;
    s=30;
    c='i';
    a=1000;
    l=65254972;
    f=179.7f;
    d=787.785;
    bb=false;
    ss="indhu";
    System.out.println(obj.b);
    System.out.println(obj.s);
    System.out.println(obj.c);
    System.out.println(obj.a);
    System.out.println(obj.l);
    System.out.println(obj.f);
    System.out.println(obj.d);
    System.out.println(obj.bb);
    System.out.println(obj.ss);
  }
}