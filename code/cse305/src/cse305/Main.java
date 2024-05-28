package cse305;

public class Main {
    public static void main(String[] args) {
        RequestCreator lowPriorityCreator = new LowPriorityCreator();
        RequestCreator mediumPriorityCreator = new MediumPriorityCreator();
        RequestCreator highPriorityCreator = new HighPriorityCreator();

        lowPriorityCreator.processRequest();
        mediumPriorityCreator.processRequest();
        highPriorityCreator.processRequest();
    }
}
