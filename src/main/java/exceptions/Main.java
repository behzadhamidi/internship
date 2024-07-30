package exceptions;

import java.io.IOException;

import static exceptions.ExceptionHandlingExample.readFile;

class Main {
    public static void main(String[] args) {
        try {

            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("خطا در هنگام خواندن فایل: " + e.getMessage());
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("خطا در هنگام محاسبه: " + e.getMessage());
        } /* finally {
            System.out.println("این بلوک همیشه اجرا می‌شود.");
        } */
    }
}
