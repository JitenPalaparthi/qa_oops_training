package seasons;

public class Season {

    // pring (March, April, May), summer (June, July, August), autumn (September,
    // October, November) and winter (December, January, February)

    public String getSeason(byte month) {
        if (month >= 3 && month <= 5) {
            return "spring";
        } else if (month >= 6 && month <= 8) {
            return "summer";
        } else if (month >= 9 && month <= 11) {
            return "autumn";
        } else if (month == 12 || month >= 1 && month <= 2) {
            return "winter";
        } else {
            return "wrong input";
        }
    }

}
