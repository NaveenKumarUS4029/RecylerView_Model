package ran.am.recylerviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RCModel> modelArrayList;
    RCAdapter rcAdapter;

    String[] title = new String[]{
            "How to create RecyclerView in Android Studio","How to create Login Page in Android Studio",
            "How to use Java in Android studio", "How to use Kotlin in Android studio",
            "How to use Jetpack Compose in Android studio", "How to use IOT ",
            "How to use DataBinding","Welcome to the Android Studio",

            "How to create RecyclerView in Android Studio","How to create Login Page in Android Studio",
            "How to use Java in Android studio", "How to use Kotlin in Android studio",
            "How to use Jetpack Compose in Android studio", "How to use IOT ",
            "How to use DataBinding","Welcome to the Android Studio",

    };

    int[] image = new int[]{
            R.drawable.alogin,R.drawable.bdisplay,
            R.drawable.c_integration, R.drawable.dflood,
            R.drawable.edate,R.drawable.flist,
            R.drawable.grecycling,R.drawable.hweb,

            R.drawable.alogin,R.drawable.bdisplay,
            R.drawable.c_integration, R.drawable.dflood,
            R.drawable.edate,R.drawable.flist,
            R.drawable.grecycling,R.drawable.hweb,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        modelArrayList = new ArrayList<>();

        rcAdapter = new RCAdapter(this,modelArrayList);
        recyclerView.setAdapter(rcAdapter);

        for (int i = 0; i < title.length; i++) {
            RCModel rcModel = new RCModel(title[i],image[i]);
            modelArrayList.add(rcModel);
        }
        rcAdapter.notifyDataSetChanged();
    }
}