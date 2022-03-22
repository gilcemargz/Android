package android.com.br;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Olá mundo", Toast.LENGTH_LONG).show();
        //TextView aluno = new TextView(this);
        //aluno.setText("Oĺa Gilcemar");
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<String>(Arrays.asList("PB", "é melhor que","Java"));

        ListView viewAlunos = findViewById(R.id.acitivity_main_lista_alunos);

        viewAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos ));


        /*
        TextView al1 = findViewById(R.id.textView);
        TextView al2 = findViewById(R.id.textView2);
        TextView al3 = findViewById(R.id.textView3);

        al1.setText(alunos.get(0));
        al2.setText(alunos.get(1));
        al3.setText(alunos.get(2));*/

    }
}
