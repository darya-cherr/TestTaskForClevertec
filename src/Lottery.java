import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lottery {

    public static final int MIN_NUMBER = 2;
    public static final int MAX_NUMBER = 8;

    public static boolean checkLotteryTicket(int lotteryTicket){

        String ticket = String.valueOf(lotteryTicket);
        String leftTicketPart = ticket.substring(0, ticket.length() / 2);
        String secondTicketPart = ticket.substring(ticket.length() / 2);

        return Arrays.stream(leftTicketPart.split("")).mapToInt(Integer::valueOf).sum() ==
                Arrays.stream(secondTicketPart.split("")).mapToInt(Integer::valueOf).sum();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lotteryTicket, size;

        while (true) {
            lotteryTicket = scan.nextInt();
            size = String.valueOf(lotteryTicket).length();

            if ((size >= MIN_NUMBER && size <= MAX_NUMBER) && (size % 2 == 0))
                break;
            else
                System.out.println("The number of digits in the ticket must be even and range from 2 to 8");
        }

        String result = checkLotteryTicket(lotteryTicket) ? "Win" : "Lose";
        System.out.println(result);
    }
}