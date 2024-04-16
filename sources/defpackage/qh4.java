package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: qh4  reason: default package */
/* loaded from: classes2.dex */
public class qh4 implements tk9 {
    private Status a;
    private GoogleSignInAccount b;

    public GoogleSignInAccount a() {
        return this.b;
    }

    @Override // defpackage.tk9
    @NonNull
    public Status d() {
        return this.a;
    }
}
