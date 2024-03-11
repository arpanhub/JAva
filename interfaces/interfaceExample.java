/* interface IN
{
    final int a=10;
    void display();
}
class interfaceExample //implements IN
{
    public void display()
    {
        System.out.println("interfaces");
    }
    public static void main(String args[])
    {
        interfaceExample i=new interfaceExample();
        i.display();
        System.out.println(a);
    }
} */
//--------------------------------------------------------------------
/* interface Vehicle {
    public void changeGear(int g);

    public void speedUp(int a);

    public void applyBrakes(int d);
}

class Bike implements Vehicle {
    int gear = 0;
    int speed = 0;

    public void changeGear(int g) {
        gear = g;
    }

    public void speedUp(int a) {
        speed += gear * a;
    }

    public void applyBrakes(int d) {
        speed -= gear * d;
    }

    void display() {
        System.out.println("Gear:" + gear + "\nSpeed" + speed);
    }
}

public class interfaceExample {
    public static void main(String args[]) {
        Bike b = new Bike();
        b.changeGear(3);
        b.display();
        b.speedUp(20);
        b.display();
        b.applyBrakes(10);
        b.display();
    }
} */
//-------muiltiple interace----------
/* interface API {
    default void show() {
        System.out.println("default API");
    }
}

interface in1 extends API {
    void display();
}

interface in2 extends API {
    void print();
}

public class interfaceExample implements in1, in2 {
    public void display() {
        System.out.println("interface 1");
    }

    public void print() {
        System.out.println("interface 2");
    }

    public static void main(String[] args) {
        interfaceExample mi = new interfaceExample();
        mi.show();
        mi.display();
        mi.print();
    }
} */

/* //static method in interface
/* interface In3 {
    final int a = 10;

    static void disp() {
        System.out.println("hello");
    }
}

public class interfaceExample{
public static void main(String[] args) {
In3.disp();//class name and fucntion name

}} */
 interface Bank
{
    //ok
    void deposit(int d);
    void withdraw(int w);
    void showbalance();
}
abstract class Bankmanager1 implements  Bank 
{
    int balance=0;
    public void deposit(int d) {
        balance +=d;
    }
}
abstract class Bankmanager2 implements Bank//s
{
    int balance=0;
    public void withdraw(int w) {
        balance -= w; 
    }
}
class Bankmanager3 extends Bankmanager2 implements Bank//
{
    int balance=0;
    public void deposit(int d) {
        balance +=d;
    }
    public void showbalance() {
        System.out.println(balance);
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        // static int balance=1000;
        Bankmanager3 m1 = new Bankmanager3();
        m1.deposit(1000);//yes mam extension no issue
        m1.withdraw(1000);
        m1.showbalance();

       
    }
}
 //no mam working
