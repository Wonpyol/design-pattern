package structure.decorator.bad;

public class Client {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw(); // 기본 도로만 표시

        RoadDisplay roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw(); // 기본 도로 표시 + 차선 표시

        RoadDisplayWithTraffic roadWithTraffic = new RoadDisplayWithTraffic();
        roadWithTraffic.draw(); // 기본 도로 표시 + 신호등 표시
    }
}
