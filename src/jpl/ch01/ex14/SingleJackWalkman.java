package jpl.ch01.ex14;

public class SingleJackWalkman{
		private Object jack;

		public void setJack(Object jack) {
			this.jack = jack;
		}

		public Object getJack() {
			return this.jack;
		}

		public void playMusic() {
			jack = "Playing music(Jack)";
	}
}