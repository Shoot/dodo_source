package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: LandingSMSInputInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcl5;", "Lbl5;", "Lox1;", "", "number", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "b", "pinCode", "localityUuid", "Loz3;", "Luq9;", "a", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "localityId", "Lil5;", c.a, "Lil5;", "landingSMSInputService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lil5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: cl5  reason: default package */
/* loaded from: classes4.dex */
public final class cl5 implements bl5, ox1 {
    private final String a;
    private final String b;
    private final il5 c;

    /* compiled from: LandingSMSInputInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Luq9;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cl5$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<oz3<? extends uq9>> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LandingSMSInputInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Luq9;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputInteractorImpl$confirmCode$1$1", f = "LandingSMSInputInteractor.kt", l = {37}, m = "invokeSuspend")
        /* renamed from: cl5$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0088a extends f3b implements Function2<pz3<? super uq9>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ cl5 c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0088a(cl5 cl5Var, String str, String str2, String str3, cv1<? super C0088a> cv1Var) {
                super(2, cv1Var);
                this.c = cl5Var;
                this.d = str;
                this.e = str2;
                this.f = str3;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0088a c0088a = new C0088a(this.c, this.d, this.e, this.f, cv1Var);
                c0088a.b = obj;
                return c0088a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(pz3<? super uq9> pz3Var, cv1<? super Unit> cv1Var) {
                return ((C0088a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                    uq9 b = this.c.c.b(this.c.a, this.d, this.e, this.f);
                    this.a = 1;
                    if (((pz3) this.b).emit(b, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<uq9> invoke() {
            return wz3.z(new C0088a(cl5.this, this.b, this.c, this.d, null));
        }
    }

    /* compiled from: LandingSMSInputInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputInteractorImpl$sendPhoneNumber$1", f = "LandingSMSInputInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: cl5$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                cl5.this.c.a(this.c, cl5.this.a, cl5.this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public cl5(String str, String str2, il5 il5Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "localityId");
        z65.h(il5Var, "landingSMSInputService");
        this.a = str;
        this.b = str2;
        this.c = il5Var;
    }

    @Override // defpackage.bl5
    public oz3<uq9> a(String str, String str2, String str3) {
        z65.h(str, "number");
        z65.h(str2, "pinCode");
        z65.h(str3, "localityUuid");
        return g(new a(str, str2, str3));
    }

    @Override // defpackage.bl5
    public wx<Unit> b(String str) {
        z65.h(str, "number");
        return f(new b(str, null));
    }

    public wx<Unit> f(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public <T> oz3<T> g(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }
}
