package gooin.github.io.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by gooin on 2016/6/17.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
