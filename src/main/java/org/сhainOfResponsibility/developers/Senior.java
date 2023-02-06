package org.сhainOfResponsibility.developers;

public class Senior implements ITHandler{
    boolean spareTimeFlag = false;
    @Override
    public boolean HandleRequest(String taskName, int requestDifficulty) {
        if (spareTimeFlag) {
            System.out.println(taskName + "done by Senior");
        } else {
            System.out.println("Senior cant hande task");
        }
        return spareTimeFlag;
    }
}
