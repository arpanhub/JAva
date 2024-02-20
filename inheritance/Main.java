// Define the Printable interface
interface Printable {
    void print();
}

// Class A implementing Printable
class A implements Printable {
    void a() {
        System.out.println("Method a() in class A");
    }

    // Implementing the print() method of the Printable interface
    public void print() {
        a();
    }
}

// Class B implementing Printable
class B implements Printable {
    void b() {
        System.out.println("Method b() in class B");
    }

    // Implementing the print() method of the Printable interface
    public void print() {
        b();
    }
}

// Class Call
class Call {
    void invoke(Printable p) {
        if (p instanceof A) {
            // Downcast to A and call method a()
            ((A) p).a();
        } else if (p instanceof B) {
            // Downcast to B and call method b()
            ((B) p).b();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Printable p = new B(); // Creating an instance of class B
        Call c = new Call();
        c.invoke(p);
    }
}
