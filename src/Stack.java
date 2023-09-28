import java.util.EmptyStackException;

public class Stack {

    private int[] s;

    int l = 0;

    public Stack() {}
    
    public void push(int element) {
        int[] tmp = new int[l+1]
        if(l > 0) {
    
            for(int i = 0; i < l; i++) {
                tmp[i] = s[i];
            }
            
            tmp[l] = element;
            s = tmp;
            l++;
        } else { 
            tmp[0] = element;
            s = tmp;
            l = 1;
        }
            
    }

    public int pop() {
        if(l != 0 ) {
            int item = s[l-1];
            int[] tmp = new int[l-1]

            for(int i = 0; i < l-1; i++) {
                tmp[i] = s[i];
            }

            S = tmp;
            l--;
            return item;
        } else {
            throw new EmptyStackException();

            return -1;
        }
        
    }

    public int peek() {
        if (size <= 0) {
            throw new EmptyStackException();
        }
        return s[l-1];
    }

    public int size() {
        return l;
    }

    public boolean isEmpty() {
        if (l == 0;) {
            return true;
        } else {
            return false;
        }
    }
  
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}



