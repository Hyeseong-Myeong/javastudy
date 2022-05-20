public class DmbCellPhoneEx {
    public static void main(String[] args) {
        DmbPhone dmbPhone = new DmbPhone("갤럭시", "검정", 10);
        System.out.println("모델: " + dmbPhone.model);
        System.out.println("색상: " + dmbPhone.color);
        System.out.println("채널: " + dmbPhone.channel);

        dmbPhone.powerON();
        dmbPhone.bell();
        dmbPhone.sendVoice("여보세요");
        dmbPhone.receiveVoice("안녕하세요");
        dmbPhone.hangUp();

        dmbPhone.turnOnDmb();
        dmbPhone.changeChannelDmb(12);
        dmbPhone.turnOffDmb();

    }
}
