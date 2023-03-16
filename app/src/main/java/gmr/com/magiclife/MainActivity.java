package gmr.com.magiclife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.ImageView;

//Have middle button open up right side 3 buttons for 20, 30, and 40 health.
//Use current reset button press as template. Use gone visibility while not
//clicking on main center button.
//Have middle button open up left side 2, 3, or 4 player format. Have 3 diff
//xml and java class files for them.
//Incorporate bottom smaller window for commander or poison damage.
//Incorporate way to add pictures/ change colors for background.

public class MainActivity extends AppCompatActivity {



    TextView mainLife;
    TextView oppLife;
    ImageButton mainAdd;
    ImageButton oppAdd;
    ImageButton menu;
    ImageView mainTable;
    ImageView oppTable;

    ImageButton modeFour;
    ImageButton modeTwo;

    ImageView mainAddLarge;
    ImageView mainSubtractLarge;
    ImageView oppAddLarge;
    ImageView oppSubtractLarge;

    int mainLifeTotal = 20;
    int oppLifeTotal = 20;
    String mainLifeTot;
    String oppLifeTot;

    ImageButton twenty;
    ImageButton thirty;
    ImageButton forty;
    TextView twentyText;
    TextView thirtyText;
    TextView fortyText;

    int menuVisible = -1;

    int mainColorNumber = 1;
    int oppColorNumber = 2;
    int greenColor = 0xFF008200;
    int blackColor = 0xFF000000;
    int blueColor = 0xFF0000FF;
    int whiteColor = 0xFF9F9F00;
    int redColor = 0xFFFF0000;



    public void menuClick(View v){
        menuVisible *= -1;
        if(menuVisible == 1){
            twenty.setVisibility(View.VISIBLE);
            thirty.setVisibility(View.VISIBLE);
            forty.setVisibility(View.VISIBLE);
            modeFour.setVisibility(View.VISIBLE);
            modeTwo.setVisibility(View.VISIBLE);
        } else if(menuVisible == -1){
            twenty.setVisibility(View.GONE);
            thirty.setVisibility(View.GONE);
            forty.setVisibility(View.GONE);
            modeFour.setVisibility(View.GONE);
            modeTwo.setVisibility(View.GONE);
        }
    }

    public void mainAddClick(View v){
        mainLifeTotal++;
        mainLifeTot = mainLifeTotal + "";
        mainLife.setText(mainLifeTot);
    }

    public void oppAddClick(View v){
        oppLifeTotal++;
        oppLifeTot = oppLifeTotal + "";
        oppLife.setText(oppLifeTot);
    }

    public void mainSubtractClick(View v){
        mainLifeTotal--;
        mainLifeTot = mainLifeTotal + "";
        mainLife.setText(mainLifeTot);
    }

    public void oppSubtractClick(View v){
        oppLifeTotal--;
        oppLifeTot = oppLifeTotal + "";
        oppLife.setText(oppLifeTot);
    }

    public void resetTwenty(View v){
        oppLifeTotal = 20;
        mainLifeTotal = 20;
        oppLifeTot = oppLifeTotal + "";
        mainLifeTot = mainLifeTotal + "";
        oppLife.setText(oppLifeTot);
        mainLife.setText(mainLifeTot);
    }

    public void resetThirty(View v){
        oppLifeTotal = 30;
        mainLifeTotal = 30;
        oppLifeTot = oppLifeTotal + "";
        mainLifeTot = mainLifeTotal + "";
        oppLife.setText(oppLifeTot);
        mainLife.setText(mainLifeTot);
    }

    public void resetForty(View v){
        oppLifeTotal = 40;
        mainLifeTotal = 40;
        oppLifeTot = oppLifeTotal + "";
        mainLifeTot = mainLifeTotal + "";
        oppLife.setText(oppLifeTot);
        mainLife.setText(mainLifeTot);
    }

