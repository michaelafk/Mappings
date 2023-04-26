/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kirky
 */
public class UnsortedLinkedListMapping<K, V> {

    private class Node {

        private K key;
        private V value;
        private Node next;

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    private Node first;

    public UnsortedLinkedListMapping() {
        first = null;
    }

    public V get(K key) {
        Node p = first;
        boolean trobat = false;
        while (p != null && !trobat) {
            trobat = p.key.equals(key);
            if (!trobat) {
                p = p.next;
            }
        }
        return p.value;
    }

    public V put(K key, V value) {
        Node p = first;
        boolean trobat = false;
        while (p != null && !trobat) {
            trobat = p.key.equals(key);
            if (!trobat) {
                p = p.next;
            }
        }
        if (trobat) {
            p.value = value;
            return value;
        } else {
            Node aux = first;
            Node node = new Node();
            node.key = key;
            node.value = value;
            first = node;
            node.setNext(aux);
            return value;
        }
    }

    public V remove(K key) {
        Node p = first;
        Node pp = null;
        boolean trobat = false;
        while (p != null && !trobat) {
            trobat = p.key.equals(key);
            if (!trobat) {
                pp = p;
                p = p.next;
            }
        }
        if(trobat){
            if(pp == null){
                first = p.next;
            }else{
                pp.next = p.next;
            }
            return p.value;
        }
        return null;
    }

    public boolean isEmpty() {
        if(first == null){
            return true;
        }else{
            return false;
        }
    }
}
