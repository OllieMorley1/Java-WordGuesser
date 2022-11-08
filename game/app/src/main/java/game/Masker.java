package game;
import java.util.ArrayList;

public class Masker {
    public static void main(String[] args) {
    }

    public String getMaskedWord(String word, ArrayList<Character> guessedLetters){
        StringBuilder sb=new StringBuilder(word);
        for (int i  = 1; i < word.length(); i ++){
            if(!guessedLetters.contains(sb.charAt(i))){
                sb.replace(i, i + 1, "_");
            }
        }
        return sb.toString();
    }  
}
