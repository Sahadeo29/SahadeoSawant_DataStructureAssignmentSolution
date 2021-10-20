package com.GL.GradedAssignment3.Question1.Stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class FloorStack {
	Queue<Integer> queue;
	Queue<Integer> tempQueue;

	public FloorStack() {
		queue = new LinkedList<>();
		tempQueue = new LinkedList<>();
	}

	public void push(int data) {
		if (queue.size() == 0)
			queue.add(data);
		else {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				tempQueue.add(queue.remove());
			}
			queue.add(data);

			for (int i = 0; i < size; i++) {
				queue.add(tempQueue.remove());
			}
		}
	}

	public int pop() {
		if (queue.size() == 0) {
			throw new NoSuchElementException("Underflow Exception");
		}
		for (int i = 0; i < queue.size(); i++) {
			System.out.println("Day" + (i + 1) + ":" + queue.remove());
		}
		return queue.remove();
	}

	public int getSize() {
		return queue.size();
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}
}