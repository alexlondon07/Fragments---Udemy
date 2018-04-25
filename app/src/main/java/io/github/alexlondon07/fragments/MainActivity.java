package io.github.alexlondon07.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import io.github.alexlondon07.fragments.Fragments.DataFragment;
import io.github.alexlondon07.fragments.Fragments.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        //Llamar al metodo renderizarText de el DetailsFragment,pasando el texto que recibimos por parametro

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);
    }
}
