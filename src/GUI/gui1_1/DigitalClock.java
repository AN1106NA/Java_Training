package gui1_1;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  java.awt.Frameを使用する。
 *  Windowsの普通のアプリケーションと同様にタイトルバーの「×」ボタンをクリックすると終了する。
 *  デジタル時計の描画は、paintメソッド内でGraphicsを使用して行う。テキストラベルによる単なる表示は、不可。
 * @author Anna.S
 */
public class DigitalClock extends Frame {
	private String timeStr;
	private SimpleDateFormat sdf;
	private TimeZone timeZone;

	DigitalClock() {
		super("DigitalClock");
		configDefaultDesign();
		setVisible(true);

		/**
		 * check !! 200 ミリ秒間隔で再描画.
		 *
		 * TimerTaskはクラスのインスタンスを生成するだけでは動かない.
		 * Timerクラスのscheduleメソッドの引数に呼び出したいTimerTaskクラスをセットする.
		 *  Bad example> new ClockTimer();
		 */
		Timer timer = new Timer(true);
		timer.schedule(new ClockTimer(), 0, 200);

		//「×」で終了.
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private void configDefaultDesign() {
		setSize(400, 180);
		setFont(new Font("Meiryo UI", Font.ITALIC, 50));
		setLocationRelativeTo(null);
		sdf = new SimpleDateFormat("HH:mm:ss");
		timeZone = TimeZone.getTimeZone("Asia/Tokyo");
		sdf.setTimeZone(timeZone);
	}

	/**
	 *  paintの中でCalendarクラスから時間取得
	 */
	public void paint(Graphics g) {
		Dimension d = getSize();
		Calendar cal = Calendar.getInstance();
		timeStr = sdf.format(cal.getTime());
		int x = (d.width / 5);	//TODO 適当にあわせてるだけ.
		int y = (d.height / 2) + 30;
		g.drawString(timeStr, x, y);
	}

	class ClockTimer extends TimerTask {
		public void run() {
			repaint();
		}
	}
}