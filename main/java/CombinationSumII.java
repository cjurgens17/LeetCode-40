import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
//Hello
    //LeetCode #40
//    Given a collection of candidate numbers (candidates) and a target number (target), find all unique
//    combinations in candidates where the candidate numbers sum to target.
//
//    Each number in candidates may only be used once in the combination.
//
//    Note: The solution set must not contain duplicate combinations.

    public static void main(String[] args) {
        int[] candidates = new int[] {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(comSum2(candidates,target));
    }


    public static List<List<Integer>> comSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combos(0,candidates,target,res,new ArrayList<>());
        return res;


    }

    public static void combos(int index,int[] candidates, int target, List<List<Integer>> res, List<Integer> combo){
        if(target == 0){
            res.add(new ArrayList<>(combo));
            return;
        }

        for(int i = index;i< candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) break;

            combo.add(candidates[i]);
            combos(i+1, candidates,target-candidates[i],res,combo);
            combo.remove(combo.size()-1);
        }
    }
}
