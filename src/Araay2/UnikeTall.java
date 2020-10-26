package Araay2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.SecureRandom;

public class UnikeTall {
    int length;
    int[] array;

    public UnikeTall(int length) {
        this.length = length;
        int[] array1 = new int[length];
        this.array= array1;
    }

    public boolean sok(int tall) {
        boolean result = true;
        for (int i : array) {
            if (i == tall) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public void fyllarray() {
        int randomtall;
        for (int i = 0; i < length; i++) {
            randomtall = (int) (Math.random() * (900) + 100);
            for (int j : array) {
                if (randomtall != j) {
                    array[i] = randomtall;
                }
            }
        }
    }
    public int minstTall(){
        int minst = array[0];
        for (int i:array){
            if(i<minst){
                minst=i;
            }
        }
        return minst;
    }
    public int størsteTall(){
        int max = array[0];
        for (int i:array){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public double gjnommsnitt(){
        double sum=0;
        for(int i:array){
            sum+=i;
        }
        double snitt = sum/array.length;
        return snitt;
    }
    public String formatering(){
        String ut="";
        for (int i=0; i<array.length;i++) {
            ut += array[i] + " ";
                if (i%5==1) {
                    ut += "\n";
                }
        }
        ut+="\n Mineste Tall er "+minstTall()+"\n";
        ut+="Største Tall er "+størsteTall()+"\n";
        ut+="Gjennomsnittsverdien er "+String.format("%.1f",gjnommsnitt());
        return ut;
    }
}


