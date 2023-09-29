import java.util.NoSuchElementException;
public class Queue {

    //PIVs, array and size
    private int[] q;

    private int s = 0;

    /**
     * Default parameter-less constructor
     */
    public Queue() {}

    /**
     * Adds an item to the start of the queue
     *
     * @param element the element to be added to the queue
     */
    public void add(int element) {
      int[] temp = new int[s + 1];
      if (s > 0) {
          //increases array size by 1 and moves everything forward
        for (int i = 1; i < s; i++) {
          temp[i] = q[i-1];
        }
        q = temp;
        q[0] = element;
        s++;

        //if there is no items in the array simply set the only array value to element
      } else {
          temp[0] = element;
        q = temp;
        s++;
      }
      
    }

    /**
     * Removes a value from the end of the queue and returns it
     *
     * @return the removed value from the end of the queue
     */
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

    /**
     * Returns but does not change or remove the value at the end of the queue
     *
     * @return the last element in the queue
     */
    public int peek() {
       if (s == 0) {throw new NoSuchElementException();}

        //returns last element
       return q[s-1];
    }

    /**
     * Tells you the amount of items in the queue
     *
     * @return the size of the queue
     */
    public int size() {
      return s;
    }

    /**
     * Tells you if the queue is empty or not
     *
      * @return if the queue is empty or not
     */
    public boolean isEmpty() {
      return (s<= 0);
    }
}

