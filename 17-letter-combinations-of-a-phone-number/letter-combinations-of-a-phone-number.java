class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()<1)return new ArrayList<>();
        List<String> list = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        backtrack(digits,0,map,list,new StringBuilder());
        return list;
    }
    public void backtrack(String digits ,int i, HashMap<Integer,String> map , List<String>list,StringBuilder s){
        if(i==digits.length()){
            list.add(s.toString());
            return ;
        }
        String letters = map.get(digits.charAt(i)-'0') ;
        for(char l : letters.toCharArray()){
            s.append(l);
            backtrack(digits,i+1,map,list,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}