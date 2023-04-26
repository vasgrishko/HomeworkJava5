// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек 
// может иметь несколько телефонов.

package HomeworkJava5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Иванов С.С.");
        nameBook.put(1, "Петров А.А.");
        nameBook.put(2, "Терентьев В.В.");
        nameBook.put(3, "Сидоров К.К.");
        for (int i=0; i< nameBook.size(); i++){
            if (phoneBook.get(i) == null){
                phoneBook.put(i, new ArrayList<String>()); 
                phoneBook.get(i).add("8-965-454-00-"+ i + i +";"+"8-920-855-01-"+ i + i);
            } 
            System.out.println("Телефонные номера абонента"+" "+ nameBook.get(i)+":" + " " + phoneBook.get(i));
        }
               
    }
}

