package reflection;

public class BubbleSort {
	public static void main(String[] args) {
		int list[]= {23,76,53,40,67,1,213,21};
		System.out.println("before sorting");
		for	(int i=0;i<list.length;i++) {
			System.out.println(list[i]+"");
		}
		System.out.println();
		BubbleSort(list);
	}

	public static void BubbleSort(int list[]) {
		int i,j;
		int n=list.length;
		for(i=0;i<n-1;i++) {
			 for(j=0;j<n-1-i;j++)
			 {
				 if(list[j]>list[j+1]) {
					 int temp=list[j];
					 list[j]=list[j+1];
					 list[j+1]=temp;
				 }
			 }
		}
		System.out.println("after sorting");
		for(i=0;i<n;i++) {
			System.out.println(list[i]+"");
		}
			
	}
		
	}
