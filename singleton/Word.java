/**
 * Word class for words in flashcards
 * @author Jackson Dawson
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * constructor for word
     * @param word name of word
     * @param type type of word (noun, adj, or verb)
     * @param definition definiton of the word
     * @param sentence the word used in a sentence
     */
    public Word(String word, String type, String definition, String sentence)
    {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * returns the name of the word
     * @return String of the name of the word
     */
    public String getWord()
    {
        return this.word;
    }

    /**
     * returns the description, including the definition, type, 
     * and sentence in a format
     * @return String of the description of the word
     */
    public String getDescription()
    {
        return "Part of Speech: " + this.type + "\nDefinition: " + this.definition + "\n" + this.sentence;
    }

}
