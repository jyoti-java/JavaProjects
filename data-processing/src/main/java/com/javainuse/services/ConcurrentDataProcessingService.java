package com.javainuse.services;

import java.lang.Thread.State;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class ConcurrentDataProcessingService {

	public static String fstThread = null;
	public static Thread t1 = null;

	// @Async
	public String startApi() {

		if (fstThread == null) {
			t1 = Thread.currentThread();
			fstThread = Thread.currentThread().getName();
		}

		/*
		 * comparing the currentThread name with fstThread name, if both are not
		 * equal,then interrupt the first thread
		 */

		if (!fstThread.equalsIgnoreCase(Thread.currentThread().getName())) {

			t1.currentThread().interrupt();
			System.out.println(t1.getName() + " got interrupted");
			State ThreadState = Thread.currentThread().getState();
			ThreadState = Thread.State.BLOCKED;

		}

		ConcurrentHashMap<Integer, String> concurHashmap = new ConcurrentHashMap<Integer, String>();
		concurHashmap.put(100, "A");
		concurHashmap.put(101, "B");
		concurHashmap.put(102, "C");
		concurHashmap.put(103, "D");

		System.out.println("************Processing Started**************");
		for (Object o : concurHashmap.entrySet()) {
			Object s = o;
			System.out.println(s + " is getting processed by the thread" + Thread.currentThread().getName());
			sleep(8);

		}
		System.out.println("Processing Completed by the Thread " + Thread.currentThread().getName());
		// System.out.println(10 / 0);
		return "PROCESSING COMPLETED";
	}

	private void sleep(int args) {

		try {
			TimeUnit.SECONDS.sleep(args);

		} catch (Exception e) {

			Thread.currentThread().interrupt();
		}
	}

	public void stopApi() {

		System.out.println("*********Stop Processing the Data**********" + Thread.currentThread().getName());
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("The Thread is already interrupted");
		} else {
			State currentThreadState = Thread.currentThread().getState();
			currentThreadState = Thread.State.BLOCKED;
		}
	}

}
