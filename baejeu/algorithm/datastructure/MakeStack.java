package baejeu.algorithm.datastructure;

// 배열을 이용해서 스택 구현해보기
public class MakeStack {
     int[] arr = new int[10000];
     int pointer = 0;

    public void push(int value){
        this.arr[pointer++] = value;
    }
    public int pop(){
        if(isEmpty())throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
    }
    public int peek() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer-1];
    }
    public boolean isEmpty() {
        if (this.pointer == 0) {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        MakeStack st = new MakeStack();
        System.out.println(st.peek());
    }
}

