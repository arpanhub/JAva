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
import java.util.*;
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
}