class StaticDicl_Ini
{    
    static byte b;
    static short s;
    static char c;
    static int i;
    static long l;
    static float f;
    static double d;
    static String ss;
    static boolean bb;
    public static void main(String[] args)
    { 
      StaticDicl_Ini obj=new StaticDicl_Ini();
      b=10;
      s=30;
      c='i';
      i=100;
      l=982697826;
      f=13.8879;
      d=98.37831;
      ss="jlkjs";
      bb=false;
      System.out.println(obj.b);
      System.out.println(obj.s);
      System.out.println(obj.c);
      System.out.println(obj.i);
      System.out.println(obj.l);
      System.out.println(obj.f);
      System.out.println(obj.d);
      System.out.println(obj.ss);
      System.out.println(obj.bb);
    }
}