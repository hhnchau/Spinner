package info.kingpes.customspiner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private List<model> list;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spiner);
        list = new ArrayList<>();
        adapter = new Adapter(this, list);
        spinner.setAdapter(adapter);


        list.add(new model(1, "One"));
        list.add(new model(2, "Two"));
        list.add(new model(3, "Three"));
        list.add(new model(4, "Four"));
        list.add(new model(5, "Five"));

        adapter.notifyDataSetChanged();


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String txt = ((TextView) view.findViewById(R.id.txt)).getText().toString();
                Toast.makeText(MainActivity.this, list.get(position).getTxt() + txt, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
		
		
		
		
//        final String[] plants = new String[]{"Black birch", "Bolean birch", "Canoe birch", "Cherry birch", "European weeping birch"};
//        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, plants);
//        spinnerArrayAdapter.setDropDownViewResource(R.layout.item_spinner);
//        spinner.setAdapter(spinnerArrayAdapter);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(ManageReservation.this, plants[position].toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
		
		
		
		
		
		
		
    }
}
