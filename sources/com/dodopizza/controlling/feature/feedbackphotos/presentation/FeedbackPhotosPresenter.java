package com.dodopizza.controlling.feature.feedbackphotos.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.feedbackphotos.presentation.a;
import com.dodopizza.controlling.feature.fullscreenimage.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: FeedbackPhotosPresenter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0014J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010-\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lxr3;", "Ljava/io/File;", "photoFile", "", "F", "N", "L", "", "orderId", "photoPath", "O", "M", "filePath", "Lwrb;", "upload", "I", "H", "G", "J", "onFirstViewAttach", "", "containsError", "K", "Lnr3;", "a", "Lnr3;", "data", "Lvh7;", "b", "Lvh7;", "interactor", "Lur3;", com.huawei.hms.opendevice.c.a, "Lur3;", "router", "Lor3;", DateTokenConverter.CONVERTER_KEY, "Lor3;", "delegate", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lorg/slf4j/Logger;", "logger", "Ll6;", "Lq58;", "f", "Ll6;", "photoPreviewsVOs", "<init>", "(Lnr3;Lvh7;Lur3;Lor3;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedbackPhotosPresenter extends BasePresenter<xr3> {
    private final nr3 a;
    private final vh7 b;
    private final ur3 c;
    private final or3 d;
    private final Logger e;
    private final l6<q58> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lwrb;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$addPhoto$1", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<pz3<? super wrb>, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = file;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super wrb> pz3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                l6 l6Var = FeedbackPhotosPresenter.this.f;
                String absolutePath = this.c.getAbsolutePath();
                z65.g(absolutePath, "getAbsolutePath(...)");
                l6Var.add(new q58("", absolutePath, 0, false, 8, null));
                FeedbackPhotosPresenter.this.J();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lwrb;", "upload", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$addPhoto$2", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<wrb, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ File d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = file;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.d, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(wrb wrbVar, cv1<? super Unit> cv1Var) {
            return ((b) create(wrbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter feedbackPhotosPresenter = FeedbackPhotosPresenter.this;
                String absolutePath = this.d.getAbsolutePath();
                z65.g(absolutePath, "getAbsolutePath(...)");
                feedbackPhotosPresenter.I(absolutePath, (wrb) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lwrb;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$addPhoto$3", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends f3b implements y84<pz3<? super wrb>, Throwable, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, cv1<? super c> cv1Var) {
            super(3, cv1Var);
            this.c = file;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super wrb> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new c(this.c, cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter feedbackPhotosPresenter = FeedbackPhotosPresenter.this;
                String absolutePath = this.c.getAbsolutePath();
                z65.g(absolutePath, "getAbsolutePath(...)");
                feedbackPhotosPresenter.H(absolutePath);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lpz3;", "Lwrb;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$addPhoto$4", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends f3b implements y84<pz3<? super wrb>, Throwable, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super wrb> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new d(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter.this.J();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq58;", "previewVO", "", "a", "(Lq58;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function1<q58, Boolean> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(q58 q58Var) {
            z65.h(q58Var, "previewVO");
            return Boolean.valueOf(z65.c(q58Var.b(), this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq58;", "previewVO", "", "", "a", "(Lq58;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function1<q58, List<? extends String>> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(q58 q58Var) {
            List<String> o;
            z65.h(q58Var, "previewVO");
            q58Var.f(false);
            q58Var.j(0);
            o = kc1.o("change_count", "change_upload_failure");
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq58;", "previewVO", "", "a", "(Lq58;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function1<q58, Boolean> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(q58 q58Var) {
            z65.h(q58Var, "previewVO");
            return Boolean.valueOf(z65.c(q58Var.b(), this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq58;", "previewVO", "", "", "a", "(Lq58;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function1<q58, List<? extends String>> {
        public static final h a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(q58 q58Var) {
            List<String> o;
            z65.h(q58Var, "previewVO");
            q58Var.f(true);
            q58Var.j(0);
            o = kc1.o("change_count", "change_upload_failure");
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq58;", "preview", "", "a", "(Lq58;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function1<q58, Boolean> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(q58 q58Var) {
            z65.h(q58Var, "preview");
            return Boolean.valueOf(z65.c(q58Var.b(), this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq58;", "preview", "", "", "a", "(Lq58;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function1<q58, List<? extends String>> {
        final /* synthetic */ wrb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(wrb wrbVar) {
            super(1);
            this.a = wrbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(q58 q58Var) {
            List<String> e;
            z65.h(q58Var, "preview");
            q58Var.i(this.a.b());
            q58Var.j((int) this.a.a());
            e = jc1.e("change_count");
            return e;
        }
    }

    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$onFirstViewAttach$1", f = "FeedbackPhotosPresenter.kt", l = {38, 42}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class k extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FeedbackPhotosPresenter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/a;", "action", "", "b", "(Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/a;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ FeedbackPhotosPresenter a;

            a(FeedbackPhotosPresenter feedbackPhotosPresenter) {
                this.a = feedbackPhotosPresenter;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(com.dodopizza.controlling.feature.feedbackphotos.presentation.a aVar, cv1<? super Unit> cv1Var) {
                if (aVar instanceof a.C0115a) {
                    this.a.F(((a.C0115a) aVar).a());
                } else if (aVar instanceof a.c) {
                    this.a.N();
                } else if (aVar instanceof a.b) {
                    this.a.L();
                }
                return Unit.a;
            }
        }

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((k) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                vh7 vh7Var = FeedbackPhotosPresenter.this.b;
                String a2 = FeedbackPhotosPresenter.this.a.a();
                this.a = 1;
                obj = vh7Var.e(a2, this);
                if (obj == d) {
                    return d;
                }
            }
            FeedbackPhotosPresenter.this.f.addAll((List) obj);
            FeedbackPhotosPresenter.this.J();
            oz3<com.dodopizza.controlling.feature.feedbackphotos.presentation.a> c = FeedbackPhotosPresenter.this.d.c();
            a aVar = new a(FeedbackPhotosPresenter.this);
            this.a = 2;
            if (c.collect(aVar, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$onPhotoPreviewClicked$1", f = "FeedbackPhotosPresenter.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class l extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, boolean z, cv1<? super l> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((l) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ur3 ur3Var = FeedbackPhotosPresenter.this.c;
                v74 v74Var = new v74(this.c, this.d);
                this.a = 1;
                obj = ur3Var.a(v74Var, this);
                if (obj == d) {
                    return d;
                }
            }
            com.dodopizza.controlling.feature.fullscreenimage.presentation.a aVar = (com.dodopizza.controlling.feature.fullscreenimage.presentation.a) obj;
            if (!(aVar instanceof a.C0116a)) {
                if (aVar instanceof a.b) {
                    FeedbackPhotosPresenter feedbackPhotosPresenter = FeedbackPhotosPresenter.this;
                    feedbackPhotosPresenter.M(feedbackPhotosPresenter.a.a(), ((a.b) aVar).a());
                } else if (aVar instanceof a.c) {
                    FeedbackPhotosPresenter feedbackPhotosPresenter2 = FeedbackPhotosPresenter.this;
                    feedbackPhotosPresenter2.O(feedbackPhotosPresenter2.a.a(), ((a.c) aVar).a());
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq58;", "previewVO", "", "a", "(Lq58;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class m extends ej5 implements Function1<q58, Boolean> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(q58 q58Var) {
            z65.h(q58Var, "previewVO");
            return Boolean.valueOf(z65.c(q58Var.b(), this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$removePhoto$2", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Throwable th = (Throwable) this.b;
                FeedbackPhotosPresenter.this.e.warn(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq58;", "previewVO", "", "a", "(Lq58;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class o extends ej5 implements Function1<q58, Boolean> {
        public static final o a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(q58 q58Var) {
            boolean z;
            z65.h(q58Var, "previewVO");
            if (q58Var.a() && !q58Var.e()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lwrb;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$retryPhotoUpload$1", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends f3b implements Function2<pz3<? super wrb>, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, cv1<? super p> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new p(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super wrb> pz3Var, cv1<? super Unit> cv1Var) {
            return ((p) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter.this.G(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lwrb;", "upload", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$retryPhotoUpload$2", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends f3b implements Function2<wrb, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, cv1<? super q> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q qVar = new q(this.d, cv1Var);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(wrb wrbVar, cv1<? super Unit> cv1Var) {
            return ((q) create(wrbVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter.this.I(this.d, (wrb) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lwrb;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$retryPhotoUpload$3", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends f3b implements y84<pz3<? super wrb>, Throwable, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, cv1<? super r> cv1Var) {
            super(3, cv1Var);
            this.c = str;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super wrb> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new r(this.c, cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter.this.H(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeedbackPhotosPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lpz3;", "Lwrb;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter$retryPhotoUpload$4", f = "FeedbackPhotosPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends f3b implements y84<pz3<? super wrb>, Throwable, cv1<? super Unit>, Object> {
        int a;

        s(cv1<? super s> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super wrb> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new s(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FeedbackPhotosPresenter.this.J();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public FeedbackPhotosPresenter(nr3 nr3Var, vh7 vh7Var, ur3 ur3Var, or3 or3Var) {
        z65.h(nr3Var, "data");
        z65.h(vh7Var, "interactor");
        z65.h(ur3Var, "router");
        z65.h(or3Var, "delegate");
        this.a = nr3Var;
        this.b = vh7Var;
        this.c = ur3Var;
        this.d = or3Var;
        this.e = LoggerFactory.getLogger("FeedbackPhotosPresenter");
        this.f = new l6<>(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(File file) {
        o(wz3.E(wz3.h(wz3.F(wz3.H(this.b.b(this.a.a(), file), new a(file, null)), new b(file, null)), new c(file, null)), new d(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        this.f.S(new e(str), f.a);
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        this.f.S(new g(str), h.a);
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str, wrb wrbVar) {
        this.f.S(new i(str), new j(wrbVar));
        J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        List<q58> F0;
        or3 or3Var = this.d;
        F0 = sc1.F0(this.f);
        or3Var.d(F0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        Collection D0;
        D0 = sc1.D0(this.f, new ArrayList());
        ArrayList<q58> arrayList = new ArrayList();
        for (Object obj : D0) {
            if (((q58) obj).a()) {
                arrayList.add(obj);
            }
        }
        for (q58 q58Var : arrayList) {
            M(this.a.a(), q58Var.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str, String str2) {
        this.f.z0(new m(str2));
        J();
        p(z77.a(this.b.f(str, str2), new n(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        Sequence P;
        Sequence<q58> j2;
        P = sc1.P(this.f);
        j2 = dca.j(P, o.a);
        for (q58 q58Var : j2) {
            O(this.a.a(), q58Var.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(String str, String str2) {
        o(wz3.E(wz3.h(wz3.F(wz3.H(this.b.g(str, str2), new p(str2, null)), new q(str2, null)), new r(str2, null)), new s(null)));
    }

    public final void K(String str, boolean z) {
        z65.h(str, "photoPath");
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, z, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        ((xr3) getViewState()).ha(this.f);
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }
}
