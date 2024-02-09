/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeWages;

/**
 *
 * @author ASUS
 */
public class PieceWorker extends Employee{//employee sınıfından alt sınıflar türetebilmek için extend ediyoruz. 
    private int producedPieces;//gerekli değişkenleri tanımlıyoruz.
    private int moneyPerPiece;
    public PieceWorker(String AdSoyad,String TCKimlikNo,int producedPieces,int moneyPerPiece){//constructor methodunu tanımlıyoruz.
        super(AdSoyad,TCKimlikNo);//super methodu ile ana sınıftaki(employee) parametrelerin değerini atıyoruz.
        this.producedPieces=producedPieces;
        this.moneyPerPiece=moneyPerPiece;
        
    }

    @Override
    public double maasAl() {//alınacak maaş hesaplanıyor.
        double maas=getMoneyPerPiece()*getProducedPieces();
        return maas ;
        
    }
    public String toString(){//bilgileri ekrana yazdıracak method.
        return super.getAdSoyad()+" "+super.getTCKimlikNo()+" "+getProducedPieces()+" "+getMoneyPerPiece()+" "+maasAl();
    }

    /**
     * @return the producedPieces
     */
    public int getProducedPieces() {//getter ve setter methodları
        return producedPieces;
    }

    /**
     * @param producedPieces the producedPieces to set
     */
    public void setProducedPieces(int producedPieces) {
        this.producedPieces = producedPieces;
    }

    /**
     * @return the moneyPerPiece
     */
    public int getMoneyPerPiece() {
        return moneyPerPiece;
    }

    /**
     * @param moneyPerPiece the moneyPerPiece to set
     */
    public void setMoneyPerPiece(int moneyPerPiece) {
        this.moneyPerPiece = moneyPerPiece;
    }
    
    
}
