public abstract class Coffe {
    final void makecoffe() {
        boilWater();
        putEspresso();
        putIce();
    }
    abstract void putExtra();

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }
    private void putEspresso(){
        System.out.println("에스프레소를 넣는다.");
    }
    private void putIce() {
        System.out.println("얼음을 넣는다.");
    }

}

class IceAmericano extends Coffe {

    @Override
    void putExtra() {
        System.out.println("시럽을 넣는다.");
    }
}

class IceLatte extends Coffe {

    @Override
    void putExtra() {
        System.out.println("우유를 넣는다.");
    }
}




/*
class IceAmericano {
    public void makeAmericano() {
        boilwater();
        putEspresso();
        putIce();
        putSyrup();
    }

    private void boilwater() {
        System.out.println("물을 끓인다.");
    }

    private void putEspresso() {
        System.out.println("에스프레소 넣는다.");
    }

    private void putIce() {
        System.out.println("얼음을 넣는다.");
    }

    private void putSyrup() {
        System.out.println("시럽을 넣는다.");
    }

}


class IceLatte {

    public void makeIceLatte() {
        boilWater();
        putEspresso();
        putIce();
        putMilk();
    }

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }

    private void putEspresso() {
        System.out.println("끓는 물에 에스프레소를 넣는다.");
    }

    private void putIce() {
        System.out.println("얼음을 넣는다.");
    }

    private void putMilk() {
        System.out.println("우유를 넣는다.");
    }
}


*/
