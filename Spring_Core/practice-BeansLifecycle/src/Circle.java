public class Circle implements Shape {

    private Draw2d draw2d;

    // Constructor Injection
    public Circle(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    @Override
    public void draw() {
        draw2d.draw2DShape();
        //System.out.println("Drawing Circle...");
    }
}
