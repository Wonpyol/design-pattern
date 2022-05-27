package structure.decorator.refactoring;

public class Client1 {
    public static void main(String[] args) {
//        Display road = new RoadDisplay1();
//        road.draw();
//
//        Display roadWithLane = new LaneDecorator(new RoadDisplay1());
//        roadWithLane.draw();
//
//        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay1());
//        roadWithTraffic.draw();

        Display roadWithLaneWithTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay1()));
        roadWithLaneWithTraffic.draw();
    }
}
