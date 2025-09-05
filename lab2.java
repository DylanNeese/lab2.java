// lab2.java
// Dylan Neese
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods
// 1. The highest I went to was 999999937, it took a while for me to run it so I decided to stop there. Proceeding would take a lot longer, and could potentially crash my computer.
//I added another 0 to make it 100000000000 and it wouldnt run at all. In my final test I tried 2,013,265,920 and it originally started to run and then it crashed my visual studio code completley. 
//2. When you print it has to print out thousands of lines vs not printingits much faster becasue it only does memory and cpu operations.
//3. Time could be a factor as it takes a lot of time in order to run this program. Also memory could be a factor as it takes a lot of memory to store all the boolean values.Language could limit it as well. Virtual machine could be a limit as well.  

public class lab2 {

	public static void main(String[] args) 
	{
		int num;
		
		//add code to get num from command line argument
		if (args.length > 0){
            num = Integer.parseInt(args[0]);
            System.out.println("N = " + num);
        }
        else{
            num = 1000;
            System.out.println("Missing argument. Defulting N to 1000");
        }
        
		//call showPrimes
		showPrimes( num );		
	}//main
	
	public static void showPrimes(int N){
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }   
        isPrime[0] = false;
        isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        //output primes
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {

                System.out.println(i);
            }
        }
				
	}//showPrimes
	
}//lab2
