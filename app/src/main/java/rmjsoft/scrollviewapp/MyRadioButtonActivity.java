package rmjsoft.scrollviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MyRadioButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton mRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_button);

        mRadioButton = (RadioButton) findViewById(R.id.my_radio_button);
        findViewById(R.id.my_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"RadioButton was " + (mRadioButton.isChecked() ? "checked": "not Checked"),
        Toast.LENGTH_SHORT).show();
        mRadioButton.setChecked(false);
    }
}
