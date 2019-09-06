package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100]; //  외부노출안되게  - private
	
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	public boolean add(int index, Object element ) {
		for (int i =size -1; i>=index; i--) {
			elementData[i+1]=elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
		
	}
	public Object get(int index) {
		return elementData[index];
	}
	public String toString() {
		String str ="[";
		for(int i=0; i< size; i++) {
			str +=elementData[i];
			if(i < size-1) {//마지막,안보이게..
				str +=",";
			}
		}
		return str + "]";
	}
	public int size() {
		return size;
	}
	public int indexOf(Object o) {
		for (int i=0; i<size; i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
}
