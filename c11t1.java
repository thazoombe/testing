import java.io.FileReader;
import java.io.BufferedReader;
//group 14
public class c11t1 {
    public static void main(String[] args) {
        String line;
        int counter=0;
        try {
            // Creates a reader
            BufferedReader reader = new BufferedReader(new FileReader("Countries.txt"));
            
            // Reads the file line by line
            while ((line = reader.readLine()) != null) {
                int length = line.length();//created to store the lenght of current line
                char lastLetter = line.charAt(length-1);//created to store the char at the end of current line
                
                if(lastLetter == 'a')//check if the char at the end of the current line is 'a'
                {
                    counter++;
                }
            }
            reader.close();// Closes the reader
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.print("number of countries which end with an alphabet 'a' is " + counter);
    }
}
