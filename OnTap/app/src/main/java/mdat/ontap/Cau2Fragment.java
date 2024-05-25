package mdat.ontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau2Fragment extends Fragment {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recycleViewData;
    RecyclerView recyclerViewLandScape;

    public Cau2Fragment() {
        // Required empty public constructor
    }

    public static Cau2Fragment newInstance(String param1, String param2) {
        Cau2Fragment fragment = new Cau2Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cau2, container, false);

        recycleViewData = getDataForRecycleView();
        recyclerViewLandScape = view.findViewById(R.id.recyclerLand);

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(view.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        //recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal);

        landScapeAdapter = new LandScapeAdapter(view.getContext(), recycleViewData);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
        return view;
    }

    ArrayList<LandScape> getDataForRecycleView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("music1", "Xuân Thì");
        dsDuLieu.add(landScape1);
        LandScape landScape2 = new LandScape("music2", "Chưa Bao Giờ");
        dsDuLieu.add(landScape2);
        LandScape landScape3 = new LandScape("music3", "Tháng Mấy Em Nhớ Anh");
        dsDuLieu.add(landScape3);

        return dsDuLieu;
    }
}