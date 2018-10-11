package amphibiawebandroid.amphibiaweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button searchButton = (Button) findViewById(R.id.search_button);
        Button treesearchButton = (Button) findViewById(R.id.tree_search_button);
        Button favoritesButton = (Button) findViewById(R.id.favorites_button);
        Button settingsButton = (Button) findViewById(R.id.settings_button);
        Button contactButton = (Button) findViewById(R.id.contact_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSearch = new Intent(home.this, SearchList.class);
                startActivity(toSearch);
            }
        });

    }
}
