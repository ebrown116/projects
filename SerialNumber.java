public class SerialNumber {
    //Private member variable
    private String first;
    private String second;
    private String third;
    private boolean valid;
    private String code;
    private boolean go;

    //No-argument constructor
    public SerialNumber() {
        this("");
    }

    //Argument-based constructor
    public SerialNumber(String sn) {
        code = sn;
        go = true;
        if (sn.length() < 15) {
            System.out.println(code + " does not have enough characters.");
            go= false;
        } else if (sn.length() > 15) {
            System.out.println(code + " has too many characters.");
            go= false;
        } else if (sn.charAt(5) !='-') {
            System.out.println(code + " is missing a hyphen.");
            go= false;
        } else if (sn.charAt(10) != '-') {
            System.out.println(code + " is missing a hyphen.");
            go= false;
        } else {
            first = sn.substring(0, 5);
            second = sn.substring(6, 10);
            third = sn.substring(11);

            validate();
        }
    }

    public boolean isaGo() {
        return go;
    }

    public boolean isValid() {
        return valid;
    }

    private void validate() {
        valid = (isFirstGroupValid() && isSecondGroupValid() && isThirdGroupValid());
    }

    private boolean test(int num) {
        boolean isValid = true;
        char c;
        if(num==1) {
            for (int i = 0; i < first.length(); i++) {
                c = first.charAt(i);
                if (!Character.isLetter(c)) {
                    isValid = false;
                }
            }
        } else if(num==2) {
            for (int i = 0; i < second.length(); i++) {
                c = second.charAt(i);
                if (!Character.isDigit(c)) {
                    isValid = false;
                }
            }
        } else if(num==3) {
            for (int i = 0; i < third.length(); i++) {
                c = third.charAt(i);
                if (!Character.isLetter(c)) {
                    isValid = false;
                }
            }
        }
        return isValid;
    }

    private boolean isFirstGroupValid() {
        return test(1);
    }

    private boolean isSecondGroupValid() {
        return test(2);
    }

    private boolean isThirdGroupValid() {
        return test(3);
    }

    public String toString() {
        return first + "-" + second + "-" + third;
    }
}
