    import java.util.Arrays;
import java.util.List; 
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        String result = array[0];
        return result;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String result = array[1];
        return result;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String result = array[array.length-1];
        return result;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        String result = array[array.length-2];
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List<String> arrayList = Arrays.asList(array);
        boolean doesContain = arrayList.contains(value);
        return doesContain;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];
        int j = (array.length- 1);
        for(int i=0; i < array.length;i++){
            result[i] = array[j];
            j--;
        }
        return result;
        /*
        for(int i = 0; i < array.length/2; i++ ) {
        String temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - i -1] = temp;
        }
        return array; */
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean myBool = true;
        String[] reversedArray = reverse(array);

        for (int i = 0; i <array.length; i++){
            if(array[i].equals(reversedArray[i]) == false ) {
                myBool = false;
            } 
        }   

        return myBool;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String lowerCaseArray = Arrays.toString(array).toLowerCase();
        char[] alpha = "abcdefghijklmnopqrstuvwyz".toCharArray();

        for(int i = 0; i<alpha.length; i++) {
            if(!lowerCaseArray.contains(String.valueOf(alpha[i]))) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length;i++) {
            if(value.equals(array[i])){  
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        ArrayList<String> arlist = new ArrayList<String>( );

        String ans = "";
        for(int i = 0; i<array.length; i++) {
            if(!array[i].equals(valueToRemove)) {

                arlist.add(array[i]);
            }
        }

        String[] result = arlist.toArray(new String[0]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> newList = new ArrayList<>(Arrays.asList(array));
        ArrayList<String> resultPreToString = new ArrayList<>();
        resultPreToString.add(array[0]);
        for(int i = 1; i<array.length; i++) {
           
            if(newList.get(i-1)!=((newList.get(i))))
                resultPreToString.add(newList.get(i)); 
        
    }
        String[] result = resultPreToString.toArray(new String[0]);
        return result;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String previousArrayString = array[0];
        String concatenatedArrayString = array[0];
        
        for(int i = 1; i<array.length;i++) {
         if(previousArrayString.equals(array[i]) == false) {
             concatenatedArrayString = concatenatedArrayString + " " + array[i];
            } else {
                concatenatedArrayString = concatenatedArrayString + array[i];
        }
        previousArrayString = array[i];  
    }
    String[] result = concatenatedArrayString.split(" ",0);
        return result;
}
}
