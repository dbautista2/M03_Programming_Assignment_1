// 13.9 
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);

        if (circle1.equals(circle2)) {
            System.out.println("Circle 1 is equal to Circle 2.");
        } else {
            System.out.println("Circle 1 is not equal to Circle 2.");
        }

        int comparison = circle1.compareTo(circle2);
        if (comparison < 0) {
            System.out.println("Circle 1 is smaller than Circle 2.");
        } else if (comparison > 0) {
            System.out.println("Circle 1 is larger than Circle 2.");
        } else {
            System.out.println("Circle 1 is the same size as Circle 2.");
        }
    }
}

/*

   GeometricObject |<|--| Circle                        

                                - radius: double                    

                                + Circle(radius: double)   
                                + getRadius(): double          
                                + setRadius(radius: double): void 
                                + getArea(): double             
                                + getPerimeter(): double    
                                + compareTo(other: Circle): int 
                                + equals(o: Object): boolean 
                                + toString(): String            
*/