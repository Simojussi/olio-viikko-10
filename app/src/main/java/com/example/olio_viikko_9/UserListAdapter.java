package com.example.olio_viikko_9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_list_iew, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userFirstName.setText(users.get(position).getLastName() + " " + users.get(position).getFirstName());
        holder.userEmail.setText(users.get(position).getEmail());
        holder.userDegreeProgram.setText(users.get(position).getDegreeProgram());
        ArrayList<String> d = users.get(position).getDegrees();
        for (String degree : d) {
            holder.userDegrees.setText(d + ", ");
        }


        //holder.userImage.setImageResource(users.get(position).getImage());


    }

    @Override
    public int getItemCount() {

        return users.size();
    }
}
