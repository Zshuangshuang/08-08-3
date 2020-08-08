/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-08
 * Time:22:39
 **/
class Shape{
    public void draw(){

    }
}
class Cycle extends  Shape{
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class React extends  Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个△");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();

    }
    public static void main(String[] args) {
        Shape shape = new Cycle();

        Shape shape1 = new React();
       drawMap(shape);
       drawMap(shape1);
    }
}
