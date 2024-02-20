package inheritance;
/* class Vehicle {
    public int model;
    public int speed;

    public Vehicle(int model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void applyBrake(int dec) {
        speed -= dec;
    }

    public void speedUp(int inc) {
        speed += inc;
    }

    @Override
    public String toString() {
        return ("model number :" + model + " speed is:" + speed);
    }
}

class Car1 extends Vehicle {
    public int nSeater;

    public Car1(int model, int speed, int nseater) {
        super(model, speed);
        nSeater = nseater;
    }

    public void setSeat(int val) {
        nSeater = val;
    }

    public String toString() {
        return (super.toString() + " number of seats " + nSeater);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Car1 ca = new Car1(3, 50, 5);
        // ca.model=5;
        System.out.println(ca.toString());

    }

} */
/* class employee
{
    int salary=6000;
}
class Engineer extends employee{
    int ben=10000;
}
public class inheritance {

    public static void main(String[] args) {
        Engineer obj=new Engineer();
        System.out.println("total "+(obj.ben+obj.salary));
    }
} */
//--------------------------------------------------------------------

/* class one
{
   public void print()
    {
        System.out.println("one");
    }
}
class two extends one
{
    public void print1()
    {
        System.out.println("two");
    }
}
class three extends two
{
    public void print2()
    {
        System.out.println("three");
    }
}
public class inheritance
{
    public static void main(String[] args) {
        three t=new three();
        t.print();
       t.print1();
        t.print2();
        two tw=new two();
        tw.print();
        tw.print1();
        tw.print2();
    }
} */

//-------------------------------------------
/* 
import java.util.Scanner;
class player
{   
    //String name;
   public void print()
    {
        System.out.print("player");//ok
    }
}
class football extends player
{
    public void print()
    {
        System.out.print("football");
    }
}
class basketball extends player
{
    public void print()
    {
        System.out.print("basketball");
    }
}
public class inheritance
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sports: ");
        String sports=sc.next();
       if(sports.equals("football"))
       {
            player fb=new football();
            fb.print();
       }
       else if(sports.equals("basketball"))
       {
            player bb=new basketball();
            bb.print();
       }
       else
       {
        player p=new player();
        p.print();
       }
    }
}    */
//--------------------------------------
/* 
class A1 {
    static void m1() {
        System.out.println("parent static m1");
    }

    void m2() {
        System.out.println("parent non static m2");
    }
}

class B1 extends A1 {
    static void m1() {
        System.out.println("child static m1");
    }

    @Override
    public void m2() {
        System.out.println("child non static m2");
    }
}

public class inheritance {

    public static void main(String[] args) {
        A1 a = new B1();
        a.m1();
        a.m2();

    }

} */
//----------------------------------------------------------------------------
//InvokeSuperfromSub
/* class Parent2 {
    int num = 23;

    Parent2() {
        System.out.println("parent");
    }

    void show() {
        System.out.println("parent's show");
    }
}

class Child2 extends Parent2 {
    int num = 54;

    Child2() {
        super();
        System.out.println("child");

    }

    @Override
    void show() {

        System.out.println("child show" + super.num);
        super.show();
    }
} */
/*
Now,let'sbreak
down what
happens step
by step:

1.
In the`main`method,
we create
an object`obj`
of type`Parent2`
but actually
instantiate it with`Child2`
because of polymorphism.

2. When`new Child2()`
is executed, the
following happens:-`Child2`
constructor is called.-`super()`
is called inside`Child2`constructor,
which invokes
the constructor of`Parent2`,printing"parent".-Then"child"
is printed from`Child2`constructor.

3. After`obj`
is created and assigned,`obj.show()`
is called:-Since`obj`
is of type`Parent2`,
but it
actually refers
to an
instance of`Child2`,
polymorphism comes
into play.-`show()` method from `Child2` is invoked.
   - In `Child2`'s `show()` method:
     - "child show" is printed along with the value of `super.num`, which accesses the `num` variable of the parent class (`Parent2`). This prints "23".
     - `super.show()` is called, which invokes the `show()` method of the parent class (`Parent2`), printing "parent's show". */
//------------------------------------------------------------------------------

/* public class inheritance {
    int roll;
    String name;
    static String college = "lpu";

    static void change() {
        college = "lovely professional university";
    }

    inheritance(int r, String n) {
        roll = r;
        name = n;
    }

    void disp() {
        System.out.println(roll + " " + name + " " + college);
    }

    
    //  * public String toString()
    //  * {
    //  * //return getClass().getName()+"@"+Integer.toHexString(hashCode());
    //  * return ("hello");
    //  * }
    public int hashCode() {
        return roll;
    }
    
    public static void main(String[] args) {

        inheritance.change();
        inheritance s1 = new inheritance(1, "saloni");
        inheritance s2 = new inheritance(2, "Harsh");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        Object obj = new String("abc");
        Class c = obj.getClass();
        System.out.println(c.getName());

        // s1.disp();
        // s2.disp();
        s1 = null;
        System.gc();
        System.out.println("end");

    }

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }

} */
    
/* class inheritance{}
public class Dog2 extends inheritance{
    static void func(inheritance a)
    {
        Dog2 d=(Dog2)a;
        System.out.println("dwoncasting");
    }
    public static void main(String[] args) {
        inheritance a=new Dog2();
        Dog2.func(a);
    }
} */