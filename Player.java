
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player implements danPlayer
{
   
    //the very basics, band A requirements
    public void play()
    {
        System.out.println("play() invoked in Player class");
    }
    
    public void stop()
    {
        System.out.println("stop() invoked in Player class");
    }
    
    public void pause()
    {
        System.out.println("pause() invoked in Player class");
    }
    
    public void openFile()
    {
        System.out.println("openFile() invoked in Player class");
    }
    
    //intermediate, band B requirements
    public String getCurrentTrackName();  // need to strip down to filename and remove ".mp3"
    public void setMute(boolean _mute);
    public void setVolume(double _volume); //0-1
    public Duration getTime();
    public boolean getMute();
    public double getVolume(); //0-1
    
    //advanced, band C requirements
    public void setTime(Duration _time);       
    public Duration getTotalTime();
    public void openPlayList();
    ArrayList<String> getPlayList(); //need to strip down filenames
    public void playTrack(int _trackNo); // choose which track in playlist to play.
    public void restart(); //go to start of current track    
}
