import java.util.Arrays;

public class Triangle {

    double[] sides;

    public Triangle(double a, double b, double c) {
        sides = new double[]{a, b, c};
    }

    public Triangle(double[] s) {
        sides = new double[s.length];
        System.arraycopy(s, 0, sides, 0, s.length);
//    for(int i=0;i<s.length;i++)
//      sides[i]=s[i];
    }

    public Triangle(Point a, Point b, Point c) {
        sides = new double[3];
        sides[0] = Math.sqrt(Math.pow((double) (b.x - a.x), 2.0) + Math.pow((double) (b.y - a.y), 2.0));
        sides[1] = Math.sqrt(Math.pow((double) (b.x - c.x), 2.0) + Math.pow((double) (b.y - c.y), 2.0));
        sides[2] = Math.sqrt(Math.pow((double) (c.x - a.x), 2.0) + Math.pow((double) (c.y - a.y), 2.0));
    }

    public Triangle(Point[] s) {
        sides = new double[s.length];
        sides[0] = Math.sqrt(Math.pow((double) (s[1].x - s[0].x), 2.0) + Math.pow((double) (s[1].y - s[0].y), 2.0));
        sides[1] = Math.sqrt(Math.pow((double) (s[1].x - s[2].x), 2.0) + Math.pow((double) (s[1].x - s[2].x), 2.0));
        sides[2] = Math.sqrt(Math.pow((double) (s[2].x - s[0].x), 2.0) + Math.pow((double) (s[2].x - s[0].x), 2.0));
    }

    private int uniqueSides() {
        return (int) Arrays.stream(sides).distinct().count();
    }

    //Scalene triangles are triangles where each side is a different length.
    public boolean isScalene() {
        if (uniqueSides() == 3) {
            return true;
        }
        return false;
    }

    //Triangle with all sides of equal length
    public boolean isEquilateral() {
        if (uniqueSides() == 1) {
            return true;
        }
        return false;
    }

    //An isosceles triangle is a triangle that has two sides of equal length
    public boolean isIsosceles() {
        if (uniqueSides() == 2) {
            return true;
        }
        return false;
    }
}