package com.pack5;

import java.util.Scanner;
import java.util.InputMismatchException;
public class P5JDP5 {
    static int quantity_of_records;
    static String[] array_of_records;
    static int user_input_quantity_of_records;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа блокнот\n\n\n");
        user_choice_list_or_changes_method();
    }
    public static void user_choice_list_or_changes_method() {
        System.out.print("Если вы хотите просмотреть список доступных записей, нажмите 1.\nЕсли вы хотите внести изменения в какую-либо запись, нажмите 2.\nЕсли вы хотите создать новые записи, нажмите 3.\n\nВаш выбор: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int user_choice_list_or_changes_create = scanner.nextInt();
            if ((user_choice_list_or_changes_create == 1) || (user_choice_list_or_changes_create == 2) || (user_choice_list_or_changes_create == 3)) {
                if (user_choice_list_or_changes_create == 1) {
                    System.out.print("\nНихера нет\n\n");
                    user_choice_list_or_changes_method();
                } else if (user_choice_list_or_changes_create == 2) {
                    System.out.print("\nЗаписей пока нет\n\n");
                    user_choice_list_or_changes_method();
                } else if (user_choice_list_or_changes_create == 3) {
                    System.out.print("\nУкажите количество записей которые вы хотите создать: ");
                    user_choice_to_change_the_quantity_of_records_or_their_contents_method();
                }
            } else {
                System.out.print("\nТакого варианта нет!\nПопробуйте ещё раз.\n\n");
                user_choice_list_or_changes_method();
            }
        }
        catch (InputMismatchException e){
            System.out.println("\nЭто даже не число!\n");
            user_choice_list_or_changes_method();
        }
    }
    public static void user_choice_to_change_the_quantity_of_records_or_their_contents_method() {
        Scanner scanner = new Scanner(System.in);
        try {
            quantity_of_records = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("\nЭто даже не число!\n");
            System.out.print("Укажите количество записей которые вы хотите создать: ");
            user_choice_to_change_the_quantity_of_records_or_their_contents_method();
        }
        array_of_records = new String[quantity_of_records];
        System.out.print("\nСоздано новые записи, в количестве " + quantity_of_records + ".\nПолный список записей:\n\n");
        String[] array_of_records = new String[quantity_of_records];
        for (int i = 1; i <= quantity_of_records; i++) {
            System.out.println("Запись номер " + i + ".");
        }
        user_choice_to_change_the_quantity_of_records_or_their_contents_second_floor_method();
    }
    public static void user_choice_to_change_the_quantity_of_records_or_their_contents_second_floor_method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЧтобы изменить количество созданных записей, нажмите 1.");
        System.out.println("Чтобы изменить содержимое любой записи, нажмите 2.");
        System.out.print("\nВаш выбор: ");
        try {
            int user_choice_to_change_the_quantity_of_records_or_their_contents = scanner.nextInt();
            if (user_choice_to_change_the_quantity_of_records_or_their_contents == 1) {
                System.out.print("Укажите обновлённое количество записей: ");
                user_choice_to_change_the_quantity_of_records_or_their_contents_method();
            } else if (user_choice_to_change_the_quantity_of_records_or_their_contents == 2) {
                record_number_selection_method();
            } else {
                System.out.print("\nТакого варианта нет!\nПопробуйте ещё раз.\n");
                user_choice_to_change_the_quantity_of_records_or_their_contents_second_floor_method();
            }
        }

        catch (InputMismatchException e){
            System.out.println("\nЭто даже не число!");
            user_choice_to_change_the_quantity_of_records_or_their_contents_second_floor_method();
        }
    }
    public static void record_number_selection_method() {
        System.out.print("\nВсего записей " + quantity_of_records + ".\nУкажите номер записи: ");
        record_number_selection_second_floor_method();
    }
    public static void record_number_selection_second_floor_method() {
        Scanner scanner = new Scanner(System.in);
        try {
            int user_input_quantity_of_records = scanner.nextInt();
            if (user_input_quantity_of_records <= quantity_of_records) {
                user_input_for_records(user_input_quantity_of_records);
            } else {
                System.out.println("\nТакой записи не существует");
                System.out.print("\nУкажите коректный номер записи: ");
                record_number_selection_second_floor_method();
            }
        }
        catch (InputMismatchException e){
            System.out.println("\nЭто даже не число!");
            System.out.print("\nВсего записей " + quantity_of_records + ".");
            System.out.print("\nУкажите коректный номер записи: ");
            record_number_selection_second_floor_method();
        }
    }
    public static void user_input_for_records(int user_input_quantity_of_records) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите текст который будет помещён в запись: ");
        String user_input_record = scanner.nextLine();
        array_of_records[user_input_quantity_of_records - 1] = user_input_record;
        System.out.print("\nЗапись сохранена.\n\nЧтобы изменить содержимое любой записи, нажмите 1.\nЧтобы просмотреть содержимое любой записи, нажмите 2.\n\nВаш выбор: ");
        try {
            int user_choice_change_an_record_or_create_a_new_one = scanner.nextInt();
            if (user_choice_change_an_record_or_create_a_new_one == 1) {
                record_number_selection_method();
            } else if (user_choice_change_an_record_or_create_a_new_one == 2) {
                user_checking_the_contents_of_records();
            } else {
                System.out.println("\nТакой херни нет!\nПопробуйте ещё раз.");
                record_number_selection_method();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("\nЭто даже не число!");
            record_number_selection_method();
        }
    }
    public static void user_checking_the_contents_of_records() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВсего записей " + quantity_of_records + ".");
        System.out.print("Какую запись вы хотели бы просмотреть: ");
        try {
            int user_input_record = scanner.nextInt();
            if (user_input_record <= quantity_of_records) {
                if (array_of_records[user_input_record - 1] == null) {
                    System.out.println("\nНихера нет\n");
                    System.out.print("Попробуйте ввести номер другой записи\n");
                    user_checking_the_contents_of_records();
                } else {
                    System.out.print("\nВ запись номер " + user_input_record + " вы поместили ниже указанный текст:\n\n");
                    System.out.print(array_of_records[user_input_record - 1]);
                    user_choice_change_check_or_exit_method();
                }
            } else {
                System.out.print("Такого нет!\nПопробуйте снова\n");
                user_checking_the_contents_of_records();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("\nЭто даже не число!");
            record_number_selection_method();
        }
    }
    public static void user_choice_change_check_or_exit_method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nЧтобы изменить содержимое любой записи, нажмите 1.\nЧтобы просмотреть содержимое любой записи, нажмите 2.\nЧтобы завершить работу программы, нажмите 3.\n\nВаш выбор: ");
        int user_choice_change_check_or_exit = scanner.nextInt();
        try {
            if (user_choice_change_check_or_exit == 1) {
                System.out.print("\nИзменение содержимого записи\n");
                record_number_selection_method();
            } else if (user_choice_change_check_or_exit == 2) {
                user_checking_the_contents_of_records();
            } else if (user_choice_change_check_or_exit == 3) {
                System.out.print("\nСпасибо за внимание.");
            } else {
                System.out.print("\nТакой херни нет!!!!\nПопробуйте ещё раз.\n");
                user_choice_change_check_or_exit_method();
            }
        }
        catch (InputMismatchException e) {
            System.out.println("\nЭто даже не число!!!!");
            user_choice_change_check_or_exit_method();
        }
    }
}