class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

         ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        boolean freq[]=new boolean[nums.length];
        Printprmution(nums,list,resultList,freq);
        return resultList;
        
    }

     public static void Printprmution(int arr[],ArrayList<Integer>list, List<List<Integer>> resultList,boolean []freq){
         if(list.size()==arr.length){
                if(!resultList.contains(list)){
                        resultList.add(new ArrayList<>(list));
                }
               return;
         }
        
           for(int i=0;i<arr.length;i++){
                if(!freq[i]){
                     freq[i]=true;
                     list.add(arr[i]);
                     Printprmution(arr,list,resultList,freq);
                     list.remove(list.size()-1);
                     freq[i]=false;
                }
           }

    }
}