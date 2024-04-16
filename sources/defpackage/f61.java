package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.StateWarningEntity;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.cu7;
import defpackage.fx2;
import defpackage.kk7;
import defpackage.nk9;
import defpackage.ou2;
import defpackage.pt2;
import defpackage.sk9;
import defpackage.sx6;
import defpackage.uu2;
import defpackage.zo7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CheckoutStateFactory.kt */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0082\u0001\b\u0007\u0012\u0006\u0010T\u001a\u00020R\u0012\u0006\u0010W\u001a\u00020U\u0012\u0006\u0010Z\u001a\u00020X\u0012\u0006\u0010^\u001a\u00020[\u0012\u0007\u0010\u0081\u0001\u001a\u00020\u0002\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010g\u001a\u00020e\u0012\u0006\u0010j\u001a\u00020h\u0012\u0006\u0010m\u001a\u00020k\u0012\u0006\u0010p\u001a\u00020n\u0012\u0006\u0010s\u001a\u00020q\u0012\f\u0010w\u001a\b\u0012\u0004\u0012\u00020u0t\u0012\u0006\u0010z\u001a\u00020x¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\f\u0010%\u001a\u00020$*\u00020#H\u0002J(\u0010+\u001a\u00020\u0005*\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\fH\u0002J\u001c\u0010.\u001a\u0004\u0018\u00010-*\u00020,2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\fH\u0002J\u0018\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u00104\u001a\u0002032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00100\u001a\u00020/H\u0002J.\u00107\u001a\u000205*\u0002052\b\u00106\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u000205*\u0002052\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\fH\u0096\u0001J\r\u0010<\u001a\u000205*\u000205H\u0096\u0001J\u001e\u0010=\u001a\u000205*\u0002052\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u000205*\u0002052\u0006\u0010?\u001a\u00020-H\u0096\u0001J\u0015\u0010B\u001a\u000205*\u0002052\u0006\u0010A\u001a\u000209H\u0096\u0001J\r\u0010C\u001a\u000205*\u000205H\u0096\u0001J\u001e\u0010E\u001a\u000205*\u0002052\b\u0010D\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\bE\u0010>J\r\u0010F\u001a\u000205*\u000205H\u0096\u0001J\r\u0010G\u001a\u000205*\u000205H\u0096\u0001J\u0015\u0010H\u001a\u000205*\u0002052\u0006\u0010!\u001a\u00020 H\u0096\u0001J\u0015\u0010I\u001a\u000205*\u0002052\u0006\u0010!\u001a\u00020 H\u0096\u0001J\u0015\u0010K\u001a\u000205*\u0002052\u0006\u0010J\u001a\u00020)H\u0096\u0001J\u0015\u0010L\u001a\u000205*\u0002052\u0006\u0010J\u001a\u00020)H\u0096\u0001J\u001e\u0010M\u001a\u000205*\u0002052\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\bM\u0010>J\r\u0010N\u001a\u000205*\u000205H\u0096\u0001J\r\u0010O\u001a\u000205*\u000205H\u0096\u0001J\u001e\u0010Q\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010P\u001a\b\u0012\u0004\u0012\u0002090\fH\u0016R\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010fR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010iR\u0014\u0010m\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010oR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010rR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010vR\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010yR\u001c\u0010~\u001a\n |*\u0004\u0018\u00010{0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010}R\u001d\u0010\u0080\u0001\u001a\n |*\u0004\u0018\u00010u0u8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u007f¨\u0006\u0084\u0001"}, d2 = {"Lf61;", "Le61;", "Lh61;", "Lb41;", "checkoutDetails", "Lwk7;", Image.TYPE_HIGH, "", "Lls2;", "times", "Lsx6;", "g", "", "allAvailableTimes", "", "selectedDeferredTime", "Lsx6$a;", "j", "(Ljava/util/Collection;Ljava/lang/Long;)Ljava/util/List;", "fromTime", "", "title", "", "isSelected", "isSuggested", "Lsx6$a$d;", "l", "(Ljava/lang/Long;Ljava/lang/String;ZZ)Lsx6$a$d;", "Lzo7;", "i", "Ly41;", "b", "Ljw7;", "paymentWay", Image.TYPE_MEDIUM, "Lzs7;", "Lcu7;", "q", "Lkk7;", "Lw6;", "addresses", "Ld88;", "pizzerias", "p", "Lkk7$b;", "Lou2;", com.huawei.hms.opendevice.c.a, "Llia;", "cart", "Lin6;", "f", "Lfx2;", e.a, "Lb61;", CrashHianalyticsData.TIME, "o", "(Lb61;Ljava/lang/Long;Ljava/lang/String;Z)Lb61;", "Ld41;", "errors", "F", "x", "B", "(Lb61;Ljava/lang/Long;)Lb61;", "deliverablePlace", "w", "error", "z", "G", "loadingTime", "v", "t", "D", "u", "A", "pizzeria", "C", "y", "n", "k", "E", "checkoutErrors", "a", "Lx42;", "Lx42;", "customerAddressService", "Le98;", "Le98;", "pizzeriaService", "Lfq0;", "Lfq0;", "cartContentService", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Lej6;", "Lej6;", "minDeliveryPriceInfoProvider", "Lava;", "Lava;", "stateProvider", "Lj2c;", "Lj2c;", "vpnChecker", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lx51;", "Lx51;", "checkoutService", "Li00;", "Li00;", "authorizationState", "Ldt5;", "Ldt5;", "locality", "Las8;", "Lay1;", "Las8;", "countryProvider", "Lap7;", "Lap7;", "packagingStateResolver", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "()Lay1;", "currentCountry", "checkoutStateLogic", "<init>", "(Lx42;Le98;Lfq0;Lhq3;Lh61;Lej6;Lava;Lj2c;Lf8c;Lx51;Li00;Ldt5;Las8;Lap7;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f61  reason: default package */
/* loaded from: classes4.dex */
public final class f61 implements e61, h61 {
    private final x42 a;
    private final e98 b;
    private final fq0 c;
    private final hq3 d;
    private final ej6 e;
    private final ava f;
    private final j2c g;
    private final f8c h;
    private final x51 i;
    private final i00 j;
    private final dt5 k;
    private final as8<ay1> l;
    private final ap7 m;
    private final /* synthetic */ h61 n;
    private final Logger o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsx6$a;", CrashHianalyticsData.TIME, "", "a", "(Lsx6$a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f61$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<sx6.a, CharSequence> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(sx6.a aVar) {
            z65.h(aVar, CrashHianalyticsData.TIME);
            if (aVar instanceof sx6.a.C0671a) {
                return "Another time";
            }
            if (aVar instanceof sx6.a.c) {
                return "Faster";
            }
            if (aVar instanceof sx6.a.d) {
                Long e = ((sx6.a.d) aVar).e();
                return "Time " + e;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lls2;", CrashHianalyticsData.TIME, "", "a", "(Lls2;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f61$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<ls2, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(ls2 ls2Var) {
            z65.h(ls2Var, CrashHianalyticsData.TIME);
            if (ls2Var.f()) {
                Long b = ls2Var.b();
                return "Carryout " + b;
            } else if (ls2Var.g()) {
                return "Faster";
            } else {
                Long b2 = ls2Var.b();
                return "Delivery " + b2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzo7;", "a", "()Lzo7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f61$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function0<zo7> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final zo7 invoke() {
            return zo7.c.a;
        }
    }

    public f61(x42 x42Var, e98 e98Var, fq0 fq0Var, hq3 hq3Var, h61 h61Var, ej6 ej6Var, ava avaVar, j2c j2cVar, f8c f8cVar, x51 x51Var, i00 i00Var, dt5 dt5Var, as8<ay1> as8Var, ap7 ap7Var) {
        z65.h(x42Var, "customerAddressService");
        z65.h(e98Var, "pizzeriaService");
        z65.h(fq0Var, "cartContentService");
        z65.h(hq3Var, "featureService");
        z65.h(h61Var, "checkoutStateLogic");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        z65.h(avaVar, "stateProvider");
        z65.h(j2cVar, "vpnChecker");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(x51Var, "checkoutService");
        z65.h(i00Var, "authorizationState");
        z65.h(dt5Var, "locality");
        z65.h(as8Var, "countryProvider");
        z65.h(ap7Var, "packagingStateResolver");
        this.a = x42Var;
        this.b = e98Var;
        this.c = fq0Var;
        this.d = hq3Var;
        this.e = ej6Var;
        this.f = avaVar;
        this.g = j2cVar;
        this.h = f8cVar;
        this.i = x51Var;
        this.j = i00Var;
        this.k = dt5Var;
        this.l = as8Var;
        this.m = ap7Var;
        this.n = h61Var;
        this.o = LoggerFactory.getLogger("CheckoutStateFactory");
    }

    private final y41 b(b41 b41Var) {
        String str;
        StateWarningEntity stateWarningEntity;
        lia a2 = this.c.a();
        boolean z = !z65.c(a2.i(), a2.j());
        boolean a3 = this.d.a(bq3.e);
        boolean a4 = this.d.a(bq3.q);
        boolean a5 = this.d.a(bq3.p5);
        int d = b41Var.d();
        boolean g = this.a.g();
        Iterator<StateWarningEntity> it = this.f.e().getWarnings().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                stateWarningEntity = it.next();
                Integer code = stateWarningEntity.getCode();
                if (code != null && code.intValue() == 102) {
                    break;
                }
            } else {
                stateWarningEntity = null;
                break;
            }
        }
        StateWarningEntity stateWarningEntity2 = stateWarningEntity;
        if (stateWarningEntity2 != null) {
            str = stateWarningEntity2.getDescription();
        }
        return new y41(g, z, a3, d, a4, str, a5, m(b41Var.g().b()), z65.c(d().getCode(), "826"));
    }

    private final ou2 c(kk7.b bVar, Collection<w6> collection) {
        Object obj;
        if (bVar instanceof kk7.b.a) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((w6) obj).getId(), ((kk7.b.a) bVar).a())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            w6 w6Var = (w6) obj;
            if (w6Var == null) {
                return null;
            }
            return new ou2.b(w6Var);
        } else if (bVar instanceof kk7.b.C0408b) {
            e91 a2 = ((kk7.b.C0408b) bVar).a();
            if (a2 == e91.e) {
                a2 = null;
            }
            if (a2 == null) {
                return null;
            }
            return new ou2.c(a2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final ay1 d() {
        return this.l.get();
    }

    private final fx2 e(b41 b41Var, lia liaVar) {
        if (this.d.a(bq3.b5) && (b41Var.e() instanceof kk7.b) && (!liaVar.c().c().isEmpty())) {
            return new fx2.a(liaVar.c().c(), fx2.a.d.a(liaVar.c().c()), liaVar.c().b());
        } else if (this.d.a(bq3.a5) && (b41Var.e() instanceof kk7.b)) {
            if (liaVar.c().a().d()) {
                return fx2.b.a;
            }
            return new fx2.d(liaVar.c().a());
        } else {
            return fx2.c.a;
        }
    }

    private final in6 f(lia liaVar, b41 b41Var) {
        boolean z;
        fx2 e = e(b41Var, liaVar);
        if (liaVar.d().d() && !(e instanceof fx2.d) && !(e instanceof fx2.b) && !(e instanceof fx2.a)) {
            z = false;
        } else {
            z = true;
        }
        return new in6(liaVar.n(), e, liaVar.i(), liaVar.o(), liaVar.d(), z, this.e.b());
    }

    private final sx6 g(b41 b41Var, List<ls2> list) {
        String i0;
        String i02;
        if (this.o.isTraceEnabled()) {
            i02 = sc1.i0(list, null, null, null, 0, null, b.a, 31, null);
            Logger logger = this.o;
            int size = list.size();
            logger.trace("Got deferred times from service. Count=" + size + "; Times=[" + i02 + "]");
        }
        List<sx6.a> j = j(list, b41Var.c());
        if (!j.isEmpty()) {
            j = sc1.r0(j, sx6.a.C0671a.a);
        }
        if (this.o.isTraceEnabled()) {
            i0 = sc1.i0(j, null, null, null, 0, null, a.a, 31, null);
            Logger logger2 = this.o;
            logger2.trace("Resulting times are " + i0);
        }
        return new sx6.b.C0672b(j);
    }

    private final wk7 h(b41 b41Var) {
        return p(b41Var.e(), ru2.a(this.a.getAll()), this.b.a(this.k));
    }

    private final zo7 i(b41 b41Var) {
        zo7.d dVar;
        Integer h = b41Var.h();
        if (h != null) {
            return new zo7.a(h.intValue());
        }
        Boolean i = b41Var.i();
        if (i != null) {
            dVar = new zo7.d(i.booleanValue());
        } else {
            dVar = null;
        }
        return (zo7) mh5.d(dVar, c.a);
    }

    private final List<sx6.a> j(Collection<ls2> collection, Long l) {
        int w;
        Object obj;
        List<sx6.a> r0;
        long j;
        sx6.a.b l2;
        Collection<ls2> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection2) {
            if (!((ls2) obj2).c()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((ls2) obj3).d()) {
                arrayList2.add(obj3);
            }
        }
        w = lc1.w(arrayList2, 10);
        ArrayList<sx6.a> arrayList3 = new ArrayList(w);
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ls2 ls2Var = (ls2) it.next();
            if (ls2Var.g()) {
                String e = ls2Var.e();
                if (l != null) {
                    z = false;
                }
                l2 = new sx6.a.c(e, z, false, ls2Var.d());
            } else {
                Long b2 = ls2Var.b();
                if (b2 != null) {
                    j = b2.longValue();
                } else {
                    j = 0;
                }
                l2 = l(Long.valueOf(j), ls2Var.e(), z65.c(l, ls2Var.b()), ls2Var.d());
            }
            arrayList3.add(l2);
        }
        if (l != null) {
            if (!arrayList3.isEmpty()) {
                for (sx6.a aVar : arrayList3) {
                    if ((aVar instanceof sx6.a.b) && ((sx6.a.b) aVar).g()) {
                        return arrayList3;
                    }
                }
            }
            Iterator<T> it2 = collection2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (z65.c(((ls2) obj).b(), l)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ls2 ls2Var2 = (ls2) obj;
            if (ls2Var2 != null) {
                r0 = sc1.r0(arrayList3, l(ls2Var2.b(), ls2Var2.e(), true, ls2Var2.d()));
                return r0;
            }
            return arrayList3;
        }
        return arrayList3;
    }

    private final sx6.a.d l(Long l, String str, boolean z, boolean z2) {
        return new sx6.a.d(l, str, z, false, z2);
    }

    private final boolean m(jw7 jw7Var) {
        du7 c2;
        if (!this.d.a(bq3.q5) || jw7Var == null || (c2 = jw7Var.c()) == null) {
            return false;
        }
        if (!du7.b.a(Integer.valueOf(c2.i())).o() || !this.g.a()) {
            return false;
        }
        return true;
    }

    private final wk7 p(kk7 kk7Var, Collection<w6> collection, Collection<d88> collection2) {
        Object obj;
        Object obj2;
        Object obj3 = null;
        if (kk7Var instanceof kk7.b) {
            ou2 c2 = c((kk7.b) kk7Var, collection);
            if (c2 == null) {
                c2 = null;
            }
            if (c2 != null) {
                obj3 = new uu2.a.C0694a(c2);
            }
            return (wk7) mh5.c(obj3, uu2.c.e);
        } else if (kk7Var instanceof kk7.a) {
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (z65.c(((d88) obj2).getId(), ((kk7.a) kk7Var).a())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            d88 d88Var = (d88) obj2;
            if (d88Var != null) {
                obj3 = new bq0.a.C0072a(d88Var);
            }
            return (wk7) mh5.c(obj3, bq0.b.e);
        } else if (kk7Var instanceof kk7.c) {
            Iterator<T> it2 = collection2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (z65.c(((d88) obj).getId(), ((kk7.c) kk7Var).a())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            d88 d88Var2 = (d88) obj;
            if (d88Var2 != null) {
                obj3 = new nk9.b.a(d88Var2);
            }
            return (wk7) mh5.c(obj3, nk9.a.e);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final cu7 q(zs7 zs7Var) {
        jw7 b2 = zs7Var.b();
        if (b2 != null) {
            return new cu7.a(b2);
        }
        return cu7.c.b;
    }

    @Override // defpackage.h61
    public b61 A(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.n.A(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 B(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return this.n.B(b61Var, l);
    }

    @Override // defpackage.h61
    public b61 C(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.n.C(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 D(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.n.D(b61Var);
    }

    @Override // defpackage.h61
    public b61 E(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.n.E(b61Var);
    }

    @Override // defpackage.h61
    public b61 F(b61 b61Var, Collection<? extends d41> collection) {
        z65.h(b61Var, "<this>");
        z65.h(collection, "errors");
        return this.n.F(b61Var, collection);
    }

    @Override // defpackage.h61
    public b61 G(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.n.G(b61Var);
    }

    @Override // defpackage.e61
    public b61 a(b41 b41Var, Collection<? extends d41> collection) {
        Object b2;
        List<ls2> list;
        boolean z;
        List<ls2> b3;
        Object Z;
        pt2 aVar;
        sx6 sx6Var;
        List<ok9> l;
        zo7 i;
        Object obj;
        z65.h(b41Var, "checkoutDetails");
        z65.h(collection, "checkoutErrors");
        boolean z2 = false;
        if (!this.j.b()) {
            list = kc1.l();
        } else {
            try {
                sk9.a aVar2 = sk9.b;
                this.o.trace("Getting deferred times for delivery");
                String b4 = this.h.b();
                if (b4.length() == 0) {
                    b3 = kc1.l();
                } else {
                    if (!(b41Var.e() instanceof kk7.a) && !(b41Var.e() instanceof kk7.c)) {
                        z = false;
                        b3 = this.i.e(b4, z).b().b();
                    }
                    z = true;
                    b3 = this.i.e(b4, z).b().b();
                }
                b2 = sk9.b(b3);
            } catch (Throwable th) {
                sk9.a aVar3 = sk9.b;
                b2 = sk9.b(vk9.a(th));
            }
            if (sk9.d(b2) != null) {
                b2 = kc1.l();
            }
            list = (List) b2;
        }
        if (b41Var.c() != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((ls2) obj).b(), b41Var.c())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                z2 = true;
            }
        }
        if (!list.isEmpty()) {
            Z = sc1.Z(list);
            if (((ls2) Z).b() != null && !z2) {
                aVar = pt2.e.b;
            } else {
                aVar = new pt2.a(b41Var.c(), b41Var.j());
            }
        } else {
            aVar = pt2.c.b;
        }
        pt2 pt2Var = aVar;
        if (!(pt2Var instanceof pt2.c) && !(pt2Var instanceof pt2.e)) {
            sx6Var = g(b41Var, list);
        } else {
            sx6Var = sx6.c.a;
        }
        sx6 sx6Var2 = sx6Var;
        wk7 h = h(b41Var);
        if (!(h instanceof nk9.b)) {
            l = kc1.l();
            i = i(b41Var);
        } else {
            l = ((nk9.b) h).e().K();
            if (!l.isEmpty()) {
                i = this.m.b(i(b41Var), l);
            } else {
                throw new IllegalStateException("Restaurant service types list is empty".toString());
            }
        }
        return F(k(new b61(q(b41Var.g()), h, i, l, pt2Var, sx6Var2, f(this.c.a(), b41Var), b(b41Var), null, null, null, this.c.a().p(), b41Var.f(), 1792, null)), collection);
    }

    @Override // defpackage.h61
    public b61 k(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.n.k(b61Var);
    }

    @Override // defpackage.h61
    public b61 n(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return this.n.n(b61Var, l);
    }

    @Override // defpackage.h61
    public b61 o(b61 b61Var, Long l, String str, boolean z) {
        z65.h(b61Var, "<this>");
        z65.h(str, "title");
        return this.n.o(b61Var, l, str, z);
    }

    @Override // defpackage.h61
    public b61 t(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.n.t(b61Var);
    }

    @Override // defpackage.h61
    public b61 u(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.n.u(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 v(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return this.n.v(b61Var, l);
    }

    @Override // defpackage.h61
    public b61 w(b61 b61Var, ou2 ou2Var) {
        z65.h(b61Var, "<this>");
        z65.h(ou2Var, "deliverablePlace");
        return this.n.w(b61Var, ou2Var);
    }

    @Override // defpackage.h61
    public b61 x(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.n.x(b61Var);
    }

    @Override // defpackage.h61
    public b61 y(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.n.y(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 z(b61 b61Var, d41 d41Var) {
        z65.h(b61Var, "<this>");
        z65.h(d41Var, "error");
        return this.n.z(b61Var, d41Var);
    }
}
