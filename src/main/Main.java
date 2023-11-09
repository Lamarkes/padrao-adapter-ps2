package main;

import interfaces.IUSB;
import model.AdaptadorPS2ToUSBModel;
import model.GabineteUSBModel;
import model.TecladoPS2Model;

public class Main {
    public static void main(String[] args) {
        TecladoPS2Model tecladoPS2 = new TecladoPS2Model();

        GabineteUSBModel gabinete = new GabineteUSBModel();

        IUSB adaptador = new AdaptadorPS2ToUSBModel(tecladoPS2);
        adaptador.conectarUSB();
    }
}