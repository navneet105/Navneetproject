package LEC39;

import java.util.*;

public class p261graphvalidtree {
	//sare tree graph hote 
	
	public boolean validTree(int n,int [][]edges) {
		HashMap<Integer,List<Integer>>map=new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < edges.length; i++) {
			int v1=edges[i][0];
			int v2=edges[i][1];
			map.get(v1).add(v2);
			map.get(v2).add(v1);
		}
		return BFT(map);
	}
	public boolean  BFT(HashMap<Integer,List<Integer>>map) {
		Queue<Integer>q=new LinkedList<>();
		HashSet<Integer>visited=new HashSet<>();
		int count=0;
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			count++;
			//for compont count
			q.add(src);
			while(!q.isEmpty()) {
				//remove
				int rv=q.poll();
				//ignore if already visited
						if(visited.contains(rv)) {
							//for cyle
							return false;
						}
				//marked visited
						visited.add(rv);
			
						
				//add unvisited neres
						for(int nbrs:map.get(rv)) {
							if(!visited.contains(nbrs)) {
								q.add(nbrs);
							}
						}
			}
		}
		return count==1;
	}
	}

