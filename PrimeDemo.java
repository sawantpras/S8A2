import java.util.*;

//by extending Thread Class
class Prime extends Thread {
	int n;

	// constructor
	Prime(int n) {
		this.n = n;
	}

	// to check given number prime or not
	public void run() {
		int i, m = 0, flag = 0;
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {

				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is prime");
	}
}

// by implementing Runnable interface
class Prime1 implements Runnable {
	int n;

	Prime1(int n) {
		this.n = n;
	}

	public void run() {
		int i, m = 0, flag = 0;
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {

				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is prime");
	}

}

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("By extending Thread class");
		System.out
				.println("Please enter the number which you want check Prime or not?");
		int n = s.nextInt();
		// create object of Prime Class
		Prime p1 = new Prime(n);
		// Invoke start method on the object
		p1.start();
		System.out.println("By implementing Runnable interface");
		System.out
				.println("Please enter the number which you want check Prime or not?");
		int m = s.nextInt();
		// create object of Thread Class
		Prime1 p2 = new Prime1(m);
		// create object of Thread class while passing the object of implementor
		// class to the constructor of thread class
		Thread t = new Thread(p2);
		// invoke the start method on object of thread class
		t.start();

	}

}
