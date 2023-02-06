package org.сhainOfResponsibility.main;

import org.сhainOfResponsibility.developers.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String taskName = "Hardest task ever";
        int requestDifficulty = 150;

        var senior = new Senior();
        var junior = new Junior();
        var teamLead = new TeamLead();

        // Избегаем связывания отправителя получателя запроса,
        // передаем запросы по цепочке объектам хэндлерам
        List<ITHandler> handlers = Arrays.asList(senior, junior, teamLead);
        int iterator = 0;
        while (!handlers.get(iterator).HandleRequest(taskName, requestDifficulty) && iterator < handlers.size()) {
            ++iterator;
        }
    }
}
