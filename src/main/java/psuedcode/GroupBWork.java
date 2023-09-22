package psuedcode;

public class GroupBWork {

    public static void main(String[] args) {
        String[] names={"Sandy","Zoey","Wini","Honey"};

        System.out.println(VowelsCounter("aeiouxyzkfkddl"));
        for(int i =0; i<names.length ; i++){
            System.out.println(swap(names)[i]);
        }
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));

        System.out.println(createStringOfFibonnaciUpToMax(40));

    }

//A, E, I, O, U, and sometimes Y

        public static int VowelsCounter(String str){
             int count = 0;
           // char[] arr = new char[str.length()];
             for(int i = 0; i<str.length();i++){
                 char k=str.charAt(i);
                 char j = Character.toUpperCase(k);
                 if(j== 'A' || j=='E'|| j=='I' ||j=='O' ||j=='U'){
                  count++;

                 }
             }

            return count;
        }

//Swap the first element in an array with the last element in an array and return



        public static String[] swap(String[] stringArray) {
            String[] copiedArray= stringArray.clone();
            copiedArray[0]=stringArray[stringArray.length -1];
            copiedArray[copiedArray.length-1]=stringArray[0];
            return copiedArray;

        }

        /**

         * Given the following legend

         *

         * f >> 7

         * s >> $

         * 1 >> !

         * a >> @

         *

         * your method should replace any character represented by a key in the legend, with its corresponding value.

         * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"

         * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"

         *

         * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer

         */



        public static String replaceCharacters(String str) {
            String i = str.replace('f','7');
           String j= i.replace('s','$');
           String k = j.replace('1','!');
           String l = k.replace('a','@');
           String m = l.replace('F','7');


            return m;

        }


//" The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu //Fence "


        public static String replaceWuTangTwoThreeDivisible(String stringInput) {

            return null;

        }
    //0 1 1 2 3 5 8 13
        public static String createStringOfFibonnaciUpToMax(int maxnumber) {
            String s = " ";
            int num1 = 0;
            int num2 = 1;
            int  nextnum = 0;
            while (nextnum < maxnumber) {
                if(s==" "){
                    s=num1+"";
                }else{
                    s = s + "," + num1 ;
                }
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                nextnum = num1;
            }

            return s;

        }

    }
