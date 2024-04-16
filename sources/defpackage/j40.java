package defpackage;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
/* compiled from: AutofillIdCompat.java */
/* renamed from: j40  reason: default package */
/* loaded from: classes.dex */
public class j40 {
    private final Object a;

    private j40(@NonNull AutofillId autofillId) {
        this.a = autofillId;
    }

    @NonNull
    public static j40 b(@NonNull AutofillId autofillId) {
        return new j40(autofillId);
    }

    @NonNull
    public AutofillId a() {
        return i40.a(this.a);
    }
}
