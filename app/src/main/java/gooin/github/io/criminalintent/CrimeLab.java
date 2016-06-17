package gooin.github.io.criminalintent;

import android.content.Context;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

/**
 * Created by gooin on 2016/6/17.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {

        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i=0;i<100;i++) {
            Crime crime =new Crime();
            crime.setTitle("第"+i+"个破事");
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

}
