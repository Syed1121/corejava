import java.lang.*;
class A
{
    void mofca()
    {
        System.out.println("I am method of parent class A");
    }
}
class B extends A
{
    void mofcb()
    {
        System.out.println("I am method of child class B");
    }
}
class C extends A
{
    void mofcc()
    {
        System.out.println("I am method of child class C");
    }
}
class D extends A
{
    void mofcd()
    {
        System.out.println("I am method of child class D");
    }
}
class Main
{
    public static void main(String args[])
    {
        B objB=new B();
        objB.mofca();
        objB.mofcb();
        System.out.println("-------------------------------------------------");
        C objC=new C();
        objC.mofca();
        objC.mofcc();
        System.out.println("-------------------------------------------------");
        D objD=new D();
        objD.mofca();
        objD.mofcd();
        
    }
}