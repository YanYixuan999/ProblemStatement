package sg.edu.rp.c346.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvDeatil;
    private ImageView imageView;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);

        holidays = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvDeatil = rowView.findViewById(R.id.tvDetail);
        imageView = rowView.findViewById(R.id.imageView);

        Holiday holiday = holidays.get(position);

        tvDeatil.setText(holiday.getName() + " " +holiday.getDay() + " " +holiday.getMonth() +" " +holiday.getYear());

        if (holiday.getName() == "New Year's Day"){
            imageView.setImageResource(R.drawable.newyear);
        }else{
            imageView.setImageResource(R.drawable.labour);
        }

        return rowView;
    }
}
