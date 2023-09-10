public class circularTour {
    static int tour(int petrol[], int distance[]) {
        int s = 0;
        int i = 0;
        int fuel = 0;
        while (true) {
            fuel += petrol[i];
            if (fuel > distance[i]) {
                fuel = fuel - distance[i];
                i++;
                if (i == s) {
                    break;
                }
                if (i == petrol.length) {
                    i = 0;
                }
            } else {
                if (petrol[s] - distance[s] > 0) {
                    fuel -= (petrol[s] - distance[s]);
                } else {
                    fuel -= petrol[s];
                }
                if (i == s) {
                    i++;
                }
                s++;
                if (s == petrol.length) {
                    return -1;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int petrol[] = { 43, 22, 29, 69, 73, 90, 59, 9, 37, 99, 54, 9, 4, 49, 34, 34, 91, 49, 68, 55, 69, 47, 1, 30, 89,
                47, 50, 98, 4, 91, 64, 34, 54, 98, 87 };
        int distance[] = { 93, 53, 26, 76, 97, 58, 89, 37, 30, 15, 61, 61, 22, 29, 5, 51, 28, 57, 49, 95, 3, 100, 98,
                40, 44, 29, 3, 1, 4, 48, 82, 60, 39, 36, 52 };
        System.out.println(tour(petrol, distance));
    }
}
