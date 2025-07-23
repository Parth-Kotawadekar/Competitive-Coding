class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0 || target <= 0) {
            return result;
        }
        // Only benefit of sorting is that we can break early in the recursion if the
        // current number is greater than the remaining target.
        Arrays.sort(candidates);
        combinationSumHelper(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void combinationSumHelper(int[] candidates, int start, int target, List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            tempList.add(candidates[i]);
            combinationSumHelper(candidates, i, target - candidates[i], tempList, result);
            tempList.remove(tempList.size() - 1);
        }
    }
}