import java.util.Arrays;
import java.util.Scanner;

public class EP22IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Circle circle1 = new Circle (coordinates [0], coordinates [1], coordinates [2]);
        coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Circle circle2 = new Circle (coordinates [0], coordinates [1], coordinates [2]);
        double distance = CalculateDistanceBetweenPoints (circle1.getCenter(), circle2.getCenter());
        if (distance <= circle1.getRadius() + circle2.getRadius()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }



    }

    private static double CalculateDistanceBetweenPoints (Point pointA, Point pointB)
    {
        double side1 = pointA.getX() - pointB.getX();
        double side2 = pointA.getY() - pointB.getY();

        double distance = Math.sqrt (side1 * side1 + side2 * side2);
        return distance;
    }
}

class Circle
{
    private Point center;

    public double radius;

    public Circle (double x, double y, double radius)
    {
        this.radius = radius;
        this.center = new Point (x, y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class Point
{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
