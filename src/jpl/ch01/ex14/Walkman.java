package jpl.ch01.ex14;
/**
 *
 * @author Anna.S
 *
 */
class Walkman {
	public static final int MAX_MUSIC_NUM = 1000;
	private String[] musicSet;
	private int musicIndex;

	public Walkman() {
		musicSet = new String[MAX_MUSIC_NUM];
		musicIndex = -1;
	}

	/** index で指定した音楽が削除できるか判定する */
	private boolean canRemoveMusic(int index) {
		if (index < 0 || index >= musicSet.length) {
			return false;
		} else if (musicIndex == index) {
			return false;
		}
		return true;
	}

	/** music を音楽セットに追加する
	  * 音楽セットがいっぱいの場合は -1 を返す */
	public int addMusic(String music) {
		for (int i = 0; i < musicSet.length; ++i) {
			if (musicSet[i] == null) {
				musicSet[i] = music;
				return i;
			}
		}
		return -1;
	}

	/** index で指定した曲を音楽セットから削除する
	 *  削除した音楽を返す */
	public String removeMusic(int index) {
		if (!canRemoveMusic(index)) {
			return null;
		} else if (musicSet[index] == null) {
			return null;
		}

		String retMusic = musicSet[index];
		musicSet[index] = null;
		return retMusic;
	}

	/** music で指定した曲を音楽セットから削除する
	 *  削除した音楽を返す */
	public String removeMusic(String music) {
		int index = -1;
		for (int i = 0; i < musicSet.length; ++i) {
			if (musicSet[i].equals(music)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return null;

		return removeMusic(index);
	}

	/** index で指定した音楽を返す */
	public String getMusic(int index) {
		if (index < 0 || index >= musicSet.length) {
			return null;
		}
		return musicSet[index];
	}

	/** 音楽セットを返す */
	public String[] getMusicSet() {
		return musicSet;
	}

	/** index で指定した音楽を再生する */
	public void playMusic(int index) {
		if (index < 0 || index >= musicSet.length) {
			System.out.println("Invalid index");
		} else if (musicSet[index] == null) {
			System.out.println("The music with index does not exit");
		}
		musicIndex = index;
		System.out.println("Play music: " + musicSet[index]);
	}

	/** 音楽を停止する */
	public void stopMusic() {
		musicIndex = -1;
		System.out.println("Stop music");
	}
}