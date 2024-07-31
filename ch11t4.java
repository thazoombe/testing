import java.io.BufferedReader;
import java.io.FileReader;
//group 14
public class ch11t4 {
    public static void main(String[] args) {
        String line;
        try {
            // Creates a reader that is linked with the myFile.txt
            BufferedReader reader = new BufferedReader(
            new FileReader("Scores.txt"));

            // Reads the file line by line
            while ((line = reader.readLine()) != null) {
                int arraylenth=0;//store the lenght of numArrayStr array
                int total = 0;//store total score
                int[] numArrayInt = {0,0,0,0,0,0};//array to store the int that converted from numArrayStr
                String numArrayStr[] = line.split(" ");//split the line and store them in an string array

                //use try and catch to let program run normally 
                //after numArrayStr thows an ArrayIndexOutOfBoundsException
                try {
                    //loop to convert number that have data type as string to int
                    //and count the length of numArrayStr 
                    while(true)
                    {
                        numArrayInt[arraylenth] = Integer.parseInt(numArrayStr[arraylenth]);
                        arraylenth++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    //after received exception do nothing
                }

                //loop to calculate total
                for(int i = 0; i < arraylenth; i++)
                {
                    total += numArrayInt[i];
                }
                System.out.println("total: " + total);//display total
                System.out.println("average: " + (float)total/arraylenth);//display average
            }
            // Closes the reader
            reader.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
