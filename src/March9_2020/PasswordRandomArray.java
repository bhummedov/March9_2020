package March9_2020;

public class PasswordRandomArray {
  /*  public static void main(String[] args) {
        String sentence = "We are in love with Java";
        String [] resultArray = convertStringToArray(sentence);
        for(String word:resultArray){
            System.out.println(word);
        }
    }

    public static int findNumberOfWords(String sentence){
        int counter=0;
        for(int i=0 ; i<sentence.length();i++){
            if (sentence.charAt(i)==' '){
                counter++;
            }
        }
        return counter;
    }

    public static String[] convertStringToArray(String sentence){
        sentence+=" ";
        int numWords = findNumberOfWords(sentence);
        String[] result = new String[numWords];
        String word="";
        int index=0;

        for(int j=0 ; j<sentence.length() ; j++) {

            word += sentence.charAt(j);
            if (sentence.charAt(j) == ' ') {
                result[index] = word;
                index++;
                word="";

            }

        }
        return result;
    }
}*/
  public static void main(String[] args) {
      System.out.println(generatePassword());

  }
  public static String generatePassword(){
  String[][] pass = {
          {"A", "B", "C", "D", "E", "F","G"},
          {"a", "b", "c", "d","e", "f", "g"},
          {"@", "#", "-", "+", "*", "&"},
          {"1","2","3","4","5","6","7"}};
String passwords= "";
      int index;
      for (int i=0; i<3; i++){
          index=0;
          passwords+=(int) (Math.random()*pass[0].length);
          passwords+= pass[0][index];
  }
      for (int i=0; i<3; i++){
          index = (int)(Math.random()*pass[1].length);
          passwords+=pass[1][index];
}
      index = (int)(Math.random()*pass[2].length);
      passwords+=pass[2][index];

      for (int i=0; i<4; i++){
          index = (int)(Math.random()*pass[3].length);
          passwords+=pass[3][index];
}
  return passwords;
  }
}