package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.tmb;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001f"}, d2 = {"Lr3a;", "", DateTokenConverter.CONVERTER_KEY, "f", "b", tmb.g.SEGMENT_JSON_NAME, c.a, "", "byteCount", e.a, "", "a", "sink", "g", "", "[B", "data", "I", "pos", "limit", "", "Z", "shared", "owner", "Lr3a;", StatisticManager.NEXT, StatisticManager.PREV, "<init>", "()V", "([BIIZZ)V", Image.TYPE_HIGH, "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: r3a  reason: default package */
/* loaded from: classes3.dex */
public final class r3a {
    public static final a h = new a(null);
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public r3a f;
    public r3a g;

    /* compiled from: Segment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lr3a$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r3a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public r3a() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        int i;
        r3a r3aVar = this.g;
        if (r3aVar != this) {
            z65.e(r3aVar);
            if (!r3aVar.e) {
                return;
            }
            int i2 = this.c - this.b;
            r3a r3aVar2 = this.g;
            z65.e(r3aVar2);
            int i3 = 8192 - r3aVar2.c;
            r3a r3aVar3 = this.g;
            z65.e(r3aVar3);
            if (r3aVar3.d) {
                i = 0;
            } else {
                r3a r3aVar4 = this.g;
                z65.e(r3aVar4);
                i = r3aVar4.b;
            }
            if (i2 > i3 + i) {
                return;
            }
            r3a r3aVar5 = this.g;
            z65.e(r3aVar5);
            g(r3aVar5, i2);
            b();
            t3a.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final r3a b() {
        r3a r3aVar = this.f;
        if (r3aVar == this) {
            r3aVar = null;
        }
        r3a r3aVar2 = this.g;
        z65.e(r3aVar2);
        r3aVar2.f = this.f;
        r3a r3aVar3 = this.f;
        z65.e(r3aVar3);
        r3aVar3.g = this.g;
        this.f = null;
        this.g = null;
        return r3aVar;
    }

    public final r3a c(r3a r3aVar) {
        z65.h(r3aVar, tmb.g.SEGMENT_JSON_NAME);
        r3aVar.g = this;
        r3aVar.f = this.f;
        r3a r3aVar2 = this.f;
        z65.e(r3aVar2);
        r3aVar2.g = r3aVar;
        this.f = r3aVar;
        return r3aVar;
    }

    public final r3a d() {
        this.d = true;
        return new r3a(this.a, this.b, this.c, true, false);
    }

    public final r3a e(int i) {
        r3a c;
        if (i > 0 && i <= this.c - this.b) {
            if (i >= 1024) {
                c = d();
            } else {
                c = t3a.c();
                byte[] bArr = this.a;
                byte[] bArr2 = c.a;
                int i2 = this.b;
                xr.i(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            c.c = c.b + i;
            this.b += i;
            r3a r3aVar = this.g;
            z65.e(r3aVar);
            r3aVar.c(c);
            return c;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final r3a f() {
        byte[] bArr = this.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        z65.g(copyOf, "copyOf(...)");
        return new r3a(copyOf, this.b, this.c, false, true);
    }

    public final void g(r3a r3aVar, int i) {
        z65.h(r3aVar, "sink");
        if (r3aVar.e) {
            int i2 = r3aVar.c;
            if (i2 + i > 8192) {
                if (!r3aVar.d) {
                    int i3 = r3aVar.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = r3aVar.a;
                        xr.i(bArr, bArr, 0, i3, i2, 2, null);
                        r3aVar.c -= r3aVar.b;
                        r3aVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.a;
            byte[] bArr3 = r3aVar.a;
            int i4 = r3aVar.c;
            int i5 = this.b;
            xr.d(bArr2, bArr3, i4, i5, i5 + i);
            r3aVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public r3a(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        z65.h(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
