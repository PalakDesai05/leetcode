class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1= new StringBuilder();
        for(String ch:word1){
            s1.append(ch);
        }
        String w1=s1.toString();
        StringBuilder s2= new StringBuilder();
        for(String ch:word2){
            s2.append(ch);
        }
        String w2=s2.toString();
        if(w1.equals(w2)){
            return true;
        }else{
            return false;
        }

    }
}