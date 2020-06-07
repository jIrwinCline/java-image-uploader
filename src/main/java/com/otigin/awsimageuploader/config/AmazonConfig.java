package com.otigin.awsimageuploader.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

  @Bean
  public AmazonS3 s3() {
    AWSCredentials awsCredentials = new BasicAWSCredentials(
        "AKIAIUZWYQ5MAS2BQ3YA",
        "8Y8sgN9LRa69z6GnAAD7/QgvMnAWfspRWg57j2qV"
    );

    return AmazonS3ClientBuilder.standard()
        .withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
  }
}
