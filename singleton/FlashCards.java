import java.util.Random;
import java.util.ArrayList;
/**
 * FlashCards class orders flashcards properly
 * @author Jackson Dawson
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words = new ArrayList<Word>();
    private Word currentWord;

    /**
     * Constructor for FlashCards class
     */
    private FlashCards()
    {
        flashCards = new FlashCards();
        rand = new Random();
    }
    
    /**
     * getInstance method returns instance of FlashCards
     * @return flashCards instance of flashCards
     */
    public static FlashCards getInstance()
    {
        return flashCards;
    }

    public Word getWord()
    {
        return currentWord;
    }

}
