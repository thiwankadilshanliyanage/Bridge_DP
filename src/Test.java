/**
 *
 * @author Thiwanka
 */
public class Test {

    
    public static void main(String[] args) {
        
    }
    
}
abstract class Shape{
    Clour clour;
    public abstract void draw();
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
    
}

class Rectangale extends Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle");
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