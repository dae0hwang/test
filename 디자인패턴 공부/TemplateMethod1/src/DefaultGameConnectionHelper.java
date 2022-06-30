public class DefaultGameConnectionHelper extends AbstGameConnectHelper{

    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        System.out.println("더 강화된 알고리즘을 이용한 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디 암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        //서버에서 유저이름을 가지고 유저의나이를 알 수 있다.
        //나이와 지금 시간을 확인하여
        //현재 10시가 지났고, 미성년자라면
        //권한이 없는 것으로 한다.
        return 0;
    }

    @Override
    protected String connetion(String info) {
        System.out.println("마지막 접속단계!");
        return null;
    }
}
