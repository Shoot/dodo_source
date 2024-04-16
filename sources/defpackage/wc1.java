package defpackage;

import android.graphics.ColorFilter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ColorFilter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0004B\u0015\b\u0000\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Lwc1;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "a", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wc1  reason: default package */
/* loaded from: classes.dex */
public final class wc1 {
    public static final a b = new a(null);
    private final ColorFilter a;

    /* compiled from: ColorFilter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lwc1$a;", "", "Luc1;", RemoteMessageConst.Notification.COLOR, "Lpc0;", "blendMode", "Lwc1;", "a", "(JI)Lwc1;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: wc1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wc1 a(long j, int i) {
            return yf.a(j, i);
        }
    }

    public wc1(ColorFilter colorFilter) {
        z65.h(colorFilter, "nativeColorFilter");
        this.a = colorFilter;
    }

    public final ColorFilter a() {
        return this.a;
    }
}
