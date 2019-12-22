import org.apache.mahout.math.DenseMatrix;
import org.apache.mahout.math.DenseVector;
import org.apache.mahout.math.Matrix;
import org.apache.mahout.math.SingularValueDecomposition;
import org.apache.mahout.math.Vector.Element;
import org.apache.mahout.math.function.DoubleDoubleFunction;

public class SVD_sample {
	
	public static void main(String[] args) {
		DenseMatrix dm = new DenseMatrix(new double[][] {{1,1,1,0,0},{3,3,3,0,0},{4,4,4,0,0},{5,5,5,0,0},{0,2,0,3,3},{0,0,0,5,5},{0,1,0,4,4}});
//		DenseVector dv1 = new DenseVector(new Double[] {1,3,4,5,0,0,0});
//		DenseVector dv2 = new DenseVector(new Double[] {1,3,4,5,2,0,1});
		
		DenseVector dv1 = new DenseVector(new double[] {1,3,4,5,0,0,0});
		dm.assignColumn(0, dv1);
		DenseVector dv2 = new DenseVector(new double[] {1,3,4,5,2,0,1});
		dm.assignColumn(1, dv2);
		DenseVector dv3 = new DenseVector(new double[] {1,3,4,5,0,0,0});
		dm.assignColumn(2, dv3);
		DenseVector dv4 = new DenseVector(new double[] {1,3,4,5,3,5,4});
		dm.assignColumn(3, dv4);
		DenseVector dv5 = new DenseVector(new double[] {1,3,4,5,3,5,4});
		dm.assignColumn(4, dv5);
		
		SingularValueDecomposition svdm = new SingularValueDecomposition(dm);
		System.out.println(svdm.getU());
		System.out.println("");
		System.out.println(svdm.getS());
		System.out.println("");
		System.out.println(svdm.getV());
		
		System.out.println(svdm.rank());
		
		DenseMatrix dm1 = (DenseMatrix) svdm.getS();
		double Tenergy = 0;
		for(int i=0;i<svdm.rank();i++) {
			Tenergy = (double) (Tenergy + Math.pow((double) dm1.get(i, i), 2));
			
		}
		System.out.println(Tenergy);
		double Thresholdenergy = 0.8*Tenergy;
		System.out.println(Thresholdenergy);
		double e1 = 0;
		for(int i =0;i<2;i++) {
			e1 = (double) (e1 + Math.pow((double) dm1.get(i, i), 2));
		}
		System.out.println(e1);
		
		DenseVector dvq = new DenseVector(new double[] {5,0,0,0,0});
		Matrix m1 = svdm.getV();
		Matrix trans = m1.transpose();
		 
		System.out.println(trans.times(dvq));
		
	}
		
		 
	
	

}
