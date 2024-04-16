package defpackage;

import android.text.style.URLSpan;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: URLSpanCache.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lspb;", "", "Lstb;", "urlAnnotation", "Landroid/text/style/URLSpan;", "a", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: spb  reason: default package */
/* loaded from: classes.dex */
public final class spb {
    private final WeakHashMap<stb, URLSpan> a = new WeakHashMap<>();

    public final URLSpan a(stb stbVar) {
        z65.h(stbVar, "urlAnnotation");
        WeakHashMap<stb, URLSpan> weakHashMap = this.a;
        URLSpan uRLSpan = weakHashMap.get(stbVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(stbVar.a());
            weakHashMap.put(stbVar, uRLSpan);
        }
        return uRLSpan;
    }
}
