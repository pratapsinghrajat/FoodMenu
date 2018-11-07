package com.example.rajatpratapsingh.customlistview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyCustomListAdapter extends ArrayAdapter<Hero>
{
    Context mcTx;
    int resource;
    List<Hero> heroList;

    public MyCustomListAdapter(Context mCtx, int resource, List<Hero> heroList)
    {
        super(mCtx,resource,heroList);

        this.mcTx=mCtx;
        this.resource=resource;
        this.heroList=heroList;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(mcTx);
        View view = inflater.inflate(resource,null);


        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewTeam = view.findViewById(R.id.textViewTeam);
        ImageView imageView =view.findViewById(R.id.imageView);

        Hero hero = heroList.get(position);

        textViewName.setText(hero.getName());
        textViewTeam.setText(hero.getTeam());
        imageView.setImageDrawable(mcTx.getResources().getDrawable(hero.getImage()));

        view.findViewById(R.id.buttonDelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            removeItem(position);
            }
        });

        return view;
    }

    private  void  removeItem(int i)
    {
        AlertDialog.Builder builder = new  AlertDialog.Builder(mcTx);
        builder.setTitle("Are you sure to proceed ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
