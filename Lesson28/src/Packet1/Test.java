package Packet1;

import Packet1.Person;

public class Test  {
    public static void main(String[] args) {
        /* Модификаторы доступа: public, private, default(все что default доступно в пределах пакета),
        protected (доступны в пределах одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета,
        где эти поля и методы были декларированны)
         */
        Person person1 = new Person();
            person1.name = "Jack";

        Person person2 = new Person();
        System.out.println(person2.name1);
    }
}

