package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int MAX_CAPACITY = 12;
	public static final int EMPTY = -1;
	public static final int ERROR = -1;
	public static final int MAX_INDEX = 11;
	private final int[] numbers = new int[MAX_CAPACITY];

	private int total = EMPTY;

	public int getTotal(){
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == MAX_INDEX;
	}

	protected int isEmpty() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

	public int peekaboo() {
		if(callCheck())
		{
			return ERROR;
		}
		return numbers[total];
	}
}
