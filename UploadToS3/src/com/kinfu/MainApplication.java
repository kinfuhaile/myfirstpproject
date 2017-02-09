package com.kinfu;


import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class MainApplication {
	private static String bucketName     = "kinfu";
	private static String keyName        = "Kinfu";
	
	private static String uploadFileName = "TV_LA_Home_Desktop.jpg";
	
	public static void main(String[] args) throws IOException {
        
            File file = new File(uploadFileName);            
            UploadFileToS3SingleOperation fileToS3SingleOperation = new UploadFileToS3SingleOperation();
            fileToS3SingleOperation.uploadToAWS3SingleOperation(file, bucketName, keyName);

         
    }
}
