package AV2Interfaces.Q2XXXX;

public class ByTwos implements Series{

    int val;

     ByTwos() {
        val = 0;
    }

    public int  getNext() {
         if (val >= MAX_VALUE) {
             System.out.println(ERROR_MESSAGE);
         } else {
             val += 2;
         }
        return val;
    }
}
