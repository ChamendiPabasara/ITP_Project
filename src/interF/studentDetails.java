/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interF;

/**
 *
 * @author chame
 */
class studentDetails {
    
    
    private String StudentName;
    private float gpa;
     private String StID;
      private String status;
       private String cid;
        private String did;

    public studentDetails(String StudentName, float gpa, String StID, String status, String cid, String did) {
        this.StudentName = StudentName;
        this.gpa = gpa;
        this.StID = StID;
        this.status = status;
        this.cid = cid;
        this.did = did;
    }

    public String getStudentName() {
        return StudentName;
    }

    public float getGpa() {
        return gpa;
    }

    public String getStID() {
        return StID;
    }

    public String getStatus() {
        return status;
    }

    public String getCid() {
        return cid;
    }

    public String getDid() {
        return did;
    }
        
        
        
    
}
