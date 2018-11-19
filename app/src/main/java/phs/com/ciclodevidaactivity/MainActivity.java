package phs.com.ciclodevidaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        Log.d("testeOnCreate", "onCreate pimeira tela executado");
        Toast.makeText(this, "onCreate pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Activity_segunda_tela.class);
        startActivity(intent);
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("testeOnDestroy", "onDestroy pimeira tela executado");
        Toast.makeText(this, "onDestroy pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {
        super.onPause();
        Log.d("testeOnPause", "onPause pimeira tela executado");
        Toast.makeText(this, "onPause pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("testeOnRestart", "onRestart pimeira tela executado");
        Toast.makeText(this, "onRestart pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Log.d("testeOnResume", "onResume pimeira tela executado");
        Toast.makeText(this, "onResume pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Log.d("testeOnSave", "onSaveInstanceState pimeira tela executado");
        Toast.makeText(this, "onSaveInstanceState pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {
        super.onStart();
        Log.d("testeOnStart", "onStart pimeira tela executado");
        Toast.makeText(this, "onStart pimeira tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onStop() {
        super.onStop();
        Log.d("testeOnStop", "onStop pimeira tela executado");
        Toast.makeText(this, "onStop pimeira tela executado", Toast.LENGTH_SHORT).show();
    }
}
