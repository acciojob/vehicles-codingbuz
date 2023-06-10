package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;
    public Boat(String name, int currentSpeed, int currentDirection) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection =0;
    }

  public void move(int currentDirection,int currentSpeed){
        this.currentDirection=currentDirection;
        this.currentSpeed=currentSpeed;
  }
        public void steer(int direction){
        this.currentDirection+=direction;
        }
  public void stop(){
        if(currentSpeed==0){
            return;
        }
  }

    public String getVehicleName(){
        return  this.name;
    }
    public int getVehicleCapacity(){
        return 0;
    }

}
