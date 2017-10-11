package ex6;

public class Conteneur {

	private boolean readOnly;

	private Object[] elements;
	private int size;

	public void add(Object element) {
		if (readOnly) {
			return;
		}
		int newSize = size + 1;
		if (newSize > size) {
			agrandirTab();
		}
		elements[size++] = element;

	}

	/**
	 * 
	 */
	private void agrandirTab() {
		Object[] newElements = new Object[size + 10];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
	}

	public Object getContent(int i) {
		return elements[i];
	}

	public int getSize() {
		return size;
	}
}
