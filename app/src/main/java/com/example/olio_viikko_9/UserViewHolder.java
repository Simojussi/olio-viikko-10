package com.example.olio_viikko_9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView userFirstName;
    TextView userLastName;
    TextView userEmail;
    TextView userDegreeProgram;
    TextView userDegrees;

    //ImageView userImage;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        //image = itemView.findViewById(R.id.imageViewUser);
        userFirstName = itemView.findViewById(R.id.tvFirstName);
        userEmail = itemView.findViewById(R.id.tvEmail);
        userDegreeProgram = itemView.findViewById(R.id.tvDegreeProgram);
        userDegrees = itemView.findViewById(R.id.tvDegrees);



    }
}
