package structure.decorator.bad;

public class RoadDisplayWithTraffic extends RoadDisplay {
    public void draw(){
        super.draw();
        drawTraffic();
    }

    private void drawTraffic(){
        System.out.println("신호등 표시");
    }
}
