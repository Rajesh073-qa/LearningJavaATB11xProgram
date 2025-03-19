package ex10_forLoop;

    public class Lab102_For_No_Condition {
        public static void main(String[] args) {
            for (int i = 0; ; i++) {
                System.out.println(i);
            }
            //infinite loop
            //To stop execution forcefully
            // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
            // exit code 0 - Successful
        }
    }

