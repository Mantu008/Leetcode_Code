class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n=candidates.length;
        Arrays.sort(candidates);
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>(); 
        int idx=0;
        Printsubn(idx,target,candidates,n,list,resultList);
         return resultList;
    }

         public static void Printsubn(int idx,int target,int arr[],int n,ArrayList<Integer>list, List<List<Integer>>resultList){
                if(target==0){
                     resultList.add(new ArrayList<>(list));
                return;
         }

          for(int i=idx;i<arr.length;i++){
              if(i>idx && arr[i]==arr[i-1]) continue;
              if(arr[i]>target) break;
              list.add(arr[i]);
              Printsubn(i+1,target-arr[i],arr,n,list,resultList);
              int size=list.size()-1;
              list.remove(size);
          }
    }
}