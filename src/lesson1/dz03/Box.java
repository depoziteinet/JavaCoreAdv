package lesson1.dz03;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> boxWithFruit = new ArrayList<>();

    public int getSize(){
        return boxWithFruit.size();
    }

    public void addFruit(T fruit){
        this.boxWithFruit.add(fruit);
    }

    public float getWeight(){
        return this.boxWithFruit.size() * this.boxWithFruit.get(0).weight;
    }

    public boolean compare(Box<? extends Fruit> box){
        float thisBox = this.boxWithFruit.size() * this.boxWithFruit.get(0).weight;
        float otherBox = box.boxWithFruit.size() * box.boxWithFruit.get(0).weight;

        return Math.abs(thisBox - otherBox) < 0.000001;
    }

    public void transferFrom(Box<T> box) {
        if (!box.boxWithFruit.isEmpty()) {
            this.boxWithFruit.addAll(box.boxWithFruit);
            box.boxWithFruit.clear();
        }
    }
}
