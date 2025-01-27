package access;

class SpeakerConstruct {
    private int volume;

    SpeakerConstruct(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume > 100) {
            System.out.println("볼륨을 증가시킬 수 없습니다.");
        }else {
            this.volume++;
        }
    }

    void volumeDown() {
        this.volume--;
    }

    void printVolume(){
        System.out.println("현재 볼륨 : "  + this.volume);
    }
}

public class Speaker {
    public static void main(String[] args) {
        SpeakerConstruct speaker = new SpeakerConstruct(90);
        speaker.printVolume();
        speaker.volumeUp();
        speaker.printVolume();
        speaker.volumeDown();
        speaker.printVolume();
//      `java: volume has private access in access.SpeakerConstruct (private 은 클래스 외부에서 직접적으로 접근할 수 없음.)
//      speaker.volume = 100;
    }
}