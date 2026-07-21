class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length>1){
            int buy = 0;
            int sell = 1;
            int cmax = prices[sell]-prices[buy];

            for(int i = 2; i<prices.length;i++){
                int nmax = prices[i]-prices [buy];
                if(cmax<=nmax){
                    cmax = nmax;
                    sell = i;
                }
            }
            for(int i = 1; i<sell; i++){
                int nmax = prices[sell]-prices[i];
                if(cmax<nmax){
                    cmax = nmax;
                    buy = i;
                }
            }
            int highest =prices[sell]-prices[buy];

            int nbuy=buy;
            int nsell;
            for(int i = sell; i < prices.length; i++){
                if(prices[i]<prices[nbuy]){
                    nbuy = i;
                }
            }

            for(int i = ++nbuy; i < prices.length; i++){
                if(prices[i]-prices[nbuy]>highest){
                    highest = prices[i]-prices[nbuy];
                }
            }
            
            return (highest>0)?highest:0;
        }else{
            return 0;
        }
    }
}
