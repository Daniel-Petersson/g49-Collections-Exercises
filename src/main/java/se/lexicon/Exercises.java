package se.lexicon;

import java.util.*;

/**
 * Hello world!
 */
public class Exercises {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();

    }

    //1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
    public static void ex1() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        System.out.println("List: " + weekdays);
    }

    //2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
    //and print out each element separately.
    public static void ex2() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        List<String> newWeekdays = new ArrayList<>();
        newWeekdays.addAll(0, weekdays);
        Iterator<String> itr = newWeekdays.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    //3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
    //insert the weekday THURSDAY into the right position in the list.
    public static void ex3() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        //weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        System.out.println("Week without Thursday: " + weekdays);
        weekdays.add(3, "Thursday");
        System.out.println("Week after i added thursday to the right index: " + weekdays);
    }

    //4. Create a new list and populate it with the days of the week. Then create a new list out of the
    //first three elements of the first list using a subList.
    public static void ex4() {
        List<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        List<String> subWeek = weekdays.subList(0, 3);
        System.out.println(subWeek);
    }

    //5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
    //pay attention to the order of the elements.
    public static void ex5() {
        HashSet<String> weekdays = new HashSet<String>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        System.out.println(weekdays);
    }

    //6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
    //an arrayList.
    public static void ex6() {
        HashSet<String> weekdays = new HashSet<String>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        ArrayList<String> weekArray = new ArrayList<>(weekdays);
        System.out.println("Arraylist: " + weekArray);
    }

    //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an
    //arrayList. Lastly, manually sort the list in alphabetical order and print it out.
    public static void ex7() {
        HashSet<String> names = new HashSet<String>();
        names.add("Lena");
        names.add("Olle");
        names.add("Jonas");
        names.add("Helmer");
        names.add("Frida");
        names.add("Sture");
        names.add("Sandra");

        ArrayList<String> namesArray = new ArrayList<>(names);
        System.out.println("Unsorted ArrayList: " + namesArray);
        Collections.sort(namesArray);
        System.out.println("Sorted ArrayList: " + namesArray);

    }

    //8. Create a new hashSet and populate it with random names. Lastly, sort the names in
    //alphabetical order using only a Set or a child of Set.
    public static void ex8() {
        HashSet<String> names = new HashSet<String>();
        names.add("Lena");
        names.add("Olle");
        names.add("Jonas");
        names.add("Helmer");
        names.add("Frida");
        names.add("Sture");
        names.add("Sandra");

        TreeSet<String> sortedHashSet = new TreeSet<>();
        for (String name : names) {
            sortedHashSet.add(name);
        }
        System.out.println("Sorted HashSet names: " + sortedHashSet);
    }

    //9. Create a new hashMap of type <Integer,String> and populate it with elements containing an
    //id(Integer) and a car brand(String). Lastly, print out the entire hashMap.
    public static void ex9() {
        HashMap<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Volvo");
        cars.put(2, "BMW");
        cars.put(3, "VW");
        cars.put(4, "Skoda");
        System.out.println("HashMap of: " + cars);
    }

    //10. Create a new hashMap of type <Integer,String> and populate it with elements containing an
    //id(Integer) and a car brand(String). Lastly, print out only the keys.
    public static void ex10() {
        HashMap<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Volvo");
        cars.put(2, "BMW");
        cars.put(3, "VW");
        cars.put(4, "Skoda");

        for (Map.Entry m : cars.entrySet()) {
            System.out.println("Key: " + m.getKey());
        }
    }

    //11. Create a new hashMap of type <Integer,String> and populate it with elements containing an
    //id(Integer) and a car brand(String). Lastly, print out only the values.
    public static void ex11() {
        HashMap<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Volvo");
        cars.put(2, "BMW");
        cars.put(3, "VW");
        cars.put(4, "Skoda");

        for (Map.Entry m : cars.entrySet()) {
            System.out.println("value: " + m.getValue());
        }
    }

    //12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
    //Create a new hashMap of type <Integer,Car> and populate it with elements containing an
    //id(Integer) and a car object(Car). Lastly, print out only the car's brand.
    public static void ex12() {
        Car car1 = new Car(1, "Volvo", "240");
        Car car2 = new Car(2, "Ferrari", "Testarosa");
        Car car3 = new Car(3, "VW", "Passat");
        Car car4 = new Car(4, "Audi", "80");

        HashMap<Integer, Car> cars = new HashMap<>();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);
        cars.put(4, car4);

        for (Car car:cars.values()){
            System.out.println(car.getBrand());
        }
    }

}
