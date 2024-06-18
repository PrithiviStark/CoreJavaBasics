package com.qspiders.cframes;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Program4 {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("Pavithra");
		pq.add("Jyothika");
		pq.add("Abirami");
		pq.add("Avanthika");
		pq.add("Maggi");
		pq.add("Maggi");
		pq.add("Shaubha");
		pq.add("Kumar");
		pq.add("Nelson");
		pq.add("Rajesh");
		pq.add("Evelin");
		pq.add("Sathish");
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
