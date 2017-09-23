package rmjsoft.scrollviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        findViewById(R.id.my_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.my_edit_text);
                editText.getText().toString();
                Toast.makeText(EditTextActivity.this,editText.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
