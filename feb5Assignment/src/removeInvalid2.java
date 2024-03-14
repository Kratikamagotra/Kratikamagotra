import java.util.Scanner;

public class removeInvalid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any random String: ");
        String string = scanner.nextLine();

        String[] stringArray= string.split(" ");
        String concatenatedString= String.join(" ", stringArray);

        String filteredString=concatenatedString.toString()
                .replaceAll("[^a-zA-Z\\s:]", "")
                .replaceAll("\\s+"," ");
       // String filteredString =concatenatedString.replaceAll("[0-9]","");


        String[] words= filteredString.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(!word.isEmpty()){
                stringBuilder.append(Character.toUpperCase(word.charAt(0))).append(word.substring(0)).append(" ");
            }
        }
        String finalString= stringBuilder.toString().trim();

        System.out.println("Filtered and Capitalized Title: " +finalString);



        }

    }
