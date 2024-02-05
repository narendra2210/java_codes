package Super150.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack ;
import java.util.* ;

public class graph_2 {
    HashMap<Integer, HashMap<Integer, Integer>> mp ;

    public graph_2(int v){
        mp = new HashMap<>() ;
        for(int i=1; i<=v; i++){
            mp.put(i, new HashMap<>()) ;
        }
    }

    public boolean bfs(int src, int des){
        Queue<Integer>q = new LinkedList<>() ;
        HashSet<Integer>visited = new HashSet<>() ;

        q.add(src) ;
        while(!q.isEmpty()){
            int rv = q.poll() ;
            if(visited.contains(rv)){
                continue ;
            }
            visited.add(rv) ;

            if(rv == des) return true ;

            for(int nbrs: mp.get(rv).keySet()){
                if(!visited.contains(nbrs)) q.add(nbrs) ;
            }
        }

        return false ;
        
    }

    public boolean dfs(int src, int des){
        Stack<Integer>st = new Stack<>() ;
        HashSet<Integer>visited = new HashSet<>() ;

        st.add(src) ;
        while(!st.isEmpty()){
            int rv = st.pop() ;
            if(visited.contains(rv)){
                continue ;
            }
            visited.add(rv) ;

            if(rv == des) return true ;

            for(int nbrs: mp.get(rv).keySet()){
                if(!visited.contains(nbrs)) st.add(nbrs) ;
            }
        }

        return false ;
        
    }
}
