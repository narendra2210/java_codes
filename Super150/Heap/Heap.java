package Super150.Heap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> data = new ArrayList<>();

    public void add(int item){ //Min heap
        this.data.add(item);
        unHeapify(this.data.size() - 1);
    }

    private void unHeapify(int ci) { //check if it is min heap
        int pi = (ci - 1)/2;
        if(this.data.get(pi) > this.data.get(ci)){
            Swap(pi , ci);
            unHeapify(pi);
        }
    }

    public void Swap(int i, int j) { // swap the arraylist element
        int ith = this.data.get(i);
        int jth = this.data.get(j);
        this.data.set(i , jth);
        this.data.set(j , ith);
    }
}
