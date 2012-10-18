import java.util.*;
import java.io.*;

class Exercise5 {
    public static void main(String[] args) {
        try {
            HashSet<String> taxPayerList = new HashSet<String>();
            Scanner taxPayers = new Scanner(new File("taxpayers.txt"));
            Scanner unemployed = new Scanner(new File("unemployed.txt"));
            while(taxPayers.hasNextLine()) {
                taxPayerList.add(taxPayers.nextLine());
            }
            while(unemployed.hasNextLine()) {
                String name = unemployed.nextLine();
                if(taxPayerList.contains(name)) {
                    System.out.println(name);
                }
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}