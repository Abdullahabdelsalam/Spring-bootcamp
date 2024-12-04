public class Square implements Shape{

    private Draw3d draw3d;

    // Setter Injection
    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    @Override
    public void draw() {
        draw3d.draw3DShape();
       // System.out.println("Drawing Square...");
    }
}
