package ch13_abstraction.interfaces;

public class TvRemoteController {
    // field 선언, 상속으론 하나만 받을 수 있으니까
    private PowerButton powerButton;//다만, 왜 new는 필요없나, 선언만 해둘거기 때문에
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton   vU;
    private VolumeDownButton vD;


    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton
                                ,VolumeUpButton vU, VolumeDownButton vD) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.vU = vU;
        this.vD = vD;
        System.out.println("TV 리모컨 객체가 생성 되었습니다.");
    }

    public void onPressedPowerButton(){powerButton.onPressed();}//전원 키고 끄기

    public void onPressedChannelUpButton(){channelUpButton.onPressed();}//한칸 올리기
    public void onPressedChannelDownButton(){channelDownButton.onPressed();}//한칸 내리기
    public void onPressedVolumeUpButton(){vU.onPressed();}
    public void onPressedVolumeDownButton(){vD.onPressed();}

    public void onUpChannelUpButton(){System.out.println(channelUpButton.onUp());}//계속 올리기
    public void onDownChannelDownButton(){channelDownButton.onDown();}//계속 내리기
    public void onUpVolumeUpButton(){System.out.println(vU.onUp());}//계속 올리기
    public void onDownVolumeDownButton(){vD.onDown();}

}

