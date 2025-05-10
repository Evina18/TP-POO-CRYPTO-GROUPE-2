public class B extends A {
    public void f(A o) {
    System.out.println("void f(A o) dans B");

    }
    public void f(B o) {
        System.out.println("void f(B o) dans A");
        }
   }
