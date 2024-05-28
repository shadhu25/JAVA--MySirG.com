
public class StaticMember {
    private int x; // instance menber variable
    private static int y; // static menber variable
    public void fun1(){ x=3;} // instance member function
    public static void fun2(){ y=3;} // static member function
    public void showdata1(){
    System.out.println(x);
    }
    public static void showdata2(){
    System.out.println(y);
    }
    static class god{
        public static String country="INDIA";
    }
}

class Example{
    public static void main(String a[]){
        StaticMember s1=new StaticMember();
        s1.fun1();
        StaticMember.fun2();
        StaticMember.showdata2();
        s1.showdata1();
        System.out.println(StaticMember.god.country);
        
    }
}
