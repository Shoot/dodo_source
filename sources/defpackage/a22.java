package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.File;
/* compiled from: CrashlyticsReportWithSessionId.java */
@AutoValue
/* renamed from: a22  reason: default package */
/* loaded from: classes2.dex */
public abstract class a22 {
    @NonNull
    public static a22 a(j12 j12Var, String str, File file) {
        return new m10(j12Var, str, file);
    }

    public abstract j12 b();

    public abstract File c();

    public abstract String d();
}
