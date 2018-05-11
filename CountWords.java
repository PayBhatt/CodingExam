import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by payal on 5/10/2018.
 * This code reads a file and counts number of words in each line and appends the count to end of that line.
 */
public class CountWords {
    public static void main(String args[]){

        System.out.println ("Counting Words");
        try
        {
            FileReader fr = new FileReader("D:\\conFusion\\Customer.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String fileContents = "";
            while (line != null) {
                fileContents += line;
                String[] parts = line.split(" ");
                //fw.append(" " + parts.length);
                fileContents += " " + parts.length + "\r\n";
                System.out.println("number of words :" + parts.length);
                line = br.readLine();
            }
            br.close();
            System.out.println(fileContents);
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\conFusion\\Customer.txt"));
            bw.write(fileContents);
            bw.flush();
        }
        catch(Exception e){
            System.out.println (e);
        }
    }
}
