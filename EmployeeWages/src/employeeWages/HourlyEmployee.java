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
public class HourlyEmployee extends Employee{//employee sınıfından alt sınıflar türetebilmek için extend ediyoruz.
    private int workHours;//gerekli değişkenleri tanımlıyoruz.
    private int wage;
    public HourlyEmployee(String AdSoyad,String TCKimlikNo,int workHours,int wage){
        super(AdSoyad, TCKimlikNo);
        this.workHours=workHours;
        this.wage=wage;
        }

    @Override
    public double maasAl() {//alınacak maaş hesaplanıyor.
        double maas=getWage()*getWorkHours();
        return maas;
    }
    public String toString(){//bilgileri ekrana yazdıracak method.
        return super.getAdSoyad()+" "+super.getTCKimlikNo()+" "+getWorkHours()+" "+getWage()+" "+maasAl();
    }

    /**
     * @return the workHours
     */
    public int getWorkHours() {//getter ve setter methodlar
        return workHours;
    }

    /**
     * @param workHours the workHours to set
     */
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    /**
     * @return the wage
     */
    public int getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(int wage) {
        this.wage = wage;
    }
    
    
    
}
