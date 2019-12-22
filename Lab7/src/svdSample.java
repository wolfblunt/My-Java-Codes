import java.io.File;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.svd.SVDRecommender;
import org.apache.mahout.cf.taste.model.DataModel;

public class svdSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataModel dm = new FileDataModel(new File("D:\\SEM 7\\Web Intelligence And Algorithms\\Lab Practicles\\Lab7\\svd_sample.csv"));
			SVD
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
