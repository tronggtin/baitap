package cse305;

/**
 * Request
 */
public abstract class Request {
    protected String priority;
    protected String expireDay;
    protected String status;

    public abstract void setPriority();

    public abstract void setExpire();

    public abstract void setStatus();

    public abstract void processRequest();
}