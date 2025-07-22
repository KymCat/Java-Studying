package Basic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 볼륨 100이상으로 올리는 방법
        // 멤버 변수에 직접 접근
        /*
        System.out.println("Volume 필드에 직접 접근");
        speaker.volume = 200; // private 선언후 오류
        speaker.showVolume();
         */

        // 만약 볼륨 100 이상 올리면 망가지는 스피커면 문제되는 행동
        // => volume 필드를 private로 선언으로 해결
    }
}
