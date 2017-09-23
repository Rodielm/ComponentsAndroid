package rmjsoft.scrollviewapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

//private String[] actions = {"OK","Cancel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button btn = (Button) findViewById(R.id.my_button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog alert = new AlertDialog.Builder(this)
                .setTitle("Tu dialogo")
                .setMessage("klk papa me abriste")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ButtonActivity.this,"Positive Message",Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ButtonActivity.this,"Negative Message",Toast.LENGTH_LONG).show();
                    }
                }).setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ButtonActivity.this,"Neutral Message",Toast.LENGTH_LONG).show();
                    }
                }).create();
        alert.show();
    }
}
