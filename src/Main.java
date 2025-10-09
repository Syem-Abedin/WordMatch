public class Main {
    public static void main(String[] args) {
        WordMatch w = new WordMatch("missisippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
    }
}
