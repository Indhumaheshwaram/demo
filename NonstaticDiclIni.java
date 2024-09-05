class NonstaticDiclIni
{
  byte b;
  short s;
  char c;
  int a;
  long l;
  float f;
  double d;
  boolean bb;
  String ss;
  public static void main(String[] args)
  {
    NonstaticDiclIni obj=new NonstaticDiclIni();
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