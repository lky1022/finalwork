package cn.edu.jnu.finalwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cn.edu.jnu.finalwork.data.book;

public class MainActivity extends AppCompatActivity {

    public static final int MEUN_ID_ADD = 1;
    public static final int MEUN_ID_UPDATE = 2;
    public static final int MEUN_ID_DELETE = 3;
    private ArrayList<cn.edu.jnu.finalwork.data.book> book;
    private Object LayoutInflater;
    private MainRecycleVievAdapter mainRecycleVievAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewMain=findViewById(R.id.recycle_view_books);//have problem

        LinearLayoutManager LinearLayoutManger=new LinearLayoutManager(this);
        LinearLayoutManger.setOrientation(LinearLayoutManger.HORIZONTAL);
        recyclerViewMain.setLayoutManager(LinearLayoutManger);

        book = new ArrayList<>();
        for(int i=1;i<10;++i)
        {
            book.add(new book(R.drawable.textph,"longzhu","xuanhuansiaos" ));
        }
         mainRecycleVievAdapter= new MainRecycleVievAdapter(book);
        recyclerViewMain.setAdapater(mainRecycleVievAdapter);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case MEUN_ID_ADD:
                book.add(item.getItemId(),new book(R.drawable.textph,"longzhu","xioashou"));
                mainRecycleVievAdapter.notifyItemInserted(item.getOrder());
                break;
            case MEUN_ID_UPDATE:
                book.get(item.getOrder()).setBook_title("niu");
                mainRecycleVievAdapter.notifyItemInserted(item.getOrder());
                break;
            case MEUN_ID_DELETE:
                AlertDialog alertDialog= new AlertDialog.Builder(this)
                        .setTitle(R.string.string_confirmation)
                        .setMessage(R.string.string_sure_to_delete)
                        .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).setPositiveButton(R.string.yesup, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                               book.remove(item.getOrder());
                               mainRecycleVievAdapter.notifyItemInserted(item.getOrder());
                            }
                        }).create();
                alertDialog.show();

            break;
        }
        return super.onContextItemSelected(item);
    }

    public class MainRecycleViewAdapter extends RecyclerView.Adapter<MainRecycleVievAdapter.ViewHolder>

    private ArrayList<String> localDataSet;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {

        public TextView getTextViewjianjie() {
            return textViewjianjie;
        }

        private final TextView textViewTitel;
        private final TextView textViewjianjie;
        private final ImageView imageViewImage;

        public ViewHolder(TextView textView) {
            super(textView);

            textViewTitel=textView.findViewById(R.id.book_title);
            textViewjianjie= textView.findViewById(R.id.book_jianjie);
            imageViewImage= textView.findViewById(R.id.book_cover);

            itemView.setOnCreateContextMenuListener(this);
        }

        public TextView getTextViewTitel(){
            return textViewTitel ;
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
       View view= LayoutInflater.form(viewGroup.getContext())
               .inflate(R.id.recycle_view_books,viewGroup,false);

        return new VeiwHolder(view);
    }

    @Override
    public  void onBindViewHorder(RecyclerView ViewHolder,final int position){

       viewHorder.gettextViewTitel().setText(localDataSet.get(position).getTitle);
       ViewHolder().getImageViewImage().setImageResource(localDataSet.get(position).getResourceId());
       viewHorder.gettextViewjianjie().setText(localDataSet.get(position).getjianjie());
    }

    @Override
    public int getItemCount(){
        return localDataSet.size();
    }
}