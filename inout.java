import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* public class inout {
    public static void main(String[] args) {
        String fname="test.txt";
        File f= new File(fname);
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getParent());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        if(f.exists())
        {
            System.out.println(f.canWrite());
            System.out.println(f.isDirectory());
            System.out.println(f.length());
        }
    }
} */
/* 
public class inout
{
    public static void main(String[] args)
    BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
    System.out.println("enter directory path");
    String dirpath=br.readLine();
    System.out.println("Enter the directory name");
    String dname=br.readLine();
    File f=new File(dirpath,dname);
    if(f.exists())
    {
        String arr[]=f.list();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            File f1=new File(arr[i]);
            if(f1.isFile())
                System.out.println(":file");
            if(f1.isDirectory())
                System.out.println(":directory");
        }
        System.out.println("no. of entries in the directory are "+n);
    }
    else
        System.out.println("directory does not exists");
} */
class inout implements Serializable
{
    public int a;
    public String b;
    public inout(int a,String b)
    {
        this.a=a;
        thus.b=b;
    }

}
public class Serialization
{
    public static void main(String [] args)
    {
        Ser a=new Ser(1,"abc");
        String filename="file.ser";
        try{
            FileOutputStream file= new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s);
            out.close();
            file.close();
            System.out.println("serialization");
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            FileInputStream file= new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
 
        }
    } 
}


