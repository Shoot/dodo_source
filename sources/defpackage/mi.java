package defpackage;

import android.os.Build;
import kotlin.Metadata;
/* compiled from: AndroidPlatformLocale.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"Lfc8;", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: mi  reason: default package */
/* loaded from: classes.dex */
public final class mi {
    public static final fc8 a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return new oh();
        }
        return new kh();
    }
}
