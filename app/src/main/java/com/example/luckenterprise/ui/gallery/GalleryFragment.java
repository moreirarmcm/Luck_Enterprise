package com.example.luckenterprise.ui.gallery;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.luckenterprise.R;
import com.example.luckenterprise.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment implements View.OnClickListener{
    private ImageView cao;
    private GalleryViewModel galleryViewModel;
    private FragmentGalleryBinding binding;
    private ImageView gato;
    private ImageView ovelha;
    private ImageView vaca;
    private ImageView leao;
    private ImageView macaco;
    private MediaPlayer mediaPlayer;
    private Context context;


    public void Contexto(Context c){
        this.context = c;
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // galleryViewModel = new ViewModelProvider(  this ).get( GalleryViewModel.class );

        binding = FragmentGalleryBinding.inflate( inflater, container, false );
        View animalView = binding.getRoot();
        cao = animalView.findViewById( R.id.imageCao );
        gato = animalView.findViewById( R.id.imageGato );
        vaca = animalView.findViewById( R.id.imageVaca );
        macaco = animalView.findViewById( R.id.imageMacaco );
        leao = animalView.findViewById( R.id.imageLeao );
        ovelha = animalView.findViewById( R.id.imageOvelha );

        animalView.setOnClickListener( this );
        cao.setOnClickListener( this );
        gato.setOnClickListener( this );
        vaca.setOnClickListener( this );
        macaco.setOnClickListener( this );
        leao.setOnClickListener( this );
        ovelha.setOnClickListener( this );

        return animalView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.imageCao:
                mediaPlayer = MediaPlayer.create( getActivity(), R.raw.dog );
                //Toast.makeText( context, "Cachorro", Toast.LENGTH_LONG ).show();
                tocarSom();
                break;
            case R.id.imageGato:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.cat );
                tocarSom();
                break;
            case R.id.imageVaca:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.cow );
                tocarSom();
                break;
            case R.id.imageMacaco:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageLeao:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.lion );
                tocarSom();
                break;
            case R.id.imageOvelha:
                mediaPlayer = MediaPlayer.create( getContext(), R.raw.sheep );
                tocarSom();
                break;
        }
    }
    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener( new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            } );
        }
    }
}