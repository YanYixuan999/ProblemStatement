package sg.edu.rp.c346.problemstatement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView tvType;
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        tvType = this.findViewById(R.id.tvType);
        lv = this.findViewById(R.id.lvHoliday);

        Intent i = getIntent();
        String name = i.getStringExtra("type");
        tvType.setText(name);

        holidays = new ArrayList<Holiday>();
        holidays.add(new Holiday("New Year's Day",1,"Jan",2017));
        holidays.add(new Holiday("Labour Day",1,"May",2017));

        aa = new HolidayAdapter(this,R.layout.row, holidays);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holidays.get(position);

                Toast.makeText(SecondActivity.this, selectedHoliday.getName()
                                + " Date: " + selectedHoliday.getDay() + " " +selectedHoliday.getMonth()+" "+selectedHoliday.getYear(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

}
