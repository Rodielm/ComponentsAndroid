package rmjsoft.scrollviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MyDatePickerActivity extends AppCompatActivity implements View.OnClickListener{

    private DatePicker mDatePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_date_picker);

        mDatePicker = (DatePicker) findViewById(R.id.my_date_picker);
        findViewById(R.id.my_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(mDatePicker.getDayOfMonth());
        sb.append("/");
        sb.append(mDatePicker.getMonth());
        sb.append("/");
        sb.append(mDatePicker.getYear());
        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();
    }
}
