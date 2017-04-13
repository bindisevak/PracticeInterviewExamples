package arrays;

public class GasStation {
	public static void main(String[] args) {
		int[] gas = {1,2,3,4,5};
		int[] cost = {1,3,2,4,5};
		GasStation gs = new GasStation();
		System.out.println(gs.canCompleteCircuit(gas, cost));
	}
	
	public int canCompleteCircuit(int[] gas, int[] cost){
		int sumRemaining = 0;
		int total = 0;
		int start = 0;
		
		for(int i=0; i<gas.length; i++){
			int remaining = gas[i] - cost[i];
			if(sumRemaining >= 0){
				sumRemaining += remaining;
			} else {
				sumRemaining = remaining;
				start = i;
			}
			total += remaining;
		}
		if(total >= 0){
			return start;
		}else{
			return -1;
		}
	}
}
