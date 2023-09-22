class Solution {
    public boolean isHappy(int n) {
    int fast=n;
    int slow=n;
    do{
      slow=findsquare(slow);
      fast=findsquare(findsquare(fast));
    
    }while(slow!=fast && slow!=1);

    if(slow==1){
         return true;
    }else{
        return false;
    }
    
}

public int findsquare(int n){
    int sum=0;
    while(n>0){   
    int rem=n%10;  
    sum=sum+rem*rem;
    n=n/10;
    }
    return sum;   
} 
}
