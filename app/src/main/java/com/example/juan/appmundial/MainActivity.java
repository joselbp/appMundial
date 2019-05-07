package com.example.juan.appmundial;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;
    private int contador1;
    private int contador2;
    private int contador3;
    private int contador4;
    private int contador5;
    private int contador6;
    private int contador7;
    private int contador8;
    private int contador9;
    private int contador10;
    private int contador11;
    private int contador12;
    private int contador13;
    private int contador14;
    private int contador15;
    private int contador16;
    private int contador17;
    private int contador18;
    private int contador19;
    private int contador20;

    private ImageButton banbrasil;
    private ImageButton banarg;
    private ImageButton banportugal;
    private ImageButton bancolombia;
    private ImageButton col1;
    private ImageButton col2;
    private ImageButton col3;
    private ImageButton col4;
    private ImageButton arg1;
    private ImageButton arg2;
    private ImageButton arg3;
    private ImageButton arg4;
    private ImageButton por1;
    private ImageButton por2;
    private ImageButton por3;
    private ImageButton por4;
    private ImageButton bra1;
    private ImageButton bra2;
    private ImageButton bra3;
    private ImageButton bra4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banbrasil = findViewById(R.id.banbrasil);
        banarg = findViewById(R.id.banarg);
        bancolombia = findViewById(R.id.bancolombia);
        banportugal = findViewById(R.id.banportugal);
        col1 = findViewById(R.id.col1);
        col2 = findViewById(R.id.col2);
        col3 = findViewById(R.id.col3);
        col4 = findViewById(R.id.col4);
        arg1 = findViewById(R.id.arg1);
        arg2 = findViewById(R.id.arg2);
        arg3 = findViewById(R.id.arg3);
        arg4 = findViewById(R.id.arg4);
        por1 = findViewById(R.id.por1);
        por2 = findViewById(R.id.por2);
        por3 = findViewById(R.id.por3);
        por4 = findViewById(R.id.por4);
        bra1 = findViewById(R.id.bra1);
        bra2 = findViewById(R.id.bra2);
        bra3 = findViewById(R.id.bra3);
        bra4 = findViewById(R.id.bra4);
        cargarimagenes();
    }

    public void imagenesmarcadas(ImageButton actual, String nuevo) {
        int id = getResources().getIdentifier(nuevo, "drawable", getPackageName());
        actual.setImageResource(id);
    }

    public void almacenarimagenes(String id, String nuevo) {
        int var = getResources().getIdentifier(nuevo, "drawable", getPackageName());
        SharedPreferences.Editor miEditor = pref.edit();
        miEditor.putInt(id, var);
        miEditor.commit();
    }

    public void cargarimagenes() {
        pref = getSharedPreferences("preferenciasUsuarios", Context.MODE_PRIVATE);
        col1.setImageResource(pref.getInt("col1", col1.getResources().getIdentifier("", "drawable", getPackageName())));
        col2.setImageResource(pref.getInt("col2", col2.getResources().getIdentifier("", "drawable", getPackageName())));
        col3.setImageResource(pref.getInt("col3", col3.getResources().getIdentifier("", "drawable", getPackageName())));
        col4.setImageResource(pref.getInt("col4", col4.getResources().getIdentifier("", "drawable", getPackageName())));
        arg1.setImageResource(pref.getInt("arg1", arg1.getResources().getIdentifier("", "drawable", getPackageName())));
        arg2.setImageResource(pref.getInt("arg2", arg2.getResources().getIdentifier("", "drawable", getPackageName())));
        arg3.setImageResource(pref.getInt("arg3", arg3.getResources().getIdentifier("", "drawable", getPackageName())));
        arg4.setImageResource(pref.getInt("arg4", arg4.getResources().getIdentifier("", "drawable", getPackageName())));
        por1.setImageResource(pref.getInt("por1", por1.getResources().getIdentifier("", "drawable", getPackageName())));
        por2.setImageResource(pref.getInt("por2", por2.getResources().getIdentifier("", "drawable", getPackageName())));
        por3.setImageResource(pref.getInt("por3", por3.getResources().getIdentifier("", "drawable", getPackageName())));
        por4.setImageResource(pref.getInt("por4", por4.getResources().getIdentifier("", "drawable", getPackageName())));
        bra1.setImageResource(pref.getInt("bra1", bra1.getResources().getIdentifier("", "drawable", getPackageName())));
        bra2.setImageResource(pref.getInt("bra2", bra2.getResources().getIdentifier("", "drawable", getPackageName())));
        bra3.setImageResource(pref.getInt("bra3", bra3.getResources().getIdentifier("", "drawable", getPackageName())));
        bra4.setImageResource(pref.getInt("bra4", bra4.getResources().getIdentifier("", "drawable", getPackageName())));
        banbrasil.setImageResource(pref.getInt("banbrasil", banbrasil.getResources().getIdentifier("", "drawable", getPackageName())));
        bancolombia.setImageResource(pref.getInt("bancolombia", bancolombia.getResources().getIdentifier("", "drawable", getPackageName())));
        banarg.setImageResource(pref.getInt("banarg", banarg.getResources().getIdentifier("", "drawable", getPackageName())));
        banportugal.setImageResource(pref.getInt("banportugal", banportugal.getResources().getIdentifier("", "drawable", getPackageName())));
    }


    public void armero(View view) {
        contador1++;
        if (contador1 == 1) {
            col1.setImageResource(R.drawable.armero);
            imagenesmarcadas(col1, "armero");
            almacenarimagenes("col1", "armero");
        }

        if (contador1 == 2) {
            col1.setImageResource(R.drawable.armero1);
            imagenesmarcadas(col1, "armero1");
            almacenarimagenes("col1", "armero1");
        }

        if (contador1 == 3) {
            col1.setImageResource(R.drawable.armero2);
            imagenesmarcadas(col1, "armero2");
            almacenarimagenes("col1", "armero2");
        }
        switch (contador1)

        {
            case 3:
                contador1 = 0;
                break;
        }
    }

    public void falcao(View view) {
        contador2++;
        if (contador2 == 1) {
            {
                col2.setImageResource(R.drawable.falcao);
                imagenesmarcadas(col2, "falcao");
                almacenarimagenes("col2", "falcao");
            }

            if (contador2 == 2) {
                col2.setImageResource(R.drawable.falcao1);
                imagenesmarcadas(col2, "falcao1");
                almacenarimagenes("col2", "falcao1");
            }

            if (contador2 == 3) {
                col2.setImageResource(R.drawable.falcao2);
                imagenesmarcadas(col2, "falcao2");
                almacenarimagenes("col2", "falcao2");
            }
            switch (contador2)

            {
                case 3:
                    contador2 = 0;
                    break;
            }

        }
    }

    public void james(View view) {
        contador3++;
        if (contador3 == 1) {
            col3.setImageResource(R.drawable.james);
            imagenesmarcadas(col3, "james");
            almacenarimagenes("col3", "james");
        }

        if (contador3 == 2) {
            col3.setImageResource(R.drawable.james1);
            imagenesmarcadas(col3, "james1");
            almacenarimagenes("col3", "james1");
        }
        if (contador3 == 3) {
            {
                col3.setImageResource(R.drawable.james2);
                imagenesmarcadas(col3, "james2");
                almacenarimagenes("col3", "james2");
            }
        }
        switch (contador3)

        {
            case 3:
                contador3 = 0;
                break;
        }
    }

    public void ospina(View view) {
        contador4++;

        if (contador4 == 1) {
            col4.setImageResource(R.drawable.ospina);
            imagenesmarcadas(col4, "ospina");
            almacenarimagenes("col4", "ospina");
        }

        if (contador4 == 2) {
            col4.setImageResource(R.drawable.ospina1);
            imagenesmarcadas(col4, "ospina1");
            almacenarimagenes("col4", "ospina1");
        }

        if (contador4 == 3) {
            col4.setImageResource(R.drawable.ospina2);
            imagenesmarcadas(col4, "ospina2");
            almacenarimagenes("col4", "ospina2");
        }

        switch (contador4)

        {
            case 3:
                contador4 = 0;
                break;
        }
    }

    public void dida(View view) {
        contador5++;
        if (contador5 == 1) {

            bra1.setImageResource(R.drawable.dida);
            imagenesmarcadas(bra1, "dida");
            almacenarimagenes("bra1", "dida");
        }

        if (contador5 == 2) {
            bra1.setImageResource(R.drawable.dida1);
            imagenesmarcadas(bra1, "dida1");
            almacenarimagenes("bra1", "dida1");
        }

        if (contador5 == 3) {
            bra1.setImageResource(R.drawable.dida2);
            imagenesmarcadas(bra1, "dida2");
            almacenarimagenes("bra1", "dida2");
        }

        switch (contador5)

        {
            case 3:
                contador5 = 0;
                break;
        }
    }

    public void ney(View view) {
        contador6++;
        if (contador6 == 1) {
            {
                bra2.setImageResource(R.drawable.neymar);
                imagenesmarcadas(bra2, "neymar");
                almacenarimagenes("bra2", "neymar");
            }

            if (contador6 == 2) {
                bra2.setImageResource(R.drawable.neymar1);
                imagenesmarcadas(bra2, "neymar1");
                almacenarimagenes("bra2", "neymar1");
            }

            if (contador6 == 3) {
                bra2.setImageResource(R.drawable.neymar2);
                imagenesmarcadas(bra2, "neymar2");
                almacenarimagenes("bra2", "neymar2");
            }
            switch (contador6) {
                case 3:
                    contador6 = 0;
                    break;
            }
        }
    }

    public void dinho(View view) {
        contador7++;
        if (contador7 == 1) {
            bra3.setImageResource(R.drawable.ronaldihno);
            imagenesmarcadas(bra3, "ronaldihno");
            almacenarimagenes("bra3", "ronaldihno");
        }
        if (contador7 == 2) {
            bra3.setImageResource(R.drawable.ronaldihno1);
            imagenesmarcadas(bra3, "ronaldihno1");
            almacenarimagenes("bra3", "ronaldihno1");
        }
        if (contador7 == 3) {
            bra3.setImageResource(R.drawable.ronaldihno2);
            imagenesmarcadas(bra3, "ronaldihno2");
            almacenarimagenes("bra3", "ronaldihno2");
        }
        switch(contador7)

    {
        case 3:
            contador7 = 0;
            break;
    }

    }
    public void ronaldo (View view)
    {
        contador8++;
        if(contador8==1)
        {
                bra4.setImageResource(R.drawable.ronaldo);
                imagenesmarcadas(bra4,"ronaldo");
                almacenarimagenes("bra4","ronaldo");}

            if(contador8==2){ bra4.setImageResource(R.drawable.ronaldo1);
                imagenesmarcadas(bra4,"ronaldo1");
                almacenarimagenes("bra4","ronaldo1");}

            if(contador8==3){ bra4.setImageResource(R.drawable.ronaldo2);
                imagenesmarcadas(bra4,"ronaldo2");
                almacenarimagenes("bra4","ronaldo2");}

                switch (contador8){
                    case 3:
                        contador8 =0;
                        break;
                }
        }


    public void cr7 (View view)
    {
        contador9++;
        if(contador9==1)
        {
                por1.setImageResource(R.drawable.cr7);
                imagenesmarcadas(por1,"cr7");
                almacenarimagenes("por1","cr7");}

            if(contador9==2){por1.setImageResource(R.drawable.cr71);
                imagenesmarcadas(por1,"cr71");
                almacenarimagenes("por1","cr71");}

            if(contador9==3){por1.setImageResource(R.drawable.cr72);
                imagenesmarcadas(por1,"cr72");
                almacenarimagenes("por1","cr72");}

        switch (contador9){
            case 3:
                contador9 =0;
                break;
        }
    }


    public void liedson (View view)
    {
        contador10++;
        if(contador10==1)        {
                por2.setImageResource(R.drawable.liedsonportugal);
                imagenesmarcadas(por2,"liedsonportugal");
                almacenarimagenes("por2","liedsonportugal");}

            if(contador10==2){por2.setImageResource(R.drawable.liedsonportugal1);
                imagenesmarcadas(por2,"liedsonportugal1");
                almacenarimagenes("por2","liedsonportugal1");}
                if (contador10==3){por2.setImageResource(R.drawable.liedsonportugal2);
                imagenesmarcadas(por2,"liedsonportugal2");
                almacenarimagenes("por2","liedsonportugal2");}


        switch (contador10){
            case 3:
                contador10 =0;
                break;
        }
        }


    public void pepe (View view)
    {
        contador11++;
        if (contador11==1)
        {
            {
                por3.setImageResource(R.drawable.pepe);
                imagenesmarcadas(por3,"pepe");
                almacenarimagenes("por3","pepe");}
            if(contador11==2){por3.setImageResource(R.drawable.pepe1);
                imagenesmarcadas(por3,"pepe1");
                almacenarimagenes("por3","pepe1");}

            if(contador11==3){por3.setImageResource(R.drawable.pepe2);
                imagenesmarcadas(por3,"pepe2");
                almacenarimagenes("por3","pepe2");}

                switch (contador11){
                    case 3:
                        contador11 =0;
                        break;
                }
        }
    }
    public void porteropor (View view) {
        contador12++;
        if (contador12 == 1){
        {
                por4.setImageResource(R.drawable.porteroportugal);
                imagenesmarcadas(por4,"porteroportugal");
                almacenarimagenes("por4","porteroportugal");}

            if (contador12==2){por4.setImageResource(R.drawable.porteroportugal1);
                imagenesmarcadas(por4,"porteroportugal1");
                almacenarimagenes("por4","porteroportugal1");}

            if(contador12==3){ por4.setImageResource(R.drawable.porteroportugal2);
                imagenesmarcadas(por4,"porteroportugal2");
                almacenarimagenes("por4","porteroportugal2");}

            switch (contador12){
                case 3:
                    contador12 =0;
                    break;
            }
        }
    }
    public void dima (View view)
    {
        contador13++;
        if (contador13==1){
        {
                arg1.setImageResource(R.drawable.di_maria);
                imagenesmarcadas(arg1,"di_maria");
                almacenarimagenes("arg1","di_maria");}

            if (contador13==2){arg1.setImageResource(R.drawable.di_maria1);
                imagenesmarcadas(arg1,"di_maria1");
                almacenarimagenes("arg1","di_maria1");}

            if (contador13==3){arg1.setImageResource(R.drawable.di_maria2);
                imagenesmarcadas(arg1,"di_maria2");
                almacenarimagenes("arg1","di_maria2");}

                switch (contador13){
                    case 3:
                        contador13 =0;
                        break;
                }
        }
    }
    public void romero (View view)
    {
        contador14++;

        if(contador14==1){
        {
                arg2.setImageResource(R.drawable.romeroarg);
                imagenesmarcadas(arg2,"romeroarg");
                almacenarimagenes("arg2","romeroarg");}

            if(contador14==2){ arg2.setImageResource(R.drawable.romeroarg1);
                imagenesmarcadas(arg2,"romeroarg1");
                almacenarimagenes("arg2","romeroarg1");}

            if(contador14==3){arg2.setImageResource(R.drawable.romeroarg2);
                imagenesmarcadas(arg2,"romeroarg2");
                almacenarimagenes("arg2","romeroarg2");}

            switch (contador14){
                case 3:
                    contador14 =0;
                    break;
            }
        }
    }
    public void messi (View view)
    {
        contador15++;
        if(contador15==1){
        {
                arg3.setImageResource(R.drawable.messiarg);
                imagenesmarcadas(arg3,"messiarg");
                almacenarimagenes("arg3","messiarg");}

                if(contador15==2){arg3.setImageResource(R.drawable.messiarg1);
                imagenesmarcadas(arg3,"messiarg1");
                almacenarimagenes("arg3","messiarg1");}

                if(contador15==3){arg3.setImageResource(R.drawable.messiarg2);
                imagenesmarcadas(arg3,"messiarg2");
                almacenarimagenes("arg3","messiarg2");}

            switch (contador15){
                case 3:
                    contador15 =0;
                    break;
            }
        }
    }
    public void higuain (View view)
    {
        contador16++;
        if(contador16==1){
        {
                arg4.setImageResource(R.drawable.higuain);
                imagenesmarcadas(arg4,"higuain");
                almacenarimagenes("arg4","higuain");}

            if(contador16==2){arg4.setImageResource(R.drawable.higuain1);
                imagenesmarcadas(arg4,"higuain1");
                almacenarimagenes("arg4","higuain1");}

            if(contador16==3){arg4.setImageResource(R.drawable.higuain2);
                imagenesmarcadas(arg4,"higuain2");
                almacenarimagenes("arg4","higuain2");}

            switch (contador16){
                case 3:
                    contador16 =0;
                    break;
            }
        }
    }
    public void bancolombiaa (View view)
    {
        contador17++;
        if(contador17==1){
        {
                bancolombia.setImageResource(R.drawable.banderacolombia);
                imagenesmarcadas(bancolombia,"banderacolombia");
                almacenarimagenes("bancolombia","banderacolombia");}

            if(contador17==2){ bancolombia.setImageResource(R.drawable.banderacolombia1);
                imagenesmarcadas(bancolombia,"banderacolombia1");
                almacenarimagenes("bancolombia","banderacolombia1");}

            if(contador17==3){bancolombia.setImageResource(R.drawable.banderacolombia2);
                imagenesmarcadas(bancolombia,"banderacolombia2");
                almacenarimagenes("bancolombia","banderacolombia2");}

            switch (contador17){
                case 3:
                    contador17 =0;
                    break;
            }
        }
    }
    public void banportugal (View view)
    {
        contador18++;
        switch(contador18)
        {
            case 1: banportugal.setImageResource(R.drawable.banportugal);
                imagenesmarcadas(banportugal,"banderaportugal");
                almacenarimagenes("banportugal","banderaportugal");
                break;
            case 2: banportugal.setImageResource(R.drawable.banportugal1);
                imagenesmarcadas(banportugal,"banportugal1");
                almacenarimagenes("banportugal","banportugal1");
                break;
            case 3: banportugal.setImageResource(R.drawable.banportugal2);
                imagenesmarcadas(banportugal,"banportugal2");
                almacenarimagenes("banportugal","banportugal2");
                break;
        }
        if(contador18==3)
        {
            contador18=0;
        }
    }
    public void banbrasil (View view)
    {
        contador19++;
        if(contador19==1){
        {

                banbrasil.setImageResource(R.drawable.banderabrasil);
                imagenesmarcadas(banbrasil,"banderabrasil");
                almacenarimagenes("banbrasil","banderabrasil");}


            if(contador19==2){banbrasil.setImageResource(R.drawable.banderabrasil1);
                imagenesmarcadas(banbrasil,"banderabrasil1");
                almacenarimagenes("banbrasil","banderabrasil1");}


            if(contador19==3){banbrasil.setImageResource(R.drawable.banderabrasil2);
                imagenesmarcadas(banbrasil,"banderabrasil2");
                almacenarimagenes("banbrasil","banderabrasil2");}

            switch (contador19){
                case 3:
                    contador19 =0;
                    break;
            }
        }
    }
    public void banarg (View view)
    {
        contador20++;
        if(contador20==1){
        {
                banarg.setImageResource(R.drawable.banderaargentina);
                imagenesmarcadas(banarg,"banderaargentina");
                almacenarimagenes("banarg","banderaargentina");}

            if(contador20==2){banarg.setImageResource(R.drawable.banderaargentina1);
                imagenesmarcadas(banarg,"banderaargentina1");
                almacenarimagenes("banarg","banderaargentina1");}

            if(contador20==3){banarg.setImageResource(R.drawable.banderaargentina2);
                imagenesmarcadas(banarg,"banderaargentina2");
                almacenarimagenes("banarg","banderaargentina2");}

            switch (contador20){
                case 3:
                    contador20 =0;
                    break;
            }
        }
    }

    public void acerca (View view) {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
    public void spl (View view) {
        Intent i = new Intent(this, SplashScreen.class);
        startActivity(i);
    }

}

