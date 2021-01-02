package Main;

import Modal.Methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Three_Method_invoking {


    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("Modal.Methods");
            Method method = c.getDeclaredMethod("display", String.class);
            method.setAccessible(true);
            Object o = method.invoke(new Methods(),"Something");
            System.out.println(o);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }



}
