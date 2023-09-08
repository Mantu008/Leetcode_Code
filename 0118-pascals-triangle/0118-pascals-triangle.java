class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerlist = new ArrayList<>();
        innerlist.add(1);
        list.add(innerlist);

        if(numRows == 1) 
            return list;
            
        List<Integer> prevlist = innerlist;
        for(int i = 1; i < numRows; i++) {
            List<Integer> newlist = new ArrayList<Integer>();
            newlist.add(1);
            for(int j = 0; j < prevlist.size()-1; j++) {
                newlist.add(prevlist.get(j) + prevlist.get(j+1));
            }
            newlist.add(1);
            list.add(newlist);
            prevlist = newlist;
        }
        return list;
    }
}