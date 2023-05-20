package com.example.bottom.ui.cart;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.bottom.CartListAdapter;
import com.example.bottom.R;
import com.example.bottom.databinding.FragmentCartBinding;
import com.example.bottom.ui.home.HomeFragment;

public class CartFragment extends Fragment {

    ListView cartList;

    String[] itemName;

    Integer[] qtyDecrease;

    Integer[] quantity;

    Integer[] qtyIncrease;


    private @NonNull FragmentCartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CartViewModel cartViewModel = new ViewModelProvider(this).get(CartViewModel.class);

        binding = FragmentCartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        CartListAdapter adapter1;
        adapter1 = new CartListAdapter(this.getActivity(),itemName,qtyDecrease,quantity,qtyIncrease);
        cartList=(ListView)root.findViewById(R.id.cartList);
        cartList.setAdapter(adapter1);

       Button btnadditem= root.findViewById(R.id.btn_add_Item);
       Button buttonminus=root.findViewById(R.id.btn_minus);
        TextView txtquantity=root.findViewById(R.id.txt_quantity);
        Button buttonadd=root.findViewById(R.id.btn_add);
       int value=0;


       btnadditem.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Navigation.findNavController(view).navigate(R.id.navigation_home);
           }
       });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}