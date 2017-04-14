import java.io.*;

/**
 * Created by Ted on 8/13/2016.
 */

/**
 * Minimum viable product:
 *  Match workers to shifts according to availability, ability, requests off
 *  Export 7 days schedule to CSV or other easily read/printable format
 */
class schedulerMain {

    public static void main(String[] args){
        System.out.println("Hello World");
        /*File dir = new File("testOutput");
        dir.mkdir();
        File file = new File("testOutput","test.txt");
        System.out.println("Absolute path: " + file.getAbsolutePath());

        Shift testShift = new Shift(1);

        try {
            String content = "This is a modified line!\nThis is the second line!";
            if(!file.exists()) {
                System.out.println("DOesn't exist.");
                file.createNewFile();
            }
            FileWriter fw = new FileWriter((file.getAbsolutePath()));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
