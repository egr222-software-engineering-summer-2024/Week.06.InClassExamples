public class Main {
    public static void main(String[] args) {
        Point p1 = new Point3D(4, 5, 0);
        Point p2 = new Point3D(4, 5, 6);
        Point p3 = new Point(4, 5);

        System.out.println("p1 == p2 " + (p1 == p2));   // false
        System.out.println("p1 == p3 " + (p1 == p3));   // false
        System.out.println("p3 == p2 " + (p3 == p2));   // true

        System.out.println("p1.equals(p2) " + (p1.equals(p2))); // false
        System.out.println("p1.equals(p3) " + (p1.equals(p3))); // false
        System.out.println("p3.equals(p2) " + (p3.equals(p2))); // false
        System.out.println("p2.equals(p3) " + (p2.equals(p3))); // false

        System.out.println("Other: " + p1.equals("Hello World!")); // should return false
        System.out.println("Null: " + p1.equals(null)); // should return false
    }
}