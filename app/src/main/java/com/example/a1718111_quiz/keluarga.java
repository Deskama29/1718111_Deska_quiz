package com.example.a1718111_quiz;

import android.graphics.drawable.Drawable;

public class keluarga {
    public String nama ,jabatan ;
    public Drawable gambar;


    public Drawable getGambar()
    {
        return gambar;
    }

    public void setGambar(Drawable gambar)
    {
        this.gambar = gambar;
    }

    public keluarga(Drawable gambar, String nama, String jabatan) {
        this.gambar = gambar;
        this.nama = nama;
        this.jabatan = jabatan;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

}