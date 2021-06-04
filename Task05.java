package task05;

public class Task05 {

    String name;
    int i;
    String s;
    int count;
    int i;

    public Task05(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int consider(int count, int i){
        return count * i;
    }
}
