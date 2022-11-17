package cn.edu.jnu.finalwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mianStringSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewMain=findViewById(R.id.recycle_view_books);//have problem

        LinearLayoutManager LinearLayoutManger=new LinearLayoutManager(this);
        LinearLayoutManger.setOrientation(LinearLayoutManger.HORIZONTAL);
        recyclerViewMain.setLayoutManager(LinearLayoutManger);

        mianStringSet =new ArrayList<String>();
        for(int i=1;i<10;++i)
        {
            mianStringSet.add("NO."+i);
        }
        MainRecycleVievAdapter mainRecycleVievAdapter=new MainRecycleVievAdapter(mianStringSet);
        recyclerViewMain.setAdapater(mainRecycleVievAdapter);

    }

    public class MainRecycleViewAdapter extends RecyclerView.Adapter<MainRecycleVievAdapter.ViewHolder>

    private ArrayList<String> localDataSet;

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView textView;

        public ViewHolder(TextView textView) {
            super(view);

            textView=(TextView) itemView.findViewById(R.id.);//lose a definition
        }

        public TextView getTextView(){
            return textView;
        }
    }
}