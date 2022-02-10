package Hangman;

import java.io.*;
import java.util.*;

public class Gameword {

    private String filename;
    private String randomWord;
    private String underScoreWord = "";

    private int randomWordLength;

    private ArrayList<String> wordList;

    public Gameword() throws IOException {

        setWordsList("words.txt");
        setRandomWord();

    }

    public void test() {
        System.out.println();
        System.out.println("Test Statements: Gameword");
        System.out.println(getWordsList());
        System.out.println(getRandomWord());
        System.out.println(getUnderScoreWord());
    }

    public void setFileName(String file) {
        this.filename = file;
    }

    public void setWordsList(String filename) throws IOException {

        setFileName(filename);

        FileInputStream inputStream = null;
        ArrayList<String> words = new ArrayList<>();
        try {
           // Getting ClassLoader obj
           ClassLoader classLoader = this.getClass().getClassLoader();
           // Getting resource(File) from class loader
           File configFile = new File(Objects.requireNonNull(classLoader.getResource(getFileName())).getFile());

           inputStream = new FileInputStream(configFile);
           BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

           String line;
           while ((line = reader.readLine()) != null) {
               words.add(line);
           }
           reader.close();

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } finally {
            try {
               assert inputStream != null;
               inputStream.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
        this.wordList = words;
    }

    public ArrayList<String> getWordsList() {
        return wordList;
    }

    public int getWordsListIndex() {
        ArrayList<String> words = getWordsList();

        int max = words.size();
        return (int) ((Math.random() * (max - 1)) + 1);

    }

    public void setRandomWord() {
       int random = getWordsListIndex();
       this.randomWord = wordList.get(random);
       this.randomWordLength = wordList.get(random).length();
    }

    public String getFileName() {
        return filename;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public int getRandomWordLength() {
        return randomWordLength;
    }

    public void setUnderScoreWord(String underscores) { this.underScoreWord = underscores; }

    public String getUnderScoreLength() {
        int length = getRandomWordLength();
        String underscores = "";
        for( int i = 0; i < length; i++ ) {
            String underScore = "_";
            underscores = underscores + underScore;
        }
        return underscores;
    }

    public String getUnderScoreWord() {
        setUnderScoreWord(getUnderScoreLength());
        return underScoreWord;
    }
}
