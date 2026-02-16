import java.time.LocalDateTime;
import java.util.*;

// MODEL CLASS
class LogEntry {
    private static int counter = 1;

    private int logId;
    private String accountNumber;
    private String actionType;
    private double amount;
    private String status;
    private LocalDateTime timestamp;

    public LogEntry(String acc, String action, double amt, String status) {
        this.logId = counter++;
        this.accountNumber = acc;
        this.actionType = action;
        this.amount = amt;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getAccountNumber() { return accountNumber; }

    @Override
    public String toString() {
        return "ID=" + logId +
                " | Acc=" + accountNumber +
                " | " + actionType +
                " | Amt=" + amount +
                " | " + status +
                " | " + timestamp;
    }
}

// SERVICE CLASS
class LogManager {

    // MAIN STORAGE
    private ArrayList<LogEntry> allLogs = new ArrayList<>();

    // RECENT LOGS (QUEUE)
    private LinkedList<LogEntry> recentLogs = new LinkedList<>();

    // FEATURE 1: ADD LOG
    public void addLog(String acc, String action, double amt, String status) {
        LogEntry log = new LogEntry(acc, action, amt, status);

        allLogs.add(log);          // store in list
        recentLogs.addLast(log);  // maintain order

        System.out.println("✅ Log Added: " + log);
    }

    // FEATURE 2: GET LOGS BY ACCOUNT (LINEAR SEARCH)
    public List<LogEntry> getLogsByAccount(String acc) {

        List<LogEntry> result = new ArrayList<>();

        for (LogEntry log : allLogs) {
            if (log.getAccountNumber().equals(acc)) {
                result.add(log);
            }
        }

        return result;
    }

    // FEATURE 3: RECENT N LOGS (STACK STYLE)
    public List<LogEntry> getRecentLogs(int n) {

        List<LogEntry> result = new ArrayList<>();

        int size = recentLogs.size();

        for (int i = size - 1; i >= 0 && n > 0; i--, n--) {
            result.add(recentLogs.get(i));
        }

        return result;
    }
}

// DRIVER
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LogManager manager = new LogManager();

        while (true) {

            System.out.println("\n1. Add Log");
            System.out.println("2. Get Logs by Account");
            System.out.println("3. Recent Logs");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Account: ");
                    String acc = sc.next();

                    System.out.print("Action: ");
                    String action = sc.next().toUpperCase();

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    System.out.print("Status: ");
                    String status = sc.next().toUpperCase();

                    manager.addLog(acc, action, amt, status);
                    break;

                case 2:
                    System.out.print("Account: ");
                    acc = sc.next();

                    List<LogEntry> logs = manager.getLogsByAccount(acc);

                    if (logs.isEmpty()) {
                        System.out.println("No logs found");
                    } else {
                        logs.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    List<LogEntry> recent = manager.getRecentLogs(n);

                    if (recent.isEmpty()) {
                        System.out.println("No logs");
                    } else {
                        recent.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}