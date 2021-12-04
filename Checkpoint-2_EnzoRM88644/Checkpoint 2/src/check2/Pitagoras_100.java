package check2;

public class Pitagoras_100 {

	public static void main(String[] args) {
		int hip = 5, ct1 = 3, ct2 = 4;
		int i;
		
		i = 0;
		for (hip = 1; hip <=100; hip++)
				for (ct1 = 1; ct1 < hip; ct1++)
					for (ct2 = 1; ct2 < hip; ct2++)
					if (Math.pow(hip, 2) == Math.pow(ct1, 2) + Math.pow(ct2, 2))
					if(ct1 > ct2)
						System.out.println(++i + "o trio pitagórico: " + hip + " " + ct1 + " " + ct2);

}
}
