package com.adjav.game.bored;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MemoryLevel6Activity extends AppCompatActivity {

    ImageView tile_1, tile_2, tile_3, tile_4, tile_5, tile_6, tile_7, tile_8, tile_9, tile_10, tile_11, tile_12, tile_13, tile_14, tile_15, tile_16,
            tile_17, tile_18, tile_19, tile_20, tile_21, tile_22, tile_23, tile_24, tile_25, tile_26, tile_27, tile_28, tile_29, tile_30, tile_31, tile_32;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
                             201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216};

    int image101, image102, image103, image104, image105, image106, image107, image108, image109, image110, image111, image112, image113, image114, image115, image116,
            image201, image202, image203, image204, image205, image206, image207, image208, image209, image210, image211, image212, image213, image214, image215, image216;

    int firstCard, secondCard;
    int firstClick, secondClick;
    int cardNumber = 1;

    int counter = 0;
    int move = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tile_layout_harder);

        tile_1 = (ImageView) findViewById(R.id.tile_1);
        tile_2 = (ImageView) findViewById(R.id.tile_2);
        tile_3 = (ImageView) findViewById(R.id.tile_3);
        tile_4 = (ImageView) findViewById(R.id.tile_4);
        tile_5 = (ImageView) findViewById(R.id.tile_5);
        tile_6 = (ImageView) findViewById(R.id.tile_6);
        tile_7 = (ImageView) findViewById(R.id.tile_7);
        tile_8 = (ImageView) findViewById(R.id.tile_8);
        tile_9 = (ImageView) findViewById(R.id.tile_9);
        tile_10 = (ImageView) findViewById(R.id.tile_10);
        tile_11 = (ImageView) findViewById(R.id.tile_11);
        tile_12 = (ImageView) findViewById(R.id.tile_12);
        tile_13= (ImageView) findViewById(R.id.tile_13);
        tile_14 = (ImageView) findViewById(R.id.tile_14);
        tile_15 = (ImageView) findViewById(R.id.tile_15);
        tile_16 = (ImageView) findViewById(R.id.tile_16);
        tile_17 = (ImageView) findViewById(R.id.tile_17);
        tile_18 = (ImageView) findViewById(R.id.tile_18);
        tile_19 = (ImageView) findViewById(R.id.tile_19);
        tile_20 = (ImageView) findViewById(R.id.tile_20);
        tile_21 = (ImageView) findViewById(R.id.tile_21);
        tile_22 = (ImageView) findViewById(R.id.tile_22);
        tile_23 = (ImageView) findViewById(R.id.tile_23);
        tile_24 = (ImageView) findViewById(R.id.tile_24);
        tile_25 = (ImageView) findViewById(R.id.tile_25);
        tile_26 = (ImageView) findViewById(R.id.tile_26);
        tile_27 = (ImageView) findViewById(R.id.tile_27);
        tile_28 = (ImageView) findViewById(R.id.tile_28);
        tile_29 = (ImageView) findViewById(R.id.tile_29);
        tile_30 = (ImageView) findViewById(R.id.tile_30);
        tile_31 = (ImageView) findViewById(R.id.tile_31);
        tile_32 = (ImageView) findViewById(R.id.tile_32);

        tile_1.setTag("0");
        tile_2.setTag("1");
        tile_3.setTag("2");
        tile_4.setTag("3");
        tile_5.setTag("4");
        tile_6.setTag("5");
        tile_7.setTag("6");
        tile_8.setTag("7");
        tile_9.setTag("8");
        tile_10.setTag("9");
        tile_11.setTag("10");
        tile_12.setTag("11");
        tile_13.setTag("12");
        tile_14.setTag("13");
        tile_15.setTag("14");
        tile_16.setTag("15");
        tile_17.setTag("16");
        tile_18.setTag("17");
        tile_19.setTag("18");
        tile_20.setTag("19");
        tile_21.setTag("20");
        tile_22.setTag("21");
        tile_23.setTag("22");
        tile_24.setTag("23");
        tile_25.setTag("24");
        tile_26.setTag("25");
        tile_27.setTag("26");
        tile_28.setTag("27");
        tile_29.setTag("28");
        tile_30.setTag("29");
        tile_31.setTag("30");
        tile_32.setTag("31");

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        tile_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_1, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_2, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_3, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_4, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_5, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_6, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_7, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_8, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_9, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_10, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_11, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_12, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_13, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_14, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_15, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_16, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_17, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_18, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_19, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_20, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_21, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_22, theCard);

                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }

            }
        });

        tile_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_23, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_24, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_25, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_26, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_27, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_28, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_29, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_30, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_31, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        tile_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_32, theCard);
                counter=counter+1;
                if((counter % 2)==0)
                {
                    move +=1;
                }


            }
        });

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);

    }

    private void flipCard(ImageView tile, int card) {
        if(cardsArray[card] == 101){
            tile.setImageResource(image101);
        } else if (cardsArray[card] == 102){
            tile.setImageResource(image102);
        } else if (cardsArray[card] == 103){
            tile.setImageResource(image103);
        } else if (cardsArray[card] == 104){
            tile.setImageResource(image104);
        } else if (cardsArray[card] == 105){
            tile.setImageResource(image105);
        } else if (cardsArray[card] == 106){
            tile.setImageResource(image106);
        } else if (cardsArray[card] == 107){
            tile.setImageResource(image107);
        } else if (cardsArray[card] == 108){
            tile.setImageResource(image108);
        } else if (cardsArray[card] == 109){
            tile.setImageResource(image109 );
        } else if (cardsArray[card] == 110){
            tile.setImageResource(image110 );
        } else if (cardsArray[card] == 111 ){
            tile.setImageResource(image111 );
        } else if (cardsArray[card] == 112 ){
            tile.setImageResource(image112 );
        } else if (cardsArray[card] == 113 ){
            tile.setImageResource(image113 );
        } else if (cardsArray[card] == 114 ){
            tile.setImageResource(image114 );
        } else if (cardsArray[card] == 115 ){
            tile.setImageResource(image115 );
        } else if (cardsArray[card] == 116){
            tile.setImageResource(image116);
        } else if (cardsArray[card] == 201 ){
            tile.setImageResource(image201 );
        } else if (cardsArray[card] == 202 ){
            tile.setImageResource(image202 );
        } else if (cardsArray[card] == 203 ){
            tile.setImageResource(image203 );
        } else if (cardsArray[card] == 204 ){
            tile.setImageResource(image204 );
        } else if (cardsArray[card] == 205 ){
            tile.setImageResource(image205 );
        } else if (cardsArray[card] == 206 ){
            tile.setImageResource(image206 );
        } else if (cardsArray[card] == 207 ){
            tile.setImageResource(image207 );
        } else if (cardsArray[card] == 208 ){
            tile.setImageResource(image208  );
        } else if (cardsArray[card] == 209 ){
            tile.setImageResource(image209  );
        } else if (cardsArray[card] == 210 ){
            tile.setImageResource(image210  );
        } else if (cardsArray[card] == 211 ){
            tile.setImageResource(image211  );
        } else if (cardsArray[card] == 212){
            tile.setImageResource(image212  );
        } else if (cardsArray[card] == 213){
            tile.setImageResource(image213  );
        } else if (cardsArray[card] == 214){
            tile.setImageResource(image214  );
        } else if (cardsArray[card] == 215){
            tile.setImageResource(image215 );
        } else if (cardsArray[card] == 216){
            tile.setImageResource(image216);
        }

        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            firstClick = card;

            tile.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            secondClick = card;

            tile_1.setEnabled(false);
            tile_2.setEnabled(false);
            tile_3.setEnabled(false);
            tile_4.setEnabled(false);
            tile_5.setEnabled(false);
            tile_6.setEnabled(false);
            tile_7.setEnabled(false);
            tile_8.setEnabled(false);
            tile_9.setEnabled(false);
            tile_10.setEnabled(false);
            tile_11.setEnabled(false);
            tile_12.setEnabled(false);
            tile_13.setEnabled(false);
            tile_14.setEnabled(false);
            tile_15.setEnabled(false);
            tile_16.setEnabled(false);
            tile_17.setEnabled(false);
            tile_18.setEnabled(false);
            tile_19.setEnabled(false);
            tile_20.setEnabled(false);
            tile_21.setEnabled(false);
            tile_22.setEnabled(false);
            tile_23.setEnabled(false);
            tile_24.setEnabled(false);
            tile_25.setEnabled(false);
            tile_26.setEnabled(false);
            tile_27.setEnabled(false);
            tile_28.setEnabled(false);
            tile_29.setEnabled(false);
            tile_30.setEnabled(false);
            tile_31.setEnabled(false);
            tile_32.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);

        }
    }

    private void calculate(){
        if(firstCard == secondCard){
            if(firstClick == 0){
                tile_1.setVisibility(View.INVISIBLE);
            } else if(firstClick == 1){
                tile_2.setVisibility(View.INVISIBLE);
            } else if(firstClick == 2){
                tile_3.setVisibility(View.INVISIBLE);
            } else if(firstClick == 3){
                tile_4.setVisibility(View.INVISIBLE);
            } else if(firstClick == 4){
                tile_5.setVisibility(View.INVISIBLE);
            } else if(firstClick == 5){
                tile_6.setVisibility(View.INVISIBLE);
            } else if(firstClick == 6){
                tile_7.setVisibility(View.INVISIBLE);
            } else if(firstClick == 7){
                tile_8.setVisibility(View.INVISIBLE);
            } else if(firstClick == 8){
                tile_9.setVisibility(View.INVISIBLE);
            } else if(firstClick == 9){
                tile_10.setVisibility(View.INVISIBLE);
            } else if(firstClick == 10){
                tile_11.setVisibility(View.INVISIBLE);
            } else if(firstClick == 11){
                tile_12.setVisibility(View.INVISIBLE);
            } else if(firstClick == 12){
                tile_13.setVisibility(View.INVISIBLE);
            } else if(firstClick == 13){
                tile_14.setVisibility(View.INVISIBLE);
            } else if(firstClick == 14){
                tile_15.setVisibility(View.INVISIBLE);
            } else if(firstClick == 15){
                tile_16.setVisibility(View.INVISIBLE);
            } else if(firstClick == 16){
                tile_17.setVisibility(View.INVISIBLE);
            } else if(firstClick == 17){
                tile_18.setVisibility(View.INVISIBLE);
            } else if(firstClick == 18){
                tile_19.setVisibility(View.INVISIBLE);
            } else if(firstClick == 19){
                tile_20.setVisibility(View.INVISIBLE);
            } else if(firstClick == 20){
                tile_21.setVisibility(View.INVISIBLE);
            } else if(firstClick == 21){
                tile_22.setVisibility(View.INVISIBLE);
            } else if(firstClick == 22){
                tile_23.setVisibility(View.INVISIBLE);
            } else if(firstClick == 23){
                tile_24.setVisibility(View.INVISIBLE);
            } else if(firstClick == 24){
                tile_25.setVisibility(View.INVISIBLE);
            } else if(firstClick == 25){
                tile_26.setVisibility(View.INVISIBLE);
            } else if(firstClick == 26){
                tile_27.setVisibility(View.INVISIBLE);
            } else if(firstClick == 27){
                tile_28.setVisibility(View.INVISIBLE);
            } else if(firstClick == 28){
                tile_29.setVisibility(View.INVISIBLE);
            } else if(firstClick == 29){
                tile_30.setVisibility(View.INVISIBLE);
            } else if(firstClick == 30){
                tile_31.setVisibility(View.INVISIBLE);
            } else if(firstClick == 31){
                tile_32.setVisibility(View.INVISIBLE);
            }


            if(secondClick == 0){
                tile_1.setVisibility(View.INVISIBLE);
            } else if(secondClick == 1){
                tile_2.setVisibility(View.INVISIBLE);
            } else if(secondClick == 2){
                tile_3.setVisibility(View.INVISIBLE);
            } else if(secondClick == 3){
                tile_4.setVisibility(View.INVISIBLE);
            } else if(secondClick == 4){
                tile_5.setVisibility(View.INVISIBLE);
            } else if(secondClick == 5){
                tile_6.setVisibility(View.INVISIBLE);
            } else if(secondClick == 6){
                tile_7.setVisibility(View.INVISIBLE);
            } else if(secondClick == 7){
                tile_8.setVisibility(View.INVISIBLE);
            } else if(secondClick == 8){
                tile_9.setVisibility(View.INVISIBLE);
            } else if(secondClick == 9){
                tile_10.setVisibility(View.INVISIBLE);
            } else if(secondClick == 10){
                tile_11.setVisibility(View.INVISIBLE);
            } else if(secondClick == 11){
                tile_12.setVisibility(View.INVISIBLE);
            } else if(secondClick == 12){
                tile_13.setVisibility(View.INVISIBLE);
            } else if(secondClick == 13){
                tile_14.setVisibility(View.INVISIBLE);
            } else if(secondClick == 14){
                tile_15.setVisibility(View.INVISIBLE);
            } else if(secondClick == 15){
                tile_16.setVisibility(View.INVISIBLE);
            } else if(secondClick == 16){
                tile_17.setVisibility(View.INVISIBLE);
            } else if(secondClick == 17){
                tile_18.setVisibility(View.INVISIBLE);
            } else if(secondClick == 18){
                tile_19.setVisibility(View.INVISIBLE);
            } else if(secondClick == 19){
                tile_20.setVisibility(View.INVISIBLE);
            } else if(secondClick == 20){
                tile_21.setVisibility(View.INVISIBLE);
            } else if(secondClick == 21){
                tile_22.setVisibility(View.INVISIBLE);
            } else if(secondClick == 22){
                tile_23.setVisibility(View.INVISIBLE);
            } else if(secondClick == 23){
                tile_24.setVisibility(View.INVISIBLE);
            } else if(secondClick == 24){
                tile_25.setVisibility(View.INVISIBLE);
            } else if(secondClick == 25){
                tile_26.setVisibility(View.INVISIBLE);
            } else if(secondClick == 26){
                tile_27.setVisibility(View.INVISIBLE);
            } else if(secondClick == 27){
                tile_28.setVisibility(View.INVISIBLE);
            } else if(secondClick == 28){
                tile_29.setVisibility(View.INVISIBLE);
            } else if(secondClick == 29){
                tile_30.setVisibility(View.INVISIBLE);
            } else if(secondClick == 30){
                tile_31.setVisibility(View.INVISIBLE);
            } else if(secondClick == 31){
                tile_32.setVisibility(View.INVISIBLE);
            }


        } else {
            tile_1.setImageResource(R.drawable.tile);
            tile_2.setImageResource(R.drawable.tile);
            tile_3.setImageResource(R.drawable.tile);
            tile_4.setImageResource(R.drawable.tile);
            tile_5.setImageResource(R.drawable.tile);
            tile_6.setImageResource(R.drawable.tile);
            tile_7.setImageResource(R.drawable.tile);
            tile_8.setImageResource(R.drawable.tile);
            tile_9.setImageResource(R.drawable.tile);
            tile_10.setImageResource(R.drawable.tile);
            tile_11.setImageResource(R.drawable.tile);
            tile_12.setImageResource(R.drawable.tile);
            tile_13.setImageResource(R.drawable.tile);
            tile_14.setImageResource(R.drawable.tile);
            tile_15.setImageResource(R.drawable.tile);
            tile_16.setImageResource(R.drawable.tile);
            tile_17.setImageResource(R.drawable.tile);
            tile_18.setImageResource(R.drawable.tile);
            tile_19.setImageResource(R.drawable.tile);
            tile_20.setImageResource(R.drawable.tile);
            tile_21.setImageResource(R.drawable.tile);
            tile_22.setImageResource(R.drawable.tile);
            tile_23.setImageResource(R.drawable.tile);
            tile_24.setImageResource(R.drawable.tile);
            tile_25.setImageResource(R.drawable.tile);
            tile_26.setImageResource(R.drawable.tile);
            tile_27.setImageResource(R.drawable.tile);
            tile_28.setImageResource(R.drawable.tile);
            tile_29.setImageResource(R.drawable.tile);
            tile_30.setImageResource(R.drawable.tile);
            tile_31.setImageResource(R.drawable.tile);
            tile_32.setImageResource(R.drawable.tile);


        }

        tile_1.setEnabled(true);
        tile_2.setEnabled(true);
        tile_3.setEnabled(true);
        tile_4.setEnabled(true);
        tile_5.setEnabled(true);
        tile_6.setEnabled(true);
        tile_7.setEnabled(true);
        tile_8.setEnabled(true);
        tile_9.setEnabled(true);
        tile_10.setEnabled(true);
        tile_11.setEnabled(true);
        tile_12.setEnabled(true);
        tile_13.setEnabled(true);
        tile_14.setEnabled(true);
        tile_15.setEnabled(true);
        tile_16.setEnabled(true);
        tile_17.setEnabled(true);
        tile_18.setEnabled(true);
        tile_19.setEnabled(true);
        tile_20.setEnabled(true);
        tile_21.setEnabled(true);
        tile_22.setEnabled(true);
        tile_23.setEnabled(true);
        tile_24.setEnabled(true);
        tile_25.setEnabled(true);
        tile_26.setEnabled(true);
        tile_27.setEnabled(true);
        tile_28.setEnabled(true);
        tile_29.setEnabled(true);
        tile_30.setEnabled(true);
        tile_31.setEnabled(true);
        tile_32.setEnabled(true);

        checkEnd();

    }

    private void checkEnd(){
        if(tile_1.getVisibility() == View.INVISIBLE &&
                tile_2.getVisibility() == View.INVISIBLE &&
                tile_3.getVisibility() == View.INVISIBLE &&
                tile_4.getVisibility() == View.INVISIBLE &&
                tile_5.getVisibility() == View.INVISIBLE &&
                tile_6.getVisibility() == View.INVISIBLE &&
                tile_7.getVisibility() == View.INVISIBLE &&
                tile_8.getVisibility() == View.INVISIBLE &&
                tile_9.getVisibility() == View.INVISIBLE &&
                tile_10.getVisibility() == View.INVISIBLE &&
                tile_11.getVisibility() == View.INVISIBLE &&
                tile_12.getVisibility() == View.INVISIBLE &&
                tile_13.getVisibility() == View.INVISIBLE &&
                tile_14.getVisibility() == View.INVISIBLE &&
                tile_15.getVisibility() == View.INVISIBLE &&
                tile_16.getVisibility() == View.INVISIBLE &&
                tile_17.getVisibility() == View.INVISIBLE &&
                tile_18.getVisibility() == View.INVISIBLE &&
                tile_19.getVisibility() == View.INVISIBLE &&
                tile_20.getVisibility() == View.INVISIBLE &&
                tile_21.getVisibility() == View.INVISIBLE &&
                tile_22.getVisibility() == View.INVISIBLE &&
                tile_23.getVisibility() == View.INVISIBLE &&
                tile_24.getVisibility() == View.INVISIBLE &&
                tile_25.getVisibility() == View.INVISIBLE &&
                tile_26.getVisibility() == View.INVISIBLE &&
                tile_27.getVisibility() == View.INVISIBLE &&
                tile_28.getVisibility() == View.INVISIBLE &&
                tile_29.getVisibility() == View.INVISIBLE &&
                tile_30.getVisibility() == View.INVISIBLE &&
                tile_31.getVisibility() == View.INVISIBLE &&
                tile_32.getVisibility() == View.INVISIBLE ) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(new ContextThemeWrapper(this,R.style.AlertDialogCustom));
            alertDialogBuilder
                    .setMessage("Moves: " + move)
                    .setCancelable(false)
                    .setPositiveButton("PLAY AGAIN", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(),MemoryLevel1Activity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("LEVEL SELECT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources(){
        image101 = R.drawable.image5_1;
        image102 = R.drawable.image5_2;
        image103 = R.drawable.image5_3;
        image104 = R.drawable.image5_4;
        image105 = R.drawable.image5_5;
        image106 = R.drawable.image5_6;
        image107 = R.drawable.image5_7;
        image108 = R.drawable.image5_8;
        image109 = R.drawable.image5_9;
        image110 = R.drawable.image5_10;
        image111 = R.drawable.image5_11;
        image112 = R.drawable.image5_12;
        image113 = R.drawable.image5_13;
        image114 = R.drawable.image5_14;
        image115 = R.drawable.image5_15;
        image116 = R.drawable.image5_16;
        image201 = R.drawable.image5_1;
        image202 = R.drawable.image5_2;
        image203 = R.drawable.image5_3;
        image204 = R.drawable.image5_4;
        image205 = R.drawable.image5_5;
        image206 = R.drawable.image5_6;
        image207 = R.drawable.image5_7;
        image208 = R.drawable.image5_8;
        image209 = R.drawable.image5_9;
        image210 = R.drawable.image5_10;
        image211 = R.drawable.image5_11;
        image212 = R.drawable.image5_12;
        image213 = R.drawable.image5_13;
        image214 = R.drawable.image5_14;
        image215 = R.drawable.image5_15;
        image216 = R.drawable.image5_16;

    }

    public void moveCounter(String string) {

        if((counter % 2) == 0) {

            move += 1;
        }
    }
}
