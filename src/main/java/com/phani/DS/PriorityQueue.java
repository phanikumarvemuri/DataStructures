package com.phani.DS;

import java.util.Arrays;

public class PriorityQueue {

	int[] a;
	int size;

	public PriorityQueue() {
		this.a = new int[20];
		this.size = 1;
	}

	public void add(int x) {
		a[this.size] = x;
		int k = this.size;
		this.size++;

		while (k > 1) {
			if (a[k / 2] > a[k]) {
				int temp = a[k / 2];
				a[k / 2] = a[k];
				a[k] = temp;
			}
			k = k / 2;
		}
	}

	@SuppressWarnings("null")
	public void remove() {
		if (this.size == 1) {
			System.out.println("only one element");
			a[1] = (Integer) null;
		} else {
			int temp = 1;
			int start = 1;
			while (2 * temp < this.size) {
				start = temp;
				temp = this.min(2 * temp, 2 * temp + 1);
				a[start] = a[temp];

			}
			a[temp] = 0;
		}

		this.size--;
	}

	private int min(int i, int j) {

		return this.a[i] == this.a[j] ? i : this.a[i] > this.a[j] ? j : i;

	}

	public int extract()

	{
		return this.a[1];
	}

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(3);
		pq.add(40);
		pq.add(9);
		pq.add(7);
		pq.add(8);
		pq.remove();
		for (int i = 1; i <= pq.size; i++) {
			System.out.println(pq.a[i]);
		}

	}

}
