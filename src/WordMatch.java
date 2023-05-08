
public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
        int numAppeared = 0;
        int lenGuess = guess.length();
        for (int i = 0; i < secret.length(); i ++){
            String temp = secret.substring(i, i + lenGuess);
            if (temp.equals(guess)){
                numAppeared ++;
            }
        }
        return numAppeared*lenGuess*lenGuess;
    }

    public String findBetterGuess(String guess1, String guess2) {
        int point1 = scoreGuess(guess1);
        int point2 = scoreGuess(guess2);
        if (point1 > point2){
            return guess1;
        }
        if (point2 > point1){
            return guess2;
        }
        if (guess1.compareTo(guess2) > 0){
            return guess1;
        }
        return guess2;
    }
}
