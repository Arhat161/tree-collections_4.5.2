package ru.netology;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Candidate> allCandidates = new TreeSet<Candidate>();

        List<Candidate> candidates = Arrays.asList(
                new Candidate("Иванов Иван Иванович", "male", "28", 4, 4),
                new Candidate("Классухина Снежанна Борисовна", "female", "24", 4, 3),
                new Candidate("Петров Ибрагим Аванесович", "male", "46", 5, 5),
                new Candidate("Ахиджанов Сергей Безрукович", "male", "37", 3, 3),
                new Candidate("Бабайкин Ахтунг Настрёмович", "male", "18", 3, 5),
                new Candidate("Круглов Александр Мойшович", "male", "53", 2, 2),
                new Candidate("Японов Самурай Якудзович", "male", "65", 5, 4),
                new Candidate("Мухин Артур Каренович", "male", "33", 4, 3),
                new Candidate("Динамина Любовь Ашотовна", "female", "23", 3, 5),
                new Candidate("Пирожков Артур Рубенович", "male", "45", 2, 5),
                new Candidate("Сидоров Евгений Сидорович", "male", "25", 3, 4)
        );

        if (!allCandidates.addAll(candidates)) {
            System.out.println("Ошибка добавления списка кандидатов в TreeSet!");
        } else {
            showAllCandidates(allCandidates);
        }


    }

    public static void showAllCandidates(Set allCandidates) {
        if (allCandidates.size() > 0) {
            System.out.println("\nФИО, Релевантность резюме, Оценка на собеседовании\n");
            for (Object oneCandidate : allCandidates) {
                Candidate candidate = (Candidate) oneCandidate;
                System.out.println(candidate.getFio() + ", " + candidate.getRelevance() + ", " + candidate.getRating());
            }
        } else {
            System.out.println("Нет кандидатов в списке!");
        }
    }
}
