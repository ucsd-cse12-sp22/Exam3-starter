import java.util.Iterator;

public class CircularArrayList<T> implements ArrayListADT<T>,Iterable<T>{
	int capacity;
	int size;
	int front;
	int rear;
	int it;
	T[] arrayList;
	
	public CircularArrayList() {
		//Fill in the constructor for the circularArrayList
	}
	
	public CircularArrayList(int initialCapacity) {
		
		//Fill in the constructor for the circularArrayList
	}

	@Override
	public void addRear(T element) {
		
		//Method to add element at the rear of the arraylist
	}

	@Override
	public void addFront(T element) {
		
		//Method to add element at the front of the arraylist i.e. towards start
	}

	public T get(int index) throws Exception {
		//Method to get element at a given index of the circularArrayList
	}
	
	
	@Override
	public T remove() {
		//Method to remove element from the front
	}
	
	 public class MyArrayListIterator<T> implements Iterator<T> {
		    private int currentIndex = front; //start with front index

		    @Override
		    public boolean hasNext() {
		      //Method to check if iterator has next element
		    }

		    @Override
		    public T next() {
		    	//Used to get the next element of iterator
		    }
		  }

	@Override
	public Iterator<T> iterator() {
		return  new MyArrayListIterator();
	}

	@Override
	public int getSize() {
		//Fill method to get size of arraylist
	}

	@Override
	public int getCapacity() {
		//Fill method to get capacity of arraylist
	}
	
}
