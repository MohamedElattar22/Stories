package com.example.stories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView postsRecycler ;
    postsAdapter adapter ;
    List<postData>postsList;
    RecyclerView rv;
    storiesAdapter AStoryadapter;
    List<sroriesDataClass>storylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rvStories);
        createStories();
        AStoryadapter = new storiesAdapter(storylist);
        rv.setAdapter(AStoryadapter);
        postsRecycler = findViewById(R.id.rv_posts);
        createPostsList();
        adapter = new postsAdapter(postsList);
        postsRecycler.setAdapter(adapter);
    }
    void createStories(){
        storylist = new ArrayList<>();
        for (int i = 0 ; i < 100;i++){
            storylist.add(new sroriesDataClass(R.drawable.asffa,R.drawable.story1));
        }
    }
    void createPostsList (){
        postsList = new ArrayList<>();
        for (int i = 0 ; i<100;i++){
            postsList.add(new postData("LinkedIn","12,378 Followers !","Let's create better world !",R.drawable.sa,R.drawable.images));
        }
}
}