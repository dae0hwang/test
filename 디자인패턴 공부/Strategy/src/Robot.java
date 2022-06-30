
interface AttackStrategy {

    public void attack();
}


class MissileStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Missile");
    }
}

class PunchStrategy implements AttackStrategy {


    @Override
    public void attack() {
        System.out.println("strong Punch");
    }
}


interface MovingStrategy { public void move(); }

class FlyingStrategy implements MovingStrategy {
    public void move() { System.out.println("fly."); }
}
class WalkingStrategy implements MovingStrategy {
    public void move() { System.out.println("walk."); }
}

abstract class Robot {

    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        attackStrategy.attack();
    }
    public void move(){
        movingStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

}


class TaekwonV extends Robot {
    public TaekwonV(String name) { super(name); }
}

class Atom extends Robot {
    public Atom(String name) { super(name); }
}

