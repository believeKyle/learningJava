package com.kyle.java8;

import org.testng.annotations.Test;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Filter;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testMoveRightBy() {
        Point p1 = new Point(5,5);
        Point p2 = p1.moveRightBy(10);
        assertEquals(15, p2.getX());
        assertEquals(5, p2.getY());
    }

    @Test
    public void testMoveAllPointsRightBy() throws Exception{
        List<Point> points = Arrays.asList(new Point(5, 5), new Point(10, 5));
        List<Point> exceptedPoints = Arrays.asList(new Point(15, 5), new Point(20, 5));
        List<Point> newPoints = Point.moveAllPointsRightBy(points, 10);
        assertEquals(exceptedPoints, newPoints);
    }

    @Test
    public void testFilter() throws Exception{
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        List<Integer> even = filter(numbers,  i->i%2 == 0);
        List<Integer> smallerThanThree = filter(numbers, i->i<3);
        assertEquals(Arrays.asList(2, 4), even);
        assertEquals(Arrays.asList(1, 2), smallerThanThree);
    }

    public <T> List<T> filter(List<T> numbers, Predicate<T> predicate){
        List<T> result = new ArrayList<T>();
        for ( T e : numbers){
            if (predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}