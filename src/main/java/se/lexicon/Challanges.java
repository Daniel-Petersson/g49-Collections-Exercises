package se.lexicon;

import java.util.*;

public class Challanges {
    public static void main(String[] args) {
        Challange1();
        Challange2();
        Challange3();
        Challange4();
    }

    //Challenges
    //1. Create an empty set and populate it with the all the days of the week. Next create a second
    //set and populate it with ONLY the weekend days (SATURDAY and SUNDAY). Lastly, compare
    //the two sets and retain in the first set only those days that are the same in both sets.
    public static void Challange1() {
        Set<String> weekdays = new HashSet<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        boolean modified = weekdays.retainAll(weekendDays);
        System.out.println(modified);
        System.out.println("Common days in both set are: " + weekdays);
    }

    //2. Create a new hashMap of types <String,String> and populate it with elements containing an
    //email (String) and a name (String). Next, create a new Set and populate it with the keys from
    //the hashMap you created.
    public static void Challange2() {
        HashMap<String, String> personInfo = new HashMap<>();
        personInfo.put("Daniel@test.com", "Daniel Petersson");
        personInfo.put("Johan@test.com", "Johan Karlsson");

        /*Set<String> emailSet = new HashSet<>();

        for (String email : personInfo.keySet()) {
            emailSet.add(email);
        }
        System.out.println(emailSet);

         */

        Set<String> keySet = new HashSet<>(personInfo.keySet());
        System.out.println("The keys are: " + keySet);
    }

    //3. Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
    //setters. Have the class implement the Comparable interface. Implement the override method
    //and have it compare the AGE of the superhero. Next, create a new arrayList of type
    //SuperHero. Sort the list by age and print out each element.
    public static void Challange3() {
        ArrayList<SuperHero> superheroesList = new ArrayList<>();

        superheroesList.add(new SuperHero(1, "superman", 30));
        superheroesList.add(new SuperHero(2, "batman", 41));
        superheroesList.add(new SuperHero(3, "wolverine", 35));
        superheroesList.add(new SuperHero(4, "hellboy", 50));

        Collections.sort(superheroesList);
        for (SuperHero superHero : superheroesList) {
            System.out.println("ID: " + superHero.getId());
            System.out.println("Name: " + superHero.getName());
            System.out.println("Age: " + superHero.getAge());
            System.out.println();

        }
    }

    //4. Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection
    //and populate it with the content of the int array. Lastly, print out each element in the
    //Collection without duplicates.
    public static void Challange4() {
        int[] numbers = {1, 4, 4, 2, 6, 7};

        HashSet<Integer> uniqNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqNumbers.add(number);
        }
        System.out.println("Numbers without duplicates: ");
        for (int number : uniqNumbers) {
            System.out.println(number);
        }
    }
}
