package com.saharsaafi.customlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.icu.text.LocaleDisplayNames;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ListView malisteviawperso;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperer liste
        malisteviawperso= findViewById(R.id.listviewperso);

        ArrayList<HashMap<String, String>> listItem= new ArrayList<>();
        HashMap<String, String>map;
        //word
        map=new HashMap<>();
        map.put("titre","word");
        map.put("description","editeur de text");
        map.put("img",String.valueOf(R.drawable.word));
        listItem.add(map);
         SimpleAdapter adapter =new  SimpleAdapter  (this.getBaseContext(), listItem, R.layout.activity_list_item,
                new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter);
        //excel
        map=new HashMap<>();
        map.put("titre","excel");
        map.put("description","tableur");
        map.put("img",String.valueOf(R.drawable.excel));
        listItem.add(map);
        SimpleAdapter adapter2 =new  SimpleAdapter  (this.getBaseContext(), listItem, R.layout.activity_list_item,
                new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter2);

        //power point
        map=new HashMap<>();
        map.put("titre","power point");
        map.put("description","logiciel de presentation");
        map.put("img",String.valueOf(R.drawable.powerpoint));
        listItem.add(map);
        SimpleAdapter adapter3 =new  SimpleAdapter  (this.getBaseContext(), listItem, R.layout.activity_list_item,
                new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter3);

        //outlook
        map=new HashMap<>();
        map.put("titre","outlook");
        map.put("description","client de courrier electronique");
        map.put("img",String.valueOf(R.drawable.outlook));
        listItem.add(map);
        SimpleAdapter adapter4 =new  SimpleAdapter  (this.getBaseContext(), listItem, R.layout.activity_list_item,
                new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
        malisteviawperso.setAdapter(adapter4);


        malisteviawperso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                HashMap<String,String> map = (HashMap<String, String>)malisteviawperso.getItemAtPosition(position);
            }
        });


    }
}
