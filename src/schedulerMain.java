import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Ted on 8/13/2016.
 */
class schedulerMain {

    public static void main(String[] args){
        System.out.println("Hello World");
        PrintWriter out = null;
        try {
            out = new PrintWriter("testOutput.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        out.println("The first line");
        out.println("The second line");
        out.close();

    }
}
