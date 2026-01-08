package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        powerButton.onPressed();
        //powerButton,channelUpButton,channelDownButton, 밑에 new 필요없이 이거 넣어도 되긴 한다.
        /*
            버튼들을 만들어서 main에서 객체생성을 한 후에
            메서드를 호출하는 것은 가능
            그런데 Main에서 매번 객체를 생성해줘야 한다는 문제점이 있다.
         */
        TvRemoteController remocon = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );//여기서 생성, 즉 객체가 인자로 들어갔다.
        /*
            리모컨 객체의 인자로 생성자를 집어넣었다.
            생성자의 정의는 : 객체를 생성할 때 호출되는 메서드
            하지만 객체명이 없는 상태

            객체명은 저어기 TvRemoteController내에 있긴한데, 다른 곳도 되는가?
            this.powerButton = powerButton이라고 되어있는데
            this.powerButton = new PowerButton();이고
            PowerButton powerButton = new PowerButton();이 된다.
         */

        //remocon.powerButton.onPressed();
        remocon.onPressedPowerButton();
        remocon.onPressedChannelUpButton();
        remocon.onUpChannelUpButton();
        remocon.onPressedChannelDownButton();
        remocon.onDownChannelDownButton();
        remocon.onPressedVolumeDownButton();
        remocon.onDownVolumeDownButton();
        remocon.onPressedVolumeUpButton();
        remocon.onUpVolumeUpButton();

        remocon.onPressedPowerButton();

        //

        AirConditionerController acon = new AirConditionerController(
                new PowerButton(),
                new tempDownButton(),
                new tempUpButton(),
                new ModeChange()
        );

        acon.pressPower();
        acon.pressDown();
        acon.pressOnDown();
        acon.pressUp();
        acon.pressOnUp();
        acon.pressMode();
        acon.pressMode();
        acon.pressMode();

        acon.pressPower();


    }
}
