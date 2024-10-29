import java.awt.Point;

public class LabeledPoint17 {
    private Point point;
    private String label;
    public LabeledPoint17(int x, int y, String label) {
        this.point = new Point(x, y);
        this.label = label;
    }
    @Override
    public String toString() {
        return "LabeledPoint{point=" + point.toString() + ", label='" + label + "'}";
    }
}
