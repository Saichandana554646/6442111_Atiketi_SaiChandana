public class TestPlayable {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();  // Output: Playing the guitar
        piano.play();   // Output: Playing the piano
    }
}
