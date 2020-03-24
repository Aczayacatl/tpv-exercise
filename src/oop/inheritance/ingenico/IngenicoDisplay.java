package oop.inheritance.ingenico;

public class IngenicoDisplay {

    private static IngenicoDisplay instance;

    // Constructor privado
    private IngenicoDisplay(){}

    public static IngenicoDisplay getInstance(){
        if(instance == null){
            instance = new IngenicoDisplay();
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
