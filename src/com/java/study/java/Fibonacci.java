package com.java.study.java;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:26 AM 2018/10/29
 */
public class Fibonacci {

	public static void main(String[] args) {
		// System.out.println(Fibonacci(3));
		System.out.println(Fib(50L));
	}

	public static Long Fibonacci(int n) {
		if (n == 0) {
			return 0L;
		} else if (n == 1) {
			return 1L;
		} else if (n > 1) {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		} else {
			return -1L;
		}
	}

	public static Long Fib(Long n) {
		//F(n)=F(n-1)+F(n-2)
		if (n <= 1) {
			return n;
		}
		//F(n-1)
		Long last = 1L;
		//F(n-2)
		Long lastPre = 1L;
		// F(n)
		Long result = 1L;

		for (long i = 2; i <= n; i++) {
			result = last + lastPre;
			lastPre = last;
			last = result;
		}
		return result;
	}


}
