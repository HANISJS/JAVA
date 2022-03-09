public class Player {
    private int number;
    private String name;
    private int mypick;

    public void guess(){
        number=(int)(Math.random()*10); //랜덤 숫자로 추측
        System.out.println(name + " guessed " + number);
    }

    public int getNumber(){
        return number;
    }


    public void playername(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void pickNumber(){ //랜덤으로 숫자 선택
        mypick=(int)(Math.random()*10);
        System.out.println(name + " picked " + mypick);
    }

    //다른 플레이어가 추측한 숫자와 자신의 숫자가 같은지 확인
    public boolean askToGuess(Player theOther) {
        theOther.guess();
        if (mypick == theOther.getNumber())
            return true;
        else return false;
    }
}
