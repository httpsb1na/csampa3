import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    boolean a = false;
    if (wordList != null) {
      for (int i = 1; i < wordList.size(); i++) {
        String p = wordList.get(i - 1);
        String c = wordList.get(i);
        if (wordList.get(i).indexOf(wordList.get(i - 1)) != -1) {
          a = true;
        } else {
          a = false;
        }
      }
    }
    return a;
  }
