package patterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (InputStream in2 = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))) {
            while ((c = in2.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
