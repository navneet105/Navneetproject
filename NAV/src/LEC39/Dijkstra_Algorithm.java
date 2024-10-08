package LEC39;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import LEC39.Prims_Algorithm.PrimsPair;

public class Dijkstra_Algorithm {

	private HashMap<Integer,HashMap<Integer,Integer>>map;
	public Dijkstra_Algorithm(int v) {
		map=new HashMap<>();
		for (int i = 1; i <=v; i++) {
		map.put(i, new HashMap<>());	
		}
	}
	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	class DijkastPair{
		int vtx;
		String acqpath;
		int cost;
		public DijkastPair(int vtx,String acqpath,int cost) {
			this.acqpath=acqpath;
			this.vtx=vtx;
			this.cost=cost;
		}
		public String toString() {
			return vtx+" "+acqpath+" @ "+cost;
		}
	}
public void Dijkastra() {
	HashSet<Integer>visited=new HashSet<>();
	PriorityQueue<DijkastPair>pq=new PriorityQueue<>(new Comparator<DijkastPair>() {

		@Override
		public int compare(DijkastPair o1, DijkastPair o2) {
			// TODO Auto-generated method stub
			return o1.cost-o2.cost;
		}
		
	});
	int sum=0;
	pq.add(new DijkastPair(1,"1",0) );
	while(!pq.isEmpty()) {
		DijkastPair rp=pq.poll();
		if(visited.contains(rp.vtx)) {
			continue;
		}
		visited.add(rp.vtx);
		System.out.println(rp);
		sum+=rp.cost;
		System.out.println(rp);
		for(int nbrs:map.get(rp.vtx).keySet()) {
			if(!visited.contains(nbrs)) {
				int cost=map.get(rp.vtx).get(nbrs);
				pq.add(new DijkastPair(nbrs,rp.acqpath+rp.vtx,rp.cost+cost));
			}
		}
	}
	
}
public static void main(String[] args) {
	Dijkstra_Algorithm pa=new Dijkstra_Algorithm(7);
	pa.AddEdge(1, 2, 2);
	pa.AddEdge(2, 3, 3);
	pa.AddEdge(1, 4, 10);
	pa.AddEdge(4, 5, 8);
	pa.AddEdge(3, 4, 1);
	pa.AddEdge(5, 6, 5);
	pa.AddEdge(5, 7, 6);
	pa.AddEdge(6, 7, 4);
	pa.Dijkastra();
	
	
}
}
