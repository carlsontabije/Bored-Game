package com.adjav.game.bored;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class MemoryLevel5Activity extends AppCompatActivity {

    ImageView tile_1, tile_2, tile_3, tile_4, tile_5, tile_6, tile_7, tile_8, tile_9, tile_10, tile_11, tile_12, tile_13, tile_14, tile_15, tile_16;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108, 201, 202, 203, 204, 205, 206, 207, 208};

    int image101, image102, image103, image104, image105, image106, image107, image108, image201, image202, image203, image204, image205, image206, image207, image208;

    int firstCard, secondCard;
    int firstClick, secondClick;
    int cardNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tile_layout);

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

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        tile_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_1, theCard);

            }
        });

        tile_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_2, theCard);

            }
        });

        tile_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_3, theCard);

            }
        });

        tile_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_4, theCard);

            }
        });

        tile_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_5, theCard);

            }
        });

        tile_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_6, theCard);

            }
        });

        tile_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_7, theCard);

            }
        });

        tile_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_8, theCard);

            }
        });

        tile_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_9, theCard);

            }
        });

        tile_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_10, theCard);

            }
        });

        tile_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_11, theCard);

            }
        });

        tile_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_12, theCard);

            }
        });

        tile_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_13, theCard);

            }
        });

        tile_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_14, theCard);

            }
        });

        tile_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_15, theCard);

            }
        });

        tile_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                flipCard(tile_16, theCard);

            }
        });
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
        } else if (cardsArray[card] == 201){
            tile.setImageResource(image201);
        } else if (cardsArray[card] == 202){
            tile.setImageResource(image202);
        } else if (cardsArray[card] == 203){
            tile.setImageResource(image203);
        } else if (cardsArray[card] == 204){
            tile.setImageResource(image204);
        } else if (cardsArray[card] == 205){
            tile.setImageResource(image205);
        } else if (cardsArray[card] == 206){
            tile.setImageResource(image206);
        } else if (cardsArray[card] == 207){
            tile.setImageResource(image207);
        } else if (cardsArray[card] == 208){
            tile.setImageResource(image208);
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

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },600);

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
                tile_16.getVisibility() == View.INVISIBLE ) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MemoryLevel5Activity.this);
            alertDialogBuilder
                    .setMessage("CONGRATS")
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MemoryLevel5Activity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
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
        image201 = R.drawable.image5_1;
        image202 = R.drawable.image5_2;
        image203 = R.drawable.image5_3;
        image204 = R.drawable.image5_4;
        image205 = R.drawable.image5_5;
        image206 = R.drawable.image5_6;
        image207 = R.drawable.image5_7;
        image208 = R.drawable.image5_8;

    }
}
