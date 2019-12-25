package com.cesebe.csbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.cesebe.csbank.R.id.girisyaptw;
import static com.cesebe.csbank.R.id.kullaniciaditw;

public class MainActivity extends AppCompatActivity {
ImageView logo;
TextView  girisyap;
TextView kullaniciadi;
TextView parola;

EditText kullaniciadi_et;
EditText parola_et;

SharedPreferences sharedPreferences;

int counter = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo = findViewById(R.id.logomain);
        girisyap = findViewById(R.id.girisyaptw);
        kullaniciadi = findViewById(R.id.kullaniciaditw);
        parola = findViewById(R.id.parolatw);

        kullaniciadi_et = findViewById(R.id.kullaniciadiet);
        parola_et = findViewById(R.id.parolaet);

        sharedPreferences = this.getSharedPreferences("com.cesebe.csbank", Context.MODE_PRIVATE);

        String StoredUN = sharedPreferences.getString("kadistored","NaN");
        int StoredPass = sharedPreferences.getInt("parolastored",0);
        girisyap.setText(StoredUN);


    }

    public void click(View view){
        String userName = kullaniciadi_et.getText().toString();

        sharedPreferences.edit().putString("kadistored","csb").apply();
        sharedPreferences.edit().putInt("parolastored",2727).apply();
    }
}
