package tasks;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Stream.of;

public class Seventeen {
        public static String nbaCup(String resultSheet, String toFind) {
            if (toFind.isEmpty()) {
                return "";
            }

            var stat = new int[5];
            for (var match : of(resultSheet.split(",")).filter(s -> s.contains(toFind)).toArray(String[]::new)) {
                if (match.contains(".")) {
                    return "Error(float number):" + match;
                }
                var teams = match.substring(0, match.lastIndexOf(' ')).replaceAll(" \\d+ ", "@").split("@");
                if (teams[0].equals(toFind) || teams[1].equals(toFind)) {
                    var pointsA = Integer.parseInt(match.substring(match.lastIndexOf(' ') + 1));
                    var pointsB = Integer.parseInt(match.substring(teams[0].length() + 1, match.indexOf(teams[1]) - 1));
                    MatchStatistics(pointsA, pointsB, match.startsWith(toFind), stat);
                }
            }
            return toFind + (stat[3] + stat[4] > 0 ? ":W=" + stat[0] + ";D=" + stat[2] + ";L=" + stat[1] + ";Scored=" + stat[3] + ";Conceded=" + stat[4] + ";Points=" + (3 * stat[0] + stat[2]) : ":This team didn't play!");
        }

        private static void MatchStatistics(int pointsA, int pointsB, boolean home, int[] stats) {
            if (home) {
                var temp = pointsA;
                pointsA = pointsB;
                pointsB = temp;
            }

            stats[3] += pointsA;
            stats[4] += pointsB;

            if (pointsA > pointsB) {
                stats[0]++;
            } else if (pointsA < pointsB) {
                stats[1]++;
            } else {
                stats[2]++;
            }
        }
        }

