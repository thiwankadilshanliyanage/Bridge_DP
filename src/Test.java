/**
 *
 * @author Thiwanka
 */
public class Test {

    
    public static void main(String[] args) {
        
        Circle c1 = new Circle(new Red());
        c1.draw();
        Circle c2 = new Circle(new Blue());
        c2.draw();
        Rectangale r1 = new Rectangale(new Red());
        r1.draw();
        
        
    }
    
}
abstract class Shape{
    Clour clour;

    public Shape(Clour clour) {
        this.clour = clour;
    }
    public abstract void draw();
}

class Circle extends Shape{

    public Circle(Clour clour) {
        super(clour);
    }
    @Override
    public void draw() {
        System.out.println(" Draw Circle");
        clour.fill();
    }
    
}

class Rectangale extends Shape{

    public Rectangale(Clour clour) {
        super(clour);
    }
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
        clour.fill();
    }
    
}

interface Clour{
    public abstract void fill();
}

class Red implements Clour{

    @Override
    public void fill() {
        System.out.println("FIll Red Clour");
    }
    
}

class Blue implements Clour{

    @Override
    public void fill() {
        System.out.println("FIll Blue Clour");
    }
    
}