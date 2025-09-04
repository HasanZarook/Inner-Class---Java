package Inner_Class;

class A {
    public int x =0 ;
    int m []= new int[10];
    public void method(){
        System.out.println("method of class A");
    }
    class B{
        public void method_1(){
            x++;    // we can use the outter class attributes and funvtion in inner class
            System.out.println(x);
            System.out.println("method of inner class B");
        }
    }
    static class C{
        public void method_2(){
            System.out.println("method of inner class C");
        }
    }
}

public class TestInner{
    public static void main(String[] args) {
        A a = new A();
        a.method();
        A.B b = a.new B();
        b.method_1();
       // b.x;              we cannot access the outter class attributes and functions by using inner class object
       // b.method();

        A.C c =new A.C();   //we can use this syntax only for static inner class
        //A.C c1 = new A.B();
    }
}
