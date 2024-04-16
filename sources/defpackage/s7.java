package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AddressFieldInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u000bB+\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0018\u0010\u0016\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Ls7;", "Lis3;", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "", "b", "I", "()I", "setHint", "(I)V", "hint", "", c.a, "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "focusOnShow", e.a, "mandatory", "<init>", "(Ljava/lang/String;IZZ)V", "Ls7$a;", "Ls7$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: s7  reason: default package */
/* loaded from: classes4.dex */
public abstract class s7 implements is3 {
    private String a;
    private int b;
    private boolean c;
    private boolean d;

    /* compiled from: AddressFieldInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Ls7$a;", "Ls7;", "", e.a, "Z", "f", "()Z", "g", "(Z)V", "showCancelButton", "", Action.NAME_ATTRIBUTE, "", "hint", "focusOnShow", "mandatory", "<init>", "(Ljava/lang/String;IZZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s7$a */
    /* loaded from: classes4.dex */
    public static final class a extends s7 {
        private boolean e;

        public /* synthetic */ a(String str, int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3);
        }

        public final boolean f() {
            return this.e;
        }

        public final void g(boolean z) {
            this.e = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, boolean z, boolean z2, boolean z3) {
            super(str, i, z, z2, null);
            z65.h(str, Action.NAME_ATTRIBUTE);
            this.e = z3;
        }
    }

    /* compiled from: AddressFieldInfo.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls7$b;", "Ls7;", "", Action.NAME_ATTRIBUTE, "", "hint", "", "focusOnShow", "mandatory", "<init>", "(Ljava/lang/String;IZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s7$b */
    /* loaded from: classes4.dex */
    public static final class b extends s7 {
        public /* synthetic */ b(String str, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2, null);
            z65.h(str, Action.NAME_ATTRIBUTE);
        }
    }

    public /* synthetic */ s7(String str, int i, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, z2);
    }

    public final boolean a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final void d(boolean z) {
        this.c = z;
    }

    public final void e(boolean z) {
        this.d = z;
    }

    @Override // defpackage.is3
    public String getName() {
        return this.a;
    }

    private s7(String str, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }
}
