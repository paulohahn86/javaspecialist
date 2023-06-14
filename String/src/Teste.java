import java.util.*;
import java.util.stream.IntStream;

public class Teste {

    public static void main(String[] args) {

        int[] nums = new int[] {2,7,11,15};
        int target = 9;

       int[] retorno = twosum(nums,target);

        System.out.println(retorno[0] + " - " + retorno[1]);

    }

    public static int[] twosum(int[] nums, int target){
        List<Integer> list = new ArrayList<>();
        int[] array = new int[2];
        for(int i = 0; i < nums.length; i++){
            int value = target - nums[i];
            if(list.stream().anyMatch(x -> x == value)){
                array[0] = list.indexOf(value);
                array[1] = i;
                return array;
            }
            list.add(nums[i]);
            System.out.println(list.toString());
        }

        throw new IllegalArgumentException("Sum not found");
    }

    public static int[] twosum1(int[] nums, int target){
        Map<Integer,Integer> numMap = new HashMap<>();
        int[] array = new int[2];
        for(int i = 0; i < nums.length; i++){
            int value = target - nums[i];
            if(numMap.containsKey(value)){
                array[0] = numMap.get(value);
                array[1] = i;
                return array;
            }
            numMap.put(nums[i],i);
        }

        throw new IllegalArgumentException("Sum not found");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[i] + nums[j] == target){
                    array[0] = i;
                    array[1] = j;
                    break;
                }
            }
        }
        return array;
    }

}
