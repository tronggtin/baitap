package cse305;

public class MediumPriorityRequest extends Request {

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        this.expireDay = java.time.LocalDate.now().plusMonths(1).toString(); // one month from current day
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + this.expireDay);
    }
}
