import java.util.Locale;

public class WordMatch {
    private String secret; //secret string

    public WordMatch(String word) { //constructs WordMatch object with the given secret string of lower case letters
        secret = word.toLowerCase();
    }

        public int scoreGuess(String guess){ //returns a score for guess
            int score = 0, index = 0;
            if (guess.length() <= secret.length() && guess.length() != 0) {
                int newIndex = 0;
                while (secret.indexOf(guess, index) != -1) {
                    newIndex = secret.indexOf(guess, index);
                    score++;
                    index = newIndex + 1;
                    //.out.println("index=" + index);
                }
            }
            score = score * guess.length() * guess.length();
            return score;
        }

        public String findBetterGuess (String guess1, String guess2){
            int a = scoreGuess(guess1);
            int b = scoreGuess(guess2);
            int compare = guess1.compareTo(guess2);
            if (a == b) {
                if (compare <0) { //guess1 string is alphabetically smaller
                    return guess2;
                } else if (compare>0) {
                    return guess1;
                }//what if they both start with the same character... didn't create a condition for this.
            } else if (a > b) {
                return guess1;
            } else if (a < b) {
                return guess2;
            }
            return null;
        }

        public static void main (String[]args){
            WordMatch game = new WordMatch("concatenation");
            System.out.println("ten score="+game.scoreGuess("con"));
            System.out.println("nation score="+game.scoreGuess("cat"));
            System.out.println(game.findBetterGuess("con","cat"));
        }
}
