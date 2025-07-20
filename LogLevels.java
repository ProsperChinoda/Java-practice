public class LogLevels {
        public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        return logLine.split("]: ")[1].trim();
    
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        int startIndex = logLine.indexOf("[") + 1;
        int endIndex = logLine.indexOf("]");
        return logLine.substring(startIndex, endIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        String first = LogLevels.message(logLine);
        String last = LogLevels.logLevel(logLine);
        String result = first + " (" + last + ")";
        return result;

    }
    public static void main(String[] args) {
        System.out.println(reformat("[INFO]: Operation completed"));

    }

}
