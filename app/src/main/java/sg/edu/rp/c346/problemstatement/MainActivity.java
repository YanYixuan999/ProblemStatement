package sg.edu.rp.c346.problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> holidayType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = this.findViewById(R.id.lv);

        holidayType = new ArrayList<String>();
        holidayType.add(new String("Secular"));

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, holidayType);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String type = holidayType.get(position);

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("type",type);

                startActivity(i);
            }
        });
    }
}
