package cn.edu.jnu.finalwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int MEUN_ID_ADD = 1;
    public static final int MEUN_ID_UPDATE = 2;
    public static final int MEUN_ID_DELETE = 3;
    private ArrayList<String> mianStringSet;
    private Object LayoutInflater;

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

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case MEUN_ID_ADD:
                break;
            case MEUN_ID_UPDATE:
                break;
            case MEUN_ID_DELETE;
            break;
        }
        return super.onContextItemSelected(item);
    }

    public class MainRecycleViewAdapter extends RecyclerView.Adapter<MainRecycleVievAdapter.ViewHolder>

    private ArrayList<String> localDataSet;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {
        private final TextView textView;
        private final ImageView imageViewImage;

        public ViewHolder(TextView textView) {
            super(view);

            textView=(TextView) itemView.findViewById(R.id.);//lose a definition
            imageViewImage= textView.findViewById(R.id.book_cover);

            itemView.setOnCreateContextMenuListener(this);
        }

        public TextView getTextView(){
            return textView;
        }

        public ImageView getImageViewImage() {
            return imageViewImage;
        }

        @Override
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0,MEUN_ID_ADD,getAdapterPosition(),"Add"+getAdapterPosition());
            contextMenu.add(0,MEUN_ID_UPDATE,getAdapterPosition(),"Update"+getAdapterPosition());
            contextMenu.add(0,MEUN_ID_DELETE,getAdapterPosition(),"Delete"+getAdapterPosition());
        }
    }

    public MainRecycleViewAdapter(ArrayList<String> dataSet){
        localDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreatViewHolder(@NonNull ViewGroup viewGroup, int viewtype){
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.id.recycle_view_books,viewGroup,attachToRoot: false);

        return new VeiwHolder(view);
    }

    @Override
    public  void onBindViewHorder(RecyclerView ViewHolder,final int position){

       viewHorder.getTextView().setText(localDataSet.get(position));
       ViewHolder().getImageViewImage().setImageResource();
    }

    @Override
    public int getItemCount(){
        return localDataSet.size();
    }
}