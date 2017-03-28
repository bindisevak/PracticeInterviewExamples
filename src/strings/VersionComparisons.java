package strings;

public class VersionComparisons {
	public static void main(String[] args) {
		VersionComparisons vc = new VersionComparisons();
		String s= "1.0";
		String t = "1.8";
		System.out.println("Result: "+vc.compareVersions(s, t));
	}
	
	public int compareVersions(String s, String t){
		String[] arr1 = s.split("\\.");
		String[] arr2 = t.split("\\.");
		
		int i=0;
		while(i<arr1.length || i<arr2.length){
			if(i<arr1.length && i<arr2.length){
				if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
					return 1;
				}
				if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
					return -1;
				}
			} else if(i<arr1.length){
				if(Integer.parseInt(arr1[i]) != 0){
					return 1;
				}
			} else if(i<arr2.length){
				if(Integer.parseInt(arr2[i]) != 0){
					return -1;
				}
			}
			i++;
		}
		return 0;
	}
}
