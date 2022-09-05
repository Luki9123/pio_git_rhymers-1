package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > isEmpty())
			totalRejected++;
		else
			super.countIn(in);
	}
}

//alt + -> lub alt + <- działa jako przełączanie pomiędzy plikami