/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vechiclerentalapp;

/**
 *
 * @author Computer Lab 3
 */
public class Sedan {
    
    public class Sedan {
         
         protected String vihicle;
         protected String brand;
         protected String model;
         protected int year;
         protected int rentalDays;
         protected double dailyRate;
         protected double insuranceFee;
      
         
         public Sedan(String Vechicle, String brand, String model, int year){
             String vehicleId = null;
             this.vechicleId = vehicleId;
             this.brand = brand;
             this.year = year;
         }
         public void displayinfo(){
             System.out.println(" Vechicle ID: "+ vechicleId );
             System.out.println("Brand:"+ brand);
             System.out.println("Model: "+ model);
             System.out.println("Year: "+ year);
         }
         public abstract double calculateRentalCost(int days);
         public String getVehicledId(){
             return vehicleId;
         }
     }
      
}
  


