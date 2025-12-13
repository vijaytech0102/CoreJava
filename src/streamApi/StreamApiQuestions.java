package streamApi;
import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " (" + salary + ")" + (department != null ? " - " + department : "");
    }
}

class Transaction {
    private String type;
    private int amount;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() { return type; }
    public int getAmount() { return amount; }

    @Override
    public String toString() { return type + " : " + amount; }
}

class Order {
    private int id;
    private double price;

    public Order(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() { return id; }
    public double getPrice() { return price; }

    @Override
    public String toString() { return "Order " + id + " : Rs. " + price; }
}

public class StreamApiQuestions {

    public static void main(String[] args) {

        System.out.println("================= STREAM API SOLUTIONS =================");

        // Q1: Given a list of integers, return a list of unique even numbers sorted.
        List<Integer> nums = Arrays.asList(10, 2, 4, 2, 10, 8, 3);
        System.out.println("1. Unique even numbers sorted: " + q1(nums));

        // Q2: Find the string with maximum length. 
        List<String> str = Arrays.asList("apple", "watermelon", "kiwi","");
        System.out.println("2. Longest string: " + q2(str));

        // Q3: Check if all numbers in the list are positive.
        System.out.println("3. All numbers positive? " + q3(nums));

        // Q4: Convert list of strings to list of their lengths.    
        System.out.println("4. Lengths: " + q4(str));

        // Q5: Find sum of squares of all odd numbers.
        System.out.println("5. Sum of squares of odd numbers: " + q5(nums));

        // Q6: Filter employees with salary > 50000 and sort them by name.
        List<Employee> emps = Arrays.asList(
                new Employee("Vijay", 60000), new Employee("Aman", 45000), new Employee("Ravi", 70000)
        );
        System.out.println("6. Filtered employees sorted: " + q6(emps));

        // Q7: Group strings based on their first character.
        //System.out.println("7. Group words by first letter: " + q7(str));

        // Q8: Find the second highest number from the list.
        System.out.println("8. Second highest number: " + q8(nums));

        // Q9: Find all duplicate elements from the list.
        System.out.println("9. Duplicate elements: " + q9(nums));

        // Q10: Group transactions by type and calculate total amount.
        List<Transaction> trans = Arrays.asList(
                new Transaction("credit", 2000), new Transaction("debit", 1000),
                new Transaction("credit", 500)
        );
        System.out.println("10. Total transactions by type: " + q10(trans));

        // Q11: Find the most frequent word in a sentence.
        String sentence = "java is great and java is powerful";
        System.out.println("11. Most frequent word: " + q11(sentence));

        // Q12: Find the highest paid employee in each department.
        List<Employee> empDept = Arrays.asList(
                new Employee("Aman", 50000, "IT"), new Employee("Ravi", 70000, "IT"),
                new Employee("Sonu", 65000, "HR"), new Employee("Asha", 68000, "HR")
        );
        System.out.println("12. Highest paid by department: " + q12(empDept));

        // Q13: Find the first repeated character in a string.
        System.out.println("13. First repeated char: " + q13("programming"));

        // Q14: Convert list of numbers into a map (number -> square).
        System.out.println("14. Map number->square: " + q14(nums));

        // Q15: Find top 3 highest priced orders.
        List<Order> orders = Arrays.asList(new Order(1, 2000), new Order(2, 5000), new Order(3, 1500));
        System.out.println("15. Top 3 expensive orders: " + q15(orders));
    }

    // 1. Unique even numbers sorted
    // Question: Given a list of integers, return a list of unique even numbers sorted.
    // Solution
    // 1
    public static List<Integer> q1(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).distinct().sorted().toList();
    }

    // 2. Longest string
    // Question: Find the string with maximum length.
    // Solution
    // 2
    public static String q2(List<String> list) {
        return list.stream().max(Comparator.comparing(String::length)).orElse(null);
    }

    // 3. All numbers positive
    // Question: Check if all numbers in list are positive.
    // Solution
    // 3
    public static boolean q3(List<Integer> list) {
        return list.stream().allMatch(n -> n > 0);
    }

    // 4. Convert strings to lengths
    // Question: Convert list of strings to list of their lengths.
    // Solution
    // 4
    public static List<Integer> q4(List<String> list) {
        return list.stream().map(String::length).toList();
    }

    // 5. Sum of squares of odd numbers
    // Question: Return sum of squares of odd numbers.
    // Solution
    // 5
    public static int q5(List<Integer> list) {
        return list.stream().filter(n -> n % 2 != 0).map(n -> n * n).reduce(0, Integer::sum);
    }

    // 6. Filter employees salary > 50k & sort by name
    // Question: From employee list filter salary > 50000 and sort by name.
    // Solution
    // 6
    public static List<Employee> q6(List<Employee> list) {
        return list.stream().filter(e -> e.getSalary() > 50000)
                .sorted(Comparator.comparing(Employee::getName)).toList();
    }

    // 7. Group words by first letter
    // Question: Group strings based on first character.
    // Solution
    // 7
    public static Map<Character, List<String>> q7(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
    }

    // 8. Second highest number
    // Question: Find second highest number from list.
    // Solution
    // 8
    public static int q8(List<Integer> list) {
        return list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }

    // 9. Find duplicates
    // Question: Return list of duplicate elements.
    // Solution
    // 9
    public static List<Integer> q9(List<Integer> list) {
        Set<Integer> unique = new HashSet<>();
        return list.stream().filter(n -> !unique.add(n)).toList();
    }

    // 10. Total amount by transaction type
    // Question: Group transactions by type and sum amounts.
    // Solution
    // 10
    public static Map<String, Integer> q10(List<Transaction> list) {
        return list.stream().collect(Collectors.groupingBy(Transaction::getType,
                Collectors.summingInt(Transaction::getAmount)));
    }

    // 11. Most frequent word
    // Question: Find most repeated word in sentence.
    // Solution
    // 11
    public static String q11(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    // 12. Highest paid in each department
    // Question: Return highest salary employee from each department.
    // Solution
    // 12
    public static Map<String, Employee> q12(List<Employee> list) {
        return list.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Optional::get)));
    }

    // 13. First repeated character
    // Question: Return first repeating character using streams.
    // Solution
    // 13
    public static Character q13(String str) {
        return str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }

    // 14. Map number -> square
    // Question: Convert list into map where key is number and value is square, handle duplicates.
    // Solution
    // 14
    public static Map<Integer, Integer> q14(List<Integer> list) {
        return list.stream().collect(Collectors.toMap(n -> n, n -> n * n, (a, b) -> a));
    }

    // 15. Top 3 expensive orders
    // Question: Return top 3 highest priced orders.
    // Solution
    // 15
    public static List<Order> q15(List<Order> list) {
        return list.stream().sorted(Comparator.comparing(Order::getPrice).reversed()).limit(3).toList();
    }
}
