package rmjsoft.scrollviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MyAutoCompleteTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_auto_complete_text_view);

        String[] items = {"Gato","Perro","Caballo","Aguila"};

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTv);

        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item, items);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        if(getIntent().hasExtra("text")) {
            String texto = getIntent().getStringExtra("text");
            autoCompleteTextView.setHint(texto);
            getSupportActionBar().setTitle(texto);
            if(getIntent().hasExtra("myBundle")){
                Bundle bundle = getIntent().getBundleExtra("myBundle");
                bundle.getString("string_in_bundle");

                String stringInBundle = bundle.getString("string_in_bundle");
                String appName = bundle.getString("app_name");
            }
        }
    }
}
