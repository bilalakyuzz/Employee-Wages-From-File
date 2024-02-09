/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeWages;

import static java.lang.System.exit;

/**
 *
 * @author ASUS
 */
public class Stack {
 
    //node sınıfını yalnız burada kullanacağımız için private oluşturuyoruz.
    private class Node {
 
        Employee data; //node sınıfı için bilgiyi tutacak data ve düğümleri bağlayacak link değişkenleri.
        Node link; 
    }
    
    Node top;//genel  node tipinde bir değişken tanımlıyoruz
    
    public Stack()
    {
        this.top = null;
    }
 
    //stack sınıfının boş olup olmadığını kontrol eden fonksiyon
    public boolean isEmpty()
    {
        return top == null;
    }
    public void push(Employee x) // push ile ekleme yapıyoruz.
    {
        //geçici bir node oluşturuyoruz.
        Node temp = new Node();
 
       
        if (temp == null) {
            System.out.print("\nAşırı yüklenme daha fazla eleman eklenemiyor.");
            return;
        }
 
        // geçici node da bilgieri tutuyoruz.
        temp.data = x;
 
        // top ve temp node larını birbirine bağlıyoruz bunun sayesinde top node undaki bilgiyi kaybetmiyoruz.
        temp.link = top;
 
        // genel node u güncelliyoruz.
        top = temp;
    }
//eleman silen fonksiyon
    public void pop() //başlangiçtan eleman kaldıran method
    {
        //listenin doluluğunu kontrol ediyoruz.
        if (top == null) {
            System.out.print("\nListe boş");
            return;
        }
 
        // elemanı listeden koparıyoruz.
        top = (top).link;
    }
    public void display()// bütün listeyi yazdıran method.
    {
        
        if (top == null) {//doluluğu kontrol ediliyor.
            System.out.printf("\nGörüntülenecek eleman yok");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {//son elemanakadar yazmasını sağlıyoruz.
 
                // print node data
                System.out.println( temp.data);
 
                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
 

}
