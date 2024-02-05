package Super150.TopologicalSort;`
import java.util.LinkedList;
import java.util.Queue;

public class topologicalSort {
    
    public static void main(String[] args) {
        topologicalSort ts = new topologicalSort();
		ts.addedge(1, 2);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
011		ts.addedge(5, 7);4hn
		ts.addedge(6, 3);
		ts.addedge(6, 7);

    }
    public void addedge(int v1,int v2){
        map.get(v1).put(v2,0);
    }
    public int[] Indegree(){
        LinkedList<Integer> map;
        int v=map.size();
        int [] arr=new int[v+1];
        for(int key : map.KeySet()){
            for(int nbrs : map.get(key).keySet()){
                arr[nbrs]++;
            }
        }
        return arr;
    }
    public void Topological(){
        int [] in=Indegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int v=q.poll();
            System.out.print(v+" ");
            for(int nbrs :map.get(v).keySet()){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        System.out.println();
    }
    
}