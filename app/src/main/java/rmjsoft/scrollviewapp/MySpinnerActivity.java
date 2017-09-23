package rmjsoft.scrollviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MySpinnerActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner mSpinner;
    private String[] items = {"Gato","Perro","Caballo","Aguila"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);

        mSpinner = (Spinner) findViewById(R.id.my_spinner);
        findViewById(R.id.my_button).setOnClickListener(this);

        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (this,android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }
}
