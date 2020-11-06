
package alan_hesaplama;


public class ucgen {
   float  sagkenar,solkenar,taban;
   
  
    public static float ucgencevre(float sagkenar,float solkenar,float taban){
      
      return sagkenar+solkenar+taban;
    
    
    }
   public static float ucgenalan(float taban,float sagkenar,float solkenar,float kenaracısı)
    {
        if (sagkenar==solkenar)
        {
            float kenarlareşit=(solkenar*solkenar)-((taban/2)*(taban/2));
            
            return (float) (( Math.sqrt(kenarlareşit)*taban)/2);
        }
        else{
         return (float) ((solkenar*sagkenar*Math.sin(kenaracısı))/2);
        
        }
         
    }
    
}
----------------------

package alan_hesaplama;




public class cokgen {
  
    
   
   public static float cogenincevresi(float uzunluk,float kenarsayısı)
   {
      
       
       return kenarsayısı*uzunluk;
   }
     
    public static float cokgenalan(float uzunluk_k,float kenarsayısı_n)
    {
       // k, çokgenin bir kenarının uzunluğu ve n çokgenin kenar sayısı olmak üzere;
       // Alan = (1/4)nk2 cos(π/n)
      
      
     return (float) (((1/4)*kenarsayısı_n*Math.pow(uzunluk_k, 2))* Math.cos(60)));
    
    }
}
----------------------------

package alan_hesaplama;

/**
 *
 * @author murat
 */
public class Alan_hesaplama {

   
    public static void main(String[] args) {
       
        // ucgenin alanı ve cevresi
        
      ucgen mur=new ucgen();
     System.out.println(mur.ucgencevre(5,6,7));
      System.out.println(mur.ucgenalan(6, 5, 5, 30));
        // cokgenin alan ve cevresi
        cokgen cokgenler=new cokgen();
         // System.out.println(cokgenler.cokgenalan(12, 10));
    System.out.println(cokgen.cogenincevresi(6, 7));
       
    }

}
-----------------------------------------------------------------------------------------------------------------------------------
package tamsayıların_fonksionları_girmesi;

public class Tamsayıların_fonksionları_girmesi {
  public static void fonksiyon1(int []dizi)
  {
    for (int i=0;i<=2000;i++)
    {
        //3x kare - 2e kare+ kok "e"
        dizi[i]=(int) (3*(i*i)-2*(Math.pow(2, i)+Math.sqrt(i)));
    
    
    }
 
  
  }
  public static void fonksion2(double []dizi2)
  {
      for(int i=-1000;i<=1000;i++)
      {
          //1/1+e kare
          dizi2[i]=1/1+Math.pow(2, i);
      }
      
      
  }
 
    
   
    public static void main(String[] args) {
         /*  fonksion bir     int j;
        for (j=-1000;j<=1000;j++)
        {}
        int dizi[] = new int []{j};
       
        fonksiyon1(dizi);
        for(int i:dizi)
        {
            System.out.println(i);
        }*/
             double j;
        for (j=-1000;j<=1000;j++)
        {}
        double dizi[] = new double []{j};
       
           fonksion2(dizi);
        for(double i:dizi)
        {
            System.out.println(i);
        }
        
     
    }
    
}
----------------------------------------------------------------------------------------------------------------------
