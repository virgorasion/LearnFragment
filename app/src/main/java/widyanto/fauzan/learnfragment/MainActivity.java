package widyanto.fauzan.learnfragment;

import android.os.Bundle;
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

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragments));

    }
}
