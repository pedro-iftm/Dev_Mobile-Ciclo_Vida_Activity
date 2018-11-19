package phs.com.ciclodevidaactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Activity_segunda_tela extends AppCompatActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);
        Log.d("2testeOnCreate", "onCreate segunda tela executado");
        Toast.makeText(this, "onCreate segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("2testeOnDestroy", "onDestroy segunda tela executado");
        Toast.makeText(this, "onDestroy segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onPause() {
        super.onPause();
        Log.d("2testeOnPause", "onPause segunda tela executado");
        Toast.makeText(this, "onPause segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("2testeOnRestart", "onRestart segunda tela executado");
        Toast.makeText(this, "onRestart segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Log.d("2testeOnResume", "onResume segunda tela executado");
        Toast.makeText(this, "onResume segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Log.d("2testeOnSave", "onSaveInstanceState segunda tela executado");
        Toast.makeText(this, "onSaveInstanceState segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onStart() {
        super.onStart();
        Log.d("2testeOnStart", "onStart segunda tela executado");
        Toast.makeText(this, "onStart segunda tela executado", Toast.LENGTH_SHORT).show();
    }

    protected void onStop() {
        super.onStop();
        Log.d("2testeOnStop", "onStop segunda tela executado");
        Toast.makeText(this, "onStop segunda tela executado", Toast.LENGTH_SHORT).show();
    }
}
