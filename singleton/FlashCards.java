import java.util.Random;
import java.util.ArrayList;
/**
 * FlashCards class orders flashcards properly
 * @author Jackson Dawson
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Constructor for FlashCards class
     */
    private FlashCards()
    {
        rand = new Random();
        words = FileReader.getWords();
    }
    
    /**
     * getInstance method returns instance of FlashCards
     * @return flashCards instance of flashCards
     */
    public static FlashCards getInstance()
    {
        flashCards = new FlashCards();
        return flashCards;
    }

    /**
     * sets current word to a random word and returns it
     * @return a randomized word
     */
    public Word getWord()
    {
        currentWord = words.get(rand.nextInt(words.size()));
        return currentWord;
    }

}
