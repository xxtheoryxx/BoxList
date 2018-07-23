package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15055494 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        Box currentItem = boxList.get(position);
        ImageView ivBox = rowView.findViewById(R.id.imageViewBox);
        if (currentItem.getColor() == "blue"){
            ivBox.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getColor() == "orange"){
            ivBox.setImageResource(R.drawable.orange_box);
        }else if (currentItem.getColor() == "brown"){
            ivBox.setImageResource(R.drawable.brown_box);
        }

        return rowView;

    }
}
