package com.test.pgm;

class DArray<T> {
	T[] values;
	int size;
	public Object[] add;

	public DArray() {
		super();
		System.out.println("inside create");
		Object[] obj =  {};
		this.setValues((T[]) obj);
		this.setSize(0);
	}

	public T[] getValues() {
		for (int i =0;i<this.size ;i++)
		{
			System.out.println(this.values[i]);
		}
		return values;
	}

	public void setValues(T[] values) {
		this.values = values;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean add(T element) {
		Object[] newArray =  new Object[size+1];
		T[] newArray1 =(T[]) newArray;
		if (values.length == 0)

		{
			newArray1[0] = element;
			this.size++;
			this.setValues(newArray1);
			return true;
		} else {
			for (int i = 0; i < values.length; i++) {
				newArray1[i] = values[i];
				newArray1[i + 1] = element;
				this.size++;
			}
			this.setValues(newArray1);
			return true;
		}

	}
	
	public T get(int index) {
	int i = 0;
	T element = null;
	while (i < this.size)
	{
		element = this.values[i];
		i++;
	}
	System.out.println(element);
	return element;		
	}

}

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DArray<Integer> a = new DArray<Integer>();
		a.add(1);
		a.add(2);
	//	System.out.println(a.getSize());
		a.getValues();
		a.get(1);
		
	}

}
