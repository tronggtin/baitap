package cse305;

public class LowPriorityCreator extends RequestCreator {

    @Override
    public Request createRequest() {
        return new LowPriorityRequest();
    }
}

public class MediumPriorityCreator extends RequestCreator {

    @Override
    public Request createRequest() {
        return new MediumPriorityRequest();
    }
}

public class HighPriorityCreator extends RequestCreator {

    @Override
    public Request createRequest() {
        return new HighPriorityRequest();
    }
}
