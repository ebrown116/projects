
public class SerialNumberTester {
    public static void main(String[] args) {
        String serialNum1 = "GHTRJ-7786-AQWR";
        String serialNum2 = "GHT7J-0A0A-AQWR";
        String serialNum3 = "GHTRJ-8J75-AQWR";
        String serialNum4 = "GHTRJ-8975-AQ2R";

        testIt(new SerialNumber(serialNum1));
        testIt(new SerialNumber(serialNum2));
        testIt(new SerialNumber(serialNum3));
        testIt(new SerialNumber(serialNum4));
    }

    private static void testIt(SerialNumber sn) {
        if(sn.isaGo()) {
            System.out.print(sn + " is ");
            if(sn.isValid()) {
                System.out.println("valid.");
            } else {
                System.out.println("invalid.");
            }
        }
    }
}
