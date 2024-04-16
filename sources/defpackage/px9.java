package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0003\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lpx9;", "Lvm7;", "", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "semanticsNodeId", "", "b", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "allScopes", "", c.a, "Ljava/lang/Float;", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "oldXValue", Image.TYPE_HIGH, "oldYValue", "Lnx9;", e.a, "Lnx9;", "()Lnx9;", "f", "(Lnx9;)V", "horizontalScrollAxisRange", "i", "verticalScrollAxisRange", "", "b0", "()Z", "isValidOwnerScope", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Lnx9;Lnx9;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: px9  reason: default package */
/* loaded from: classes.dex */
public final class px9 implements vm7 {
    private final int a;
    private final List<px9> b;
    private Float c;
    private Float d;
    private nx9 e;
    private nx9 f;

    public px9(int i, List<px9> list, Float f, Float f2, nx9 nx9Var, nx9 nx9Var2) {
        z65.h(list, "allScopes");
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = f2;
        this.e = nx9Var;
        this.f = nx9Var2;
    }

    public final nx9 a() {
        return this.e;
    }

    public final Float b() {
        return this.c;
    }

    @Override // defpackage.vm7
    public boolean b0() {
        return this.b.contains(this);
    }

    public final Float c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    public final nx9 e() {
        return this.f;
    }

    public final void f(nx9 nx9Var) {
        this.e = nx9Var;
    }

    public final void g(Float f) {
        this.c = f;
    }

    public final void h(Float f) {
        this.d = f;
    }

    public final void i(nx9 nx9Var) {
        this.f = nx9Var;
    }
}
