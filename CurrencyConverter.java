import java.util.Scanner;
public class CurrencyConverter{
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String data[]={"RUB","AFN","EUR","ALL","BDT","INR","USD","BRL","EGP","AED","AMD","ANG",
			"AOA","ARS","AUD","AWG","AZN","BAM","BBD","BGN","BHD","BIF","BMD","BND","BOB","BSD","BTN",
			"BWP","BYR","BZD","CAD","CDF","CHF","CLP","CNY","COP","CRC","CUP","CVE","CZK","DJF","DKK",
			"DOP","DZD","ERN","ETB","FJD","FKP","GBP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD",
			"HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP","IQD","IRR","ISK","JEP","JMD","JOD","JPY",
			"KES","KGS","KHR","KID","KMF","KPW","KRW","KWD","KYD","KZT","LAK","LBP","LKR","LRD","LSL",
			"LYD","MAD","MDL","MGA","MKD","MMK","MNT","MOP","MRO","MUR","MVR","MWK","MXN","MYR","MZN",
			"NAD","NGN","NIO","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR",
			"RON","RSD","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLL","SOS","SRD","SSP","STD",
			"SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","UYU",
			"UZS","VEF","VND","VUV","WST","XAF","XCD","XOF","XPF","YER","ZAR","ZMW","ZWL"};
            double value[]={61.00,89.00,0.93 ,112.04,91.76,77.78,1,4.80,18.66,3.67,444.13,1.18,427.87,
			121.06,1.39,1.80,1.70,1.83,2.03,1.83,0.38,2030,1,1.38,6.87,1,77.75,11.92,3.38,2.02,1.26,2005,
			0.98,830,6.69,3830.8,682.1,24,103.88,23.17,178.02,6.98,55.15,146.09,15,51.66,2.17,0.79,0.8,
			2.94,0.79,7.92,0.79,54.1,8825,7.72,209.21,7.85,24.57,7.06,111.58,371.43,14587.4,3.36,0.79,
			1460.5,42300,129.22,0.79,153.68,0.71,134.16,117.1,79.51,4061,1.39,461.85,900.01,1261.54,0.31,
			0.83,436.31,14405,1518,359.99,152,15.41,4.77,9.88,19.04,3995,5750,1851.45,3130.85,8.08,36.51,
			44,15.44,1014.5,19.64,4.39,63.83,15.41,415.13,35.81,9.56,124.39,1.56,0.39,1,3.75,3.52,52.98,
			202.1,4.33,6822.67,3.64,4.65,110.42,1030,3.75,8.12,13.49,456.5,9.9,1.38,0.79,13150,583.5,21.82,
			130.26,22994,2512.53,15.41,36.56,11.02,3.51,3.04,2.31,16.92,6.79,1.39,29.59,2331,29.54,3725.44,
			39.66,11045,515345,23160,114.51,2.64,612.16,2.7,611.5,112.45,250.3,15.46,16.95,322.35};
    while(true){
             String choice1,choice2;
             Double input;
			System.out.println("Enter Your Choice from Below:");
            System.out.println("RUB   AFN   EUR   AED   AMD   ANG   AOA   ARS   AUD");
            System.out.println("ALL   BDT   INR   AWG   AZN   BAM   BBD   BGN   BHD");
            System.out.println("USD   BRL   EGP   BIF   BMD   BND   BOB   BSD   BTN");
			System.out.println("BWP   BYR   BZD   CAD   CDF   CHF   CLP   CNY   COP");
			System.out.println("CRC   CUP   CVE   CZK   DJF   DKK   DOP   DZD   ERN");
			System.out.println("ETB   FJD   FKP   GBP   GEL   GGP   GHS   GIP   GMD");
			System.out.println("GNF   GTQ   GYD   HKD   HNL   HRK   HTG   HUF   IDR");
			System.out.println("ILS   IMP   IQD   IRR   ISK   JEP   JMD   JOD   JPY");
			System.out.println("KES   KGS   KHR   KID   KMF   KPW   KRW   KWD   KYD");
			System.out.println("KZT   LAK   LBP   LKR   LRD   LSL   LYD   MAD   MDL");
			System.out.println("MGA   MKD   MMK   MNT   MOP   MRO   MUR   MVR   MWK");
			System.out.println("MXN   MYR   MZN   NAD   NGN   NIO   NOK   NPR   NZD");
			System.out.println("OMR   PAB   PEN   PGK   PHP   PKR   PLN   PYG   QAR");
			System.out.println("RON   RSD   RWF   SAR   SBD   SCR   SDG   SEK   SGD");
			System.out.println("SHP   SLL   SOS   SRD   SSP   STD   SYP   SZL   THB");
			System.out.println("TJS   TMT   TND   TOP   TRY   TTD   TVD   TWD   TZS");
			System.out.println("UAH   UGX   UYU   UZS   VEF   VND   VUV   WST   XAF");
			System.out.println("      XCD   XOF   XPF   YER   ZAR   ZMW   ZWL");
            System.out.println("\nI want to convert ");
      choice1=keyboard.nextLine();
      System.out.println("to ");
      choice2=keyboard.nextLine();
      System.out.println("\nEnter "+choice1+" value: ");
            input=keyboard.nextDouble();
            int i=0;
      while(i<160){
               if(data[i].equals(choice1))break;
               i++;
      }
      if(i==160)System.out.println("Invalid input");
      else{
              int j=0;
            while(j<160){
                if(data[j].equals(choice2))break;
                j++;
            } 
            if(j==160)System.out.println("Invalid input");
            else{
                Double ans=input/value[i];
				System.out.print("\n");
                System.out.println(data[j]+" -> "+ans*value[j]);
				System.out.print("\n");
            }
      }
      String x=keyboard.nextLine(); 
    }
        } 
    
    }
}
