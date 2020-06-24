package vn.com.sky.face;

import java.io.File;
import java.io.FilenameFilter;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class FileUtil {
	public static MatAndId loadImage(String path) {
		 var userDir = System.getProperty("user.dir");
	     var dir = new File(userDir  + "/" + path );
	     
	     var files = dir.listFiles(new FilenameFilter() {
	    	    public boolean accept(File dir, String name) {
	    	        return name.toLowerCase().endsWith(".jpg");
	    	    }
	    	});
	     
	     var result = new MatAndId();
	     var labels = new Mat(files.length, 1, CvType.CV_32SC1);
	     
	     for(var i = 0; i < files.length; i++) {
	    	labels.put (i, 0, Integer.parseInt(files[i].getName().split("\\.")[0]));
	    	 
	    	 
	    	 Mat image = Imgcodecs.imread(files[i].getAbsolutePath());
	    	 Imgproc.cvtColor(image, image, Imgproc.COLOR_RGB2GRAY);
	    	 result.getMats().add(image);
//	    	 Imgcodecs.imwrite(file.getAbsolutePath().replace(".png", ".old.png"), image);
	     }
	     result.setLabels(labels);
	     return result;
	}
}
