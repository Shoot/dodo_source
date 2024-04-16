package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExpandButton.java */
/* loaded from: classes.dex */
final class b extends Preference {
    private long b5;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, List<Preference> list, long j) {
        super(context);
        Q0();
        R0(list);
        this.b5 = j + 1000000;
    }

    private void Q0() {
        C0(pz8.expand_button);
        z0(ix8.ic_arrow_down_24dp);
        J0(a19.expand_button_title);
        G0(999);
    }

    private void R0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence M = preference.M();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(M)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.C())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(M)) {
                if (charSequence == null) {
                    charSequence = M;
                } else {
                    charSequence = s().getString(a19.summary_collapsed_preference_list, charSequence, M);
                }
            }
        }
        H0(charSequence);
    }

    @Override // androidx.preference.Preference
    public void c0(PreferenceViewHolder preferenceViewHolder) {
        super.c0(preferenceViewHolder);
        preferenceViewHolder.setDividerAllowedAbove(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.preference.Preference
    public long w() {
        return this.b5;
    }
}
