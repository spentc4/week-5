import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
public class week5 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 10000;
		int[] number = new int[count];
		ArrayList<Integer> dynamicArray = new ArrayList<Integer>(count);
		Random rd = new Random();
		int n = dynamicArray.size();
		for(int i = 0; i< number.length; i++) {
		
	      number[i] = rd.nextInt() % 1000;
	      
			
					
			
				System.out.println(number[i]+ " ");
		}
				
		Integer r1 = rd.nextInt() % 1000;
		dynamicArray.add(r1);
		dynamicArray.add(r1);
		 for (int i=0; i<n; i++) {
			 Integer r = rd.nextInt() % 1000;
	    	  dynamicArray.add(r);
	    	 
	      }
		 Instant start = Instant.now();
		 methodToTime();
		for (int i=0; i < dynamicArray.size(); i++) {
			for (int j = dynamicArray.size() - 1; j > i; j--) {
				if (dynamicArray.get(i) > dynamicArray.get(j)) {
					int tmp = dynamicArray.get(i);
					dynamicArray.set(i,dynamicArray.get(j));
					dynamicArray.set(j, tmp);
				}
			}
		}
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toNanos();
		Instant start1 = Instant.now();
		methodToTime();
		for (int i: dynamicArray) {
			System.out.println(i);
		}
		
		
		System.out.println("enter an intger you would like to search for in the array");
		boolean isPresent=false;
		Integer index =null;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Integer theNumber = Integer.valueOf(input);
		for(int q = 0; q<number.length; q++) {
			if(number[q]==theNumber) { isPresent = true;
			index=q;
				
			}
		}
		
		
		if(isPresent=true) {
			System.out.println("we did find this number in the array");
			System.out.println("found " + index + " items in the aray");
			
			
		} else {
			System.out.println("there are none of these items in array");
		}
		

		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.println("enter an intger you would like to search for in the arraylist");
		int myInt = keyboard2.nextInt();
		boolean found = dynamicArray.contains(myInt);
		int occurences = Collections.frequency(dynamicArray, myInt);
		System.out.println("found number from arrayList? " + found);
		System.out.println("there were " + occurences + " number of these items");
		
		Instant finish1 = Instant.now();
		long timeElapsed2 = Duration.between(start1,finish1).toNanos();
		
		Instant start3 = Instant.now();
		methodToTime();
		Stack<Integer> nums = new Stack<Integer>();
		int[] stacks = new int[10000];
		for(int i =0;i<stacks.length;i++) {
			int r2 = rd.nextInt() % 1000;
			nums.add(r2);
		}
		System.out.println("what integer would you like to search for in the stack");
		Scanner keyboard3 = new Scanner(System.in);
		int myInt2 = keyboard3.nextInt();
		boolean found2 = nums.contains(myInt2);
		int occurences2 = Collections.frequency(nums, myInt2);
		System.out.println("found number from arrayList? " + found2);
		System.out.println("there were " + occurences2 + " number of these items");
		Instant finish3 = Instant.now();
		long timeElapsed3 = Duration.between(start3, finish3).toNanos();
		System.out.println("this is the time elapsed for the linked list: " + timeElapsed);
		System.out.println("this is the time elapsed for the array: " + timeElapsed2);
		System.out.println("this is the time elapsed for the stack: " + timeElapsed3);


		
		
	}
				
	 private static void methodToTime() {
		    try {
		      TimeUnit.SECONDS.sleep(3);
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
	 }
	
	
	
	

	

} 
