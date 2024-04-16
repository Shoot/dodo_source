package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.b;
import androidx.preference.ListPreference;
import androidx.preference.c;
import ch.qos.logback.core.joran.action.Action;
/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* renamed from: er5  reason: default package */
/* loaded from: classes.dex */
public class er5 extends c {
    int j;
    private CharSequence[] k;
    private CharSequence[] l;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    /* renamed from: er5$a */
    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            er5 er5Var = er5.this;
            er5Var.j = i;
            er5Var.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference nh() {
        return (ListPreference) gh();
    }

    public static er5 oh(String str) {
        er5 er5Var = new er5();
        Bundle bundle = new Bundle(1);
        bundle.putString(Action.KEY_ATTRIBUTE, str);
        er5Var.setArguments(bundle);
        return er5Var;
    }

    @Override // androidx.preference.c
    public void kh(boolean z) {
        int i;
        if (z && (i = this.j) >= 0) {
            String charSequence = this.l[i].toString();
            ListPreference nh = nh();
            if (nh.g(charSequence)) {
                nh.e1(charSequence);
            }
        }
    }

    @Override // androidx.preference.c
    protected void lh(b.a aVar) {
        super.lh(aVar);
        aVar.q(this.k, this.j, new a());
        aVar.o(null, null);
    }

    @Override // androidx.preference.c, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference nh = nh();
            if (nh.X0() != null && nh.Z0() != null) {
                this.j = nh.W0(nh.a1());
                this.k = nh.X0();
                this.l = nh.Z0();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.c, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.l);
    }
}
