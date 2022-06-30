public class othersOOP {

    public static void main(String[] args) {
        Subclass subclass = new Subclass();

    }

}

abstract class Superclass {
    public Superclass(String str) {
        System.out.println(str);
    }
}

class Subclass extends Superclass {

    public Subclass() {
        super("부모 생성자");
        System.out.println("자식 생성자 호출");
    }
}


