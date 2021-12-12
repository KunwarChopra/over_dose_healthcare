/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author ANUSHA
 */
public class Work_Queue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<PatientAppRequest> patientAppointmentRequest;
    private ArrayList<Doctor_LabRequest> doctorLabRequest;

    
    public Work_Queue() {
        workRequestList = new ArrayList();
        patientAppointmentRequest= new ArrayList();
        doctorLabRequest= new ArrayList();

    }
    
     public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
     
    // For patientAppointmentRequest

    public ArrayList<PatientAppRequest> getPatientAppointmentRequest() {
        return patientAppointmentRequest;
    }

    public void setPatientAppointmentRequest(ArrayList<PatientAppRequest> patientAppointmentRequest) {
        this.patientAppointmentRequest = patientAppointmentRequest;
    }

    
    public ArrayList<Doctor_LabRequest> getDoctorLabRequest() {
        return doctorLabRequest;
    }

    public void setDoctorLabRequest(ArrayList<Doctor_LabRequest> doctorLabRequest) {
        this.doctorLabRequest = doctorLabRequest;
    }
    }