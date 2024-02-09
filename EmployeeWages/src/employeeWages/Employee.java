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
public abstract class Employee {
    private String AdSoyad;//gerekli bilgileri tutacak değişkenlerli oluşturuyoruz
    private String TCKimlikNo;
    
    public Employee(String AdSoyad,String TCKimlikNo){//construactor methodu yazıyoruz.
        this.AdSoyad=AdSoyad;
        this.TCKimlikNo=TCKimlikNo;
    }

    /**
     * @return the AdSoyad
     */
    public String getAdSoyad() {//getter ve setter methodlar
        return AdSoyad;
    }

    /**
     * @param AdSoyad the AdSoyad to set
     */
    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    /**
     * @return the TCKimlikNo
     */
    public String getTCKimlikNo() {
        return TCKimlikNo;
    }

    /**
     * @param TCKimlikNo the TCKimlikNo to set
     */
    public void setTCKimlikNo(String TCKimlikNo) {
        this.TCKimlikNo = TCKimlikNo;
    }
    public abstract double maasAl(); //daha sonra oluşturduğumuz sınıflarda farklı işlevlerde kullanacağımız abstract methodumuz.
    

    
    
}
