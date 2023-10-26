class CustomStack {
       int[] arr;
       int top;
       int maxSize;
    public CustomStack(int maxSize) {
          arr=new int[maxSize]; 
          top=-1;
          this.maxSize=maxSize;     
    }
    
    public void push(int x) {
          if(maxSize-top>1){
            top++;
            arr[top]=x;
          }
    }
    
    public int pop() {
         if(top==-1){
               return -1;
         }

         return arr[top--];

    }
    
    public void increment(int k, int val) {
           for (int i = 0; i < Math.min(k, top+1); i++) {
            arr[i] += val;
        }
    }


}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */