package com.thoughtworks.bootcamp.expencestest;

import com.thoughtworks.bootcamp.expences.MyExpences;
import com.thoughtworks.bootcamp.expences.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTest {
    @Test
    void givenPersonASpentZeroFroPersonBAndC_whenCalculate_thenReturnExpencesZero(){
        float spend = 0.0f;
        Person personA = new Person(1,"A",0,0);
        Person personB = new Person(1,"B",0,0);
        Person personC = new Person(1,"C",0,0);
        List<Person> personList = new ArrayList<Person>();
        personList.add(personA);
        personList.add(personB);
        personList.add(personC);
        MyExpences expencesObject = new MyExpences(personA,personList,spend);
        Assertions.assertEquals(0,expencesObject.calculateExpense());
    }
}
