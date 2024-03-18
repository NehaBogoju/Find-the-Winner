import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " is an invalid input");
            return;
        }
        System.out.println("Enter the details");
        String winnerTeam = "";
        float shortestTime = Float.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            String[] details = input.split(":");
            float totalTeamTime = Float.parseFloat(details[1])
                    + Float.parseFloat(details[2])
                    + Float.parseFloat(details[3])
                    + Float.parseFloat(details[4]);
            if (Float.parseFloat(details[1]) < 1 || Float.parseFloat(details[2]) < 1
                    || Float.parseFloat(details[3]) < 1 || Float.parseFloat(details[4]) < 1) {
                System.out.println("Invalid number");
                return;
            }
            if (totalTeamTime < shortestTime) {
                shortestTime = totalTeamTime;
                winnerTeam = details[0];
            }
        }
        System.out.printf("%s team wins the race in %.2f minutes", winnerTeam, shortestTime);
    }
}
