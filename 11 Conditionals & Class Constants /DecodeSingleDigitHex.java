package conditionalsAndClassConstants;

public class DecodeSingleDigitHex {
    public static void main(String[] args) {
        System.out.println("A: " + decodeHexSwitch('A'));
        System.out.println("3: " + decodeHexSwitch('3'));
        System.out.println("Z: " + decodeHexSwitch('Z'));

        System.out.println("A: " + decodeHex('A'));
        System.out.println("3: " + decodeHex('3'));
        System.out.println("Z: " + decodeHex('Z'));
    }

    public static int decodeHex(char digit) {
        if (digit >= 'A' && digit <= 'F') {
            return digit - 'A' + 10;
        } else if (digit >= '1' && digit <= '9') {
            return digit - '1' + 1;
        } else {
            return -1;
        }
    }

    public static int decodeHexSwitch(char digit) {
        int answer = -1;

        switch (digit) {
            case 'A':
                answer = 10;
                break;
            case 'B':
                answer = 11;
                break;
            case 'C':
                answer = 12;
                break;
            case 'D':
                answer = 13;
                break;
            case 'E':
                answer = 14;
                break;
            case 'F':
                answer = 15;
                break;
            case '1':
                answer = 1;
                break;
            case '2':
                answer = 2;
                break;
            case '3':
                answer = 3;
                break;
            case '4':
                answer = 4;
                break;
            case '5':
                answer = 5;
                break;
            case '6':
                answer = 6;
                break;
            case '7':
                answer = 7;
                break;
            case '8':
                answer = 8;
                break;
            case '9':
                answer = 9;
                break;
        }

        return answer;
    }
}
