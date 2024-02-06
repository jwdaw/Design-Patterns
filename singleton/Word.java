/**
 * Word class for words in flashcards
 * @author Jackson Dawson
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    public Word(String word, String type, String definition, String sentence)
    {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    public String getWord()
    {
        return this.word;
    }

    public String getDescription()
    {
        return this.definition;
    }
}
