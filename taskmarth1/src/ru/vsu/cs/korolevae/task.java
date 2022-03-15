package ru.vsu.cs.korolevae;

class perevod{
    public  int perv10 (int chislo, int sisschisl){
     int sum = 0;
     int ostatok=0;
     int st=0;
      while (chislo!= 0){
          ostatok= chislo %10;
          ostatok= (int) (ostatok * Math.pow(sisschisl,st));
          sum= sum + ostatok;
          ostatok=0;
          st= st+1;
          chislo=chislo/10;

      }


        return sum;
    }
    public  int pereviz10(int chisl0, int sisschisl){
        int sum=0;
        int ostatok= 0;
        int st=0;
        while (chisl0!=0){
            ostatok= chisl0 % sisschisl;
            sum= (int) (sum + ostatok*Math.pow(10,st));
            st= st+1;
            ostatok=0;
            chisl0= chisl0/sisschisl;

        }
        return sum;
    }
    public  int perevvod(int chislo,int ssishod, int ssneed){
        chislo= perv10(chislo,ssishod);
        chislo=pereviz10(chislo,ssneed);
        return chislo;

    }

}
