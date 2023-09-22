import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class program  {

    public static void main(String[] args) {
        
        HashMap<String, String> phoneBook = new HashMap<>();

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество записей: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            System.out.println("Запись " + (i + 1));
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите телефон: ");
            String phone = scanner.nextLine();

           
            if (phoneBook.containsKey(name)) {
                String phones = phoneBook.get(name);
                phones += ", " + phone;
                phoneBook.put(name, phones);
            }
            
            else {
                phoneBook.put(name, phone);
            }
        }

        
        TreeMap<Integer, String> sortedPhoneBook = new TreeMap<>((o1, o2) -> o2.compareTo(o1));

        
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            String phones = entry.getValue();
            int numOfPhones = phones.split(", ").length;
            sortedPhoneBook.put(numOfPhones, name + ": " + phones);
        }

        // Выводим отсортированную телефонную книгу
        System.out.println("Телефонная книга:");
        for (Map.Entry<Integer, String> entry : sortedPhoneBook.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
