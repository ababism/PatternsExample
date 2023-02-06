package org.сhainOfResponsibility.developers;

public class Junior implements ITHandler{
    private int IQ = 120;


    @Override
    public boolean HandleRequest(String taskName, int requestDifficulty) {
        if (IQ >= requestDifficulty) {
            System.out.println(taskName + "done by Junior");
            return true;
        } else {
            System.out.println("Junior cant hande task");
            return false;
        }
    }
}
