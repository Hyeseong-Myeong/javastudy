public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;

    public void turnOn(){
        System.out.println("TV를 켭니다");
    }
    public void turnOff(){
        System.out.println("TV를 끕니다");
    }
    public void setVolume(int volume){
        //대충 소리 조절 조건문
    }

    public void search(String url){
        System.out.println(url + "을 검색합니다");
    }
}
