import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer>testingArray1 = new ArrayList<>(Arrays.asList(5,1,22,25,6,-1,8,10));
        List<Integer> testingSequence1 = new ArrayList<>(Arrays.asList(1,6,-1,10));

        
        System.out.println(isValidSubsequence(testingArray1, testingSequence1)); 
        System.out.println(isVaildSubsequence2(testingArray1, testingSequence1));

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        int arrIndex = 0;
        int seqIndex = 0;
        boolean result = false;

        while(arrIndex<array.size() && seqIndex<sequence.size()){
            if(array.get(arrIndex).equals(sequence.get(seqIndex))){
                seqIndex++;
            }
            arrIndex++;
        }
        System.out.println("Sequence matching rate: "+seqIndex + "/" +sequence.size());
        
        if(seqIndex == sequence.size()){
            result = true; 
        }
        System.out.println("isVaildSubsequence() system testing, result=" + result);
        return result;
    }

    public static boolean isVaildSubsequence2(List<Integer> array, List<Integer> sequence){
        System.out.println("isVaildSubsequence2() TESTING START");
        boolean result = false;
        int seqIndex = 0;
        for(var num : array){
            if(seqIndex == sequence.size()){
                System.out.println("got here");
                break;
            }
            if(sequence.get(seqIndex).equals(num)){
                System.out.println("Matched number: "+sequence.get(seqIndex));
                seqIndex++;
            }
        }
        if(seqIndex == sequence.size()){
                result = true;
        }
        System.out.println("isVaildSubsequence2() system testing, result="+result);
        return result; 
    }
}
