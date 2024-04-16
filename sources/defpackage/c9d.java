package defpackage;

import org.jspecify.nullness.NullMarked;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* renamed from: c9d  reason: default package */
/* loaded from: classes2.dex */
public final class c9d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final CharSequence a(Object obj, String str) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
