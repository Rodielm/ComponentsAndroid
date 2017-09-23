package rmjsoft.scrollviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private ToggleButton mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        mToggle = (ToggleButton) findViewById(R.id.my_toggle_button);
        findViewById(R.id.my_toggle_button_status).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,mToggle.isChecked()? mToggle.getTextOn(): mToggle.getTextOff(),Toast.LENGTH_SHORT).show();
    }

 }

