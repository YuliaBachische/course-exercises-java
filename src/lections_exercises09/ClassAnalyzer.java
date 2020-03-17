/*
Создать класс -анализатор ClassAnalyzer. Класс имеет перегруженный
метод analyze(), принимающий объект типа
Class или объект, отличный
от него. Реализовать методы,
которые анализируют структуру класса
на предмет полей, методов, конструкторов и аннотаций всех типов для
класса. Отчет выводится в консоль
*/
package lections_exercises09;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassAnalyzer {
    public void analyze(Class cls) {
      analyzeMethods(cls);
      analyzeAnnotations(cls);
      analyzeFields(cls);
      analyzeConstructors(cls);
      analyzeTransactions(cls);
    }
    public void analyze(Object obj) {
        System.out.println(obj.getClass());
    }
    public static void analyzeMethods(Class cls){
        StringBuilder stringBuilder = new StringBuilder();
        for(Method method: cls.getDeclaredMethods()){
            stringBuilder.append("Method: ").append(method.getName()).append("\n").append("\t").append("Return type: ").
                    append(method.getReturnType()).append("\t").append("Types of parameters: ").append(Arrays.toString
                    (method.getParameterTypes()));
        }
        System.out.println(stringBuilder);
    }
    public static void analyzeAnnotations(Class cls){
        StringBuilder stringBuilder = new StringBuilder();
        if(cls!=null){
            for(Annotation annotation: cls.getDeclaredAnnotations()){
                stringBuilder.append(" Annotation: ").append(annotation.annotationType());
            }
        }
        System.out.println(stringBuilder);
    }
    public static void analyzeFields(Class cls){
        StringBuilder stringBuilder = new StringBuilder();
        for(Field field: cls.getDeclaredFields()){
            stringBuilder.append(" Field: ").append(field.getName()). append(" Type: ").append(field.getType()).append("\n");
        }
        System.out.println(stringBuilder);
    }
    public static void analyzeConstructors(Class cls){
        StringBuilder stringBuilder = new StringBuilder();
        for(Constructor constructor: cls.getDeclaredConstructors()){
            stringBuilder.append(" Constructor: ").append(constructor.getName()).append("\n").append("\t").
                    append(" Types of parameters: ").append(Arrays.toString(constructor.getTypeParameters()));
        }
        System.out.println(stringBuilder);

    }
    public static void analyzeTransactions(Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                if (annotation instanceof Transaction) {
                    System.out.println("Transaction is started");
                    try {
                        Object obj = new ClassForTest(1, 1);
                        ;
                        method.invoke(obj, 4);
                    } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Transaction is ended");
                }
            }
        }
    }
}
