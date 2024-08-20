import java.io.File;
import java.io.IOException;

public class createFile {

    public static void main(String[] args) throws IOException {
        File f1 = new File(System.getProperty("user.dir") + "\\Jyo\\jyo.txt");
             f1.createNewFile();



    File f2 = new File(System.getProperty("user.dir")+"\\Jyo\\Demo.txt");
         f2.createNewFile();
}}