    public void changeMainColor(View v){
        if(mainColorNumber == 0){
            mainColorNumber = 1;
            mainTable.setColorFilter(greenColor);
            mainAddLarge.setColorFilter(greenColor);
            mainSubtractLarge.setColorFilter(greenColor);
        }else if(mainColorNumber == 1){
            mainColorNumber = 2;
            mainTable.setColorFilter(blackColor);
            mainAddLarge.setColorFilter(blackColor);
            mainSubtractLarge.setColorFilter(blackColor);
        }else if(mainColorNumber == 2){
            mainColorNumber = 3;
            mainTable.setColorFilter(blueColor);
            mainAddLarge.setColorFilter(blueColor);
            mainSubtractLarge.setColorFilter(blueColor);
        }else if(mainColorNumber == 3){
            mainColorNumber = 4;
            mainTable.setColorFilter(whiteColor);
            mainAddLarge.setColorFilter(whiteColor);
            mainSubtractLarge.setColorFilter(whiteColor);
        }else if(mainColorNumber == 4){
            mainColorNumber = 0;
            mainTable.setColorFilter(redColor);
            mainAddLarge.setColorFilter(redColor);
            mainSubtractLarge.setColorFilter(redColor);
        }
    }


    public void changeOppColor(View v){
        if(oppColorNumber == 0){
            oppColorNumber = 1;
            oppTable.setColorFilter(greenColor);
            oppSubtractLarge.setColorFilter(greenColor);
            oppAddLarge.setColorFilter(greenColor);
        }else if(oppColorNumber == 1){
            oppColorNumber = 2;
            oppTable.setColorFilter(blackColor);
            oppSubtractLarge.setColorFilter(blackColor);
            oppAddLarge.setColorFilter(blackColor);
        }else if(oppColorNumber == 2){
            oppColorNumber = 3;
            oppTable.setColorFilter(blueColor);
            oppSubtractLarge.setColorFilter(blueColor);
            oppAddLarge.setColorFilter(blueColor);
        }else if(oppColorNumber == 3){
            oppColorNumber = 4;
            oppTable.setColorFilter(whiteColor);
            oppSubtractLarge.setColorFilter(whiteColor);
            oppAddLarge.setColorFilter(whiteColor);
        }else if(oppColorNumber == 4){
            oppColorNumber = 0;
            oppTable.setColorFilter(redColor);
            oppSubtractLarge.setColorFilter(redColor);
            oppAddLarge.setColorFilter(redColor);
        }
    }

    public void changeModeToFour(View v){
        Intent openFour = new Intent(MainActivity.this, FourPlayer.class);
        startActivity(openFour);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLife = (TextView) findViewById(R.id.mainLife);
        oppLife = (TextView) findViewById(R.id.oppLife);
        mainAdd = (ImageButton) findViewById(R.id.mainAdd);
        oppAdd = (ImageButton) findViewById(R.id.oppAdd);
        menu = (ImageButton) findViewById(R.id.menu);
        twenty = (ImageButton) findViewById(R.id.twenty);
        thirty = (ImageButton) findViewById(R.id.thirty);
        forty = (ImageButton) findViewById(R.id.forty);
        twentyText = (TextView) findViewById(R.id.twentyText);
        thirtyText = (TextView) findViewById(R.id.thirtyText);
        fortyText = (TextView) findViewById(R.id.fortyText);

        mainTable = (ImageView) findViewById(R.id.mainTable);
        oppTable = (ImageView) findViewById(R.id.oppTable);

        modeFour = (ImageButton) findViewById(R.id.modeFour);
        modeTwo = (ImageButton) findViewById(R.id.modeTwo);

        mainAddLarge = (ImageView) findViewById(R.id.mainAddLarge);
        mainSubtractLarge = (ImageView) findViewById(R.id.mainSubtractLarge);

        oppAddLarge = (ImageView) findViewById(R.id.oppAddLarge);
        oppSubtractLarge = (ImageView) findViewById(R.id.oppSubtractLarge);
    }
}
