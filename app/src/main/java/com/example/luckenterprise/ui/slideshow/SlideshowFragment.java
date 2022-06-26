package com.example.luckenterprise.ui.slideshow;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.luckenterprise.R;
import com.example.luckenterprise.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment implements View.OnClickListener {
    private ImageView um;
    private ImageView dois;
    private ImageView tres;
    private ImageView quatro;
    private ImageView cinco;
    private ImageView seis;
    private MediaPlayer mediaPlayer;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSlideshowBinding.inflate( inflater, container, false );

        mediaPlayer = mediaPlayer.create( getContext(), R.raw.cat );
        View numeroView = inflater.inflate( R.layout.fragment_slideshow, container, false );

        um = numeroView.findViewById( R.id.imageUm );
        dois = numeroView.findViewById( R.id.imageDois );
        tres = numeroView.findViewById( R.id.imageTres );
        quatro = numeroView.findViewById( R.id.imageQuatro );
        cinco = numeroView.findViewById( R.id.imageCinco );
        seis = numeroView.findViewById( R.id.imageSeis );

        um.setOnClickListener( this );
        dois.setOnClickListener( this );
        tres.setOnClickListener( this );
        quatro.setOnClickListener( this );
        cinco.setOnClickListener( this );
        seis.setOnClickListener( this );


        return numeroView;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageUm:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.one );
                mediaPlayer.start();
                break;
            case R.id.imageDois:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.two );
                mediaPlayer.start();
                break;
            case R.id.imageTres:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.three );
                mediaPlayer.start();
                break;
            case R.id.imageQuatro:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.four );
                mediaPlayer.start();
                break;
            case R.id.imageCinco:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.five );
                mediaPlayer.start();
                break;
            case R.id.imageSeis:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.six );
                mediaPlayer.start();
                break;

        }
    }
}



