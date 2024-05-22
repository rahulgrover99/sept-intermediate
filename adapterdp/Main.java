package adapterdp;

import adapterdp.thirdpartapi.ICICIBankAPI;

public class Main {

    public static void main(String[] args) {

        PhonePe phonePe = new PhonePe(new ICICIBankAdapter());


        phonePe.onHistoryClick();

        phonePe.onPayClick("naman@okicici", 100);

    }


}
