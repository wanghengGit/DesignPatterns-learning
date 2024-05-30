package designpatterns.adapter;

//������������������
public class OperationAdapter implements ScoreOperation {
	private QuickSort sortObj; //����������QuickSort����
	private BinarySearch searchObj; //����������BinarySearch����

	public OperationAdapter() {
		sortObj = new QuickSort();
		searchObj = new BinarySearch();
	}

	public int[] sort(int array[]) {  
		return sortObj.quickSort(array); //������������QuickSort�����򷽷�
	}

	public int search(int array[],int key) {  
		return searchObj.binarySearch(array,key); //������������BinarySearch�Ĳ��ҷ���
	}
}