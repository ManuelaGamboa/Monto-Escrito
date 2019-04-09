/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montoescrito;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class MontoEscrito {
    
   public static String unidad (int f)
{                  //unidades
        String salida="";
        if ((f>0)&&(f<10)){
            if(f==1){
                salida= "uno";
            }
            if(f==2){
                salida= "dos";
            }
            if(f==3){
                salida= "tres";
            }
            if(f==4){
                salida= "cuatro";
            }
            if(f==5){
                salida= "cinco";
            }
            if(f==6){
                salida= "seis ";
            }
            if(f==7){
                salida= "siete";
            }
            if(f==8){
                salida= "ocho";
            }
            if(f==9){
                salida= "nueve";
            }
        }
        return salida;
    }
    
   public static String excepciones (int f)
{      //excepciones
        String salida=null;
        if(f==10){
            salida= "diez";
        }
        if(f==11){
            salida="once";
        }
        if(f==12){
            salida= "doce";
        }
        if(f==13){
            salida= "trece";
        }
        if(f==14){
            salida= "catorce";
        }
        if(f==15){
            salida= "quince";
        }
        return salida;
    }
  
   public static String decena (int f)
{                                        //decenas
        String salida=null;
        if(f>=10&&f<100){
        
        if(f>=10&&f<16){
            salida= excepciones(f);
        }
      
       if(f>15&&f<20){
            salida= "diez y "+unidad(f%10);
        }
        
       if (f==20){
            salida="veinte";
        }
       
       if (f>20&&f<30){
            salida ="veinti "+unidad(f%10);
       }
        
        if(f==30){
            salida= "treinta";
        }
        
        if (f>30&&f<40){
            salida= "treinta y "+unidad(f%10);
        }
        
        if(f==40){
            salida= "cuarenta";
        }
        if (f>40&&f<50){
            salida= "cuarenta y "+unidad(f%10);
        }
        
        if(f==50){
            salida= "cincuenta";
        }
        
        if (f>50&&f<60){
            salida= "cincuenta y "+unidad(f%10);
        }
        
        if(f==60){
            salida= "sesenta";
        }
        
        if (f>60&&f<70){
           salida= "sesenta y "+unidad(f%10);
        }
        
        if(f==70){
           salida= "setenta";
        }
        if (f>70&&f<80){
           salida= "setenta y "+unidad(f%10);
        }
       
        if (f==80){
            salida= "ochenta";
        }
        
        if (f>80&&f<90){
            salida= "ochenta y "+unidad(f%10);
        }
        
        if(f==90){
            salida= "noventa";
        }
        if (f>90&&f<100){
            salida= "noventa y "+unidad(f%10);
        }
        } else {
            salida=unidad(f);
        }
        return salida;
    }
    
   
   public static String centenas (int f)
{                                        //centenas
       String salida=null;
       
       if(f>99&&f<1000){
        if(f==100){                            //para numeros entre 100 y 199
            return salida="cien";
        } 
         if(f==500){                            //para numeros entre 100 y 199
            return salida="quinientos";
        } 
          if(f==700){                            //para numeros entre 100 y 199
            return salida="setecientos";
        } 
           if(f==900){                            //para numeros entre 100 y 199
            return salida="novecientos";
        } 
        
        if(f%100==0){
            salida= ""+unidad(f/100)+"cientos";
        }
        
        if (f>100&&f<200){
            salida="ciento "+decena(f%100);
        }
        if (f>200&&f<300){
            salida= "docientos "+decena(f%200);
        }
        if (f>300&&f<400){
            salida= "trecientos "+decena(f%300);
        }
        if (f>400&&f<500){     
            salida= "cuatrocientos "+decena(f%400);
        }
        if (f>500&&f<600){
            salida= "quinientos "+decena(f%500);
        }
        if (f>600&&f<700){
            salida= "seicientos "+decena(f%600);
        }
        if (f>700&&f<800){
            salida= "setecientos "+decena(f%700);
        }
        if (f>800&&f<900){
            salida= "ochocientos "+decena(f%800);
        }
        if (f>900&&f<1000){
            salida= "novecientos "+decena(f%900);
        } else {
            salida=decena(f);
        }
       }
        return salida;
    }
   
   
   public static String miles (int f)
{        //miles
       String salida=null;
       if(f>=1000&&f<1000000){
       if (f==1000){           //para numeros entre 1000 y 1999
            return salida= "mil";
       }
       if(f>1000&&f<2000){     
           salida= "mil"+centenas(f%1000);
        }
       
       /**if(f%1000==0){                  //para numeros entre 2000 y 9999
           salida= ""+unidad(f/1000)+"mil";
       }**/
       if (f>2000&&f<10000){    
           salida=""+unidad(f/1000)+"mil "+centenas(f%1000);
       }
       
       if(f>9999&&f<100000){                   //para 10000 hasta 99000
       if(f%1000==0){                       
           salida=""+decena(f/1000)+"mil";
       }else{
           salida=""+decena(f/1000)+"mil"+""+centenas(f%1000);
       }}
       
       if(f>=100000&&f<1000000){
           if(f%1000==0){ 
            salida=""+centenas(f/1000)+"mil";
          } else {
           salida=""+centenas(f/1000)+" mil"+" "+centenas(f%1000);
       }}
       }else {
            salida=centenas(f);
        }
       return salida;
   }
   
   
   public static String millones (int f)
{   //millones
       String salida=null;
       int divicion;
       int residuo;
       if(f>999999&&f<100000000){
           
               if(f==1000000){
                return salida="un millon";
                }
               if(f>999999&&f<2000000){
                   divicion=f/1000000;
                   residuo=f%1000000;
                   return salida="un millon"+centenas(divicion)+" mil";
               }
               
               if(f>1000000&&f<10000000){
           
                if(f%1000000==0){
                   divicion=f/1000000;
                   residuo=f%1000000;
                salida= unidad(divicion)+" millones";
                } 
                if(f%1000000!=0){
                   divicion=f/1000000;
                   residuo=f%1000000;
                salida= unidad(divicion)+" millones"+centenas(residuo/1000)+" mil";
                }}
               if(f>=10000000&&f<100000000){
                if(f%1000000==0){
                   divicion=f/1000000;
                   residuo=f%1000000;
                salida= decena(divicion)+" millones";
                } 
                if(f%1000000!=0){
                   divicion=f/1000000;
                   residuo=f%1000000;
                salida=decena(divicion)+" millones"+centenas(residuo/1000)+ " mil";
                }
               }
       }
       return salida;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tecla = new Scanner (System.in);
        int entero = 0;
        int decimal = 0;
        System.out.println("Digite un numero:");
        float n = tecla.nextFloat();
        entero = (int) n;
        decimal = (int) (100*((n - entero)+0.001));
       
        if(entero>0 && entero<100000000){
           System.out.print(millones(entero));
           //System.out.print(miles(entero));
           //System.out.print(centenas(entero));
           //System.out.print(decena(entero));
          // System.out.print(unidad(entero));
       }else{
           System.out.println("el numero no se encuentra, el rango es mayor que 0 y menor que 100000000");
       }
        
        if(decimal>0){
            System.out.print(" con ");
            System.out.print(decena(decimal));
            System.out.print(" decimas ");
        }
    }
    }