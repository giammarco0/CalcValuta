package it.aesys.gc.CalcValuta.models;

public class Currencies {


    private Dollar dollar;
    private Euro euro;
    private Pound pound;
    private SwissFranc swissFranc;

    public Currencies() {
        dollar = new Dollar();
        euro = new Euro();
        pound = new Pound();
        swissFranc = new SwissFranc();
    }

    public Dollar getDollar() {
        return dollar;
    }

    public Euro getEuro() {
        return euro;
    }

    public Pound getPound() {
        return pound;
    }

    public SwissFranc getSwissFranc() {
        return swissFranc;
    }
}
