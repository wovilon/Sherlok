package wovilon.sherlok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
static final private int CHOOSE_THIEF=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtChoiceClick(View v) {
        Intent questionIntent=new Intent(MainActivity.this, Main2Activity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoTextView=(TextView)findViewById(R.id.textViewInfo);

        if (requestCode==CHOOSE_THIEF){
            if(resultCode==RESULT_OK){
                String thiefname=data.getStringExtra(Main2Activity.THIEF);
                infoTextView.setText(thiefname);}
            else {infoTextView.setText("");}
        }

    }
}
