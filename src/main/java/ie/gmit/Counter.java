package ie.gmit;

public class Counter {

    private int counter;

    public Counter(){
        counter = 0;
    }

    public Counter(int counter) {
        if(counter <=0)
            throw new IllegalArgumentException("Must be greater than 0");
        else
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

    public void decrementCount(){
        this.counter--;
    }



}
