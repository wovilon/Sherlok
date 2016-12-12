package wovilon.sherlok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
public final static String THIEF="Not Selected";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onRadioClicj(View v) {
        Intent answerIntent=new Intent();

        switch(v.getId()){
            case R.id.radioVorona:
                answerIntent.putExtra(THIEF,"Ворона");
                break;
            case R.id.radioDog:
                answerIntent.putExtra(THIEF,"Сраный песик");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF,"Кот Васька");
                break;
            default:answerIntent.putExtra(THIEF,"Ничего"); break;}
        setResult(RESULT_OK, answerIntent);
        finish();

    }
}
