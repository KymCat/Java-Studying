package Basic.access;

public class Speaker {
//    int volume;
    private int volume; // private로 선언

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (this.volume >= 100)
            System.out.println("음량을 증가할 수 없습니다. 최대 음량 입니다.");
        else {
            this.volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        this.volume -= 10;
        System.out.println("음량을 10 감소합니다.");
    }

    void showVolume() {
        System.out.println("현재 음량은 " + this.volume + " 입니다.");
    }
}
