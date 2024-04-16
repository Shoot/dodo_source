package defpackage;

import android.net.Uri;
import defpackage.a79;
import kotlin.Metadata;
/* compiled from: AppsFlyerDeepLinkData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Leq;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "uri", "La79$a;", "La79$a;", "()La79$a;", "attributionData", "<init>", "(Landroid/net/Uri;La79$a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: eq  reason: default package */
/* loaded from: classes3.dex */
public final class eq {
    private final Uri a;
    private final a79.a b;

    public eq(Uri uri, a79.a aVar) {
        z65.h(uri, "uri");
        z65.h(aVar, "attributionData");
        this.a = uri;
        this.b = aVar;
    }

    public final a79.a a() {
        return this.b;
    }

    public final Uri b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        if (z65.c(this.a, eqVar.a) && z65.c(this.b, eqVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        Uri uri = this.a;
        a79.a aVar = this.b;
        return "AppsFlyerDeepLinkData(uri=" + uri + ", attributionData=" + aVar + ")";
    }
}
