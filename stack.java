import java.util.Stack;

class Main {
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(10);
    st.push(5);
    st.push(15);
    st.push(20);
    st.push(45);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    System.out.println(st.peek());
    if (st.empty()) {
      System.out.println("is emty");

    } else {
      System.out.println("isn't emty");

    }

  }
}
