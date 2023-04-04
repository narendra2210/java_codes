// It's winter season. There is a long queue of students from the four prime courses at Coding Blocks
//  and everyone is here to grab his hoodie. Each student of a course has a different roll number. 
//  Whenever a new student will come, he will search for his friend from the end of the queue. 
//  Note that a student can only has friend from his course and not from any other course. 
//  As soon as he will find any of the friend in the queue, he will stand behind him, otherwise
//   he will stand at the end of the queue. At any moment Kartik Bhaiya will ask the student, 
//   who is standing in front of the queue, to come and put his name and grab his hoodie and then 
//   remove that student from the queue. There are Q operations of one of the following types:

// E x y : A new student of course x whose roll number is y will stand in queue according to the 
// method mentioned above.
// D : Kartik Bhaiya will ask the student, who is standing in front of the queue, to come and put his
//  name for the hoodie and remove him from the queue.
// Find out the order in which student put their name.

// Note: Number of dequeue operations will never be greater than enqueue operations at any point of time.

// Input Format
// First line contains an integer Q, denoting the number of operations. Next Q lines will contains one of the 2 types of operations.

// Constraints
// 1 ≤ x ≤ 4 1 ≤ y ≤ 50000 1 ≤ Q ≤ 100000

// Output Format
// For each 2nd type of operation, print two space separated integers, the front student's course and roll number.

// Sample Input
// 5
// E 1 1
// E 2 1
// E 1 2
// D
// D
// Sample Output
// 1 1
// 1 2

package Super150.Stack_and_Queue;

import java.util.*;
public class Hoodies_At_Coding_Block {

    public static void hoodies(int q) throws Exception{ 
        
    // Write your Code here
        Queue goku1 = new Queue();
        Queue goku2 = new Queue();
        Queue goku3 = new Queue();
        Queue goku4 = new Queue();
        Queue answer = new Queue();
        boolean monu1 = false;
        boolean monu2 = false;
        boolean monu3 = false;
        boolean monu4 = false;
        while(q > 0){
            char chh = scn.next().charAt(0);
            if(chh =='E'){
                int col  = scn.nextInt();
                int rol = scn.nextInt();
                if(col == 1){
                    goku1.enqueue(rol);
                    if(monu1 == false){
                        monu1 = true;
                        answer.enqueue(1);
                    }
                }
                if(col == 2){
                    goku2.enqueue(rol);
                    if(monu2 == false){
                        monu2 = true;
                        answer.enqueue(2);
                    }
                }
                if(col == 3){
                    goku3.enqueue(rol);
                    if(monu3 == false){
                        monu3 = true;
                        answer.enqueue(3);
                    }
                }
                if(col == 4){
                    goku4.enqueue(rol);
                    if(monu4 == false){
                        monu4 = true;
                        answer.enqueue(4);
                    }
                }
            }
            else{
                int gram = answer.getFront();
                if(gram == 1){
                    int roll = goku1.dequeue();
                    System.out.println(gram + " " + roll);
                    if(goku1.isEmpty()){
                        monu1 = false;
                        answer.dequeue();
                    }
                }
                if(gram==2){
                    int roll = goku2.dequeue();
                    System.out.println(gram + " " + roll);
                    if(goku2.isEmpty()){
                        monu2 = false;
                        answer.dequeue();
                    }
                }
                if(gram == 3){
                    int roll=goku3.dequeue();
                    System.out.println(gram +" "+ roll);
                    if(goku3.isEmpty()){
                        monu3 = false;
                        answer.dequeue();
                    }
                }
                if(gram == 4){
                    int roll = goku4.dequeue();
                    System.out.println(gram +" " + roll);
                    if(goku4.isEmpty()){
                        monu4 = false;
                        answer.dequeue();
                    }
                }
            }
            q--;
        }
    }
    
    
        static Scanner scn = new Scanner(System.in);
    
    
        public static void main(String[] args) throws Exception {
            int n = scn.nextInt();
            hoodies(n);
        }
    }
class Queue {

	protected int size;

	protected int front;
	protected int[] data;

	public Queue() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Queue(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}
		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}
}
