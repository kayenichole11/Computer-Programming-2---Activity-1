package Gipit;

public class FindingTheNonReapetedCharacter {

  public static void main(String[] args) {
   
  String inputStr = " kayengg kaye";
  for(char i : inputStr. toCharArray()) {
    if(inputStr.indexOf(i) == inputStr. lastIndexOf(i)) {
      
      System.out.println("First non repeated character is; " +i);
      
    }
  }
  

  }

}
  
 
