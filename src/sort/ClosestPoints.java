package sort;

import java.util.Arrays;
import java.util.Comparator;

class Point implements Comparator<Point>{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		
	}
	private static final Point root = new Point();
	double pointDistance(Point p1, Point p2){
		return Math.sqrt(Math.pow(2, (p1.x - p2.x)) + Math.pow(2, (p1.y - p2.y)));
	}

	@Override
	public int compare(Point p1, Point p2) {
		double d1 = pointDistance(p1, root);
		double d2 = pointDistance(p2, root);
		if(d1 < d2){
			return -1;
		}
		if(d1 == d2){
			return 0;
		}
		return 1;
	}
	
}
public class ClosestPoints {
	
	 Point comp = new Point();

	
	
	public Point[] getClosest(Point[] input, int k){
		if(k <= 0) return new Point[0];

		int l = 0; int h = input.length -1; int target = k-1;
		int p = partition(input, l, h);
		while(p != target){
			if(p < target){
				p = partition(input, p+1, h);
			} else{
				p = partition(input, l, p-1);
			}
		}
		return Arrays.copyOf(input, k);
	}
	
	int partition(Point[] input, int l, int h){
		int range = h-l+1;
		int p = l + (int)Math.random()*range;
		swap(input, p, h);
		Point pivot = input[h];
		int max = l;
		for(int i = l; i < h; i++){
			if(comp.compare(input[i], pivot) < 1){
				swap(input, i, max);
				max++;
			}
		}
		swap(input, max, h);
		return max;
	}
	
	void swap(Object[] input, int i, int j){
		Object tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}
}
