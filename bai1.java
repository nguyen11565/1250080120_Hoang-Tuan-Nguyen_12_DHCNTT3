/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan7;
import java.util.Scanner;
 abstract class Hinhhoc {
    public final float PI=3.14f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;
    public Hinhhoc(){
        this.ten="Hinh hoc";
        this.chuvi=0;
        this.dientich=0;
        this.thetich=0;  
    }
    public abstract void nhapten();
    public abstract void inchuvi();
    public abstract void indientich();
    public abstract void inthetich();
}
class hinhtron extends Hinhhoc {
    public float bankinh;
  
   public hinhtron(float bankinh){
       this.bankinh = bankinh;
       this.ten="hinh tron";
       this.chuvi= 2 * PI * bankinh;
        this.dientich =  PI * bankinh * bankinh;
   }
   @Override
   public void nhapten(){
       System.out.println("nhap ten "+ten);
}
   @Override
 public void inchuvi(){
   System.out.println("chu vi "+chuvi);
 }
 
 @Override
 public void indientich(){
   System.out.println("dientich "+dientich);
  }
 }
  class hinhchunhat extends Hinhhoc {
    public float dai;
    public float rong;
    
   public hinhchunhat(){
       this.ten = "hinh chu nhat";
       this.dai=dai;
       this.rong=rong;
       this.chuvi=2*(dai+rong);
       this.dientich = dai*rong;
   }
   @Override
  public void nhapten(){
       System.out.println("nhap ten "+ten);
}
   @Override
 public void inchuvi(){
   System.out.println("chu vi "+chuvi);
 }
 @Override
 public void indientich(){
   System.out.println("dientich "+dientich);
 }

class hinhtru extends hinhtron{
      public float chieucao;
  
   public hinhtru(){
       this.ten = "hinh tru";
       this.chieucao=chieucao;
       this.thetich= dientich * chieucao;
   }
   @Override
   public void nhapten(){
          System.out.println("nhap ten "+ten);
}
   
      @Override
 public void nhapchieucao(){
    System.out.println("chieucao "+chieucao);
 }
      @Override
 public void nhapthetich(){
    System.out.println("thetich "+thetich);
 }
class hinhvuong extends hinhchunhat{
   public hinhvuong(){
       ten = "hinh vuong";
   }
  @Override
 public void nhapten(){
      System.out.println("nhap ten "+ten);
   }
}
public class hinhhoc{
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("nhap hinh tron:");
        System.out.print("bankinh: ");
        float bankinh = scanner.nextFloat();
        hinhtron tron = new hinhtron(bankinh);
        System.out.println("thong tin hinh tron:");
         tron.xuatten();
        tron.inchuvi();
        tron.indientich();
        
        System.out.println("Nhap hcn:");
        System.out.print("Chieu dai: ");
        float dai = scanner.nextFloat();
        System.out.print("chieu rong: ");
        float rong = scanner.nextFloat();
        hinhchunhat hcn = new hinhchunhat(dai,rong);
        System.out.println("thong tin hcn:");
        hcn.nhapten();
        hcn.inchuvi();
        hcn.indientich();

        System.out.println("nhap  hinh vuong:");
        System.out.print("Canh: ");
        float canh = scanner.nextFloat();
        hinhvuong hv = new hinhvuong(canh);
        System.out.println("thong tin hinh vuong:");
         hv.nhapten();
    
        System.out.println("Nhap hinh tru:");
        System.out.print("Chiều cao: ");
        float chieuCao = scanner.nextFloat();
        hinhtru ht = new hinhtru(chieucao);
        System.out.println("thong tin hinh tru:");
        ht.nhapten();
        ht.indientich();
        ht.inthetich();
  }
}
      