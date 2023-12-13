package com.company;
        public class Main {
            public static void main(String[] args) {
                ArrayList cars = new ArrayList<>();

                cars.add(new Car("Toyota", "Camry", 2018));
                cars.add(new Car("Honda", "Accord", 2020));
                cars.add(new Car("Ford", "Mustang", 2015));
                cars.add(new Car("Chevrolet", "Cruze", 2019));

                Collections.sort(cars);

                for (Car car : cars) {
                    System.out.println(car);
                }
            }
        }
