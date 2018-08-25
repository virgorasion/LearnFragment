package widyanto.fauzan.learnfragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new FragmentKiri());
        fragments.add(new FragmentKanan());
        fragments.add(new FragmentKiri());
        fragments.add(new FragmentKanan());

        List<String> tabTitle = new ArrayList<>();

        tabTitle.add("Beranda");
        tabTitle.add("Informasi");
        tabTitle.add("Download");
        tabTitle.add("Tentang");

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragments, tabTitle));

        tabLayout.setupWithViewPager(viewPager);

    }
}
