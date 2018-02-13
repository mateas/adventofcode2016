package se.sjolinder.advent01;

public class BlockCounter {

    public static void main(String[] args) {
        String route = "R1, R1, R3, R1, R1, L2, R5, L2, R5, R1, R4, L2, R3, L3, R4, L5, R4, R4, R1, L5, L4, R5, R3, L1, R4, R3, L2, L1, R3, L4, R3, L2, R5, R190, R3, R5, L5, L1, R54, L3, L4, L1, R4, R1, R3, L1, L1, R2, L2, R2, R5, L3, R4, R76, L3, R4, R191, R5, R5, L5, L4, L5, L3, R1, R3, R2, L2, L2, L4, L5, L4, R5, R4, R4, R2, R3, R4, L3, L2, R5, R3, L2, L1, R2, L3, R2, L1, L1, R1, L3, R5, L5, L1, L2, R5, R3, L3, R3, R5, R2, R5, R5, L5, L5, R2, L3, L5, L2, L1, R2, R2, L2, R2, L3, L2, R3, L5, R4, L4, L5, R3, L4, R1, R3, R2, R4, L2, L3, R2, L5, R5, R4, L2, R4, L1, L3, L1, L3, R1, R2, R1, L5, R5, R3, L3, L3, L2, R4, R2, L5, L1, L1, L5, L4, L1, L1, R1";
        System.out.println("Advent01: " + part1(route));
    }

    public static int part1(String route) {

        int[] xFactor = {0, 1, 0, -1};
        int[] yFactor = {1, 0, -1, 0};
        int compas = 0;

        String[] turns = route.split(",\\s");
        int[] xSampler = new int[turns.length + 1];
        int[] ySampler = new int[turns.length + 1];
        xSampler[0] = 0;
        ySampler[0] = 0;
        int result = 0;
        for (int i = 0; i < turns.length; i++) {
            char direction = turns[i].charAt(0);
            int blocks = Integer.parseInt(turns[i].substring(1));
            compas = direction == 'R' ? compas + 1 : compas - 1;
            xSampler[i + 1] = xSampler[i] + xFactor[compas % 4] * blocks;
            ySampler[i + 1] = ySampler[i] + yFactor[compas % 4] * blocks;
        }
        result = Math.abs(xSampler[xSampler.length - 1]) + Math.abs(ySampler[ySampler.length - 1]);

        return result;
    }

    public static int part2(String route) {
        int[] xFactor = {0, 1, 0, -1};
        int[] yFactor = {1, 0, -1, 0};
        int compas = 0;

        String[] turns = route.split(",\\s");
        int[] xSampler = new int[turns.length + 1];
        int[] ySampler = new int[turns.length + 1];
        xSampler[0] = 0;
        ySampler[0] = 0;
        int result = 0;
        for (int i = 0; i < turns.length; i++) {
            char direction = turns[i].charAt(0);
            int blocks = Integer.parseInt(turns[i].substring(1));
            compas = direction == 'R' ? compas + 1 : compas - 1;
            for (int j = 0; j < blocks; j++) {

            }
            xSampler[i + 1] = xSampler[i] + xFactor[compas % 4] * blocks;
            ySampler[i + 1] = ySampler[i] + yFactor[compas % 4] * blocks;
            for (int j = 0; j <= i; j++) {
                if (xSampler[j] == xSampler[i + 1] && ySampler[j] == ySampler[i + 1]) {
                    result = Math.abs(xSampler[i + 1]) + Math.abs(ySampler[i + 1]);
                    break;
                }
            }
        }
//        result = Math.abs(xSampler[xSampler.length - 1]) + Math.abs(ySampler[ySampler.length - 1]);

        return result;
    }
}
