package com.ulyssesp.elementtransitions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_image);

        mImageView = (ImageView) findViewById(R.id.image);

        supportPostponeEnterTransition();

        // Use picasso to load an image
        Picasso.with(this)
            .load("http://i.imgur.com/DvpvklR.png")
            .into(mImageView, new Callback() {
                @Override
                public void onSuccess() {
                    supportStartPostponedEnterTransition();
                }

                @Override
                public void onError() {

                }
            });
    }
}
