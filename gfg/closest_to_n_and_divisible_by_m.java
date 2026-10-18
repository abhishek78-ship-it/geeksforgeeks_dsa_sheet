// class Solution {
//     public int closestNumber(int n, int m) {
//         int q = n / m;

//         int a = q * m;
//         int b = (q + 1) * m;

//         int diff1 = Math.abs(n - a);
//         int diff2 = Math.abs(n - b);

//         if (diff1 < diff2) {
//             return a;
//         } 
//         else if (diff2 < diff1) {
//             return b;
//         } 
//         else {
//             if (Math.abs(a) > Math.abs(b)) {
//                 return a;
//             } 
//             else {
//                 return b;
//             }
//         }
//     }
// }
class Solution {
    public int closestNumber(int n, int m) {

        m = Math.abs(m);

        int x = Math.floorDiv(n, m);  // it uses floor division to get  accurate answers for the negative numbers

        int num1 = x * m;
        int num2 = (x + 1) * m;

        int diff1 = Math.abs(n - num1);
        int diff2 = Math.abs(n - num2);

        if (diff1 < diff2) {
            return num1;
        }

        if (diff2 < diff1) {
            return num2;
        }

        if (Math.abs(num1) > Math.abs(num2)) {
            return num1;
        }

        return num2;
    }
}