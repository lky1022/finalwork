package cn.edu.jnu.finalwork;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cn.edu.jnu.finalwork.data.Book;

public class BookDesActivity extends AppCompatActivity {
    private TextView booktitle;
    private TextView bookauthor;
    private ImageView bookcover;
    private TextView bookisbn;
    private TextView bookintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        booktitle = (TextView) findViewById(R.id.bookdestitle);
        bookauthor = (TextView) findViewById(R.id.bookdesauthor);
        bookcover = (ImageView) findViewById(R.id.bookdescover);
        bookisbn = (TextView) findViewById(R.id.bookdesisbn);
        bookintro = (TextView) findViewById(R.id.bookdesjianjie);


        Bundle b = getIntent().getExtras();
        Book book = (Book) b.getSerializable("book");
        booktitle.setText(book.getTitle());
        bookintro.setText(book.getJianjie());
        bookcover.setImageResource(book.getHeadId());
    }
}