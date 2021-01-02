package Main;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Two_ReflectionMetadata {

    public static void main(String[] args) {
        Class<?> c1;
        try {
            c1 = Class.forName("Modal.User");
            System.out.println("-------get classname------");
            System.out.println("Class Name: "+c1.getName());
            System.out.println("Class Simple Name: "+c1.getSimpleName());


            System.out.println("\n-------get Super classname------");
            System.out.println("Super Class Name: "+c1.getSuperclass());

            System.out.println("\n-------Getting implemented and extended interface------");
            System.out.println("Interface: "+ Arrays.toString(c1.getInterfaces()));

            System.out.println("\n-------Getting Modifier------");
            System.out.println("Modifiers: "+ Modifier.toString(c1.getModifiers()));



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

