  import java.util.Scanner;
public class MadLibs {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter a string");
        //String input = scanner.nextLine();
        //System.out.println("you said" + input);

        String madlib = "I went to the <place>, the <plural noun> and the <number> beasts were there.";
        //madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // madlib = "The <noun> was very <adjective> today. It looked like a <food noun>";

        //first missing part in the madlib
        //find bracketed sections
        int openBracketIndex = madlib.indexOf("<");
        int closeBracketIndex = madlib.indexOf(">");
        //find the statement in between the brackets
        String wordType = madlib.substring(openBracketIndex +1, closeBracketIndex);
        //print out the statement in between the bracket
        System.out.println("Enter a " + wordType +":");
        //read and store the user input
        String userInput = scanner.nextLine();
        //create variables for everything in the string before and after the brackets
        String firstPart = madlib.substring(0, openBracketIndex);
        String lastPart = madlib.substring(closeBracketIndex + 1);
        //create structure for complete madlib
        //everything before the brackets, the use input, and eveything after the brackets
        madlib = firstPart + userInput + lastPart;

        //second missing part in the madlib
        //find bracketed sections
        openBracketIndex = madlib.indexOf("<");
        closeBracketIndex = madlib.indexOf(">");
        //find the statement in between the brackets
        wordType = madlib.substring(openBracketIndex +1, closeBracketIndex);
        //print out the statement in between the bracket
        System.out.println("Enter a " + wordType +":");
        //read and store the user input
        userInput = scanner.nextLine();
        //create variables for everything in the string before and after the brackets
        firstPart = madlib.substring(0, openBracketIndex);
        lastPart = madlib.substring(closeBracketIndex + 1);
        //create structure for complete madlib
        //everything before the brackets, the use input, and eveything after the brackets
        madlib = firstPart + userInput + lastPart;

        //third missing part in the madlib
        //find bracketed sections
        openBracketIndex = madlib.indexOf("<");
        closeBracketIndex = madlib.indexOf(">");
        //find the statement in between the brackets
        wordType = madlib.substring(openBracketIndex +1, closeBracketIndex);
        //print out the statement in between the bracket
        System.out.println("Enter a " + wordType +":");
        //read and store the user input
        userInput = scanner.nextLine();
        //create variables for everything in the string before and after the brackets
        firstPart = madlib.substring(0, openBracketIndex);
        lastPart = madlib.substring(closeBracketIndex + 1);
        //create structure for complete madlib
        //everything before the brackets, the use input, and eveything after the brackets
        madlib = firstPart + userInput + lastPart;


        //print out complete madlib
        System.out.print(madlib);
    }
}        