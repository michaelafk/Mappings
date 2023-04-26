/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kirky
 * @param <E>
 */
public class UnsortedArraySet<E>{
    private E[] Array;
    private int n;
    
    public UnsortedArraySet(int max){
        n = 0;
        Array = (E[])new Object[max];
    }
    public boolean contains(E elem){
       int i = 0;
       boolean trobat = false;
       while(trobat && i<n){
           trobat = elem.equals(Array[i]);
           i++;
       }
       return trobat;
    }
    public boolean add(E elem){
        if(!contains(elem)){
            Array[n]=elem;
            n++;
            return true;
        }else{
            return false;
        }
    }
    public boolean remove(E elem){
        if(contains(elem)){
            int i = 0;
            while(i<n){
                if(elem.equals(Array[i])){
                    break;
                }else{
                    i++;
                }
            }
            Array[i]=Array[n-1];
            n--;
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        return n == 0;
    }
    
}
