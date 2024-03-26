    
public class exception{
    public static void main(String[] args) {
        String[] arr ={"aaa","bbb",null,"ccc"};
        assert arr!=null:"array should not be null";
        assert arr.length>0:"array lenght should be greater than 0";
        try{
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==null)
                throw new IllegalArgumentException("element cant be nulll");
                System.out.println(arr[i]);

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        for(String el:arr)
        {
           assert el!=null:"no element should be null after processing";
        }

    }
}