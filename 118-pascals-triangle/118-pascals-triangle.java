class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        // List<List<Integer>> temp = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> tempArr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0){
                    tempArr.add(1);
                } else if(j == i) {
                    tempArr.add(1);
                } else {
                    tempArr.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            // System.out.println(tempArr);
            res.add(tempArr);
        }
        return res;
    }
}