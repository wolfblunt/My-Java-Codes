//import java.util.Vector;

import java.util.Iterator;

import org.apache.commons.math3.geometry.Vector;
import org.apache.mahout.math.DenseVector;
import org.apache.mahout.math.Vector.Element;
import org.apache.mahout.math.function.DoubleDoubleFunction;

public class vectorMath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DenseVector d1 = new DenseVector(new double[] {200,400,600,800});
		DenseVector d2 = new DenseVector(new double[] {300,500,700,900});
		DenseVector r = (DenseVector)d1.times(3).minus(d2);
		System.out.println(r);
		
		DoubleDoubleFunction dd = new DoubleDoubleFunction() {
			
			@Override
			public double apply(double a, double b) {
				// TODO Auto-generated method stub
				return (a*3-b);
			}
		};
		
		d1.assign(d2,dd);
		System.out.println(d1);
		double sum = 0.0;
		Iterator<org.apache.mahout.math.Vector.Element> e = d1.iterateNonZero();
		while(e.hasNext()) {
			org.apache.mahout.math.Vector.Element e1= e.next();
			sum+= e1.get()*e1.get();
		}
		
		System.out.println(sum);

	}

}
