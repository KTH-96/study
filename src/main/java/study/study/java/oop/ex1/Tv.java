package study.study.java.oop.ex1;

public class Tv {
    private String color;
    private boolean power;
    private int channel;

    public void power() {
        this.power = !power;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        this.channel--;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
