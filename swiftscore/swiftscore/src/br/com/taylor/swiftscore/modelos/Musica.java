package br.com.taylor.swiftscore.modelos;

public class Musica extends Audio {
    private String album;
    private String compositor;
    private String era;
    private boolean isTaylorsVersion;

    /* --- SOBREESCRITA DO MÉTODO (Polimorfismo) --- */

    @Override
    public double pegarMedia() {
        // Se for Taylor's Version, a música ganha um bônus de 1.0 na média final!
        if (this.isTaylorsVersion){
            return super.pegarMedia() + 1.0;
        } else {
        return super.pegarMedia();
    }

}
    // --- GETTERS E SETTERS (Para os novos atributos) ---
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isTaylorsVersion() {
        return isTaylorsVersion;
    }

    public void setTaylorsVersion(boolean taylorsVersion) {
        isTaylorsVersion = taylorsVersion;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    }