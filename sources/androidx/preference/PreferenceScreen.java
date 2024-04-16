package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.g;
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean j5;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, fob.a(context, vv8.preferenceScreenStyle, 16842891));
        this.j5 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public boolean X0() {
        return false;
    }

    public boolean c1() {
        return this.j5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void d0() {
        g.b g;
        if (x() == null && v() == null && W0() != 0 && (g = I().g()) != null) {
            g.L7(this);
        }
    }
}
