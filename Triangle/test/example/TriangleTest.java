package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    } 
    
    @Test
    public void isoscelesTriangleHaveTwoEqualSides() throws Exception {
    	Triangle triangle = new Triangle(3, 3, 2);
    	
    	assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }
    
    @Test
    public void scaleneTriangleHaveNoEqualSides() throws Exception {
    	Triangle triangle = new Triangle(3, 4, 5);
    	
    	assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }
    
    @Test
    public void triangleHaveImpossibleSide() throws Exception {
    	
    	try {
    		Triangle triangle = new Triangle(-1, 3, 5);
    		fail("Deveria ter lançado a exceção");
    	}catch(TriangleException ex) {
    	}
    }

    @Test
    public void triangleHaveSidesEqualToZero() throws Exception {
    	
    	try {
    		Triangle triangle = new Triangle(0, 0, 0);
    		fail("Deveria ter lançado a exceção");
    	}catch(TriangleException ex) {
    		
    	}
    }
    
    @Test
    public void triangleViolatesInequality() throws Exception {
    	
    	try {
    		Triangle triangle = new Triangle(1, 3, 5);
    		fail("Deveria ter lançado a exceção");
    	}catch(TriangleException ex) {
    		
    	}
    }
    
    @Test
    public void getNumberOfUniqueSidesEquilateralTriangle() throws Exception {
    	Triangle triangle = new Triangle(6, 6, 6);
    	
    	assertEquals(1, triangle.getNumberOfUniqueSides());
    }
    
    @Test
    public void getNumberOfUniqueSidesIsoscelesTriangle() throws Exception {
    	Triangle triangle = new Triangle(6, 6, 5);
    	
    	assertEquals(2, triangle.getNumberOfUniqueSides());
    }
    
    @Test
    public void getNumberOfUniqueSidesEscaleneTriangle() throws Exception {
    	Triangle triangle = new Triangle(3, 4, 5);
    	
    	assertEquals(3, triangle.getNumberOfUniqueSides());
    }
    
    
}