import java.util.NoSuchElementException;
public class Queue {

    //PIVs, array and size
    private int[] q;

    private int s = 0;

    
    public Queue() {}

  
    public void add(int element) {
      int[] temp = new int[s + 1]
      if (s > 0) {
          //increases array size by 1 and moves everything forward
        for (int i = 1; i < s; i++) {
          temp[i] = q[i-1];
        }
        q = temp;
        q[0] = element;
        s++;
      } else {
        q[0] = element;
        s++;
      }
      
    }
  
    public int remove() {
      if (s == 0) {throw new NoSuchElementException();}

        
      int tmp = q[s-1];
      int[] temp = new int[s-1];

        //sizes down the array by 1 copying in
        
      for(int i = 0; i < (s-1); i++) {
        temp[i] = q[i];
      }
      q = temp;
      s--;
      return tmp;
    }
  
    public int peek() {
       if (s == 0) {throw new NoSuchElementException();}

        //returns last element
       return q[s-1];
    }
  
    public int size() {
      return s;
    }
  
    public boolean isEmpty() {
      return (size <= 0);
    }
}

