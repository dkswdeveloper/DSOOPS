import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*
4
1 2 
5 4 
3 7
8 2
[Point [x=1, y=2], Point [x=3, y=7], Point [x=5, y=4], Point [x=8, y=2]]
[Point [x=1, y=2], Point [x=5, y=4], Point [x=3, y=7], Point [x=8, y=2]]

4
1 9
3 4
5 3
6 1
[Point [x=1, y=9], Point [x=3, y=4], Point [x=5, y=3], Point [x=6, y=1]]
[Point [x=3, y=4], Point [x=6, y=1], Point [x=5, y=3], Point [x=1, y=9]]
*/
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
public class SortPoint {
    public static void main(String[] args) {
        // change the class Point so that it implements Comparable<Point> which
        // compares only the x coordinate. If x is small, point is small
        // create a class PointSumComaparator which implements Comparator<Point>
        // it adds x and y for a point, if sum is large, point is large
        // Sample input and output is shown
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Point(a, b));
        }
        Collections.sort(list);
        System.out.println(list);
        Comparator<Point> comparator = new PointSumComaparator();
        list.sort(comparator);
        System.out.println(list);
    }
}
