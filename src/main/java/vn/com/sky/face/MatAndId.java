package vn.com.sky.face;

import java.util.ArrayList;

import org.opencv.core.Mat;

import lombok.Data;

@Data
public class MatAndId {
	private ArrayList<Mat> mats = new ArrayList<Mat>();
	private Mat labels; 
}
