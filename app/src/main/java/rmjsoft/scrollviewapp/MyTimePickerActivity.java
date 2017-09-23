package rmjsoft.scrollviewapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MyTimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    private TimePicker mTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_time_picker);


        mTimePicker = (TimePicker) findViewById(R.id.my_time_picker);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            sb.append(mTimePicker.getHour());
        }else{
            //noinspection deprecation
            sb.append(mTimePicker.getCurrentHour());
        }
        sb.append(":");

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            sb.append(mTimePicker.getMinute());
        }else{
            //noinspection deprecation
            sb.append(mTimePicker.getCurrentMinute());
        }
        Toast.makeText(this,sb.toString(),Toast.LENGTH_SHORT).show();
    }
}
