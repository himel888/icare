package com.brittolab.icare.Database;

/**
 * Created by Mobile App Develop on 19-1-16.
 */
public class DoctorInfoTable {


    private int doctorId;
    private String drName;
    private String drSpeciality;
    private String drAddress;
    private String drContactNo;
    private String drEmail;
    private String drAppointmentDate;
    private String drAppointmentTime;
    private int refUserId;




    public DoctorInfoTable(int doctorId, String drName, String drSpeciality,
                           String drAddress, String drContactNo,
                           String drEmail, String drAppointmentDate,
                           String drAppointmentTime,int refUserId) {
        this.doctorId = doctorId;
        this.drName = drName;
        this.drSpeciality = drSpeciality;
        this.drAddress = drAddress;
        this.drContactNo = drContactNo;
        this.drEmail = drEmail;
        this.drContactNo = drAppointmentDate;
        this.drEmail = drAppointmentTime;
        this.refUserId = refUserId;

    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDrSpeciality() {
        return drSpeciality;
    }

    public void setDrSpeciality(String drSpeciality) {
        this.drSpeciality = drSpeciality;
    }

    public String getDrAddress() {
        return drAddress;
    }

    public void setDrAddress(String drAddress) {
        this.drAddress = drAddress;
    }

    public String getDrContactNo() {
        return drContactNo;
    }

    public void setDrContactNo(String drContactNo) {
        this.drContactNo = drContactNo;
    }

    public String getDrEmail() {
        return drEmail;
    }

    public void setDrEmail(String drEmail) {
        this.drEmail = drEmail;
    }

    public String getDrAppointmentDate() {
        return drAppointmentDate;
    }

    public void setDrAppointmentDate(String drAppointmentDate) {
        this.drAppointmentDate = drAppointmentDate;
    }

    public String getDrAppointmentTime() {
        return drAppointmentTime;
    }

    public void setDrAppointmentTime(String drAppointmentTime) {
        this.drAppointmentTime = drAppointmentTime;
    }

    public int getRefUserId() {
        return refUserId;
    }

    public void setRefUserId(int refUserId) {
        this.refUserId = refUserId;
    }

}
