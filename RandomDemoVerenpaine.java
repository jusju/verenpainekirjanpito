package viikko2map;

import java.util.Random;
public class RandomDemoVerenpaine {
	public static void main(String[] args) {
		// RANDOM OLION LUONNILLA ALOITETAAN SATUNNAISLUKUJEN LUONTI
		// OLION PERUSLUONTITAPA
		Random random = new Random();
		int verenAlaPaine = 70;
		
		do {
			verenAlaPaine = random.nextInt(79);
		} while(verenAlaPaine < 67);
		

		System.out.println("Verenalapaineesi tänään on: " + verenAlaPaine );
		
		int verenYlaPaine = 0;
		do {
			verenYlaPaine = random.nextInt(134);
		} while(verenYlaPaine < 110);
		System.out.println("Verenyläpaineesi tänään on: " + verenYlaPaine );
	}
}
