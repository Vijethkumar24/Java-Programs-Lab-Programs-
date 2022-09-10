

class Stack {
    private int top;
    private int item[];

    Stack(int size) {
        top = -1;
        item = new int[size];
    }

    void PushItem(int data) {
        if (top == item.length - 1) {
            System.out.println("stack is full");
        } else {
            item[++top] = data;
            System.out.println("pushed item" + item[top]);
        }
    }

    int PopItem() {
        if (top < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            System.out.println("poped item is" + item[top]);
            return item[top--];
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.println("stack element are");
            for (int i = 0; i <= top; i++) {
                System.out.println(item[i]);
            }
        } else {
            System.out.println("stack is empty");
        }

    }
}


