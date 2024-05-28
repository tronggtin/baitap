package cse305;

public class HighPriorityRequest extends Request {

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        this.expireDay = java.time.LocalDate.now().toString(); // current day
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}
