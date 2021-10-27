
/**
 *
 * @author Thiwanka
 */
public class bridge_practicale {

    public static void main(String[] args) {
        
        ranger r1 = new ranger(new sniper());
        r1.running();
        ranger r2 = new ranger(new pistol());
        r2.running();
        
        commando c1 = new commando(new shotGun());
        c1.running();
        commando c2 = new commando(new sniper());
        c2.running();

    }
}

abstract class Soilder {

    Gun gun;

    public abstract void running();

    

    public Soilder(Gun gun) {
        this.gun = gun;
    }
}

class ranger extends Soilder {

    public ranger(Gun gun) {
        super(gun);
    }

    @Override
    public void running() {
        System.out.println("Running");
        gun.taking();
        gun.shoot();
        gun.drop();
    }

   
}

class commando extends Soilder {

    public commando(Gun gun) {
        super(gun);
    }

    @Override
    public void running() {
        System.out.println("Running");
        gun.taking();
        gun.shoot();
        gun.drop();
    }

}

interface Gun {

    public abstract void shoot();
    public abstract void taking();
    public abstract void drop();
}

class pistol implements Gun {

    @Override
    public void shoot() {
        System.out.println("Shoot");
    }

    @Override
    public void taking() {
        System.out.println("Taking the Pistol");
    }

    @Override
    public void drop() {
        System.out.println("Drop the Pistol");
    }
}

class sniper implements Gun {

    @Override
    public void shoot() {
        System.out.println("Shoot");
    }

    @Override
    public void taking() {
        System.out.println("Taking the Sniper");
    }

    @Override
    public void drop() {
        System.out.println("Drop the sniper");
    }
}

class shotGun implements Gun {

    @Override
    public void shoot() {
        System.out.println("Shoot");
    }

    @Override
    public void taking() {
        System.out.println("Taking the Shotgun");
    }

    @Override
    public void drop() {
        System.out.println("Drop the Shotgun");
    }

}
