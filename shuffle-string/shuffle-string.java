class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        char[] shuffle = new char[s.length()];
        
        s.getChars(0, s.length(), str, 0);
        for(int i=0; i<indices.length; i++){
            shuffle[indices[i]]= str[i];
        }
        String r = String.valueOf(shuffle);
        r = r.toLowerCase();
        return r;
    }
}