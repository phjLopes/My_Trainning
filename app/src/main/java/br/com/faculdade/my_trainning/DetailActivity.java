package br.com.faculdade.my_trainning;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.detailImage);
        TextView nameView = findViewById(R.id.detailName);
        TextView descriptionView = findViewById(R.id.detailDescription);
        TextView recommendationView = findViewById(R.id.recommendation);


        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int imageRes = getIntent().getIntExtra("image", 0);
        String recommendation = getIntent().getStringExtra("recommendation");


        nameView.setText(name);
        descriptionView.setText(description);
        imageView.setImageResource(imageRes);
        recommendationView.setText(recommendation);
    }
}
