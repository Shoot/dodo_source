package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MapAddressVO.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001Bc\b\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\"\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b!\u0010\u001c\u0082\u0001\u0005%&'()¨\u0006*"}, d2 = {"La66;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "address", "b", "addressLocation", "Li66;", c.a, "Li66;", e.a, "()Li66;", "mapButton", "", DateTokenConverter.CONVERTER_KEY, "I", "()I", "confirmButtonTextRes", "Ljq1;", "Ljq1;", "()Ljq1;", "confirmButtonState", "", "f", "Z", Image.TYPE_HIGH, "()Z", "isErrorVisible", "g", "isAddressVisible", "warningTextRes", "i", "isWarningVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li66;ILjq1;ZZIZ)V", "Lp7;", "Li9;", "Ll13;", "Lr9a;", "Lgqb;", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a66  reason: default package */
/* loaded from: classes2.dex */
public abstract class a66 {
    private final String a;
    private final String b;
    private final i66 c;
    private final int d;
    private final jq1 e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final boolean i;

    public /* synthetic */ a66(String str, String str2, i66 i66Var, int i, jq1 jq1Var, boolean z, boolean z2, int i2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i66Var, i, jq1Var, z, z2, i2, z3);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final jq1 c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public final i66 e() {
        return this.c;
    }

    public final int f() {
        return this.h;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        return this.i;
    }

    private a66(String str, String str2, i66 i66Var, int i, jq1 jq1Var, boolean z, boolean z2, int i2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = i66Var;
        this.d = i;
        this.e = jq1Var;
        this.f = z;
        this.g = z2;
        this.h = i2;
        this.i = z3;
    }

    public /* synthetic */ a66(String str, String str2, i66 i66Var, int i, jq1 jq1Var, boolean z, boolean z2, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? i66.b : i66Var, (i3 & 8) != 0 ? o09.address_confirm_button : i, (i3 & 16) != 0 ? jq1.a : jq1Var, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? o09.determining_address : i2, (i3 & 256) == 0 ? z3 : false, null);
    }
}
