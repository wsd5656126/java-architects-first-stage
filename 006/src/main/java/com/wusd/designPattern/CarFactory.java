package com.wusd.designPattern;

/**
 * 简单工厂模式
 */
public class CarFactory {
    public static Car createCar(String carName) {
        Car car = null;
        if ("奔驰".equals(carName)) {
            car = new Benchi();
        } else if ("奥迪".equals(carName)) {
            car = new Aodi();
        }
        return car;
    }

    public static void main(String[] args) {
        Car car = CarFactory.createCar("奥迪");
        Car car1 = CarFactory.createCar("奔驰");
        car.run();
        car1.run();
    }
}
