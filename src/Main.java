import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch a = new WordMatch("aaaabb");
        System.out.println(a.scoreGuess("a"));
        System.out.println(a.scoreGuess("aa"));
        System.out.println(a.scoreGuess("aaa"));
        System.out.println(a.scoreGuess("aabb"));
        System.out.println(a.scoreGuess("c"));
        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
        System.out.println("Challenge answer: " + read());
    }
    public static int read() throws FileNotFoundException {
        int tscore = 0;
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()) {
            WordMatch Word = new WordMatch(s.next());
            tscore = tscore + Word.scoreGuess(Word.findBetterGuess(s.next(), s.next()));
        }
        return tscore;
    }
}
