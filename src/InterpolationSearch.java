public class InterpolationSearch {

    public static void main(String[] args) {
        int [] arr = {12,23,43,56,78,1000};
        System.out.println(interpolationSearch(43,arr));

    }


    public static int interpolationSearch (int key, int[] arr) {
        int l = 0;
        int r = arr.length-1 ;
        if (arr.length == 0) return -1;
        int pos;

        while (arr[l] < key && key < arr[r]) {
            if (arr[l] == arr[r]) break;
            pos = l + (key - arr[l])*(l-r)/(arr[l]-arr[r]);
            if (key > arr[pos]) l = pos +1 ;
            else  if (key < arr[pos]) r = pos - 1;
            else return pos;
        }

        if (arr[l] == key) return l;
        else if (arr[r] == key) return r;
        return -1;

    }
}