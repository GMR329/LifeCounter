package gmr.com.magiclife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.content.Intent;

public class FourPlayer extends AppCompatActivity {

    int fMainInt = 20;
    int fOppInt = 20;
    int fLeftInt = 20;
    int fCrossInt = 20;

    String fMainString;
    String fOppString;
    String fLeftString;
    String fCrossString;

    TextView fMainLife;
    TextView fOppLife;
    TextView fLeftLife;
    TextView fCrossLife;

    ImageButton twenty;
    ImageButton thirty;
    ImageButton forty;

    ImageButton modeTwo;
    ImageButton modeFour;

    int menuVisible = -1;

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

    public void resetTwenty(View v){
        fMainInt = 20;
        fOppInt = 20;
        fLeftInt = 20;
        fCrossInt = 20;

        fMainString = fMainInt + "";
        fOppString = fOppInt + "";
        fLeftString = fLeftInt + "";
        fCrossString = fCrossInt + "";

        fMainLife.setText(fMainString);
        fOppLife.setText(fOppString);
        fLeftLife.setText(fLeftString);
        fCrossLife.setText(fCrossString);
    }

    public void resetThirty(View v){
        fMainInt = 30;
        fOppInt = 30;
        fLeftInt = 30;
        fCrossInt = 30;

        fMainString = fMainInt + "";
        fOppString = fOppInt + "";
        fLeftString = fLeftInt + "";
        fCrossString = fCrossInt + "";

        fMainLife.setText(fMainString);
        fOppLife.setText(fOppString);
        fLeftLife.setText(fLeftString);
        fCrossLife.setText(fCrossString);
    }

    public void resetForty(View v){
        fMainInt = 40;
        fOppInt = 40;
        fLeftInt = 40;
        fCrossInt = 40;

        fMainString = fMainInt + "";
        fOppString = fOppInt + "";
        fLeftString = fLeftInt + "";
        fCrossString = fCrossInt + "";

        fMainLife.setText(fMainString);
        fOppLife.setText(fOppString);
        fLeftLife.setText(fLeftString);
        fCrossLife.setText(fCrossString);
    }

    public void changeModeToTwo(View v){
        Intent changeToMain = new Intent(FourPlayer.this, MainActivity.class);
        startActivity(changeToMain);
    }

    public void fMainAddClick(View v){
        fMainInt++;
        fMainString = fMainInt + "";
        fMainLife.setText(fMainString);
    }

    public void fMainSubtractClick(View v){
        fMainInt--;
        fMainString = fMainInt + "";
        fMainLife.setText(fMainString);
    }

    public void fLeftAddClick(View v){
        fLeftInt++;
        fLeftString = fLeftInt + "";
        fLeftLife.setText(fLeftString);
    }

    public void fLeftSubtractClick(View v){
        fLeftInt--;
        fLeftString = fLeftInt + "";
        fLeftLife.setText(fLeftString);
    }

    public void fOppAddClick(View v){
        fOppInt++;
        fOppString = fOppInt + "";
        fOppLife.setText(fOppString);
    }

    public void fOppSubtractClick(View v){
        fOppInt--;
        fOppString = fOppInt + "";
        fOppLife.setText(fOppString);
    }

    public void fCrossAddClick(View v){
        fCrossInt++;
        fCrossString = fCrossInt + "";
        fCrossLife.setText(fCrossString);
    }

    public void fCrossSubtractClick(View v){
        fCrossInt--;
        fCrossString = fCrossInt + "";
        fCrossLife.setText(fCrossString);
    }

    @Override
    public void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.four_player);

        fMainLife = (TextView) findViewById(R.id.fMainLife);
        fOppLife = (TextView) findViewById(R.id.fOppLife);
        fCrossLife = (TextView) findViewById(R.id.fCrossLife);
        fLeftLife = (TextView) findViewById(R.id.fLeftLife);

        twenty = (ImageButton) findViewById(R.id.twenty);
        thirty = (ImageButton) findViewById(R.id.thirty);
        forty = (ImageButton) findViewById(R.id.forty);

        modeTwo = (ImageButton) findViewById(R.id.modeTwo);
        modeFour = (ImageButton) findViewById(R.id.modeFour);
    }
}
