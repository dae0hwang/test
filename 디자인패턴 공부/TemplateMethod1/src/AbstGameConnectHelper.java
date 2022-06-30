public abstract class AbstGameConnectHelper {

    //1
    protected abstract String doSecurity(String string);

    //2
    abstract protected boolean authentication(String id, String password);

    //3
    protected abstract int authorization(String userName);

    //4
    protected abstract String connetion(String info);

    //템플리 메소드
    //템플릿 메소드를 사용해 사용한다.
    public String requestConnection(String info) {
        String id, password, userName, decodedinfo, userinfo = null;

        //1 암호화된 정보를 복호화한다.
        decodedinfo = doSecurity(info);
        //decodedinfo에서 id와 password 추출
        id = "abc";
        password = "abc";

        //2 유저 인포를 가져온다.
        authentication(id, password);

        //3 userinfo에서 username을 찾아낸다.
        userName = "abc";

        //3 username바탕으로 권한 정도를 부여한다.
        int result = authorization(userName);

        switch (result) {

            //미성년자 10시 추가 사항
            case -1:
                throw new Error("셧다운");
            case 0: //무료회원
                break;
            case 1: //유료회원
                break;
            case 2: //게임 마스터
                break;
            case 3: //접속권한 없음
                break;

        }

        return connetion(userinfo);

    }

}
