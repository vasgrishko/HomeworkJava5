// 2. Пусть дан список сотрудников:
// Иван Иванов

// Светлана Петрова

// Кристина Белова

// Анна Мусина

// Анна Крутова

// Иван Юрин

// Петр Лыков

// Павел Чернов

// Петр Чернышов

// Мария Федорова

// Марина Светлова

// Мария Савина

// Мария Рыкова

// Марина Лугова

// Анна Владимирова

// Иван Мечников

// Петр Петин

// Иван Ежов

// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package HomeworkJava5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Task_2();
    }

    private static void Task_2() {
        Map<String, Integer> names = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";

        String[] list = employees.split(" ");
        for (int i = 0; i < list.length; i += 2) {
            if (names.containsKey(list[i])) {
                names.replace(list[i], names.get(list[i]) + 1);
            } else {
                names.put(list[i], 1);
            }
        }
        
        Map<String, Integer> sortedNames = new LinkedHashMap<>();
        int max = 1;
        for (int value : names.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : names.entrySet()) {
                String key = entry.getKey();
                if (names.get(key) == i) {
                    sortedNames.put(key, names.get(key));
                }
            }
        }
        System.out.println(sortedNames);
    }
}
