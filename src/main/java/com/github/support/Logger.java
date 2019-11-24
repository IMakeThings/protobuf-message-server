package com.github.support;

public class Logger {
	public static <T> void log(T msg) {
		System.out.println("> " + msg);
	}
}
