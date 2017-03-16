int shapeArea(int n) {
    if (n == 1) {
        return 1;
    }
    int k = n-1; //k is just n-1
    return (n * n) + (k * k); //n^2 + k^2 = area
}
