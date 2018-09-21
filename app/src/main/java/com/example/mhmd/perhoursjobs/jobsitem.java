package com.example.mhmd.perhoursjobs;



public class jobsitem {

    private String imgURL;
    private String jobName;
    private String jobProvider;
    private String distance;
    private String jobPrice;
    private String jobViews;
    private String jobDescription;

    public jobsitem(String imgURL, String jobName, String jobProvider, String distance, String jobPrice, String jobViews, String jobDescription) {
        this.imgURL = imgURL;
        this.jobName = jobName;
        this.jobProvider = jobProvider;
        this.distance = distance;
        this.jobPrice = jobPrice;
        this.jobViews = jobViews;
        this.jobDescription = jobDescription;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobProvider() {
        return jobProvider;
    }

    public void setJobProvider(String jobProvider) {
        this.jobProvider = jobProvider;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(String jobPrice) {
        this.jobPrice = jobPrice;
    }

    public String getJobViews() {
        return jobViews;
    }

    public void setJobViews(String jobViews) {
        this.jobViews = jobViews;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
