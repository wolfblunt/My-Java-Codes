import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.svd.Factorization;
import org.apache.mahout.cf.taste.impl.recommender.svd.*;

import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.math.DenseMatrix;
public class svdppSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataModel dm = new FileDataModel(new File("D:\\SEM 7\\Web Intelligence And Algorithms\\Lab Practicles\\Lab7\\ratings.csv"));
			SVDPlusPlusFactorizer s1 = new SVDPlusPlusFactorizer(dm, 0, 5);
		//	Factorization f1 = s1.factorize();
			//DenseMatrix d1 = new DenseMatrix(f1.allUserFeatures());
			//DenseMatrix d2 = f1.
			SVDRecommender s = new SVDRecommender(dm, s1);
			System.out.println(s);
//			int d3 = factorizer.numFeatures();
//			System.out.println(d3);
			
			//SVDRecommender recommender = new SVDRecommender(dataModel, svdPlusPlusFactorizer);
			
			List<RecommendedItem> recommendedItems = s.recommend(15, 3);
			
			for (RecommendedItem recommendation: recommendedItems) {
				System.out.println(recommendation);
			}
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
