package model;

import interfaces.IUSB;

public class AdaptadorPS2ToUSBModel implements IUSB {

    private TecladoPS2Model tecladoPS2Model;

    public AdaptadorPS2ToUSBModel(TecladoPS2Model tecladoPS2) {
        this.tecladoPS2Model = tecladoPS2;
    }
    @Override
    public void conectarUSB() {
        System.out.println("Adaptando teclado PS2 para USB...");
        tecladoPS2Model.conectarPS2();
    }
}
