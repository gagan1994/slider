package com.tugbaustundag.imageslider;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import java.util.Arrays;
public class MainActivity extends ActionBarActivity {
    //Resimlerimizin  bulunduğu yolları IMAGES adlı dizide tutuyoruz...
    private static final String[] IMAGES = new String[] {

            "https://s25.postimg.org/90c5sdtob/img1.jpg",
            "https://s25.postimg.org/79t4qwc57/img2.jpg",
            "https://s25.postimg.org/s7zaozbzv/img3.jpg",
            "https://s25.postimg.org/w5mkedyt7/img4.jpg",
            //"https://s25.postimg.org/oqx8m0cxn/img5.jpg"
    };


    private ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //ViewPager tanımladık..
        pager = (ViewPager) findViewById(R.id.pager);
        //Resimlermizi arayüzde göstermek için kullancagmız ScreenSlidePagerAdapter sınıfına resim, yollarnı set ettim.
        ScreenSlidePagerAdapter pagerAdapter =new ScreenSlidePagerAdapter(getSupportFragmentManager());

        pagerAdapter.addAll(Arrays.asList(IMAGES));
        pager.setAdapter(pagerAdapter);
        //Resmin altındaki kucuk yuvarlak iconları resim saysına göre üreten CirclePageIndicator sınıfını cagırdık
        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(pager);
    }

}
