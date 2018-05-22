
public class InsertionSort {
  
  public static void main(String... args) {
    
    InsertionSort insertionSort = new InsertionSort(new int[] {42, 22, 16, 34, 99, 3});
    
    insertionSort.sort();
    insertionSort.display();
  }
  
  public InsertionSort(int[] data) {
    this.data = data;
  }

  private void sort() {

    for (int key = 1; key < data.length; key++) {
      System.out.printf("key[%d]:", key);
      int testIndex = key;
	  while (testIndex > 0 && data[testIndex] < data[testIndex-1]) {
		swap(data, testIndex, testIndex-1);
        display();
      	testIndex--;
      }
    }
  }
  
  private void swap(int[] data, int indexA, int indexB) {
    int temp = data[indexA];
    data[indexA] = data[indexB];
    data[indexB] = temp;
  }
  
  private void display() {
    
    for (int i = 0; i < data.length; i++) {
      System.out.printf("%d |", data[i]);
    }
    System.out.println();
  }
  
  private int[] data;
}
