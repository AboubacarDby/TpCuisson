package fr.cesi.tpcuisson;

import java.util.Scanner;

public class TpCuisson {

	public static void main(String[] args) {
		int viandeChoisie, cuisson, poids;
		float coefficient = 0.0f;
		final byte BOEUF =1;
		final byte AGNEAU =2;
		final byte BLEU =1;
		final byte A_POINT = 2;
		final byte BIEN_CUIT =3;
		final byte UNE_MINUTE=60;
		final float BLEU_B = (float) (10.0/500.0);
		final float AP_B = (float) (17.0/500.0);
		final float BC_B = (float) (25.0/500.0);
		final float BLEU_A = (float) (15.0/400.0);
		final float AP_A = (float) (24.0/400.0);
		final float BC_A = (float) (40.0/400.0);
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Quelle viande voulez-vous : 1 - boeuf ou 2 - l'agneau ?");
		viandeChoisie = saisie.nextInt();
		System.out.println("Quelle cuisson désirez-vous : 1 - Bleu, 2 - A point ou 3 - Bien cuit ?");
		cuisson = saisie.nextInt();
		System.out.println("Quelle poids désirez-vous ?");
		poids = saisie.nextInt();
		saisie.close();

		switch(viandeChoisie) {
		case BOEUF:
			if(cuisson == BLEU) {
				coefficient = BLEU_B;
			}else if(cuisson == A_POINT) {
				coefficient = AP_B;
			}else {
				coefficient = BC_B;
			}
			break;
		case AGNEAU:
			if(cuisson == BLEU) {
				coefficient = BLEU_A;
			}else if(cuisson == A_POINT) {
				coefficient = AP_A;
			}else {
				coefficient = BC_A;
			}
			break;
			default : System.out.println("Erreur de saisie.");
		}
		
		System.out.println("Le temps de cuisson sera de " + coefficient);
		
	}

}
