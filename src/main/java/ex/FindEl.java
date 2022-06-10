package ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if(value[i].equals(key)) {
                rsl = i;
                break;
            }
        } if (rsl == -1) {
            throw new ElementNotFoundException("Element is not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        boolean rsl = true;
        for (int i = 0; i < abuses.length; i++) {
            if (abuses[i].equals(value)) {
                rsl = false;
                break;
            }
        } if (!rsl) {
            throw new ElementAbuseException("Element is found");
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] colours = { "Red", "Orange", "Yellow", "Green" };
        try {
            indexOf(colours , "b");
            sent("Orange" , colours);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
