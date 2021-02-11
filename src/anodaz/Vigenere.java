package anodaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vigenere {

	public static String crypt(String text, String key)
	{
		StringBuffer sb = new StringBuffer(text);
		
		for(int i = 0; i < text.length(); i++)// 
		{
			// Décalage
			int decalage = (int)key.charAt(i % key.length()) - 97;
			int newCharCode = ((int)text.charAt(i) - 97 + 2) % 26 + 97;
			sb.setCharAt(i, (char)newCharCode);
		}
		
		text = sb.toString();
		return text;
	}
	
	public static String decrypt(String text, String key)
	{
		StringBuffer sb = new StringBuffer(text);
		
		for(int i = 0; i < text.length(); i++)// 
		{
			int decalage = (int)key.charAt(i % key.length()) - 97; 
			
			int currentLetter = (int)text.charAt(i);
			if(currentLetter - decalage < 97)
				currentLetter += 26;
			
			int newCharCode = (currentLetter - 97 - decalage) % 26 + 97;
			sb.setCharAt(i, (char)newCharCode);
			//System.out.print(text.charAt(i) + " " + decalage + " " + (char)newCharCode + "\n");
		}
		
		text = sb.toString();
		return text;
	}
	


}
