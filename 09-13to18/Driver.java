package com.revature;

public class Driver {
	
	
	public static String encryptRot13(String message) {
		String encryption = "";
		for(char c : message.toCharArray()) {
			if(c <= 122 && c >= 97) {
				c += 13;
				if(c > 122) {
					c -=26;
				}
				encryption += c;				
			}
			else if(c >= 65 && c <= 90 ) {
				c += 13;
				if(c > 90) {
					c -=26;
				}
				encryption += c;				
			}
			else {encryption += c;}			
		}		
		return encryption;
	}
	
	
	public static int octalConversion(int decimal) {
		int rem;
		
		String octal="";
	    while(decimal>0)  
	    {  
	       rem=decimal%8;   
	       octal=rem+octal;   
	       decimal=decimal/8;  
	    }  
		
		return Integer.parseInt(octal);
	}
	
	
	

	public static void main(String[] args) {
		
		String example = encryptRot13("Billy Toledo ");
		
		System.out.println(example);
		
		System.out.println(octalConversion(100000));

	}

}
