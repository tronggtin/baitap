package cse305;

import java.util.Date;

public class RentalContract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private Date startDate;
    private Date endDate;
    private float rentAmount;
    public int getContractID() {
        return contractID;
    }
    public void setContractID(int contractID) {
        this.contractID = contractID;
    }
    public int getPropertyID() {
        return propertyID;
    }
    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }
    public int getTenantID() {
        return tenantID;
    }
    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public float getRentAmount() {
        return rentAmount;
    }
    public void setRentAmount(float rentAmount) {
        this.rentAmount = rentAmount;
    }



   
    
    

}
