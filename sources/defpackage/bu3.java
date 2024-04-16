package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FileMetadata.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b%\u0010&Jw\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b \u0010\u001eR'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lbu3;", "", "", "isRegularFile", "isDirectory", "Lnr7;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lod5;", "extras", "a", "(ZZLnr7;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lbu3;", "", "toString", "Z", "g", "()Z", "b", "f", c.a, "Lnr7;", e.a, "()Lnr7;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "getCreatedAtMillis", "getLastAccessedAtMillis", Image.TYPE_HIGH, "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "<init>", "(ZZLnr7;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: bu3  reason: default package */
/* loaded from: classes3.dex */
public final class bu3 {
    private final boolean a;
    private final boolean b;
    private final nr7 c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Long g;
    private final Map<od5<?>, Object> h;

    public bu3(boolean z, boolean z2, nr7 nr7Var, Long l, Long l2, Long l3, Long l4, Map<od5<?>, ? extends Object> map) {
        Map<od5<?>, Object> u;
        z65.h(map, "extras");
        this.a = z;
        this.b = z2;
        this.c = nr7Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        u = g86.u(map);
        this.h = u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bu3 b(bu3 bu3Var, boolean z, boolean z2, nr7 nr7Var, Long l, Long l2, Long l3, Long l4, Map map, int i, Object obj) {
        boolean z3;
        boolean z4;
        nr7 nr7Var2;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Map<od5<?>, ? extends Object> map2;
        if ((i & 1) != 0) {
            z3 = bu3Var.a;
        } else {
            z3 = z;
        }
        if ((i & 2) != 0) {
            z4 = bu3Var.b;
        } else {
            z4 = z2;
        }
        if ((i & 4) != 0) {
            nr7Var2 = bu3Var.c;
        } else {
            nr7Var2 = nr7Var;
        }
        if ((i & 8) != 0) {
            l5 = bu3Var.d;
        } else {
            l5 = l;
        }
        if ((i & 16) != 0) {
            l6 = bu3Var.e;
        } else {
            l6 = l2;
        }
        if ((i & 32) != 0) {
            l7 = bu3Var.f;
        } else {
            l7 = l3;
        }
        if ((i & 64) != 0) {
            l8 = bu3Var.g;
        } else {
            l8 = l4;
        }
        if ((i & 128) != 0) {
            map2 = bu3Var.h;
        } else {
            map2 = map;
        }
        return bu3Var.a(z3, z4, nr7Var2, l5, l6, l7, l8, map2);
    }

    public final bu3 a(boolean z, boolean z2, nr7 nr7Var, Long l, Long l2, Long l3, Long l4, Map<od5<?>, ? extends Object> map) {
        z65.h(map, "extras");
        return new bu3(z, z2, nr7Var, l, l2, l3, l4, map);
    }

    public final Long c() {
        return this.f;
    }

    public final Long d() {
        return this.d;
    }

    public final nr7 e() {
        return this.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.a;
    }

    public String toString() {
        String i0;
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        if (this.d != null) {
            arrayList.add("byteCount=" + this.d);
        }
        if (this.e != null) {
            arrayList.add("createdAt=" + this.e);
        }
        if (this.f != null) {
            arrayList.add("lastModifiedAt=" + this.f);
        }
        if (this.g != null) {
            arrayList.add("lastAccessedAt=" + this.g);
        }
        if (!this.h.isEmpty()) {
            arrayList.add("extras=" + this.h);
        }
        i0 = sc1.i0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
        return i0;
    }

    public /* synthetic */ bu3(boolean z, boolean z2, nr7 nr7Var, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : nr7Var, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? g86.h() : map);
    }
}
