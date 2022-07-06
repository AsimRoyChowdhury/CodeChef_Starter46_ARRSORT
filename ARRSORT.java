import java.util.ArrayList;
import java.util.Scanner;


class CodeChefCC {

static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

static int partition(int[] arr, int low, int high)
{
    int pivot = arr[high];
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}

static void quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
 
          public static void main(String[] args){
                  Scanner sc = new Scanner(System.in);
                  int t = sc.nextInt();
                  int x, arr1[], defarr[];
                  while(t-- > 0){
		x = sc.nextInt();
		arr1 = new int[x];
		ArrayList<Integer> arr2 = new ArrayList<>();
		defarr = new int[x];
		for(int i=0; i<x; i++) {
			arr1[i] = sc.nextInt();
			arr2.add(arr1[i]);
		}
		quickSort(arr1, 0, x-1);
		for(int i=0; i<x; i++){
			if(arr1[i]==arr2.get(i)){
				defarr[i] = 0;
			}
			else{
				defarr[i] = java.lang.Math.abs(i - arr2.indexOf(arr1[i]));
			}
		}
		
		quickSort(defarr, 0, x-1);
		System.out.println(defarr[x-1]);
	}
	        
          }         

}          
