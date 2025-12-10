/*
 * Complete the 'processLogs' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY logs
 *  2. INTEGER maxSpan
 */

import java.util.*;

public class SignInSignOutLogs {

    public static List<String> processLogs(List<String> logs, int maxSpan) {
        // Write your code here
        Map<String, Integer> signInTimes = new HashMap<>();
        Map<String, Integer> signOutTimes = new HashMap<>();

        // Step 1: Process each log line
        for (String log : logs) {
            if (log == null || log.isEmpty()) continue;

            String[] parts = log.trim().split("\\s+");
            if (parts.length < 3) continue; // skip malformed logs

            String userId = parts[0];
            int timeStamp;

            try {
                timeStamp = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                continue; // skip invalid timestamp
            }

            String action = parts[2];

            if ("sign-in".equals(action)) {
                // keep the earliest sign-in time for each user
                signInTimes.put(userId,
                        Math.min(signInTimes.getOrDefault(userId, timeStamp), timeStamp));
            } else if ("sign-out".equals(action)) {
                // keep the latest sign-out time for each user
                signOutTimes.put(userId,
                        Math.max(signOutTimes.getOrDefault(userId, timeStamp), timeStamp));
            }
        }

        // Step 2: Validate durations
        List<String> validIds = new ArrayList<>();
        for (String user : signOutTimes.keySet()) {
            if (signInTimes.containsKey(user)) {
                int duration = signOutTimes.get(user) - signInTimes.get(user);

                // include users with duration between 0 and maxSpan
                if (duration >= 0 && duration <= maxSpan) {
                    validIds.add(user);
                }
            }
        }

        // Step 3: Sort and return final list
        Collections.sort(validIds);
        return validIds;
    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "user1 20 sign-in",
                "user2 30 sign-in",
                "user1 50 sign-out",
                "user2 100 sign-out",
                "user3 150 sign-out"
        );

        int maxSpan = 80;
        List<String> result = processLogs(logs, maxSpan);

        System.out.println("Valid users: " + result);
    }
}
