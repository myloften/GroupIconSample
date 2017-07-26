package com.loften.groupiconsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.loften.groupiconsample.groupimageview.NineGridImageView;
import com.loften.groupiconsample.groupimageview.NineGridImageViewAdapter;
import com.loften.groupiconsample.utils.CircleImageTransformation;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NineGridImageView groudIcon1,groudIcon2,groudIcon3,groudIcon4,groudIcon5,groudIcon6,groudIcon7,groudIcon8,groudIcon9;
    private List<String> mPostList1,mPostList2,mPostList3,mPostList4,mPostList5,mPostList6,mPostList7,mPostList8,mPostList9;
    private String[] IMG_URL_LIST = {
            "https://pic4.zhimg.com/02685b7a5f2d8cbf74e1fd1ae61d563b_xll.jpg",
            "https://pic4.zhimg.com/fc04224598878080115ba387846eabc3_xll.jpg",
            "https://pic3.zhimg.com/d1750bd47b514ad62af9497bbe5bb17e_xll.jpg",
            "https://pic4.zhimg.com/da52c865cb6a472c3624a78490d9a3b7_xll.jpg",
            "https://pic3.zhimg.com/0c149770fc2e16f4a89e6fc479272946_xll.jpg",
            "https://pic1.zhimg.com/76903410e4831571e19a10f39717988c_xll.png",
            "https://pic3.zhimg.com/33c6cf59163b3f17ca0c091a5c0d9272_xll.jpg",
            "https://pic4.zhimg.com/52e093cbf96fd0d027136baf9b5cdcb3_xll.png",
            "https://pic3.zhimg.com/f6dc1c1cecd7ba8f4c61c7c31847773e_xll.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groudIcon1 = (NineGridImageView)findViewById(R.id.groudIcon1);
        groudIcon2 = (NineGridImageView)findViewById(R.id.groudIcon2);
        groudIcon3 = (NineGridImageView)findViewById(R.id.groudIcon3);
        groudIcon4 = (NineGridImageView)findViewById(R.id.groudIcon4);
        groudIcon5 = (NineGridImageView)findViewById(R.id.groudIcon5);
        groudIcon6 = (NineGridImageView)findViewById(R.id.groudIcon6);
        groudIcon7 = (NineGridImageView)findViewById(R.id.groudIcon7);
        groudIcon8 = (NineGridImageView)findViewById(R.id.groudIcon8);
        groudIcon9 = (NineGridImageView)findViewById(R.id.groudIcon9);


        mPostList1 = new ArrayList<>();
        mPostList2 = new ArrayList<>();
        mPostList3 = new ArrayList<>();
        mPostList4 = new ArrayList<>();
        mPostList5 = new ArrayList<>();
        mPostList6 = new ArrayList<>();
        mPostList7 = new ArrayList<>();
        mPostList8 = new ArrayList<>();
        mPostList9 = new ArrayList<>();

        for(int i=0;i<1;i++){
            mPostList1.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<2;i++){
            mPostList2.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<3;i++){
            mPostList3.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<4;i++){
            mPostList4.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<5;i++){
            mPostList5.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<6;i++){
            mPostList6.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<7;i++){
            mPostList7.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<8;i++){
            mPostList8.add(IMG_URL_LIST[i]);
        }
        for(int i=0;i<9;i++){
            mPostList9.add(IMG_URL_LIST[i]);
        }


        NineGridImageViewAdapter<String> mAdapter = new NineGridImageViewAdapter<String>() {
            @Override
            protected void onDisplayImage(Context context, ImageView imageView, String s) {
                //显示图片
                Picasso.with(context).load(s).placeholder(R.mipmap.ic_holding).error(R.mipmap.ic_error).into(imageView);
                //显示圆形图片
                //Picasso.with(context).load(s).transform(new CircleImageTransformation()).placeholder(R.mipmap.ic_holding).error(R.mipmap.ic_error).into(imageView);
            }

            @Override
            protected ImageView generateImageView(Context context) {
                return super.generateImageView(context);
            }
        };
        groudIcon1.setAdapter(mAdapter);
        groudIcon1.setImagesData(mPostList1);

        groudIcon2.setAdapter(mAdapter);
        groudIcon2.setImagesData(mPostList2);

        groudIcon3.setAdapter(mAdapter);
        groudIcon3.setImagesData(mPostList3);

        groudIcon4.setAdapter(mAdapter);
        groudIcon4.setImagesData(mPostList4);

        groudIcon5.setAdapter(mAdapter);
        groudIcon5.setImagesData(mPostList5);

        groudIcon6.setAdapter(mAdapter);
        groudIcon6.setImagesData(mPostList6);

        groudIcon7.setAdapter(mAdapter);
        groudIcon7.setImagesData(mPostList7);

        groudIcon8.setAdapter(mAdapter);
        groudIcon8.setImagesData(mPostList8);

        groudIcon9.setAdapter(mAdapter);
        groudIcon9.setImagesData(mPostList9);
    }
}
