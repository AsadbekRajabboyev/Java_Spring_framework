package uz.spring;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return volume;
    }

    public void setAge(int age) {
        this.volume = volume;
    }

    public MusicPlayer() {

    }
    public void setMusic(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Chalinmoqda: " + music.getSong());
    }
}