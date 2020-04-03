package com.kotlin.learning;

public class JavaProxyTest {
    public static void main(String[] args) {
        new Zoo(new Dog()).bark();
    }

    interface Animal {
        void bark();
    }

    static class Dog implements Animal {

        @Override
        public void bark() {
            System.out.println("Wang");
        }
    }

    static class Zoo  implements Animal{
        Animal animal;

        public Zoo(Animal animal) {
            this.animal = animal;
        }

        @Override
        public void bark() {
            animal.bark();
        }
    }
}
