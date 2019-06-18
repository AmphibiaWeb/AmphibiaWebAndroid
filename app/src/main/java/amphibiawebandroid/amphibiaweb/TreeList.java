package amphibiawebandroid.amphibiaweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class TreeList extends AppCompatActivity {
    GridView androidGridView;

    String[] gridViewString = {
            "Anura", "Caudata", "Gymnophiona"

    } ;
    int[] gridViewImageId = {
           R.drawable.anura, R.drawable.causata, R.drawable.gymnophiona

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_list);
        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(TreeList.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int i, long id) {
                Toast.makeText(TreeList.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
