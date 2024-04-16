package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
/* compiled from: DocumentFile.java */
/* renamed from: m53  reason: default package */
/* loaded from: classes.dex */
public abstract class m53 {
    private final m53 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m53(m53 m53Var) {
        this.a = m53Var;
    }

    public static m53 b(@NonNull Context context, @NonNull Uri uri) {
        return new gma(null, context, uri);
    }

    public abstract boolean a();
}
