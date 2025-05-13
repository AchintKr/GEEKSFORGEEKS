class A{
    int a;
    void disp_A(){
        System.out.println(a);
    }
}
class B extends A{
    int b ;
void disp_B(){
    System.out.println(b);
}
}
public class from {
    public static void main(String[] args) {
        A ob = new A();
        ob.disp_B();
    }
}
