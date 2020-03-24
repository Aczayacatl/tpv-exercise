package oop.inheritance;

public class SingletonKeyboard {
    private static SingletonKeyboard instance;

    // Constructor privado
    private SingletonKeyboard(){}

    public static SingletonKeyboard getInstance(){
        if(instance == null){
            instance = new SingletonKeyboard();
        }
        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
