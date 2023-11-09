package model;

import interfaces.IUSB;

public class GabineteUSBModel implements IUSB {
    @Override
    public void conectarUSB() {
        System.out.println("Gabinete USB conectado com sucesso!");
    }
}
