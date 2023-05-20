package com.example.bottom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CartListAdapter extends ArrayAdapter<String> {
    private Activity context;

    private String[] itemName;

    private Integer[] qtyDecrease;

    private Integer[] quantity;

    private Integer[] qtyIncrease;

    public CartListAdapter(Activity context,String[] itemName, Integer[] qtyDecrease, Integer[] quantity, Integer[] qtyIncrease) {
        super(context, R.layout.cartlist);


        this.context=context;
        this.itemName=itemName;
        this.qtyDecrease=qtyDecrease;
        this.quantity=quantity;
        this.qtyIncrease=qtyIncrease;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.cartlist, null,true);

        EditText titleName = (EditText) rowView.findViewById(R.id.itemName);
        Button decrease = (Button) rowView.findViewById(R.id.btn_minus);
        TextView totalItem = (TextView) rowView.findViewById(R.id.txt_quantity);
        Button increase = (Button) rowView.findViewById(R.id.btn_add);


        titleName.setText(itemName[position]);
        decrease.setText(qtyDecrease[position]);
        totalItem.setText(quantity[position]);
        increase.setText(qtyIncrease[position]);

        return rowView;

    };
}
