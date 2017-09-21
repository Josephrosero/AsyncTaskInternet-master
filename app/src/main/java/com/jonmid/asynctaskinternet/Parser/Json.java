package com.jonmid.asynctaskinternet.Parser;

import com.jonmid.asynctaskinternet.Models.Comment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 21/09/17.
 */

public class Json {


    //static retornara algo --- Lista de comments
    public  static List <Comment> getData(String content) throws JSONException {

//clase para convertir una cadena en un jason de array   .... añadir exeption
        JSONArray jsonArray = new JSONArray(content);
        List<Comment> commentList = new ArrayList<>();
        //recoorer el array para almacenar en objetos
        for (int i = 0;i<=jsonArray.length();i++){

            //cada coment
            JSONObject item =jsonArray.getJSONObject(i);

            Comment comment = new Comment();

            comment.setId(item.getInt("id"));
            comment.setEmail(item.getString("email"));
            comment.setBody(item.getString("body"));

commentList.add(comment);
        }
return commentList;

    }


}
