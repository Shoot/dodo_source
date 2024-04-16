package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context m5;
    private final ArrayAdapter n5;
    private Spinner o5;
    private final AdapterView.OnItemSelectedListener p5;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vv8.dropdownPreferenceStyle);
    }

    private int g1(String str) {
        CharSequence[] Z0 = Z0();
        if (str != null && Z0 != null) {
            for (int length = Z0.length - 1; length >= 0; length--) {
                if (Z0[length].equals(str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    private void h1() {
        this.n5.clear();
        if (X0() != null) {
            for (CharSequence charSequence : X0()) {
                this.n5.add(charSequence.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void V() {
        super.V();
        ArrayAdapter arrayAdapter = this.n5;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void c0(PreferenceViewHolder preferenceViewHolder) {
        Spinner spinner = (Spinner) preferenceViewHolder.itemView.findViewById(vy8.spinner);
        this.o5 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.n5);
        this.o5.setOnItemSelectedListener(this.p5);
        this.o5.setSelection(g1(a1()));
        super.c0(preferenceViewHolder);
    }

    @Override // androidx.preference.ListPreference
    public void c1(@NonNull CharSequence[] charSequenceArr) {
        super.c1(charSequenceArr);
        h1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void d0() {
        this.o5.performClick();
    }

    protected ArrayAdapter f1() {
        return new ArrayAdapter(this.m5, 17367049);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.p5 = new a();
        this.m5 = context;
        this.n5 = f1();
        h1();
    }

    /* loaded from: classes.dex */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.Z0()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.a1()) && DropDownPreference.this.g(charSequence)) {
                    DropDownPreference.this.e1(charSequence);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
