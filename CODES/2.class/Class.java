public class Class {
    private int length,breadth,height;
    public void setDimension(int l, int b, int h){
        length=l; breadth=b; height=h;
    }
    public void showDimension(){
        System.out.println("L= "+length);
        System.out.println("B= "+breadth);
        System.out.println("H= "+height);
    }
}

class Example{
        public static void main(String gas[]){
            Class C1=new Class();
            C1.setDimension(2,4,7);
            C1.showDimension();
        }
}
