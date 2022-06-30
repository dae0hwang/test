public class Main {

    public static void main(String[] args) {


        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
        // 5,5

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
        //11,11

        speaker2.setVolume(22);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
        //22,22 즉 하나의 인스턴스이다.

        if (speaker1 == speaker2) {
            System.out.println("aaa");
        }



    }

}
