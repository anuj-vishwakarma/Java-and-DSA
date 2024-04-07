public class Regex_StudentChallenge2 {
    public static void main(String[] args) {
        String str = "1eerw2*+_#!&@";
        // format the string, remove the characters except alphabets and numbers

//        System.out.println(str.replaceAll("[^a-zA-Z0-9]*",""));

        //Removing extra spaces

        String str1 = "    an   ren   fdfad   fdfd";
//        System.out.println(str1.replaceAll("\\s+", " ").trim());

        str1 = str1.replaceAll("\\s+", " ").trim();
        String [] words  = str1.split("\\s");
        System.out.println(words.length);
    }
}
