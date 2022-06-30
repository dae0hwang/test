public class SystemSpeaker {

    private static SystemSpeaker instance;
    private int volume;
    SystemSpeaker() {
        volume = 5;

    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            //시스템에 스피커를 접속하는 작업이 여기에 들어감.
            instance = new SystemSpeaker();
            System.out.println("새 인스턴스 생성");
        }else {
            System.out.println("이미 생성 되었음.");
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }




}
