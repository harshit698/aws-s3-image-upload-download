package com.springbootapp.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("image-upload-s3-bucket-1");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
