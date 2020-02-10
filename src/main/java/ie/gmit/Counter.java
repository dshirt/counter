package ie.gmit;

public class Counter {

    private int counter;

    public Counter(){
        counter = 0;
    }

    public Counter(int counter) {
        this.counter = counter;
    }


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementCount(){
        this.counter++;
    }



}
