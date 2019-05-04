package com.example.mcqbank.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mcqbank.R;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {

    Context context;
    private int[] subjectImages;
    private String[] subjectNames;

    public SubjectAdapter(Context context, int[] subjectImages, String[] subjectNames) {
        this.context = context;
        this.subjectImages = subjectImages;
        this.subjectNames = subjectNames;
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.subject_recycler_layout,viewGroup,false);

        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder subjectViewHolder, int position) {
        subjectViewHolder.imageViewSubject.setImageResource(subjectImages[position]);
        subjectViewHolder.textViewSubject.setText(subjectNames[position]);

    }

    @Override
    public int getItemCount() {
        return subjectImages.length;
    }

    public class SubjectViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewSubject;
        TextView textViewSubject;

        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSubject = itemView.findViewById(R.id.subjectImageViewId);
            textViewSubject = itemView.findViewById(R.id.subjectNameId);
        }
    }
}
