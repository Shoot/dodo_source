package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ZipEntry.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010&\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u000e\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0019\u0010$\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\u0019\u0010#R\u0017\u0010&\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\b\u0010*¨\u0006."}, d2 = {"Lrcc;", "", "Lnr7;", "a", "Lnr7;", "()Lnr7;", "canonicalPath", "", "b", "Z", Image.TYPE_HIGH, "()Z", "isDirectory", "", c.a, "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "comment", "", DateTokenConverter.CONVERTER_KEY, "J", "getCrc", "()J", "crc", e.a, "compressedSize", "f", "g", "size", "", "I", "()I", "compressionMethod", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lastModifiedAtMillis", "i", "offset", "", "j", "Ljava/util/List;", "()Ljava/util/List;", "children", "<init>", "(Lnr7;ZLjava/lang/String;JJJILjava/lang/Long;J)V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: rcc  reason: default package */
/* loaded from: classes3.dex */
public final class rcc {
    private final nr7 a;
    private final boolean b;
    private final String c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final Long h;
    private final long i;
    private final List<nr7> j;

    public rcc(nr7 nr7Var, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4) {
        z65.h(nr7Var, "canonicalPath");
        z65.h(str, "comment");
        this.a = nr7Var;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = l;
        this.i = j4;
        this.j = new ArrayList();
    }

    public final nr7 a() {
        return this.a;
    }

    public final List<nr7> b() {
        return this.j;
    }

    public final long c() {
        return this.e;
    }

    public final int d() {
        return this.g;
    }

    public final Long e() {
        return this.h;
    }

    public final long f() {
        return this.i;
    }

    public final long g() {
        return this.f;
    }

    public final boolean h() {
        return this.b;
    }

    public /* synthetic */ rcc(nr7 nr7Var, boolean z, String str, long j, long j2, long j3, int i, Long l, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nr7Var, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -1L : j, (i2 & 16) != 0 ? -1L : j2, (i2 & 32) != 0 ? -1L : j3, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? null : l, (i2 & 256) == 0 ? j4 : -1L);
    }
}
