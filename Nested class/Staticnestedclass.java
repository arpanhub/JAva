/* class outer{
    static int outer_x=10;
    int outer_y=10;
    private static int outer_private=30;
    static class StaticNested
    {
        void display(){
            System.out.println(outer_x); 
            System.out.println(outer_private); 
            // outer out=new outer();
            System.out.println(out.outer_y);
        }
    }
}
public class Staticnestedclass {
    public static void main(String[] args) {
        outer.StaticNested obj=new outer.StaticNested();
        obj.display();
    }
} */

class outer {
    static int outer_x = 10;
    int outer_y = 10;
    private static int outer_private = 30;

    class StaticNested {
        void display() {
            System.out.println(outer_x);
            System.out.println(outer_private);
            // outer out=new outer();
            System.out.println(outer_y);
        }
    }

}
public class  Staticnestedclass{
    public static void main(String[] args) {
        outer out = new outer();
        outer.StaticNested inner = out.new StaticNested();
        inner.display();
        // Outer.StaticNested obj=new Outer.StaticNested();
        // obj.display();

    }

}
