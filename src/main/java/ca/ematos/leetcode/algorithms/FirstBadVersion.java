package ca.ematos.leetcode.algorithms;

public class FirstBadVersion extends VersionControl {

    public static void main(String[] args){
        FirstBadVersion _class = new FirstBadVersion();
        _class.firstBadVersion(5);
    }

    public int firstBadVersion(int n) {
        int result = search(1, n);
        System.out.println(String.format("First Bad Version [%s]", result));
        return result;
    }

    public int search(int begin, int end){

        if (isBadVersion(begin) || begin == end)
            return begin;

        int mid = begin + ((end - begin) / 2);

        if ( isBadVersion(mid) ){
            return search(begin, mid);
        }

        return search(mid+1, end);
    }

}

class VersionControl {
    boolean isBadVersion(int version){
        if (version == 4 || version == 5){
            return true;
        }

        return false;
    }
}