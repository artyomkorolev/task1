package ru.vsu.cs.korolevae;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class perevod{
    public  int perv10 (String chislo, int sisschisl){

        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        String[] str_arr = chislo.split("");
            for (String item: str_arr){

                if(item.equals("A")){
                    list1.add(10);continue;
                }
                if(item.equals("B")){
                    list1.add(11);continue;
                }
                if(item.equals("C")){
                    list1.add(12);continue;
                }
                if(item.equals("D")){
                    list1.add(13);continue;
                }
                if(item.equals("E")){
                    list1.add(14);continue;
                }
                if(item.equals("F")){
                    list1.add(15);
                    continue;
                }


                list1.add(Integer.parseInt(item));

            }

            int summa = 0;
            for(int r = list1.size()-1;r>=0;r--){
                summa+= list1.get(r) * Math.pow(sisschisl,list1.size()-1-r);
            }

        System.out.println(summa);
         return summa;

    }

    public  String pereviz10(int chislo, int sisschisl){
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int ostatok = 0;
        while (chislo != 0) {
            ostatok = chislo % sisschisl;
            list1.add(ostatok);
            ostatok = 0;
            chislo = chislo / sisschisl;
        }

        int size= list1.size()-1;
        for (int r=size;r>=0;r--){
            list2.add(list1.get(r));
        }

        for (Integer item:list2){
            if (item>=10){
                if (item== 12 )
                    list.add("C");
                if (item== 10 )
                    list.add("A");
                if (item== 11 )
                    list.add("B");
                if (item== 13 )
                    list.add("D");
                if (item== 14 )
                    list.add("E");
                if (item== 15 )
                    list.add("F");}
            else
                list.add(String.valueOf(item));
        }

        StringBuilder sb = new StringBuilder();
        for (String i:list){
            sb.append(i);
        }

        return sb.toString();



    }

    public String perevvod(String chislo,int ssishod, int ssneed){
        int chisl= perv10(chislo,ssishod);
        String chisle= pereviz10(chisl,ssneed);
        return chisle;}

    }






