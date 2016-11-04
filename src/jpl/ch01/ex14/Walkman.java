package jpl.ch01.ex14;
/**
 *
 * @author Anna.S
 *
 */
public class Walkman {
	private Talk terminal;
	public static void main(String[] args){
		Walkman wm = new Walkman();
		Terminal terminal = new Terminal();
		wm.setTerminal(terminal);
		wm.Play();
		System.out.println(wm.getTerminal());
	}
	public Terminal getTerminal(){
		return terminal;
	}
	public void setTerminal(Terminal a_terminal){
		terminal = a_terminal;
	}
	public void Play(){
		System.out.println("Playing music.");
	}
}

}