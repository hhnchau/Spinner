package info.kingpes.customspiner;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Chau Huynh on 3/20/2017.
 */

public class Adapter extends BaseAdapter {
    private Context context;
    private List<model> list;


    private LayoutInflater layoutInflater;

    public Adapter(Context context, List<model> list) {
        this.context = context;
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.item, null);
        }

        ImageView img = (ImageView) view.findViewById(R.id.img);
        TextView txt = (TextView) view.findViewById(R.id.txt);

        img.setImageResource(R.drawable.heart);
        if (list.get(position).getImg() == 1) {
            txt.setTextColor(Color.BLUE);
        }else if(list.get(position).getImg() == 2){
            txt.setTextColor(Color.RED);
        }else {
            txt.setTextColor(Color.GREEN);
        }
        txt.setText(list.get(position).getTxt());


        return view;
    }
}
