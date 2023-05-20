package com.example.bottom.ui.home;


import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottom.MyListAdapter;
import com.example.bottom.R;
import com.example.bottom.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    ListView list;

    String[] maintitle;

    String[] subtitle;

    Integer[] imgid;

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        maintitle =new String[]{
        "Chicken","Chinese",
        "Gravy","Pani puri",
        "Meals",
        };

        subtitle =new String[]{
                "Chicken kadai Fry","Dim Sum Sweet and Pour",
                "Channa Curry","Pani",
                "Andhra Mini Thali "
        };
        imgid= new Integer[]{
                R.drawable.chicken,
                R.drawable.chinese,
                R.drawable.curry,
                R.drawable.pani,
                R.drawable.thali
        };


        MyListAdapter adapter1=new MyListAdapter (this.getActivity(),maintitle,subtitle,imgid);
        list=(ListView)root.findViewById(R.id.list);
        list.setAdapter(adapter1);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getActivity(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getActivity(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getActivity(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getActivity(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getActivity(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

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