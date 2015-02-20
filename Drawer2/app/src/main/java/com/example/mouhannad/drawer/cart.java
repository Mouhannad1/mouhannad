package com.example.mouhannad.drawer;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Mouhannad on 21/12/2014.
 */
public class cart extends Fragment {
    View rootview;
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.cart, container, false);

        button = (Button) rootview.findViewById(R.id.check);




        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

           Intent intent = new Intent(cart.this.getActivity(), checkOut.class);

               cart.this.getActivity().startActivity(intent);


            }
        });
        return rootview;



    }
}
