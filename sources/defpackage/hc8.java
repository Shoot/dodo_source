package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidTextStyle.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u000fB \b\u0016\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000R\u001d\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lhc8;", "", "other", "", "equals", "", "hashCode", "", "toString", c.a, "a", "Z", "b", "()Z", "getIncludeFontPadding$annotations", "()V", "includeFontPadding", "Lvf3;", "I", "()I", "emojiSupportMatch", "<init>", "(Z)V", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hc8  reason: default package */
/* loaded from: classes.dex */
public final class hc8 {
    public static final a c = new a(null);
    private static final hc8 d = new hc8();
    private final boolean a;
    private final int b;

    /* compiled from: AndroidTextStyle.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhc8$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: hc8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ hc8(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final hc8 c(hc8 hc8Var) {
        if (hc8Var == null) {
            return this;
        }
        return hc8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc8)) {
            return false;
        }
        hc8 hc8Var = (hc8) obj;
        if (this.a == hc8Var.a && vf3.f(this.b, hc8Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a91.a(this.a) * 31) + vf3.g(this.b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) vf3.h(this.b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public hc8(boolean z) {
        this.a = z;
        this.b = vf3.b.a();
    }

    private hc8(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public hc8() {
        this(vf3.b.a(), true, null);
    }
}
