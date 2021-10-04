package Array;

public class Ex05 {

	public static void main(String[] args) {

		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4 };
		// ÃÑÁ¡
		double total = 0;
		for (int i = 0; i < scores.length; i++)
			total = total + scores[i]; // score[0], score[1], ...
		total = 0;

		for (double k : scores) {
			total += k;
		}

		System.out.printf("ÃÑÁ¡:%.2f\n ", total);
		System.out.println("ÇÕ°è: " + ((int) (total * 100) / 100.0));
		// Çâ»óµÈ for¹®À» ÀÌ¿ëÇÏ¿©
		// ÇÕ°ú Æò±Õ Ãâ·Â

		double avg = 0;
		avg = total / (double) scores.length;
		System.out.println("Æò±Õ: " + avg);
		System.out.printf("%.3f", avg);

	}

}

/*
 * ],... } //Æò±Õ avg=total/(double)score.length; System.out.println("Æò±Õ: " +
 * avg);
 * 
 */