package anodaz;
import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files
public class Crypte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("khayer wahda :");
		System.out.println("1.cesar");
		System.out.println("2.virgenere");
		Scanner myObjs = new Scanner(System.in);  // Create a Scanner object
	    String choix = myObjs.nextLine();  // Read user input
	    switch (Integer.parseInt(choix)){
	    case 1:
			System.out.println("khayer wahda :");
			System.out.println("1.crypter");
			System.out.println("2.decrypter");
		    String choix1 = myObjs.nextLine();  // Read user input
	        
	        switch (Integer.parseInt(choix1)){
	        case 1:
	        	String dataA="";
	        	try {
	    			System.out.println("text A :");
	    		      File myObj = new File("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/filea.txt");
	    		      Scanner myReader = new Scanner(myObj);
	    		      while (myReader.hasNextLine()) {
	    		        String data = myReader.nextLine();
	    		        dataA +=data+"\n";
	    		        System.out.println(data);
	    		      }
	    		      myReader.close();
	    		    } catch (FileNotFoundException e) {
	    		      System.out.println("An error occurred.");
	    		      e.printStackTrace();
	    		    }
	    		System.out.println("text B :");
	    		Cesar Crypt=new Cesar();
	    		String result = Crypt.crypt(3,dataA);
	    		System.out.println(result);
	    		try {
	    		      FileWriter myWriter = new FileWriter("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/fileb.txt");
	    		      myWriter.write(result);
	    		      myWriter.close();
	    		    } catch (IOException e) {
	    		      System.out.println("An error occurred.");
	    		      e.printStackTrace();
	    		    }
	        	break;
	        case 2:
	        	String dataB="";
	        	try {
	    			System.out.println("text B :");
	    		      File myObj = new File("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/fileb.txt");
	    		      Scanner myReader = new Scanner(myObj);
	    		      while (myReader.hasNextLine()) {
	    		        String data = myReader.nextLine();
	    		        dataB +=data+"\n";
	    		        System.out.println(data);
	    		      }
	    		      myReader.close();
	    		    } catch (FileNotFoundException e) {
	    		      System.out.println("An error occurred.");
	    		      e.printStackTrace();
	    		    }
	    		System.out.println("text A :");
	    		Cesar deCrypt=new Cesar();
	    		String resultd = deCrypt.decrypt(3,dataB);
	    		System.out.println(resultd);
	    		try {
	  		      FileWriter myWriter = new FileWriter("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/filea.txt");
	  		      myWriter.write(resultd);
	  		      myWriter.close();
	  		    } catch (IOException e) {
	  		      System.out.println("An error occurred.");
	  		      e.printStackTrace();
	  		    }
	        	break;
	        }
	        break;
        case 2:
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrez le numéro correspondant à l'action que vous voulez exécuter\n1 : Crypter\n2 : Décrypter\n3 : Attaquer\n");
    	    String choix2 = sc.nextLine();  // Read user input
    	    Vigenere vg=new Vigenere();
            switch (Integer.parseInt(choix2)){
            case 1:
            	String dataA="";
	        	try {
	    			  System.out.println("text A :");
	    		      File myObj = new File("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/fileva.txt");
	    		      Scanner myReader = new Scanner(myObj);
	    		      while (myReader.hasNextLine()) {
	    		        String data = myReader.nextLine();
	    		        dataA +=data+"\n";
	    		        System.out.println(data);
	    		      }
	    		      
	    		      myReader.close();
	    		    } catch (FileNotFoundException e) {
	    		      System.out.println("An error occurred.");
	    		      e.printStackTrace();
	    		    }
	        	System.out.println("Entrez la clé de chiffrement :\n");
				  String key = sc.next();
				  String result = vg.crypt(dataA, key);
				  System.out.println("text B :");
	        	System.out.println(result);
	    		try {
	  		      FileWriter myWriter = new FileWriter("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/filevb.txt");
	  		      myWriter.write(result);
	  		      myWriter.close();
	  		    } catch (IOException e) {
	  		      System.out.println("An error occurred.");
	  		      e.printStackTrace();
	  		    }
            	break;
            case 2:
            	String dataB="";
	        	try {
	    			  System.out.println("text B :");
	    		      File myObj = new File("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/filevb.txt");
	    		      Scanner myReader = new Scanner(myObj);
	    		      while (myReader.hasNextLine()) {
	    		        String data = myReader.nextLine();
	    		        dataB +=data+"\n";
	    		        System.out.println(data);
	    		      }
	    		      
	    		      myReader.close();
	    		    } catch (FileNotFoundException e) {
	    		      System.out.println("An error occurred.");
	    		      e.printStackTrace();
	    		    }
	        	System.out.println("Entrez la clé de chiffrement :\n");
				  String keyb = sc.next();
				  String resultb = vg.decrypt(dataB, keyb);
				  System.out.println("text A :");
	        	System.out.println(resultb);
	    		try {
	  		      FileWriter myWriter = new FileWriter("/home/anodaz/eclipse-workspace/Crypt/src/anodaz/fileva.txt");
	  		      myWriter.write(resultb);
	  		      myWriter.close();
	  		    } catch (IOException e) {
	  		      System.out.println("An error occurred.");
	  		      e.printStackTrace();
	  		    }
            	break;
            
	    	}
	    	break;
	    }
		//System.out.print("hhhhhhhh");
	}

}