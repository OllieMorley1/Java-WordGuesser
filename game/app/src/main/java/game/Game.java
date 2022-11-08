package game;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Game {

    private Integer attempts = 10;
    private String word;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();

    public Game(WordChooser choose_word){
        this.word = choose_word.getRandomWordFromDictionary();
    }
    public static void main(String[] args) {}

    // public String getWordToGuess() {
    //     StringBuilder sb=new StringBuilder(this.word);
    //     for (int i  = 1; i < this.word.length(); i ++){
    //         if(!correct_guesses.contains(sb.charAt(i))){
    //             sb.replace(i, i + 1, "_");
    //         }
    //     }
    //     return sb.toString();
    // }


public String getWordToGuess(Masker masker) {
    return masker.getMaskedWord(this.word, this.guessedLetters);
}

    public Integer getRemainingAttempts(){
        return this.attempts;
    }

    public Boolean guessLetter(Character guess){
        if (this.word.indexOf(guess) != -1){
            this.guessedLetters.add(guess);
            return true;
        }
        else {
            this.attempts -= 1;
            return false;
        }
    }

    public Boolean GameWon(){
        for(int i = 1; i < this.word.length(); i++){
            Character letter = this.word.charAt(i);
            if(guessedLetters.indexOf(letter) == -1){
                return false;
            }
        } return true;
    } 

    public Boolean GameLost(){
        if(this.attempts == 0){
            return true;
        } else{
            return false;
        }
    }
}