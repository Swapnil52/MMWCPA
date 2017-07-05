package compare;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringComp {

	/*	public double compare(String left, String right) {

		int leftLen = left.length();
		int rightLen = right.length();

		double ssnc = 0;
		boolean match = false;

		if (leftLen > rightLen) {
			String tempS = left;
			left = right;
			right = tempS;
			int tempI = leftLen;
			leftLen = rightLen;
			rightLen = tempI;
		}

		for (int i = leftLen; i >= 0; i--) {
			if (i <= leftLen) {
				for (int j = 0; j <= leftLen - i; j++) { 
					String pattern = left.substring(j, j + i);
					System.out.println("DGB1: " + i + ", " + j + ", " + pattern + ", " + left + ", " + right);
					if (pattern.isEmpty()) {
						break;
					}

					int foundAt = right.indexOf(pattern);
					System.out.println("DGB2: " + foundAt);
					if (foundAt != -1) {
						ssnc = ssnc + Math.pow((2*i), 2); // Java math difference
						System.out.println("DGB2a: " + left + ", " + i + ", " + j + ", " + left.substring(0, j) + ", " + left.substring(0, j+i));
						left = left.substring(0, j) + left.substring(0, j + i); //lua syntax difference
						right = right.substring(0, foundAt) + right.substring(0, foundAt+i);
						System.out.println("DGB3: " + ssnc + ", " + left + ", " + right);
						match = true;
						break;
					}

				}


			}
			if(match == true){
				break;
			}
		}

		return BigDecimal.valueOf(Math.sqrt(ssnc)/(leftLen + rightLen)).setScale(5, RoundingMode.HALF_UP).doubleValue();

	}*/

	public double compare(String leftString, String rightString) {
		String leftStringInUse = leftString;
		String rightStringInUse = rightString;

		if(leftString.length() < rightString.length()) {
			leftStringInUse = rightString;
			rightStringInUse = leftString;
		}

		int leftStringLength = leftStringInUse.length();
		int rightStringLength = rightStringInUse.length();
		double ssnc = 0d;
		boolean match = false;

		for(int i = leftStringLength; i >= 0; i--) {
			if(i <= leftStringLength) {
				for(int j = 0; j <= leftStringLength-i; j++) {
					String pattern = leftStringInUse.substring(j, j+i);
					if(!pattern.isEmpty()) {
						int patternIndex = rightStringInUse.indexOf(pattern);
						if(patternIndex != -1) {
							ssnc += Math.pow(2 * i, 2);
							match = true;
							break;
						}
					}
				}
			}
			if(match) {
				break;
			}
		}
		return Math.sqrt(ssnc)/(leftStringLength+rightStringLength);
	}



}
