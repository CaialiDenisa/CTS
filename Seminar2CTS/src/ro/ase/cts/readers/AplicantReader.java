package ro.ase.cts.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException, NumberFormatException;
}