// Austin Carrick
import java.io.*;
public class GetSixLNames {
public static void main(String[] args) {
    String names_input = "rawCSSNames.txt";  // this should really be user input but ill prolly only use this once
    String names_output = "cleanCSSNames.txt";
    String temp;
        try {
        PrintWriter output =
        new PrintWriter(
            new BufferedWriter (
                new FileWriter(names_output)
            )
        );
        BufferedReader input =
            new BufferedReader(
                new FileReader(names_input));
        String s = input.readLine();
        while (s != null) {
                temp = "";
                for(int i = 8; i <= 14; i++){
                if(s.charAt(i) == ' '){
                    break;
                }
                temp += s.charAt(i);      
            }
            if(temp.length() == 6){
                temp = temp.toLowerCase();
                output.print('\'' + temp + "\',\n");
            }
            
            s = input.readLine();
        }
        output.close();
        input.close();
    }
    catch (IOException exception) {
        System.out.print("Exception");
    }         
}
}