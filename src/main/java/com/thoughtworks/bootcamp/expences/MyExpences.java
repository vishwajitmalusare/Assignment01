package com.thoughtworks.bootcamp.expences;

import java.util.List;

public class MyExpences {
    Person person;
    List<Person> personList;
    float spend;

    public MyExpences(Person person, List<Person> personList, float spend){
        this.person=person;
        this.personList = personList;
        this.spend=spend;
    }
    public float calculateExpense() {
        return 0.0f;
    }
}
