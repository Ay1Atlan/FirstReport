package day08;

public class MathClassDemo {
	public static void main(String[] args) {
		   // Math
	    // contain mathematics utility method

	    // .abs() return absolute number
	    System.out.println(Math.abs(5)); // 5
	    System.out.println(Math.abs(-15)); // 15
	    System.out.println(Math.abs(-45.32)); // 45.32

	    // what number is closer to 10.
	    int x = 100;
	    int y = -2000;

	    int diffX = x > 10 ? x - 10 : 10 - x;
	    // diffX = Math.abs(x - 10);
	    int diffY = y > 10 ? y - 10 : 10 - y;
	    // diffY = Math.abs(y - 10);

	    int result = diffX < diffY ? x : y;

	    System.out.println(result + " is closer to 10.");

	    // .max( a, b) return the greater number
	    Math.max(4, 7); // 7
	    // .min( a, b) return the smaller number
	    System.out.println(Math.min(45.4556, 1000.9));

	    // .floor() round the number back down
	    System.out.println(Math.floor(3.14)); // 3.0
	    System.out.println(Math.floor(34.70045)); // 34.0
	    // .ceil() round the number up to the next whole number
	    System.out.println(Math.ceil(3.14)); // 4.0
	    System.out.println(Math.ceil(34.70045)); // 35.0

	    // .round() if fraction is greater than .5 round up
	    // else round down
	    System.out.println(Math.round(46.34)); // 46.0
	    System.out.println(Math.round(101.501)); // 102.0

	    System.out.println("==== Math.random() ====");
	    // .random()
	    double randomNumber = Math.random();
	    System.out.println(Math.ceil(randomNumber * 4)); // 1 - 4
	                    //          (random() * range) + start
	    System.out.println(Math.floor(randomNumber * 4)); // 0 - 3
	    System.out.println(Math.floor(randomNumber * 4) + 1); // 1 - 4
	    System.out.println(Math.floor(randomNumber * 10) + 10); // 10 - 20
	}

}
