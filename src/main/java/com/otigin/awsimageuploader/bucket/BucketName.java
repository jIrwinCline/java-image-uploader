package com.otigin.awsimageuploader.bucket;

public enum BucketName {

  PROFILE_IMAGE("image-upload-app");

  private final String bucketName;

  BucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public String getBucketName() {
    return bucketName;
  }
}
