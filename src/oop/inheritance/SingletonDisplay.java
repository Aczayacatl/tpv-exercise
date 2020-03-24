package oop.inheritance;

public class SingletonDisplay {
    private static SingletonDisplay instance;

    // Constructor privado
    private SingletonDisplay(){}

    public static SingletonDisplay getInstance(){
        if(instance == null){
            instance = new SingletonDisplay();
        }
        return instance;
    }


    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
}
