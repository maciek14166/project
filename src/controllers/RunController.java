package controllers;

import models.Disease;
import models.Doctor;
import models.Patient;
import models.Specialization;

import java.util.Scanner;

/**
 * Class RunController
 */
public class RunController {
    /**
     * Class to run program
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz stworzyć pacjenta (wpisz: p) czy lekarza (wpisz: d)?: ");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision) {
            case "p" -> {
                System.out.println("Podaj imię pacjenta:");
                final String name = String.valueOf(scanner.nextLine());
                System.out.println("Podaj chorobę [f/p]:");
                final String diseaseString = String.valueOf(scanner.nextLine());
                System.out.println("Podaj wiek człowieka:");
                final int age = Integer.parseInt(scanner.nextLine());

                Disease disease;
                switch (diseaseString) {
                    case "f" -> disease = Disease.FLU;
                    case "p" -> disease = Disease.PNEUMONIA;
                    default -> {
                        System.out.println("Błędny wybór choroby");
                        this.run();
                        return;
                    }
                }

                final Patient patient = new Patient(name, age, disease);
                System.out.printf("Stworzono pacjenta: %s\n", patient);
                System.out.println("Teraz sie przedstawi:");
                patient.speak();
            }
            case "d" -> {
                System.out.println("Podaj imię lekarza:");
                final String name = String.valueOf(scanner.nextLine());
                System.out.println("Podaj specjalizację [i/d/p]:");
                final String specializationString = String.valueOf(scanner.nextLine());
                System.out.println("Podaj wiek człowieka:");
                final int age = Integer.parseInt(scanner.nextLine());

                Specialization specialization;
                switch (specializationString) {
                    case "i" -> specialization = Specialization.INTERNIST;
                    case "d" -> specialization = Specialization.DERMATOLOGIST;
                    case "p" -> specialization = Specialization.PSYCHIATRIST;
                    default -> {
                        System.out.println("Błędny wybór specjalizacji");
                        this.run();
                        return;
                    }
                }

                final Doctor patient = new Doctor(name, age, specialization);
                System.out.printf("Stworzono lekarza: %s\n", patient);
                System.out.println("Teraz sie przedstawi:");
                patient.speak();
            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }

        System.out.println("Pa pa");
    }
}
