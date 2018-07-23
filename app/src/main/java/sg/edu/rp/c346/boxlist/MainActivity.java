package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBox;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvBox = findViewById(R.id.listViewBox);

        alBox = new ArrayList<>();

        alBox.add(new Box("blue"));
        alBox.add(new Box("orange"));
        alBox.add(new Box("brown"));

        caBox = new CustomAdapter(this,R.layout.box_row, alBox);

        lvBox.setAdapter(caBox);
    }
}
