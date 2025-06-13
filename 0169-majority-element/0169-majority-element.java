class Solution {
    public int majorityElement(int[] arr) {
     Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int n=arr.length;
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>n/2){
                return  entry.getKey();
            }
        }
        
        return  -1;
    }
}