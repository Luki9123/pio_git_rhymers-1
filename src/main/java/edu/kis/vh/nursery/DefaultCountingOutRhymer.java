package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int MAX = 12;
	public static final int FINAL = -1;
	private final int[] numbers = new int[MAX];

	public int total = FINAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == FINAL;
	}

	public boolean isFull() {
		return total == MAX+FINAL;
	}

	protected int isEmpty() {
		if (callCheck())
			return FINAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return FINAL;
		return numbers[total--];
	}

}
