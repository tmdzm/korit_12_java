package ch13_abstraction.interfaces;

public class AirConditionerController {
    private PowerButton power;
    private tempDownButton td;
    private tempUpButton tu;
    private ModeChange mc;

    public AirConditionerController(PowerButton power, tempDownButton td, tempUpButton tu, ModeChange mc) {
        this.power = power;
        this.td = td;
        this.tu = tu;
        this.mc = mc;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");
    }

    public void pressPower(){power.onPressed();}
    public void pressDown(){td.onPressed();}
    public void pressUp(){tu.onPressed();}
    public void pressMode(){mc.onPressed();}

    public void pressOnDown(){td.onDown();}
    public void pressOnUp(){tu.onUp();}
}
