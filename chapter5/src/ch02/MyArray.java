package ch02;

public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -9999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num) {
        if(count >= ARRAY_SIZE) {
            System.out.println("배열의 남은 공간이 없음");
            return;
        }

        intArr[count++] = num;
    }

    public void insertElement(int position, int num) {

        int i;

        if(position < 0 || position > count) {
            return;
        }
        if(count >= ARRAY_SIZE) {
            return;
        }

        for(i = count - 1; i >= position; i--) {
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position) {

        int removerNum = ERROR_NUM;
        int i;

        if(isEmpty()) {
            System.out.println("배열이 비었다.");
            return removerNum;
        }

        if(position < 0 || position > count - 1) {
            return removerNum;
        }

        removerNum = intArr[position];

        for(i = position; i < count; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;

        return removerNum;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if(count == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public void printAll() {
        if(count == 0) {
            return;
        }

        for(int i = 0; i < count; i++) {
            System.out.println(intArr[i]);
        }
    }

}
