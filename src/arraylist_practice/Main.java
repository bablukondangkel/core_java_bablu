package arraylist_practice;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "a1c25i@30Nic";
        ArrayList<String> outputList = extractAndStore(input);
        
        for (String element : outputList) {
            System.out.print(element + " ");
        }
    }

    public static ArrayList<String> extractAndStore(String input) {
        ArrayList<String> outputList = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                current.append(c);
            } else if (Character.isDigit(c)) {
                current.append(c);
            } else {
                if (current.length() > 0) {
                    outputList.add(current.toString());
                    current.setLength(0); 
                }
                outputList.add(String.valueOf(c));
            }
        }

        if (current.length() > 0) {
            outputList.add(current.toString());
        }

        return outputList;
    }
}