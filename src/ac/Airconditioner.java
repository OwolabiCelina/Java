package ac;

public class Airconditioner {

    public String isOn(String on) throws Exception {
        if ( on == "on") {
            System.out.println("AC is On");
        }
        else {
            throw new Exception("Please on ac properly");
        }
        return on;
    }

    public String isOff(String off) {
        if (off == "off");
        return off;
    }

}


