package com.ulyssesp.elementtransitions;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by ulysses on 10/13/15.
 */
public class ImageDialogFragment extends DialogFragment {

    ImageView mImageView;

    static ImageDialogFragment newInstance() {
        return new ImageDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_dialog, container, false);

        mImageView = (ImageView) view.findViewById(R.id.image);

        // Use picasso to load an image
        Picasso.with(getContext())
            .load("http://i.imgur.com/DvpvklR.png")
            .into(mImageView);

        // Open the new activity on image click
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchImageActivity(v);
            }
        });

        return view;
    }

    void launchImageActivity(View v) {
        Intent i = new Intent(getContext(), ImageActivity.class);
        ActivityOptionsCompat options =
            ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), v, "image");
        ActivityCompat.startActivity(getActivity(), i, options.toBundle());
    }
}
