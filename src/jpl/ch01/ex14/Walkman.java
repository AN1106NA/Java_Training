package jpl.ch01.ex14;

public class Walkman {
	private Talk Talk;

	public static void main(String[] args) {
		Walkman wm = new Walkman();
		Talk Talk = new Talk();
		wm.setTalk(Talk);
		wm.Play();
		System.out.println(wm.getTalk());
	}

	public Talk getTalk() {
		return Talk;
	}

	public void setTalk(Talk talk) {
		Talk = talk;
	}

	public void Play() {
		System.out.println("Playing music.");
	}
}