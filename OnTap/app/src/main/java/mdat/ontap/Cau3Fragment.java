package mdat.ontap;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {
    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
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
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);

        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLHamster.db", Context.MODE_PRIVATE, null);

//        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Hamsters";
//
//        String sqlTaoBangHamsters = "CREATE TABLE Hamsters( HamsterID integer PRIMARY KEY, " +
//                                                            "HamsterName text);";
//
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBangHamsters);
//
//        String sqlThem1 = "INSERT INTO Hamsters VALUES(1, 'Hamster Bear');";
//        String sqlThem2 = "INSERT INTO Hamsters VALUES(2, 'Hamster WinterWhite');";
//        String sqlThem3 = "INSERT INTO Hamsters VALUES(3, 'Hamster Campell')";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//
//        db.close();

        String sqlSelect = "Select * From Hamsters";
        Cursor cs = db.rawQuery(sqlSelect, null);
        cs.moveToFirst();

        ArrayList<Hamster> dsHamster = new ArrayList<Hamster>();
        while(cs.moveToNext()){
            int idHamster = cs.getInt(0);
            String nameHamster = cs.getString(1);

            Hamster h = new Hamster(idHamster, nameHamster);
            dsHamster.add(h);
        }

        ArrayList<String> dsTenHamster = new ArrayList<>();
        for(int i=0; i<dsHamster.size(); i++)
            dsTenHamster.add(dsHamster.get(i).getHamsterName());

        ListView listViewHamsterName = view.findViewById(R.id.lvHamsterName);
        ArrayAdapter<String> adapterHamsterName = new ArrayAdapter<>(
          getContext(),
          android.R.layout.simple_list_item_1,
          dsTenHamster
        );
        listViewHamsterName.setAdapter(adapterHamsterName);

        return view;
    }
}