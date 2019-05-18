package com.example.latihan3prauts.fragment;
///16-05-2019/10116329/RakaGunturAlviansyah/IF-8

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan3prauts.R;
import com.example.latihan3prauts.adapter.GalleryAdapter;
import com.example.latihan3prauts.model.GalleryModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    RecyclerView recycle;
    GalleryModel[] images;
    NestedScrollView scroll;

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);


        recycle = (RecyclerView) root.findViewById(R.id.recyclerview);
        scroll = (NestedScrollView) root.findViewById(R.id.gallery_scrollbar);
        GridLayoutManager layout = new GridLayoutManager(getActivity(), 2) {
            @Override
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        recycle.setNestedScrollingEnabled(false);
        recycle.setLayoutManager(layout);

        GalleryModel gal1 = new GalleryModel(
                R.drawable.galeri1,
                "Relief Tebing",
                "Bandung");
        GalleryModel gal2 = new GalleryModel(
                R.drawable.galeri2,
                "Konsep Kolam",
                "Bandung");
        GalleryModel gal3 = new GalleryModel(
                R.drawable.galeri3,
                "Konsep Hutan",
                "Bandung");
        GalleryModel gal4 = new GalleryModel(
                R.drawable.galeri4,
                "Vertikal Garden",
                "Bandung");


        images = new GalleryModel[]{gal1, gal2, gal3, gal4};
        GalleryAdapter myAdapter = new GalleryAdapter(getActivity(), images);
        recycle.setAdapter(myAdapter);

        return root;
    }

}
