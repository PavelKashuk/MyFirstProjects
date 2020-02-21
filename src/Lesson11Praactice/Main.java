package Lesson11Praactice;

import Lesson11Praactice.Model.Clothes;
import Lesson11Praactice.Model.Furniture;

import java.util.Scanner;

public class Main {
    private final static int CLOTHES_FACTORY_TYPE = 1;
    private final static int FURNITURE_FACTORY_TYPE = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = 0;
        int value = 0;
        System.out.println("What factory do you need create?\n" +
                "1 - For Clothes Factory\n2 - For Furniture Factory");
        int factoryType = scanner.nextInt();

        if (factoryType == CLOTHES_FACTORY_TYPE) {
            ClothesFactory clothesFactory = new ClothesFactory();
            System.out.println("What type of clothes do you need?\n1 - For Dress\n2 - For Shirt");
            type = scanner.nextInt();

            System.out.println("How many clothes do you need?");
            value = scanner.nextInt();

            Clothes[] clothes = clothesFactory.createClothes(type, value);
            System.out.println("Clothes length is: " + clothes.length);

        }else if (factoryType == FURNITURE_FACTORY_TYPE){
            FurnitureFactory furnitureFactory = new FurnitureFactory();
            System.out.println("What type of furniture do you need?\n1 - For Chair\n2 - For Sofa");
            type = scanner.nextInt();

            System.out.println("How many furniture do you need?");
            value = scanner.nextInt();

            Furniture[] furniture = furnitureFactory.createFurniture(type, value);
            System.out.println("Furniture length is: " + furniture.length);
        }

    }
}
