package com.jonmid.asynctaskinternet.Adapter;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.asynctaskinternet.Models.Comment;
import com.jonmid.asynctaskinternet.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 21/09/17.
 */

public class CommentasAdapter  extends  RecyclerView.Adapter<CommentasAdapter.ViewHolder> {

    //servira para manejar el pojo de comment sirve para inyectar una vista dentro de componente.

    List <Comment> commentList = new ArrayList<>();

    Context context; //generate contructor de los 2 items, lleva el mismo nombre de la clase es el contructor

    public CommentasAdapter(List<Comment> commentList, Context context) {
        this.commentList = commentList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //traer el archivo
        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        //Pasar los componentes del archivo (item.xmkl ) para hacer referencia de ellos

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // encargado de trabajr los componenetes del item.xml

        holder.textViewEmail.setText(commentList.get(position).getEmail());
        holder.textViewBody.setText(commentList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    // toda clase adapte necesita un vie holder
    // holder perimite hacer refrencia a los componentes. (item.xml)

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        //
        ImageView imageView;
        TextView textViewEmail;
        TextView textViewBody;




        public ViewHolder(View item ){
            super(item);
            imageView = (ImageView) item.findViewById(R.id.img_person);
            textViewEmail = (TextView) item.findViewById(R.id.tv_1);
            textViewBody = (TextView)item.findViewById(R.id.tv_2);

        }
    }
}
