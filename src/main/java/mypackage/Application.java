package mypackage;

import java.util.Scanner;

import static mypackage.MagicMachine.magicMachineSolution;

public class Application {
    public static void main(String[] args) {
        System.out.println(magicMachineSolution(18, 18));
    }

    public static class List<T> {
        private Node<T> head;

        public List() {
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<T> currentEl = this.head;


            while (currentEl != null) {
                sb.append(currentEl.value).append(" ");
                currentEl = currentEl.next;
            }
            if(sb.length() == 0) return "";
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }

        public void insertAt(T el, int pos) {
            Node<T> head = this.head;
            Node<T> temp = head;
            Node<T> basic = new Node<>(el);

            if(pos == 0) {
                this.head = new Node<>(el);
                this.head.next = temp;
                return;
            }

            for(int i = 0; i != pos-1; i++){
                head = head.next;
            }

            Node<T> elem = head.next;
            head.next = basic;
            basic.next = elem;

        }
    }

    public static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }



}

