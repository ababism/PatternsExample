package org.сhainOfResponsibility.developers;

public class TeamLead implements ITHandler{

    @Override
    public boolean HandleRequest(String taskName, int requestDifficulty) {
        System.out.println(taskName + " done by TeamLead");
        return true;
    }
}
