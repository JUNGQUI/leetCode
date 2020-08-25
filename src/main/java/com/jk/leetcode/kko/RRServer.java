package com.jk.leetcode.kko;

import java.util.*;

public class RRServer {
    public static List<Integer> solution(int k, List<Integer> arrival, List<Integer> load) {
        // Write your code here
        Map<Integer, Integer> request = new HashMap<>();
        Map<Integer, Integer> servers = new HashMap<>();
        Map<Integer, Integer> serversLoad = new HashMap<>();
        int maximumArrival = 0, maximumWork = 0;
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < arrival.size(); i++) {
            maximumArrival = maximumArrival < arrival.get(i) ? arrival.get(i) : maximumArrival;
            request.put(arrival.get(i), load.get(i));
        }

        for (int i = 0; i < k; i++) {
            servers.put(i+1, 0);
            serversLoad.put(i+1, 0);
        }

        Object[] times = request.keySet().toArray();
        Arrays.sort(times);

        int serverIDX = 1;

        for (Object oTime : times) {
            int time = (int) oTime;
            int cycle = 0, originalIDX = serverIDX;
            while(cycle < k) {
                if (servers.get(serverIDX) <= time) {
                    int localWork = serversLoad.get(serverIDX) + request.get(time);

                    servers.put(serverIDX, time + request.get(time) - 1);
                    serversLoad.put(serverIDX, localWork);
                    maximumWork = Math.max(localWork, maximumWork);
                    cycle = k;
                }

                if (cycle == k-1) {
                    serverIDX = originalIDX + 1;
                } else {
                    serverIDX = serverIDX == k ? 1 : serverIDX+1;
                }

                cycle++;
            }
        }

        for (int serversID = 1; serversID <= k; serversID++) {
            if (serversLoad.get(serversID) == maximumWork) {
                results.add(serversID);
            }
        }

        return results;
    }
}
