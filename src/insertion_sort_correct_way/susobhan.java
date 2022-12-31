package insertion_sort_correct_way;

public class susobhan {
	public static void main (String []args) {
		
		int arr[] = {5,4,7,1};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			
			int key = arr[i];
			int j =i-1;
			
			while(j>=0 && arr[j]>key) {
				//swap 
				
//				
                   arr[j+1]=arr[j];
				       j--;
				
			}
			arr[j+1]=key;
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
