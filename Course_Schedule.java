import java.util.*;
public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[numCourses];
        for(int p[]:prerequisites){
            adj.get(p[1]).add(p[0]); // prerequisites=[1,0] jbtk course 0 nhi hota tbtk couse 1 nhi hoga.
            indegree[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        boolean visited[]=new boolean[numCourses];
        int c=0;
        while(!q.isEmpty()){
            //1.remove 
            int r=q.poll();
            //2.Ignore if Already visited
            if(visited[r]){
                continue;
            }
            //3.Mark visited
            visited[r]=true;
            //4.Self work
            c++;  //Courses which are completed.
            //5.Add Unvisited Neighbours
            for(int nbrs:adj.get(r)){
                indegree[nbrs]--;
                if(indegree[nbrs]==0){
                    q.offer(nbrs);
                }
            }
        }
        return c==numCourses;   //Hmne check kra ki agar coursecompleted total couse ke equal ho jaye toh return true.
        //TC-> O(V+E)
        //SC-> O(V+E)
    }
}
