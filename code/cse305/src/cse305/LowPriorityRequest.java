package cse305;

public class LowPriorityRequest extends Request {

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setExpire() {
        this.expireDay = java.time.LocalDate.now().toString(); // current day
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
