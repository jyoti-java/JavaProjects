package com.javalearning.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Subject implements Comparable<Subject> {
	String name;
	Integer startTime;
	Integer endTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	@Override
	public int compareTo(Subject o) {
		return this.getStartTime().compareTo(o.getStartTime());
	}

}

public class SchedulingClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfDays = Integer.parseInt(scanner.nextLine());
		List<Integer> maxClassesPerDay = new ArrayList<>();
		for (int i = 0; i < noOfDays; i++) {
			int noOfSubjects = Integer.parseInt(scanner.nextLine());
			List<Subject> subjects = new ArrayList<Subject>();

			for (int j = 0; j < noOfSubjects; j++) {
				Subject sub1 = new Subject();

				String[] input = scanner.nextLine().split(" ");
				sub1.name = input[0];
				sub1.startTime = Integer.parseInt(input[1].replace(":", ""));
				sub1.endTime = Integer.parseInt(input[2].replace(":", ""));
				subjects.add(sub1);

			}
			Collections.sort(subjects);

			maxClassesPerDay.add(getMaxClassesperDay(subjects.toArray(new Subject[subjects.size()])));
		}
		for (Integer integer : maxClassesPerDay) {
			System.out.println(integer);
		}

	}

	private static Integer getMaxClassesperDay(Subject[] subjects) {
		int maxClasses = 0;
		for (int i = 0; i < subjects.length; i++) {
			int currentClasses = getClassesPerDay(subjects, i);
			if (currentClasses > maxClasses) {
				maxClasses = currentClasses;
			}
		}
		return maxClasses;
	}

	private static int getClassesPerDay(Subject[] subjects, int index) {

		int currClass = 1;

		for (int i = index; i < subjects.length - 1; i++) {
			if (subjects[i].endTime <= subjects[i + 1].startTime)
				currClass++;
		}
		return currClass;
	}

}
