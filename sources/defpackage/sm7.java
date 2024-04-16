package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: OwnedLayer.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J¯\u0001\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020%H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010'J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+H&J\b\u0010.\u001a\u00020\u001eH&J\b\u0010/\u001a\u00020\u001eH&J\b\u00100\u001a\u00020\u001eH&J%\u00103\u001a\u00020!2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u0011H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u0018\u00107\u001a\u00020\u001e2\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u00020\u0011H&J*\u0010<\u001a\u00020\u001e2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001e082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0:H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006=À\u0006\u0001"}, d2 = {"Lsm7;", "", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Ltga;", "shape", "", "clip", "Lfe9;", "renderEffect", "Luc1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "Lqm5;", "layoutDirection", "La03;", "density", "", "g", "(FFFFFFFFFFJLtga;ZLfe9;JJILqm5;La03;)V", "Ls67;", "position", e.a, "(J)Z", "Ls55;", Image.TYPE_HIGH, "(J)V", "Lw55;", "size", c.a, "Lqn0;", "canvas", "f", "i", "invalidate", "destroy", "point", "inverse", "b", "(JZ)J", "Lzq6;", "rect", "a", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sm7  reason: default package */
/* loaded from: classes.dex */
public interface sm7 {
    void a(zq6 zq6Var, boolean z);

    long b(long j, boolean z);

    void c(long j);

    void d(Function1<? super qn0, Unit> function1, Function0<Unit> function0);

    void destroy();

    boolean e(long j);

    void f(qn0 qn0Var);

    void g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i, qm5 qm5Var, a03 a03Var);

    void h(long j);

    void i();

    void invalidate();
}
