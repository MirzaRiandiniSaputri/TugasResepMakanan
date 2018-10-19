package com.example.asus.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.LinkedList;
import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.WordViewHolder>  {

    public List<Menu> menuList;
    public Context ctx;

    //private final LinkedList<ImageView> mWordListImage;
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mWordListDetail;
    private final LinkedList<String> mWordListIngredients;
    private final LinkedList<String> mWordListProcess;
    private LayoutInflater mInflater;



    public RecyclerviewAdapter(Context context, LinkedList<String> wordList, LinkedList<String> wordListDetail, LinkedList<String> wordListIngredients, LinkedList<String> wordListProcess) {

        mInflater = LayoutInflater.from(context);

        this.mWordList = wordList;
        this.mWordListDetail = wordListDetail;
        this.mWordListIngredients = wordListIngredients;
        this.mWordListProcess = wordListProcess;
    }




    @NonNull
    @Override
    public RecyclerviewAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.row_layout, parent, false);
        return new WordViewHolder(mItemView, this);
    }


    @NonNull
    @Override
    public void onBindViewHolder(RecyclerviewAdapter.WordViewHolder holder, int position)
    {

        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
        String mCurrent2 = mWordListDetail.get(position);
        holder.wordItemDetailView.setText(mCurrent2);
    //    Menu menu = menuList.get(position);
      //  Glide.with(ctx).load(menu.getPhotoPic()).apply(RequestOptions.circleCropTransform().circleCrop()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView wordItemView;
        public final TextView wordItemDetailView;
       public final ImageView image;
        final RecyclerviewAdapter mAdapter;
        public WordViewHolder(View itemView, RecyclerviewAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.txtNama);
            wordItemDetailView = itemView.findViewById(R.id.txtDes);
          image =  itemView.findViewById(R.id.imgView);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
         //  Integer image1 = Image.get(mPosition);
            // Use that to access the affected item in mWordList.
            String element3 =  mWordList.get(mPosition);
            String element = mWordListIngredients.get(mPosition);
            String element2 = mWordListProcess.get(mPosition);
            Intent intent = new Intent(v.getContext(), Main2Activity.class);
          //  intent.putExtra("Image",image1);
            intent.putExtra("nama",element3);
            intent.putExtra("Ingredients", element);
            intent.putExtra("Process", element2);
            v.getContext().startActivity(intent);
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged();
        }
    }
}
