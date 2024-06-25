// 13.9
public class Circle extends GeometricObject implements Comparable<Circle> {
    // Fields
    private double radius;

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle other) {
        // Compare circles based on their radii
        if (this.radius < other.radius) {
            return -1;
        } else if (this.radius > other.radius) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}