package psuedcode;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Zoey", "Honey", "Sandy", "Wini", "Gani", "Rama"};
        int[] numbers = {10, 67, 98, 56, 12, 56, 8,19,75,55,43,57,27,28,24};

        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));
        System.out.println(contains(names, "Zoe"));
        System.out.println(getIndexByElement(names, "Rama"));
        printOddNumbersInRange(1,67);
        printGivenStringTimesNumberGiven("zoey",5);
        System.out.println(repeatFirstThreeLetters("Sandeep",2));
        System.out.println(WordsInAStringCounter("I am learning core java"));
    }
//Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
     //Question3
    public static String getFirstElement(String[] names) {
        return names[0];
    }
      //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }
    //Question 5
    public static String getSecondToLastElement(String[] names) {

        return names[getSecondToLastIndex(names)];
    }
    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum = sum + i;
            //sum+=i;
        }
        return sum;
    }
    //Question 7
    public static int getAverage(int[] ints) {
        int avg = 0;
        avg = getSum(ints) / ints.length;
        return avg;
    }
    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String odd = null;
        for (int i : numbers) {
            if(i %2!=0){
                if(odd ==null){
                    odd = i +"";
                }
                else {
                    odd = odd + "," + i;
                }
            }
        }
        return odd;
    }
    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String even= null;
        for (int i : numbers) {
            if(i %2==0){
                if(even ==null){
                    even =  String.valueOf(i) ;
                }
                else {
                    even = even + "," + i;
                }
            }
        }
        return even;
    }
    //Question 10
    public static boolean contains(String[] names, String element) {
        boolean b = false;
        for(String s : names){
            if(s==element){
               b=true;
               break;
            }
        }
        return b;
    }
    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int i = -1;
        int j = 0;
        for(String s : names){
            if(s==element){
                break;
            }
            j=j+1;
        }
        if(j<names.length){
            return j;
        }
        else{
            return i;
        }
        //return 0;
    }
    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        String odd= null;
      for(int i =start ;i<= end; i++){
          if(i %2!=0){
              if( odd==null){
                  odd = i +"";
              }
              else {
                  odd = odd + "," + i;
              }
          }
      }System.out.println(odd);
    }
    //Question 13
    public static void printGivenStringTimesNumberGiven(String str, int n) {
        String result =null;
        for(int i = 1; i<=n; i++){
            if( result==null){
                result = str +"";
            }
            else {
                result = result + "," + str;
            }
        }
        System.out.println(result);
    }
    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String result =null;
        String str1 = str.substring(0,3);
        for(int i = 1; i<=n; i++){
            if( result==null){
                result = str1 +"";
            }
            else {
                result = result + "," + str1;
            }
        }
        return result;
    }
    //Question 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str){
        String[] words = str.split(" ");
        return words.length;
    }
}
