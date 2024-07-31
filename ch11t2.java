import java.io.FileReader;
//group 14
public class ch11t2 {
    public static void main(String[] args) {
        int characterNum=0, wordNum=0, lineNum=0;
        int i;
        try {
            // Creates a reader
            FileReader reader = new FileReader("Countries.txt");
            
            // Reads the character one by one
            while((i = reader.read()) != -1){

                char ch = (char)i;//created for easier comparison
                if(ch != ' ' || ch != '\n')//a whitespace or newline is not a character
                {
                    characterNum++;

                    //if a file has a single character that mean it's not empty
                    //and has at least 1 word and 1 line
                    if(wordNum == 0)//== 0 to prevent future iteration from increasing it
                    {
                        wordNum++;
                        lineNum++;
                    }
                }
                if(ch == ' ' || ch == '\n')
                //when writing we use white space or newline to sperate word
                {
                    wordNum++;
                }
                if(ch == '\n')//if ch is a newline character 
                {
                    lineNum++;
                }
            }
            System.out.print("character number: " + characterNum + "\nword number: " + wordNum + "\nline number: " + lineNum);
            reader.close();// Closes the reader
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
