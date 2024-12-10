package br.com.faculdade.my_trainning;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BoxAdapter adapter;
    private ArrayList<ItemData> dataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);
        dataArrayList = new ArrayList<>();


        int[] imageList = {
                R.drawable.peito,
                R.drawable.costas,
                R.drawable.perna,
                R.drawable.ombro,
                R.drawable.corrida
        };
        String[] nameList = {
                "Peito e Tríceps",
                "Costa e Bíceps",
                "Perna",
                "Ombro",
                "Aeróbico"
        };
        String[] descList = {
                getString(R.string.peito_Triceps),
                getString(R.string.costas_biceps),
                getString(R.string.super_Pernas),
                getString(R.string.treino_ombro),
                getString(R.string.treino_aerobico)
        };
        String recommendation = getString(R.string.recomendação);

        for (int i = 0; i < nameList.length; i++) {
            dataArrayList.add(new ItemData(nameList[i], descList[i], imageList[i]));
        }


        adapter = new BoxAdapter(this, dataArrayList, item -> {
            // Abrir a atividade de detalhes
            Intent intent = new Intent(Home.this, DetailActivity.class);
            intent.putExtra("name", item.getName());
            intent.putExtra("description", item.getDescription());
            intent.putExtra("image", item.getImageResource());
            intent.putExtra("recommendation", recommendation);
            startActivity(intent);
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
