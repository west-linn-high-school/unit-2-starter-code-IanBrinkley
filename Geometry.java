public class Geometry {
    public static void main(String[] args) {
        int sides = 7;
        double radius = 5.0;
        final double PI = 22/7;
        System.out.println("A heptagon has " + sides + " sides.");
        System.out.println("A decagon has " + (sides + 3) + " sides.");
        System.out.println("A dodecagon has " + (sides + 5) + " sides.");
        System.out.println("The circumference of a circle with a radius of " + radius + " is approximately " + 2*PI*radius + ".");
    }
}
