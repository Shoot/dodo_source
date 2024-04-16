package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002,IB;\u0012\u0006\u0010N\u001a\u00020J\u0012\u0006\u0010S\u001a\u00020O\u0012\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040E\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040G¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J¯\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0016H\u0016J\u001d\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010'\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010-J\u0010\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000203H\u0014J\b\u00105\u001a\u00020\u0004H\u0016J0\u0010;\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00162\u0006\u00108\u001a\u0002072\u0006\u0010\u0006\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0014J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J%\u0010:\u001a\u00020&2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010AJ\u0018\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020\u0016H\u0016J*\u0010I\u001a\u00020\u00042\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040E2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040GH\u0016R\u0017\u0010N\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010S\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b:\u0010P\u001a\u0004\bQ\u0010RR$\u0010F\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010TR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010UR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010WR\u0016\u0010Z\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\\R*\u0010c\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010Y\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010YR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00010i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001f\u0010n\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b8\u0010mR\u0016\u0010p\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010YR\u001a\u0010u\u001a\u00020q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010m\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010tR%\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/ui/platform/v;", "Landroid/view/View;", "Lsm7;", "", "", "u", "t", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Ltga;", "shape", "", "clip", "Lfe9;", "renderEffect", "Luc1;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "Lqm5;", "layoutDirection", "La03;", "density", "g", "(FFFFFFFFFFJLtga;ZLfe9;JJILqm5;La03;)V", "hasOverlappingRendering", "Ls67;", "position", com.huawei.hms.push.e.a, "(J)Z", "Lw55;", "size", com.huawei.hms.opendevice.c.a, "(J)V", "Ls55;", Image.TYPE_HIGH, "Lqn0;", "canvas", "f", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "l", "r", "b", "onLayout", "destroy", "i", "forceLayout", "point", "inverse", "(JZ)J", "Lzq6;", "rect", "a", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lr73;", "Lr73;", "getContainer", "()Lr73;", "container", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Llm7;", "Llm7;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", Image.TYPE_SMALL, "()Z", "setInvalidated", "(Z)V", "isInvalidated", "drawnWithZ", "Lun0;", "j", "Lun0;", "canvasHolder", "Lgm5;", "k", "Lgm5;", "matrixCache", "J", "mTransformOrigin", Image.TYPE_MEDIUM, "mHasOverlappingRendering", "", "n", "getLayerId", "()J", "layerId", "Lor7;", "getManualClipPath", "()Lor7;", "manualClipPath", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lr73;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "o", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class v extends View implements sm7 {
    public static final c o = new c(null);
    private static final Function2<View, Matrix, Unit> p = b.a;
    private static final ViewOutlineProvider q = new a();
    private static Method r;
    private static Field s;
    private static boolean t;
    private static boolean u;
    private final AndroidComposeView a;
    private final r73 b;
    private Function1<? super qn0, Unit> c;
    private Function0<Unit> d;
    private final lm7 e;
    private boolean f;
    private Rect g;
    private boolean h;
    private boolean i;
    private final un0 j;
    private final gm5<View> k;
    private long l;
    private boolean m;
    private final long n;

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/v$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            z65.h(view, "view");
            z65.h(outline, "outline");
            Outline c = ((v) view).e.c();
            z65.e(c);
            outline.set(c);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "", "a", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function2<View, Matrix, Unit> {
        public static final b a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            z65.h(view, "view");
            z65.h(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            a(view, matrix);
            return Unit.a;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/v$c;", "", "Landroid/view/View;", "view", "", DateTokenConverter.CONVERTER_KEY, "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", com.huawei.hms.opendevice.c.a, "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return v.t;
        }

        public final boolean b() {
            return v.u;
        }

        public final void c(boolean z) {
            v.u = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            z65.h(view, "view");
            try {
                if (!a()) {
                    v.t = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        v.r = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        v.s = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        v.r = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        v.s = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = v.r;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = v.s;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = v.s;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = v.r;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/v$d;", "", "Landroid/view/View;", "view", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class d {
        public static final d a = new d();

        private d() {
        }

        public static final long a(View view) {
            long uniqueDrawingId;
            z65.h(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AndroidComposeView androidComposeView, r73 r73Var, Function1<? super qn0, Unit> function1, Function0<Unit> function0) {
        super(androidComposeView.getContext());
        z65.h(androidComposeView, "ownerView");
        z65.h(r73Var, "container");
        z65.h(function1, "drawBlock");
        z65.h(function0, "invalidateParentLayer");
        this.a = androidComposeView;
        this.b = r73Var;
        this.c = function1;
        this.d = function0;
        this.e = new lm7(androidComposeView.getDensity());
        this.j = new un0();
        this.k = new gm5<>(p);
        this.l = androidx.compose.ui.graphics.f.a.a();
        this.m = true;
        setWillNotDraw(false);
        r73Var.addView(this);
        this.n = View.generateViewId();
    }

    private final or7 getManualClipPath() {
        if (getClipToOutline() && !this.e.d()) {
            return this.e.b();
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.h) {
            this.h = z;
            this.a.Y(this, z);
        }
    }

    private final void t() {
        Rect rect;
        if (this.f) {
            Rect rect2 = this.g;
            if (rect2 == null) {
                this.g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                z65.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void u() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.e.c() != null) {
            viewOutlineProvider = q;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // defpackage.sm7
    public void a(zq6 zq6Var, boolean z) {
        z65.h(zq6Var, "rect");
        if (z) {
            float[] a2 = this.k.a(this);
            if (a2 != null) {
                oa6.g(a2, zq6Var);
                return;
            } else {
                zq6Var.g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        oa6.g(this.k.b(this), zq6Var);
    }

    @Override // defpackage.sm7
    public long b(long j, boolean z) {
        if (z) {
            float[] a2 = this.k.a(this);
            if (a2 != null) {
                return oa6.f(a2, j);
            }
            return s67.b.a();
        }
        return oa6.f(this.k.b(this), j);
    }

    @Override // defpackage.sm7
    public void c(long j) {
        int g = w55.g(j);
        int f = w55.f(j);
        if (g != getWidth() || f != getHeight()) {
            float f2 = g;
            setPivotX(androidx.compose.ui.graphics.f.d(this.l) * f2);
            float f3 = f;
            setPivotY(androidx.compose.ui.graphics.f.e(this.l) * f3);
            this.e.h(ina.a(f2, f3));
            u();
            layout(getLeft(), getTop(), getLeft() + g, getTop() + f);
            t();
            this.k.c();
        }
    }

    @Override // defpackage.sm7
    public void d(Function1<? super qn0, Unit> function1, Function0<Unit> function0) {
        z65.h(function1, "drawBlock");
        z65.h(function0, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !u) {
            setVisibility(0);
        } else {
            this.b.addView(this);
        }
        this.f = false;
        this.i = false;
        this.l = androidx.compose.ui.graphics.f.a.a();
        this.c = function1;
        this.d = function0;
    }

    @Override // defpackage.sm7
    public void destroy() {
        setInvalidated(false);
        this.a.e0();
        this.c = null;
        this.d = null;
        boolean d0 = this.a.d0(this);
        if (Build.VERSION.SDK_INT < 23 && !u && d0) {
            setVisibility(8);
        } else {
            this.b.removeViewInLayout(this);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        un0 un0Var = this.j;
        Canvas q2 = un0Var.a().q();
        un0Var.a().r(canvas);
        sf a2 = un0Var.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            a2.l();
            this.e.a(a2);
            z = true;
        }
        Function1<? super qn0, Unit> function1 = this.c;
        if (function1 != null) {
            function1.invoke(a2);
        }
        if (z) {
            a2.g();
        }
        un0Var.a().r(q2);
    }

    @Override // defpackage.sm7
    public boolean e(long j) {
        float l = s67.l(j);
        float m = s67.m(j);
        if (this.f) {
            if (0.0f <= l && l < getWidth() && 0.0f <= m && m < getHeight()) {
                return true;
            }
            return false;
        } else if (!getClipToOutline()) {
            return true;
        } else {
            return this.e.e(j);
        }
    }

    @Override // defpackage.sm7
    public void f(qn0 qn0Var) {
        boolean z;
        z65.h(qn0Var, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (z) {
            qn0Var.h();
        }
        this.b.a(qn0Var, this, getDrawingTime());
        if (this.i) {
            qn0Var.m();
        }
    }

    @Override // defpackage.sm7
    public void g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i, qm5 qm5Var, a03 a03Var) {
        Function0<Unit> function0;
        z65.h(tgaVar, "shape");
        z65.h(qm5Var, "layoutDirection");
        z65.h(a03Var, "density");
        this.l = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(androidx.compose.ui.graphics.f.d(this.l) * getWidth());
        setPivotY(androidx.compose.ui.graphics.f.e(this.l) * getHeight());
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f = z && tgaVar == s99.a();
        t();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && tgaVar != s99.a());
        boolean g = this.e.g(tgaVar, getAlpha(), getClipToOutline(), getElevation(), qm5Var, a03Var);
        u();
        boolean z4 = getManualClipPath() != null;
        if (z3 != z4 || (z4 && g)) {
            invalidate();
        }
        if (!this.i && getElevation() > 0.0f && (function0 = this.d) != null) {
            function0.invoke();
        }
        this.k.c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            w wVar = w.a;
            wVar.a(this, yc1.f(j2));
            wVar.b(this, yc1.f(j3));
        }
        if (i2 >= 31) {
            x.a.a(this, fe9Var);
        }
        a.C0019a c0019a = androidx.compose.ui.graphics.a.a;
        if (androidx.compose.ui.graphics.a.e(i, c0019a.c())) {
            setLayerType(2, null);
        } else if (androidx.compose.ui.graphics.a.e(i, c0019a.b())) {
            setLayerType(0, null);
            z2 = false;
        } else {
            setLayerType(0, null);
        }
        this.m = z2;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final r73 getContainer() {
        return this.b;
    }

    public long getLayerId() {
        return this.n;
    }

    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.a);
        }
        return -1L;
    }

    @Override // defpackage.sm7
    public void h(long j) {
        int h = s55.h(j);
        if (h != getLeft()) {
            offsetLeftAndRight(h - getLeft());
            this.k.c();
        }
        int i = s55.i(j);
        if (i != getTop()) {
            offsetTopAndBottom(i - getTop());
            this.k.c();
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.m;
    }

    @Override // defpackage.sm7
    public void i() {
        if (this.h && !u) {
            setInvalidated(false);
            o.d(this);
        }
    }

    @Override // android.view.View, defpackage.sm7
    public void invalidate() {
        if (!this.h) {
            setInvalidated(true);
            super.invalidate();
            this.a.invalidate();
        }
    }

    public final boolean s() {
        return this.h;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
