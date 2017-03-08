package com.padmal.journalist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Padmal on 3/8/17.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.Holder> {

    private List<NewsItem> newsList;

    public NewsAdapter(List<NewsItem> newsList) {
        this.newsList = newsList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent, false);

        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        NewsItem news = newsList.get(position);
        holder.newsHeader.setText(news.getNewsHeader());
        holder.newsBody.setText(news.getNewsBody());
        holder.newsBy.setText(news.getNewsBy());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        public TextView newsHeader, newsBody, newsBy;

        public Holder(View itemView) {
            super(itemView);
            newsHeader = (TextView) itemView.findViewById(R.id.news_header);
            newsBody = (TextView) itemView.findViewById(R.id.news_body);
            newsBy = (TextView) itemView.findViewById(R.id.news_by);
        }
    }
}
