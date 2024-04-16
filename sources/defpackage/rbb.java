package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B+\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b;\u0010<B\u001d\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b;\u0010>J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR%\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR$\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001f\u00104R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lrbb;", "Lqc8;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", com.huawei.hms.push.e.a, "Landroid/view/View;", "a", "Landroid/view/View;", "g", "()Landroid/view/View;", "view", "Lr35;", "b", "Lr35;", "inputMethodManager", "Llc8;", com.huawei.hms.opendevice.c.a, "Llc8;", "platformTextInput", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "Lkotlin/Function1;", "", "Lad3;", "", "Lkotlin/jvm/functions/Function1;", "onEditCommand", "Lqw4;", "f", "onImeActionPerformed", "Lvab;", "<set-?>", "Lvab;", "getState$ui_release", "()Lvab;", "state", "Lrw4;", Image.TYPE_HIGH, "Lrw4;", "imeOptions", "", "Ljava/lang/ref/WeakReference;", "Lj99;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Lrn5;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Lgr6;", "Lrbb$a;", "k", "Lgr6;", "textInputCommandQueue", "<init>", "(Landroid/view/View;Lr35;Llc8;Ljava/util/concurrent/Executor;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/view/View;Llc8;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rbb  reason: default package */
/* loaded from: classes.dex */
public final class rbb implements qc8 {
    private final View a;
    private final r35 b;
    private final lc8 c;
    private final Executor d;
    private Function1<? super List<? extends ad3>, Unit> e;
    private Function1<? super qw4, Unit> f;
    private vab g;
    private rw4 h;
    private List<WeakReference<j99>> i;
    private final rn5 j;
    private final gr6<a> k;

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lrbb$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rbb$a */
    /* loaded from: classes.dex */
    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "a", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rbb$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<BaseInputConnection> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(rbb.this.g(), false);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"rbb$c", "Lo35;", "", "Lad3;", "editCommands", "", DateTokenConverter.CONVERTER_KEY, "Lqw4;", "imeAction", com.huawei.hms.opendevice.c.a, "(I)V", "Landroid/view/KeyEvent;", "event", "b", "Lj99;", "ic", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rbb$c */
    /* loaded from: classes.dex */
    public static final class c implements o35 {
        c() {
        }

        @Override // defpackage.o35
        public void a(j99 j99Var) {
            z65.h(j99Var, "ic");
            int size = rbb.this.i.size();
            for (int i = 0; i < size; i++) {
                if (z65.c(((WeakReference) rbb.this.i.get(i)).get(), j99Var)) {
                    rbb.this.i.remove(i);
                    return;
                }
            }
        }

        @Override // defpackage.o35
        public void b(KeyEvent keyEvent) {
            z65.h(keyEvent, "event");
            rbb.this.f().sendKeyEvent(keyEvent);
        }

        @Override // defpackage.o35
        public void c(int i) {
            rbb.this.f.invoke(qw4.i(i));
        }

        @Override // defpackage.o35
        public void d(List<? extends ad3> list) {
            z65.h(list, "editCommands");
            rbb.this.e.invoke(list);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lad3;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rbb$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<List<? extends ad3>, Unit> {
        public static final d a = new d();

        d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends ad3> list) {
            z65.h(list, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ad3> list) {
            invoke2(list);
            return Unit.a;
        }
    }

    public rbb(View view, r35 r35Var, lc8 lc8Var, Executor executor) {
        rn5 a2;
        z65.h(view, "view");
        z65.h(r35Var, "inputMethodManager");
        z65.h(executor, "inputCommandProcessorExecutor");
        this.a = view;
        this.b = r35Var;
        this.c = lc8Var;
        this.d = executor;
        this.e = d.a;
        this.f = e.a;
        this.g = new vab("", jcb.b.a(), (jcb) null, 4, (DefaultConstructorMarker) null);
        this.h = rw4.f.a();
        this.i = new ArrayList();
        a2 = yn5.a(fo5.c, new b());
        this.j = a2;
        this.k = new gr6<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection f() {
        return (BaseInputConnection) this.j.getValue();
    }

    public final InputConnection e(EditorInfo editorInfo) {
        z65.h(editorInfo, "outAttrs");
        ubb.h(editorInfo, this.h, this.g);
        ubb.i(editorInfo);
        j99 j99Var = new j99(this.g, new c(), this.h.b());
        this.i.add(new WeakReference<>(j99Var));
        return j99Var;
    }

    public final View g() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ rbb(android.view.View r1, defpackage.r35 r2, defpackage.lc8 r3, java.util.concurrent.Executor r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L11
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()
            java.lang.String r5 = "getInstance()"
            defpackage.z65.g(r4, r5)
            java.util.concurrent.Executor r4 = defpackage.ubb.d(r4)
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbb.<init>(android.view.View, r35, lc8, java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rbb(View view, lc8 lc8Var) {
        this(view, new s35(view), lc8Var, null, 8, null);
        z65.h(view, "view");
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqw4;", "it", "", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: rbb$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<qw4, Unit> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(qw4 qw4Var) {
            a(qw4Var.o());
            return Unit.a;
        }

        public final void a(int i) {
        }
    }
}
