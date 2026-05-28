interface Playable {
    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("The guitar is playing music.");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
    }
}