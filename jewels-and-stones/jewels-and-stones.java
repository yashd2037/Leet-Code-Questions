class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int x = jewels.length();
        int y = stones.length();
        int counter = 0;
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y;j++){
                char a1 = jewels.charAt(i);
                char a2 = stones.charAt(j);
                if(a1 == a2)
                    counter++;
            }
        }
        return counter;
        
    }
}