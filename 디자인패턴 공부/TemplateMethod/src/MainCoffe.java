public class MainCoffe {

    public static void main(String[] args) {
        Coffe americano = new IceAmericano();
        Coffe cafeLatte = new IceLatte();

        americano.putExtra();
        cafeLatte.putExtra();
        americano.makecoffe();
        cafeLatte.makecoffe();
    }

}
