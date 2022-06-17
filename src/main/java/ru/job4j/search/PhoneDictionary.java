package ru.job4j.search;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<>();
        Predicate<Person> predName = s -> s.getName().contains(key);
        Predicate<Person> predAddress = s -> s.getAddress().contains(key);
        Predicate<Person> predSurname = s -> s.getSurname().contains(key);
        Predicate<Person> predPhone= s -> s.getPhone().contains(key);
        Predicate<Person> combine = predName.or(predPhone).or(predAddress).or(predSurname);
        for (Person person : persons) {
            if (combine.test(person)) {
                rsl.add(person);
            }
        }
        return rsl;
    }
}
