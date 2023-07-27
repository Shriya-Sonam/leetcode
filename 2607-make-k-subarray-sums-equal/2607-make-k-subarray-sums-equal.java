class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
    int n = arr.length;
    List<Integer>[] v = new ArrayList[n + 1];
    for (int i = 0; i <= n; i++) {
        v[i] = new ArrayList<>();
    }
    k = gcd(n, k);
    for (int i = 0; i < n; i++) {
        v[i % k].add(arr[i]);
    }
    long ans = 0;
    for (int i = 0; i < k; i++) {
        Collections.sort(v[i]);
        int x = v[i].get(v[i].size() / 2);
        for (int j : v[i]) {
            ans += Math.abs(x - j);
        }
    }
    return ans;
}

private static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
        
    }
}