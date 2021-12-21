package rce.fema.gov.demorce.viewmodel;

import rce.fema.gov.demorce.model.Application;

public class ApplicationView {

    String applicationId;
    String address1;
    String address2;
    String applicantName;
    String city;
    String state;
    String zip;
    boolean applicationStatus;

    public boolean isApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(boolean applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public ApplicationView map(Application application){
        this.address1 = "123 Main St";
        this.address2 = "Suite 123";
        this.state = "Virginia";
        this.city = "Fairfax";
        this.zip = "22030";
        this.applicantName = application.getApplicantname();
        this.applicationId = application.getId();
        this.applicationStatus = application.isApplicationstatus();
        return this;
    }
}
