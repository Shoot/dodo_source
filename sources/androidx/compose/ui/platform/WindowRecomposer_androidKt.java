package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hia;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0012\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\"\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\"&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\",\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001e\u0010\u001f\u001a\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroid/view/View;", "Ldo1;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "applicationContext", "Lkua;", "", com.huawei.hms.push.e.a, "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/d;", "lifecycle", "Lh99;", "b", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", "(Landroid/view/View;)Ldo1;", "i", "(Landroid/view/View;Ldo1;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", Image.TYPE_HIGH, "(Landroid/view/View;)Lh99;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final Map<Context, kua<Float>> a = new LinkedHashMap();

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ h99 b;

        a(View view, h99 h99Var) {
            this.a = view;
            this.b = h99Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            z65.h(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            z65.h(view, "v");
            this.a.removeOnAttachStateChangeListener(this);
            this.b.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {115, 121}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<pz3<? super Float>, cv1<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ ContentResolver d;
        final /* synthetic */ Uri e;
        final /* synthetic */ c f;
        final /* synthetic */ rv0<Unit> g;
        final /* synthetic */ Context h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContentResolver contentResolver, Uri uri, c cVar, rv0<Unit> rv0Var, Context context, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = contentResolver;
            this.e = uri;
            this.f = cVar;
            this.g = rv0Var;
            this.h = context;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.d, this.e, this.f, this.g, this.h, cv1Var);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super Float> pz3Var, cv1<? super Unit> cv1Var) {
            return ((b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:19:0x004d, B:23:0x005d, B:25:0x0065), top: B:35:0x004d }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0087 -> B:35:0x004d). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r9.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.a
                aw0 r1 = (defpackage.aw0) r1
                java.lang.Object r4 = r9.c
                pz3 r4 = (defpackage.pz3) r4
                defpackage.vk9.b(r10)     // Catch: java.lang.Throwable -> L1b
                r10 = r4
                goto L4c
            L1b:
                r10 = move-exception
                r4 = r9
                goto L95
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.a
                aw0 r1 = (defpackage.aw0) r1
                java.lang.Object r4 = r9.c
                pz3 r4 = (defpackage.pz3) r4
                defpackage.vk9.b(r10)     // Catch: java.lang.Throwable -> L1b
                r5 = r4
                r4 = r9
                goto L5d
            L35:
                defpackage.vk9.b(r10)
                java.lang.Object r10 = r9.c
                pz3 r10 = (defpackage.pz3) r10
                android.content.ContentResolver r1 = r9.d
                android.net.Uri r4 = r9.e
                r5 = 0
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r6 = r9.f
                r1.registerContentObserver(r4, r5, r6)
                rv0<kotlin.Unit> r1 = r9.g     // Catch: java.lang.Throwable -> L1b
                aw0 r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L4c:
                r4 = r9
            L4d:
                r4.c = r10     // Catch: java.lang.Throwable -> L89
                r4.a = r1     // Catch: java.lang.Throwable -> L89
                r4.b = r3     // Catch: java.lang.Throwable -> L89
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L89
                if (r5 != r0) goto L5a
                return r0
            L5a:
                r8 = r5
                r5 = r10
                r10 = r8
            L5d:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L89
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L89
                if (r10 == 0) goto L8b
                r1.next()     // Catch: java.lang.Throwable -> L89
                android.content.Context r10 = r4.h     // Catch: java.lang.Throwable -> L89
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L89
                java.lang.String r6 = "animator_duration_scale"
                r7 = 1065353216(0x3f800000, float:1.0)
                float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L89
                java.lang.Float r10 = defpackage.nf0.b(r10)     // Catch: java.lang.Throwable -> L89
                r4.c = r5     // Catch: java.lang.Throwable -> L89
                r4.a = r1     // Catch: java.lang.Throwable -> L89
                r4.b = r2     // Catch: java.lang.Throwable -> L89
                java.lang.Object r10 = r5.emit(r10, r4)     // Catch: java.lang.Throwable -> L89
                if (r10 != r0) goto L87
                return r0
            L87:
                r10 = r5
                goto L4d
            L89:
                r10 = move-exception
                goto L95
            L8b:
                android.content.ContentResolver r10 = r4.d
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r0 = r4.f
                r10.unregisterContentObserver(r0)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L95:
                android.content.ContentResolver r0 = r4.d
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r1 = r4.f
                r0.unregisterContentObserver(r1)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$c", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends ContentObserver {
        final /* synthetic */ rv0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(rv0<Unit> rv0Var, Handler handler) {
            super(handler);
            this.a = rv0Var;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            this.a.h(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.platform.s, T] */
    public static final h99 b(final View view, CoroutineContext coroutineContext, androidx.lifecycle.d dVar) {
        final is7 is7Var;
        CoroutineContext coroutineContext2;
        z65.h(view, "<this>");
        z65.h(coroutineContext, "coroutineContext");
        if (coroutineContext.c(kotlin.coroutines.d.J4) == null || coroutineContext.c(no6.N) == null) {
            coroutineContext = n.m.a().P(coroutineContext);
        }
        no6 no6Var = (no6) coroutineContext.c(no6.N);
        if (no6Var != null) {
            is7 is7Var2 = new is7(no6Var);
            is7Var2.d();
            is7Var = is7Var2;
        } else {
            is7Var = null;
        }
        final ea9 ea9Var = new ea9();
        to6 to6Var = (to6) coroutineContext.c(to6.O);
        to6 to6Var2 = to6Var;
        if (to6Var == null) {
            ?? sVar = new s();
            ea9Var.a = sVar;
            to6Var2 = sVar;
        }
        if (is7Var != null) {
            coroutineContext2 = is7Var;
        } else {
            coroutineContext2 = kotlin.coroutines.e.a;
        }
        CoroutineContext P = coroutineContext.P(coroutineContext2).P(to6Var2);
        final h99 h99Var = new h99(P);
        h99Var.g0();
        final qx1 a2 = rx1.a(P);
        if (dVar == null) {
            op5 a3 = v0c.a(view);
            if (a3 != null) {
                dVar = a3.getLifecycle();
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            view.addOnAttachStateChangeListener(new a(view, h99Var));
            dVar.a(new androidx.lifecycle.g() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* compiled from: WindowRecomposer.android.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* loaded from: classes.dex */
                public /* synthetic */ class a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[d.a.values().length];
                        try {
                            iArr[d.a.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[d.a.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[d.a.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[d.a.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[d.a.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[d.a.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[d.a.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* compiled from: WindowRecomposer.android.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @nn2(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {394}, m = "invokeSuspend")
                /* loaded from: classes.dex */
                static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                    int a;
                    private /* synthetic */ Object b;
                    final /* synthetic */ ea9<s> c;
                    final /* synthetic */ h99 d;
                    final /* synthetic */ op5 e;
                    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f;
                    final /* synthetic */ View g;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: WindowRecomposer.android.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @nn2(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
                    /* loaded from: classes.dex */
                    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                        int a;
                        final /* synthetic */ kua<Float> b;
                        final /* synthetic */ s c;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: WindowRecomposer.android.kt */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "scaleFactor", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                        /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a  reason: collision with other inner class name */
                        /* loaded from: classes.dex */
                        public static final class C0020a implements pz3<Float> {
                            final /* synthetic */ s a;

                            C0020a(s sVar) {
                                this.a = sVar;
                            }

                            public final Object b(float f, cv1<? super Unit> cv1Var) {
                                this.a.d(f);
                                return Unit.a;
                            }

                            @Override // defpackage.pz3
                            public /* bridge */ /* synthetic */ Object emit(Float f, cv1 cv1Var) {
                                return b(f.floatValue(), cv1Var);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        a(kua<Float> kuaVar, s sVar, cv1<? super a> cv1Var) {
                            super(2, cv1Var);
                            this.b = kuaVar;
                            this.c = sVar;
                        }

                        @Override // defpackage.e70
                        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                            return new a(this.b, this.c, cv1Var);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                        }

                        @Override // defpackage.e70
                        public final Object invokeSuspend(Object obj) {
                            Object d;
                            d = c75.d();
                            int i = this.a;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                vk9.b(obj);
                            } else {
                                vk9.b(obj);
                                kua<Float> kuaVar = this.b;
                                C0020a c0020a = new C0020a(this.c);
                                this.a = 1;
                                if (kuaVar.collect(c0020a, this) == d) {
                                    return d;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(ea9<s> ea9Var, h99 h99Var, op5 op5Var, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, cv1<? super b> cv1Var) {
                        super(2, cv1Var);
                        this.c = ea9Var;
                        this.d = h99Var;
                        this.e = op5Var;
                        this.f = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                        this.g = view;
                    }

                    @Override // defpackage.e70
                    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                        b bVar = new b(this.c, this.d, this.e, this.f, this.g, cv1Var);
                        bVar.b = obj;
                        return bVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                        return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
                    @Override // defpackage.e70
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.lang.Object r0 = defpackage.a75.d()
                            int r1 = r11.a
                            r2 = 1
                            r3 = 0
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r0 = r11.b
                            l95 r0 = (defpackage.l95) r0
                            defpackage.vk9.b(r12)     // Catch: java.lang.Throwable -> L14
                            goto L6f
                        L14:
                            r12 = move-exception
                            goto L86
                        L17:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1f:
                            defpackage.vk9.b(r12)
                            java.lang.Object r12 = r11.b
                            r4 = r12
                            qx1 r4 = (defpackage.qx1) r4
                            ea9<androidx.compose.ui.platform.s> r12 = r11.c     // Catch: java.lang.Throwable -> L5d
                            T r12 = r12.a     // Catch: java.lang.Throwable -> L5d
                            androidx.compose.ui.platform.s r12 = (androidx.compose.ui.platform.s) r12     // Catch: java.lang.Throwable -> L5d
                            if (r12 == 0) goto L60
                            android.view.View r1 = r11.g     // Catch: java.lang.Throwable -> L5d
                            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L5d
                            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L5d
                            java.lang.String r5 = "context.applicationContext"
                            defpackage.z65.g(r1, r5)     // Catch: java.lang.Throwable -> L5d
                            kua r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.a(r1)     // Catch: java.lang.Throwable -> L5d
                            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L5d
                            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L5d
                            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L5d
                            r12.d(r5)     // Catch: java.lang.Throwable -> L5d
                            r5 = 0
                            r6 = 0
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch: java.lang.Throwable -> L5d
                            r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L5d
                            r8 = 3
                            r9 = 0
                            l95 r12 = defpackage.qh0.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5d
                            goto L61
                        L5d:
                            r12 = move-exception
                            r0 = r3
                            goto L86
                        L60:
                            r12 = r3
                        L61:
                            h99 r1 = r11.d     // Catch: java.lang.Throwable -> L82
                            r11.b = r12     // Catch: java.lang.Throwable -> L82
                            r11.a = r2     // Catch: java.lang.Throwable -> L82
                            java.lang.Object r1 = r1.s0(r11)     // Catch: java.lang.Throwable -> L82
                            if (r1 != r0) goto L6e
                            return r0
                        L6e:
                            r0 = r12
                        L6f:
                            if (r0 == 0) goto L74
                            defpackage.l95.a.a(r0, r3, r2, r3)
                        L74:
                            op5 r12 = r11.e
                            androidx.lifecycle.d r12 = r12.getLifecycle()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.f
                            r12.d(r0)
                            kotlin.Unit r12 = kotlin.Unit.a
                            return r12
                        L82:
                            r0 = move-exception
                            r10 = r0
                            r0 = r12
                            r12 = r10
                        L86:
                            if (r0 == 0) goto L8b
                            defpackage.l95.a.a(r0, r3, r2, r3)
                        L8b:
                            op5 r0 = r11.e
                            androidx.lifecycle.d r0 = r0.getLifecycle()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.f
                            r0.d(r1)
                            throw r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // androidx.lifecycle.g
                public void d(op5 op5Var, d.a aVar) {
                    z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
                    z65.h(aVar, "event");
                    int i = a.$EnumSwitchMapping$0[aVar.ordinal()];
                    if (i == 1) {
                        sh0.d(qx1.this, null, ux1.UNDISPATCHED, new b(ea9Var, h99Var, op5Var, this, view, null), 1, null);
                    } else if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                h99Var.V();
                                return;
                            }
                            return;
                        }
                        h99Var.g0();
                    } else {
                        is7 is7Var3 = is7Var;
                        if (is7Var3 != null) {
                            is7Var3.f();
                        }
                        h99Var.r0();
                    }
                }
            });
            return h99Var;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ h99 c(View view, CoroutineContext coroutineContext, androidx.lifecycle.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.a;
        }
        if ((i & 2) != 0) {
            dVar = null;
        }
        return b(view, coroutineContext, dVar);
    }

    public static final do1 d(View view) {
        z65.h(view, "<this>");
        do1 f = f(view);
        if (f != null) {
            return f;
        }
        for (ViewParent parent = view.getParent(); f == null && (parent instanceof View); parent = parent.getParent()) {
            f = f((View) parent);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kua<Float> e(Context context) {
        kua<Float> kuaVar;
        Map<Context, kua<Float>> map = a;
        synchronized (map) {
            try {
                kua<Float> kuaVar2 = map.get(context);
                if (kuaVar2 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    rv0 b2 = bw0.b(-1, null, null, 6, null);
                    kuaVar2 = wz3.K(wz3.z(new b(contentResolver, uriFor, new c(b2, cm4.a(Looper.getMainLooper())), b2, context, null)), rx1.b(), hia.a.b(hia.a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, kuaVar2);
                }
                kuaVar = kuaVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kuaVar;
    }

    public static final do1 f(View view) {
        z65.h(view, "<this>");
        Object tag = view.getTag(ly8.androidx_compose_ui_view_composition_context);
        if (tag instanceof do1) {
            return (do1) tag;
        }
        return null;
    }

    private static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final h99 h(View view) {
        z65.h(view, "<this>");
        if (view.isAttachedToWindow()) {
            View g = g(view);
            do1 f = f(g);
            if (f == null) {
                return d6c.a.a(g);
            }
            if (f instanceof h99) {
                return (h99) f;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void i(View view, do1 do1Var) {
        z65.h(view, "<this>");
        view.setTag(ly8.androidx_compose_ui_view_composition_context, do1Var);
    }
}
