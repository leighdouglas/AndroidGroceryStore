package nyc.c4q.grocerystore.employeeHandbook.employees;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.grocerystore.R;

/**
 * Created by leighdouglas on 10/24/16.
 */

public class LeighFrag extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.leigh_douglas, container, false);
        return view;
    }
}
