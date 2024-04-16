package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: ImageV5.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lwv4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "urlPattern", "", "Ljava/util/Map;", "()Ljava/util/Map;", "imageMeta", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: wv4  reason: default package */
/* loaded from: classes.dex */
public final class wv4 {
    private final String a;
    private final Map<String, Object> b;

    public wv4(String str, Map<String, ? extends Object> map) {
        z65.h(str, "urlPattern");
        z65.h(map, "imageMeta");
        this.a = str;
        this.b = map;
    }

    public final Map<String, Object> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv4)) {
            return false;
        }
        wv4 wv4Var = (wv4) obj;
        if (z65.c(this.a, wv4Var.a) && z65.c(this.b, wv4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        Map<String, Object> map = this.b;
        return "ImageV5(urlPattern=" + str + ", imageMeta=" + map + ")";
    }
}
