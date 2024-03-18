package mdat.animallists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DongVatAdapter extends BaseAdapter {
    private ArrayList<DongVat> dsDongVat;
    private LayoutInflater layoutInflater;
    private Context context;

    public DongVatAdapter(Context context, ArrayList<DongVat> dsDongVat) {
        this.dsDongVat = dsDongVat;
        this.context = context;
        this.layoutInflater = layoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsDongVat.size();
    }

    @Override
    public Object getItem(int i) {
        return dsDongVat.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //View item hiện hành
        View viewHienHanh = view;
        //Kiểm tra
        if(viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_dongvat, null);
        //Lấy dữ liệu
        DongVat dongVatHienTai = dsDongVat.get(i);
        //Gán lên các điều khiển

        //Tìm điều khiển
        TextView textView_TenDongVat = (TextView) viewHienHanh.findViewById(R.id.tvTenDongVat);
        TextView textView_LoaiDongVat = (TextView) viewHienHanh.findViewById(R.id.tvLoaiDongVat);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imgAnh);
        //Set lên
        textView_TenDongVat.setText(dongVatHienTai.getTenDongVat());
        textView_LoaiDongVat.setText(dongVatHienTai.getLoai());
        imageView_Anh.setImageResource(dongVatHienTai.getIdAnh());

        return viewHienHanh;
    }
}
