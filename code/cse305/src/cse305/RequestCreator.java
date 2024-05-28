package cse305;

public abstract class RequestCreator {
    public abstract Request createRequest();

    public void processRequest() {
        Request request = createRequest();
        request.setPriority();
        request.setExpire();
        request.setStatus();
        request.processRequest();
    }
}
