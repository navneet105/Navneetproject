package LEC40;

import java.util.HashMap;
import java.util.*;
import java.util.Queue;

//dag directed acyclic graph p chlta h
//os main use hota h
//dependecy graph deadlock chek krne k lye kis order m kre ki dead lock na lge 
//p0 tabhi exctute hoga p1 ho chuka hoga
//degree in degree out degree 
//topolo in degreee p hota h
//p0 ka in degree out degree
//order flow kre system m excute krne ke lye // deadlock
//in degree ye btatat h mere dependecy kitne p h
//khans alogoriths bfs lgayege
public class Topologicalsort {
	private HashMap<Integer,List<Integer>>map;
	public Topologicalsort(int v) {
		map=new HashMap<>();
		for (int i = 0; i <=v; i++) {//numbering 0 base liya h
		map.put(i, new ArrayList<>());	
		}
	}
	public void AddEdge(int v1,int v2) {
		map.get(v1).add(v2);
	}
	public int[] Indegree(){
		int []in=new int[map.size()];
		for(int e1:map.keySet()) {
			for(int nbrs:map.get(e1)) {
				in[nbrs]++;
			}
		}
		return in;
	}
	public void Topological() {
		int []in =Indegree();
		Queue<Integer>q=new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int r=q.poll();	
			System.out.println(r+" ");
			for(int nbrs:map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
	}
	public boolean Iscycle() {
		int []in =Indegree();
		Queue<Integer>q=new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		int c=0;
		while(!q.isEmpty()) {
			int r=q.poll();	
			c++;
			for(int nbrs:map.get(r)) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		return c!=map.size();
	}
}
