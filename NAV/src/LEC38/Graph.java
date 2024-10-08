package LEC38;

import java.util.*;

//neo 4g 
//finite set of edge and vertix
//sre graph ko tree nhi bolte h
//two vertics ko add ko edge
//graph type directed and undirected
//directed-weighted and unweigted
//undirected -weighte and unweighted
//adjecency

public class Graph {

	private HashMap<Integer,HashMap<Integer,Integer>>map;
	public Graph(int v) {
		map=new HashMap<>();
		for (int i = 1; i <=v; i++) {
		map.put(i, new HashMap<>());	
		}
	}
	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public boolean ContainsEdge(int v1,int v2) {
		return map.get(v1).containsKey(v2);
	}
	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}
	public int noofEdge() {
		int ans=0;
		for(int key:map.keySet()) {
			ans+=map.get(key).size();
		}
		return ans/2;
	}
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	public void removevertex(int v1) {
		for(int v2:map.get(v1).keySet()) {
			removeEdge(v1,v2);
		}
		map.remove(v1);
	}
	public void Display() {
		for(int vtx:map.keySet()) {
			System.out.println(vtx+" "+map.get(vtx));
		}
	}
	public boolean hasPath(int src,int des,HashSet<Integer>visited) {
		if(src==des) {
			return true;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
			boolean ans=hasPath(nbrs,des,visited);
			if(ans) {
				return true;
			
			}
			}
		}
		visited.remove(src);
		return false;
	}
	public void PrintallPath(int src,int des,HashSet<Integer>visited,String ans) {
		if(src==des) {
			System.out.println(ans+des);
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				PrintallPath(nbrs,des,visited,ans+src);
			
			}
		}
		visited.remove(src);
	
	}
	public boolean BFS(int src,int des) {//level wise triversal queue 
		Queue<Integer>q=new LinkedList<>();
		HashSet<Integer>visited=new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			//remove
			int rv=q.poll();
			//ignore if already visited
					if(visited.contains(rv)) {
						continue;
					}
			//marked visited
					visited.add(rv);
			//self work
					if(rv==des) {
						return true;
					}
			//add unvisited neres
					for(int nbrs:map.get(rv).keySet()) {
						if(!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
		}
		return false ;
		
		
	}
	public boolean DFS(int src,int des) {//stack
		Stack<Integer>st=new Stack<>();
		HashSet<Integer>visited=new HashSet<>();
		st.push(src);
		while(!st.isEmpty()) {
			//remove
			int rv=st.pop();
			//ignore if already visited
					if(visited.contains(rv)) {
						continue;
					}
			//marked visited
					visited.add(rv);
			//self work
					if(rv==des) {
						return true;
					}
			//add unvisited neres
					for(int nbrs:map.get(rv).keySet()) {
						if(!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}
		}
		return false ;
		
	}
	public void BFT() {
		Queue<Integer>q=new LinkedList<>();
		HashSet<Integer>visited=new HashSet<>();
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			//for compont count
			q.add(src);
			while(!q.isEmpty()) {
				//remove
				int rv=q.poll();
				//ignore if already visited
						if(visited.contains(rv)) {
							//for cyle
							continue;
						}
				//marked visited
						visited.add(rv);
				//self work
						
							System.out.print(rv+" ");
						
				//add unvisited neres
						for(int nbrs:map.get(rv).keySet()) {
							if(!visited.contains(nbrs)) {
								q.add(nbrs);
							}
						}
			}
		}
		System.out.println();
	}
}