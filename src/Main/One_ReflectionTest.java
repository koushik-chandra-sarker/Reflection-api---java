package Main;

import Modal.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/**
 *
 * Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
 *
 * The java.lang.Class class provides many methods that can be used to get metadata, examine and change
 *      the run time behavior of a class.
 *
 * The java.lang and java.lang.reflect packages provide classes for java reflection.
 * */
public class One_ReflectionTest {
    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName("Modal.Person");
            //Reflect Constructors
            System.out.println("------- Reflect Constructors------");
            Constructor<?>[] constructor =  c.getConstructors();
            System.out.println("Constructors: " + Arrays.toString(constructor));

            //Reflect methods
            System.out.println("\n------- Reflect Methods------");
            Method[] methods = c.getMethods();
            System.out.println("Methods: " + Arrays.toString(methods));

            //Reflect DeclaredMethods
            System.out.println("\n------- Reflect DeclaredMethods------");
            Method[] declaredMethods = c.getMethods();
            System.out.println("DeclaredMethods: " + Arrays.toString(declaredMethods));

            //Reflect Fields
            System.out.println("\n------- Reflect Fields------");
            Field[] fields = c.getFields();
            System.out.println("Fields: " + Arrays.toString(fields));
            //Reflect DeclaredFields
            System.out.println("\n------- Reflect DeclaredFields------");
            Field[] declaredFields = c.getDeclaredFields();
            System.out.println("DeclaredFields: " + Arrays.toString(declaredFields));
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
