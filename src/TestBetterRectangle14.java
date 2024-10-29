public class TestBetterRectangle14 {
    public static void main(String[] args) {
        BetterRectangle14 rect = new BetterRectangle14(10, 20, 30, 40);

        System.out.println("Location: (" + rect.x + ", " + rect.y + ")");
        System.out.println("Size: " + rect.width + "x" + rect.height);
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
    }
}

