package dynamicProgramming;

import java.util.LinkedList;

public class Coins {
	public static void main(String[] args) {
		int[] coins = {1,5,10,25};
		int amount = 55;
		Coins cnt = new Coins();
		System.out.println(cnt.coinChange(coins, amount));
		System.out.println(cnt.coinChange1(coins, amount));
	}
	
	public int coinChange(int[] coins, int amount) {
	    if(amount==0) return 0;
	 
	    int[] dp = new int [amount+1];
	    dp[0]=0; // do not need any coin to get 0 amount
	    for(int i=1;i<=amount; i++)
	        dp[i]= Integer.MAX_VALUE;
	 
	    for(int i=0; i<=amount; i++){
	        for(int coin: coins){
	            if(i+coin <=amount){
	                if(dp[i]==Integer.MAX_VALUE){
	                    dp[i+coin] = dp[i+coin];
	                    //System.out.println("in if: "+dp[i+coin]);
	                }else{
	                    dp[i+coin] = Math.min(dp[i+coin], dp[i]+1);
	                    //System.out.println("in else: "+dp[i+coin]);
	                }
	            }
	        }
	    }
	 
	    if(dp[amount] >= Integer.MAX_VALUE)
	        return -1;
	 
	    return dp[amount];
	}
	
	public int coinChange1(int[] coins, int amount) {
		if (amount == 0)
			return 0;
	 
		LinkedList<Integer> amountQueue = new LinkedList<Integer>();
		LinkedList<Integer> stepQueue = new LinkedList<Integer>();
	 
		// to get 0, 0 step is required
		amountQueue.offer(0);
		stepQueue.offer(0);
	 
		while (amountQueue.size() > 0) {
			int temp = amountQueue.poll();
			int step = stepQueue.poll();
	 
			if (temp == amount)
				return step;
	 
			for (int coin : coins) {
				if (temp > amount) {
					break;
				} else {
					if (!amountQueue.contains(temp + coin)) {
						amountQueue.offer(temp + coin);
						stepQueue.offer(step + 1);
					}
				}
			}
		}
	 
		return -1;
	}
}
