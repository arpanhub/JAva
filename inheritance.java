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
}   