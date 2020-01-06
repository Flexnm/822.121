package homework_exceptions;

public class TV {
	private String name;
	private int volume;
	private boolean mute;

	public TV(String name, int volume, boolean mute) {
		super();
		this.name = name;
		this.volume = volume;
		this.mute = mute;
	}

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isMute() {
		return mute;
	}

	public void changeVolume(int volumeChange) throws VolumeException {
		if(volume + volumeChange >= 0 && volume + volumeChange <= 10) {
			this.volume += volumeChange;
			System.out.println("Volume is: " + volume);
		} else {
			// EXCEPTION!!
			System.out.println("Volume is: " + volume);
			throw new VolumeException();
		}
		
	}
	
	public void muteVolume() {
//		if(!mute) {
//			mute = true;
//		} else {
//			mute = false;
//		}
		
		mute = !mute;
		System.out.println("Mute is: " + (mute ? "On" : "Off"));
	}
	
	
}
