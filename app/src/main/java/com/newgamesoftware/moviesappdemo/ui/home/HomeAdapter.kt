package com.newgamesoftware.moviesappdemo.ui.home


import android.view.ViewGroup
import com.newgamesoftware.moviesappdemo.base.view.recyclerView.BaseRecyclerAdapter
import com.newgamesoftware.moviesappdemo.models.Movie


class HomeAdapter: BaseRecyclerAdapter<HomeRecyclerView, HomeCell>() {

    private val movies = ArrayList<Movie>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val cell = HomeCell(parent.context)
        return Holder(cell)
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        val movie = movies[position]

        holder.cell.bindMovie(movie)

        holder.cell.setOnClickListener {
            holder.cell.recyclerView.superView.primaryFragment.onItemMovieClicked(movie)
        }

        if (position == itemCount - 1) {    //last element
            val page = itemCount / 20 + 1
            request?.invoke(page)
        }
    }


    override fun getItemCount(): Int {
        return movies.size
    }


    fun addMovies(newList: ArrayList<Movie>) {
        val oldSize = movies.size

        movies.addAll(newList)
        notifyItemRangeChanged(oldSize, movies.size)
    }
}