package id.sch.smktelkom_mlg.xirpl3011.recyclerview2.adapter;

import android.graphics.drawable.Drawable;
/**
 * Created by Smktelkom on 1/17/2017.
 */
public class Hotel {
      public String judul;
       public String deskripsi;
      public Drawable foto;
               public Hotel(String judul, String deskripsi, Drawable foto){
               this.judul = judul;
               this.deskripsi = deskripsi;
               this.foto = foto;
           }
    }