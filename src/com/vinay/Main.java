package com.vinay;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while(!quit){
            System.out.println("Enter Your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions(){
        System.out.println("\nPress : ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addItem(){
        System.out.print("Please enter the Grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem(){
        System.out.print("Enter item name which you want to modify: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo,newItem);
    }

    private static void removeItem(){
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    private static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list.");
        }else{
            System.out.println(searchItem + " is not in the grocery lsit");
        }
    }







}
