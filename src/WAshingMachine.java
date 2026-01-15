interface Motor {
    int capacity = 10;   // fixed value (given inside program)

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        // no code needed
    }

    public void consume() {
        // no code needed
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
