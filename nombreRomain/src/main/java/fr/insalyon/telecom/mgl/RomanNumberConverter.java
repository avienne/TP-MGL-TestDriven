package fr.insalyon.telecom.mgl.RomanNumber;

public class RomanNumberConverter {
	
	public int romanToIntSub(char c){
		
		// Check that String is valid)

		switch (c){
			case 'I' : return 1;
			case 'V' : return 5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' : return 1000;

			default : throw new IllegalArgumentException(""+c);
		}
	}

	public int romanToInt(String s) throws IllegalArgumentException {
		int somme = 0 ; 
		int i;
		int counter = 0;
		char currentc;

		for( i= 0; i< s.length() ; i++){
			currentc = s.charAt(i);
			
			somme += romanToIntSub(currentc);

		}
		return somme;
	}

	public String intToRoman(int i){
		if (i<=0){
			throw new IllegalArgumentException(""+i);
		}
		throw new UnsupportedOperationException();

	}
}