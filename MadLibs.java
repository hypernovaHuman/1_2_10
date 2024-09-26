import java.util.Scanner;
public class MadLibs {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String input = scanner.nextLine();
        System.out.println("you said" + input);

        String madlib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        madlib = "The <noun> was very <adjective> today. It looked like a <food noun>";
    }
}
