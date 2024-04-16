package androidx.compose.foundation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B>\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cø\u0001\u0000¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lfn6;", "Landroidx/compose/foundation/f;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "Loq6;", com.huawei.hms.opendevice.c.a, "Loq6;", "interactionSource", DateTokenConverter.CONVERTER_KEY, "Z", "enabled", "", com.huawei.hms.push.e.a, "Ljava/lang/String;", "onClickLabel", "Lgn9;", "f", "Lgn9;", "role", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "onClick", "<init>", "(Loq6;ZLjava/lang/String;Lgn9;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableElement extends fn6<f> {
    private final oq6 c;
    private final boolean d;
    private final String e;
    private final gn9 f;
    private final Function0<Unit> g;

    public /* synthetic */ ClickableElement(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(oq6Var, z, str, gn9Var, function0);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(ClickableElement.class, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.ClickableElement");
        ClickableElement clickableElement = (ClickableElement) obj;
        if (z65.c(this.c, clickableElement.c) && this.d == clickableElement.d && z65.c(this.e, clickableElement.e) && z65.c(this.f, clickableElement.f) && z65.c(this.g, clickableElement.g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.c.hashCode() * 31) + a91.a(this.d)) * 31;
        String str = this.e;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        gn9 gn9Var = this.f;
        if (gn9Var != null) {
            i2 = gn9.l(gn9Var.n());
        }
        return ((i3 + i2) * 31) + this.g.hashCode();
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public f o() {
        return new f(this.c, this.d, this.e, this.f, this.g, null);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(f fVar) {
        z65.h(fVar, "node");
        fVar.r1(this.c, this.d, this.e, this.f, this.g);
    }

    private ClickableElement(oq6 oq6Var, boolean z, String str, gn9 gn9Var, Function0<Unit> function0) {
        z65.h(oq6Var, "interactionSource");
        z65.h(function0, "onClick");
        this.c = oq6Var;
        this.d = z;
        this.e = str;
        this.f = gn9Var;
        this.g = function0;
    }
}
