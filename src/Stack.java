import java.util.EmptyStackException;

public class Stack {

    private int[] s;

    int l = 0;

    /**
     *Constructor for Stack, takes in no parameters
     */
    public Stack() {}

    /**
     * Pushes an element to top of stack
     *
     * @param element intakes value to be added
     */
    public void push(int element) {
        int[] tmp = new int[l+1];
        if(l > 0) {
    //adds to top of stack with new array and increases size by 1
            for(int i = 0; i < l; i++) {
                tmp[i] = s[i];
            }
            
            tmp[l] = element;
            s = tmp;
            l++;

            //if it is empty just set the only value to element
        } else { 
            tmp[0] = element;
            s = tmp;
            l = 1;
        }
            
    }

    /**
     * Takes out the item from the top of the stack and returns it
     *
     * @return returns the item removed from the stack
     */
    public int pop() {
        if(l != 0 ) {
            int item = s[l-1];
            int[] tmp = new int[l-1];
            //cuts array by 1 into new array and returns extra value
            for(int i = 0; i < l-1; i++) {
                tmp[i] = s[i];
            }

            s = tmp;
            l--;
            return item;
        } else {
            throw new EmptyStackException();

        }
        
    }

    /**
     * Returns but does not remove the item at the top of the stack
     *
     * @return the item at the top of stack
     */
    public int peek() {
        if (l == 0) {
            throw new EmptyStackException();
        }
        return s[l-1];
    }


    /**
     * Tells you the amount of items in the stack
     *
     * @return length of stack array
     */
    public int size() {
        return l;
    }

    /**
     * Tells you if the stack has no values in it or not
     *
     * @return the true or false of if it is empty
     */
    public boolean isEmpty() {
        if ( l == 0) {
            return true;
        } else {
            return false;
        }
    }
}



