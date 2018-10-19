package com.example.asus.resepmakanan;

/**
 * Created by imam-pc on 04/07/2016.
 */
public class Menu {
    private String nama, deskripsi;
    private Integer photoPic;
public Menu( Integer photoPic)
{

    this.photoPic=photoPic;
}
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }


    public Integer getPhotoPic() {
        return photoPic;
    }

    public void setPhotoPic(Integer photoPic) {
        this.photoPic = photoPic;
    }

    
}