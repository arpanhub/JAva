package patterns;

// import java.util.Scanner;
public class pat1{
    /* public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=2;j++)
            {
                
            }
        }
    } */
    
        public static void main(String[] args) {
            int rows = 5;
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = rows - 1; k > i; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
}
