import java.util.TreeMap;

public class JobScheduling {
    class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, new Comparator<Job>() {
            public int compare(Job o1, Job o2) {
                return Integer.compare(o1.deadline, o2.deadline);
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].id + " " + arr[i].profit + " " + arr[i].deadline);
        }
        TreeMap<Integer, Integer> t = new TreeMap<>();
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            if (time < arr[i].deadline) {
                if (t.containsKey(arr[i].profit)) {
                    t.put(arr[i].profit, t.get(arr[i].profit) + 1);
                } else {
                    t.put(arr[i].profit, 1);
                }
                time++;
            } else {
                if (arr[i].profit > t.firstKey()) {
                    if(t.get(t.firstKey())==1){
                        t.remove(t.firstKey());
                    }else{
                        t.put(t.firstKey(), t.get(t.firstKey()) - 1);
                    }
                    // t.remove(t.firstKey());
                    if (t.containsKey(arr[i].profit)) {
                        t.put(arr[i].profit, t.get(arr[i].profit) + 1);
                    } else {
                        t.put(arr[i].profit, 1);
                    }
                }
            }

        }
        for (int i : t.keySet()) {
            System.out.println(i);
        }
        int ans = 0;
        int cnt=0;
        for (int i : t.keySet()) {
            ans += i*t.get(i);
            cnt+=t.get(i);
        }
        int a[] = { cnt, ans };
        return a;
    }
}
