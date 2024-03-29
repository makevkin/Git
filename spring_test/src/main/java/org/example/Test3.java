package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
         ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet1", Pet.class);
//        Person person = new Person(pet); // прописываем зависимость животного и человека вручную
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
