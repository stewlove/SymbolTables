import edu.greenriver.sdev333.BST;
import edu.greenriver.sdev333.OrderedSymbolTable;
import edu.greenriver.sdev333.SeparateChainingHashST;
import edu.greenriver.sdev333.SymbolTable;
import java.util.Scanner;

/**
 * Basic symbol table test client
 * p. 370 of Sedgewick and Wayne
 * Authors have a running example throughout the text, with pictures of
 *  "S I M P L E E X A M P L E" and we rewrote the client to be in our style
 *  of writing Java code in our program.
 */
public class BasicTestClient {
    public static void main(String[] args) {
        String inputString = "S E A R C H E X A M P L E";

        Scanner input = new Scanner(inputString);

        // You can replace the implementation with any class that implements
        // SymbolTable interface
        SymbolTable<String, Integer> st = new SeparateChainingHashST<>();

        int i = 0;
        while (input.hasNext()) {
            String key = input.next();
            st.put(key, i);
            i++;
        }

        for (String s : st.keys()) {
            System.out.println(s + " " + st.get(s));
        }

        //The basic test client is extended to test the min, max, floor, ceiling, select, rank methods (delete methods not required)
        /*System.out.println(st.min());
        System.out.println(st.max());
        System.out.println(st.floor("B"));
        System.out.println(st.ceiling("C"));
        System.out.println(st.select(1));
        System.out.println(st.rank("F"));*/
    }
}
