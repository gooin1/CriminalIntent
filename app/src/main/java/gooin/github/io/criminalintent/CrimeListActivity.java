package gooin.github.io.criminalintent;
import android.support.v4.app.Fragment;

public class CrimeListActivity extends gooin.github.io.criminalintent.SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new  gooin.github.io.criminalintent.CrimeListFragment();
    }
}
