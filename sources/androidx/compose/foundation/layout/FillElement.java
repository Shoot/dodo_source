package androidx.compose.foundation.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lfn6;", "Landroidx/compose/foundation/layout/a;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "Lt23;", com.huawei.hms.opendevice.c.a, "Lt23;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", DateTokenConverter.CONVERTER_KEY, "F", "fraction", "", com.huawei.hms.push.e.a, "Ljava/lang/String;", "inspectorName", "<init>", "(Lt23;FLjava/lang/String;)V", "f", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FillElement extends fn6<androidx.compose.foundation.layout.a> {
    public static final a f = new a(null);
    private final t23 c;
    private final float d;
    private final String e;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$a;", "", "", "fraction", "Landroidx/compose/foundation/layout/FillElement;", com.huawei.hms.opendevice.c.a, "a", "b", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f) {
            return new FillElement(t23.Vertical, f, "fillMaxHeight");
        }

        public final FillElement b(float f) {
            return new FillElement(t23.Both, f, "fillMaxSize");
        }

        public final FillElement c(float f) {
            return new FillElement(t23.Horizontal, f, "fillMaxWidth");
        }
    }

    public FillElement(t23 t23Var, float f2, String str) {
        z65.h(t23Var, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        z65.h(str, "inspectorName");
        this.c = t23Var;
        this.d = f2;
        this.e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.c == fillElement.c && this.d == fillElement.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + Float.floatToIntBits(this.d);
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public androidx.compose.foundation.layout.a o() {
        return new androidx.compose.foundation.layout.a(this.c, this.d);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(androidx.compose.foundation.layout.a aVar) {
        z65.h(aVar, "node");
        aVar.f1(this.c);
        aVar.g1(this.d);
    }
}
