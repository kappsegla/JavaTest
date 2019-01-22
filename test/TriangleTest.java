import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void isScalene_3DifferentSides_True() {

        //Arrange
        Triangle triangle = new Triangle(2.0, 3.0, 4.0);

        //Act
        boolean scalene = triangle.isScalene();

        //Assert
        assertTrue(scalene);
    }

    @Test
    void isScalene_2SidesWithSameLength_False() {
        Triangle triangle = new Triangle(2.0, 2.0, 3.0);

        assertFalse(triangle.isScalene());
    }

    @Test
    void isEquilateral_AllSidesSameLength_True() {
        Triangle triangle = new Triangle(2.0, 2.0, 2.0);

        assertTrue(triangle.isEquilateral());
    }

    @Test
    void isEquilateral_DifferentLength_False() {
        Triangle triangle = new Triangle(3.0, 2.0, 1.0);

        assertFalse(triangle.isEquilateral());
    }

    @Test
    void isIsosceles_TwoEqualSides_True() {
        Triangle triangle = new Triangle(3.0, 3.0, 4.0);

        assertTrue(triangle.isIsosceles());
    }

    @Test
    void isIsosceles_NoEqualSides_False() {
        Triangle triangle = new Triangle(3.0, 2.0, 4.0);

        assertFalse(triangle.isIsosceles());
    }

    @Test
    void Triangle_PointConstructor_sides() {
        Triangle triangle = new Triangle(new Point(0,0), new Point(4,0), new Point(2,4));

//        assertEquals( 4.0, triangle.sides[0], 0.1);
//        assertEquals( 4.472, triangle.sides[1], 0.001);
//        assertEquals( 4.472, triangle.sides[2], 0.001);

        double[] expected = new double[]{4.0,4.472,4.472};

        assertArrayEquals( expected, triangle.sides,0.001);

    }
}