/* import java.util.*;
public class java {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        if(a>=0){
            System.out.println("Postive hai bhia");
        }
        else{
            System.out.println("nhi bhai negative");
        }
    }
}
 */
/* import java.util.*;
public class java{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            a[i]=d;
        }
        int x=0;
        int y=a.length-1;
        while(x<y){
            int temp=a[x];
            a[x]=a[y];
            a[y]=temp;
            x++;
            y--;
        }
        for(int d:a){
            System.out.print(d+" ");
        }
    }
} */
/* import java.util.*;
public class java {
    Scanner sc =new Scanner(System.in);
    public static void enterarray(int m,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int d=sc.nextInt();
                a[i][j]=d;
            }
        }
    }
    public static void printarray(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(a[i][j]);
            }
            System.out.println("/n");
        }

    }
    public static void main(String[] args){
        System.out.println("Enter the size of array:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] a=new int[n][m];
        enterarray(m,n);
        printarray(m,n);
    }
}
 */
/* public class java {
    String breed;
    int age;
    String color;
    Dog(String breed,int age,String color)
    {
        this.breed=breed;
        this.age=age;
        this.color=color;
    }

    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return("hi  my breed is"+this.getBreed()+"age is "+this.getAge()+"colour is "+this.getColor());
    }
    public static void main(String[] args) {
     Dog doberman=new Dog("Doberman",5,"white")
     System.out.println(h1.getBreed());  
    }
} *//* 
public class java{
    double length;
    double width;
    double height;
    
    public java(){
    this.length = 1;
    this.width = 1;
    this.height = 1;
    }
    public java(double l,double w,double h){
    this.length = l;
    this.width = w;
    this.height = h;
    }
    public double Volume(){
    return length*width*height;
    }
    public static void main(String[] args) {
    java v1 = new java();
    System.out.println("default : " + v1.Volume());
    java v2 = new java(2.665,96.36,78.25);
    System.out.println("parameterized conc : " + v2.Volume());
    
    }
    }
 */

/**
 * java
 */
import java.util.*;
import java.util.Collections;
public class java {
    public static void main(String[] args)
     {

        StringBuilder str=new StringBuilder();
        str.append("Arpan");
        int start=0;
        int end=str.length()-1;
        System.out.println(end);
        boolean check=false;
        int checkinc=0;
        while(start<=end)
        {
            char temp=str.charAt(end);
            str.setCharAt(end,str.charAt(start));
            str.setCharAt(start,temp);
            start++;
            end--;
        }
        System.out.println(str);
        System.out.println(str);
        
    }
}