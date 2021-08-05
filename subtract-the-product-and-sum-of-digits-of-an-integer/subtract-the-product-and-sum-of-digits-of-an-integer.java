class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0, x;
        while(n>0){
            x = n % 10;
            n = n/10;
            product = product * x;
            sum = sum + x;
        }
        
        return product-sum;
    }
}