package androidx.compose.foundation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BD\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00050\u001dø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u001d\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lfn6;", "Landroidx/compose/foundation/d;", "t", "node", "", "u", "", "hashCode", "", "other", "", "equals", "Luc1;", com.huawei.hms.opendevice.c.a, "J", RemoteMessageConst.Notification.COLOR, "Lmg0;", DateTokenConverter.CONVERTER_KEY, "Lmg0;", "brush", "", com.huawei.hms.push.e.a, "F", "alpha", "Ltga;", "f", "Ltga;", "shape", "Lkotlin/Function1;", "Lt45;", "g", "Lkotlin/jvm/functions/Function1;", "inspectorInfo", "<init>", "(JLmg0;FLtga;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackgroundElement extends fn6<d> {
    private final long c;
    private final mg0 d;
    private final float e;
    private final tga f;
    private final Function1<t45, Unit> g;

    public /* synthetic */ BackgroundElement(long j, mg0 mg0Var, float f, tga tgaVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, mg0Var, f, tgaVar, function1);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !uc1.l(this.c, backgroundElement.c) || !z65.c(this.d, backgroundElement.d) || this.e != backgroundElement.e || !z65.c(this.f, backgroundElement.f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int r = uc1.r(this.c) * 31;
        mg0 mg0Var = this.d;
        if (mg0Var != null) {
            i = mg0Var.hashCode();
        } else {
            i = 0;
        }
        return ((((r + i) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public d o() {
        return new d(this.c, this.d, this.e, this.f, null);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(d dVar) {
        z65.h(dVar, "node");
        dVar.i1(this.c);
        dVar.h1(this.d);
        dVar.c(this.e);
        dVar.m0(this.f);
    }

    public /* synthetic */ BackgroundElement(long j, mg0 mg0Var, float f, tga tgaVar, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? uc1.b.e() : j, (i & 2) != 0 ? null : mg0Var, f, tgaVar, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j, mg0 mg0Var, float f, tga tgaVar, Function1<? super t45, Unit> function1) {
        z65.h(tgaVar, "shape");
        z65.h(function1, "inspectorInfo");
        this.c = j;
        this.d = mg0Var;
        this.e = f;
        this.f = tgaVar;
        this.g = function1;
    }
}
