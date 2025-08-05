class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<baskets.length; j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break;
                }
            }
        }
        for(int i=0; i<baskets.length; i++){
            if(baskets[i]!=0){
                c++;
            }
        }
        return c;
    }
}