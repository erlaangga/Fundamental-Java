class bubblesortbukanpublik{
	public static void main(String[]args){
		int a[] = {4,3,12,54,1,2,9,5,7};
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.print(a[i]+ " ");
		}
		for(int i=a.length-2; i>0; i--){
			System.out.print("nilai i " + i);
			for(int j=0; j<=i;j++){
				System.out.println("nilai j " +j);
				if (a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.print(a[i] + " ");
		}
	}
}