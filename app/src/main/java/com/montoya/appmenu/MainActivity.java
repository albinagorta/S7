package com.montoya.appmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txvM;
    private  static  final  int opc01=1,opc02=2,opc03=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvM=findViewById(R.id.txvM);

        registerForContextMenu(txvM);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu01,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opc01:
                txvM.setText("Seleccionó la Opción 01 del Sub-Menu ");
                return  true;
            case R.id.opc02:
                txvM.setText("Seleccionó la Opción 02 del Sub-Menu ");
                return  true;
            case R.id.opc03:
                txvM.setText("Seleccionó la Opción 03 del Sub-Menu ");
                return  true;
            default:
                return super.onContextItemSelected(item);
    }
    /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
          getMenuInflater().inflate(R.menu.sub_menu,menu);
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       //getMenuInflater().inflate(R.menu.menu01,menu);
        menu.add(Menu.NONE, opc01, Menu.NONE, "OPCIÓN 1");
        menu.add(Menu.NONE, opc02, Menu.NONE, "OPCIÓN 2");
        menu.add(Menu.NONE, opc03, Menu.NONE, "OPCIÓN 3");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case opc01: txvM.setText("Opción 1 seleccionada");
               return true;
           case  opc02: txvM.setText("Opción 2 seleccionada"); return true;
           case  opc03: txvM.setText("Opción 3 seleccionada"); return  true;
           default:
               return super.onOptionsItemSelected(item);
       }*/

    }
}