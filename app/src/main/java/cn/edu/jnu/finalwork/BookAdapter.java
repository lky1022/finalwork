package cn.edu.jnu.finalwork;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jnu.finalwork.base.BookJson;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    public static final int MENU_ID_1 = 1;
    public static final int MENU_ID_2 = 2;
    private ArrayList<BookJson.ResultBean.DataBean> BookList=new ArrayList<BookJson.ResultBean.DataBean>();

    private OnItemClickListener mOnItemClickListener;//声明点击时间对象名称

    //设置点击时间对象
    public void setmOnItemClickListener(OnItemClickListener listener){
        this.mOnItemClickListener=listener;
    }

    public BookAdapter(ArrayList<BookJson.ResultBean.DataBean> bookList) {
        this.BookList = bookList;
    }



    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_linear_item,parent,false);
        BookViewHolder myViewHolder=new BookViewHolder(itemview);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.BookViewHolder holder, int position) {
        BookJson.ResultBean.DataBean book=BookList.get(position);
        holder.booktitle.setText(book.getTitle());
        Glide.with(holder.itemView).load(book.getImg()).into(holder.bookcover);
        holder.sub.setText(book.getCatalog());
    }

    @Override
    public int getItemCount() {
        return BookList.size();
    }
    public interface OnItemClickListener{//定义点击事件回调接口
        void onItemClick(View view,int position);
    }
    class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView bookcover;
        TextView booktitle;
        TextView sub;

        public BookViewHolder(View itemview){
            super(itemview);
            itemview.setOnClickListener(this);
            this.bookcover=itemview.findViewById(R.id.image_view_book_cover);
            this.booktitle=itemview.findViewById(R.id.text_view_book_title);
            this.sub=itemview.findViewById((R.id.text_view_book_jianjie));
        }

        @Override
        public void onClick(View view) {
            if(mOnItemClickListener!=null){
                mOnItemClickListener.onItemClick(view,getAdapterPosition());

            }
        }

    }

}