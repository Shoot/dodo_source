package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.b;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.c;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* renamed from: wp6  reason: default package */
/* loaded from: classes.dex */
public class wp6 extends c {
    Set<String> j = new HashSet();
    boolean k;
    CharSequence[] l;
    CharSequence[] m;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    /* renamed from: wp6$a */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                wp6 wp6Var = wp6.this;
                wp6Var.k = wp6Var.j.add(wp6Var.m[i].toString()) | wp6Var.k;
                return;
            }
            wp6 wp6Var2 = wp6.this;
            wp6Var2.k = wp6Var2.j.remove(wp6Var2.m[i].toString()) | wp6Var2.k;
        }
    }

    private MultiSelectListPreference nh() {
        return (MultiSelectListPreference) gh();
    }

    public static wp6 oh(String str) {
        wp6 wp6Var = new wp6();
        Bundle bundle = new Bundle(1);
        bundle.putString(Action.KEY_ATTRIBUTE, str);
        wp6Var.setArguments(bundle);
        return wp6Var;
    }

    @Override // androidx.preference.c
    public void kh(boolean z) {
        if (z && this.k) {
            MultiSelectListPreference nh = nh();
            if (nh.g(this.j)) {
                nh.b1(this.j);
            }
        }
        this.k = false;
    }

    @Override // androidx.preference.c
    protected void lh(b.a aVar) {
        super.lh(aVar);
        int length = this.m.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.j.contains(this.m[i].toString());
        }
        aVar.i(this.l, zArr, new a());
    }

    @Override // androidx.preference.c, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference nh = nh();
            if (nh.W0() != null && nh.X0() != null) {
                this.j.clear();
                this.j.addAll(nh.Y0());
                this.k = false;
                this.l = nh.W0();
                this.m = nh.X0();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.j.clear();
        this.j.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.k = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.c, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.m);
    }
}
