import javax.sound.sampled.SourceDataLine;

public class localouter {
    private void getval()
    {
        int sum=20;
        class localInner{
            public int divisor;
            public int remainder;
            public localInner(){
                 divisor=4;
                 remainder=sum%divisor;

            }
            private int getDivisor()
            {
                return  divisor;
            }
            private int getremainder()
            {
                return  sum%divisor;
            }
            private int getQuotient()
            {
                return  sum/divisor;
            }
        }
    }
    localInner inner = new localInner();
    System.out.println(inner.getDivisor());
    System.out.println(inner.getremainder());
    System.out.println(inner.getQuotient());
    public static void main(String[] args) {
        localouter obj= new localouter();
        

    }
}
