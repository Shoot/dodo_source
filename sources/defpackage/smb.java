package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import im.threads.business.transport.MessageAttributes;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TreeTargeting.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u0004\u000b\f\u0006\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lsmb;", "Lct4;", "Lt6b;", "", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, com.huawei.hms.push.e.a, "f", "g", "Ldb7;", "Lsmb$a;", "Lsmb$b;", "Lsmb$c;", "Lsmb$d;", "Lsmb$e;", "Lsmb$f;", "Lsmb$g;", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: smb  reason: default package */
/* loaded from: classes.dex */
public abstract class smb implements ct4, t6b {
    private final String a;

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lsmb$a;", "Lsmb;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "Lwg5;", "Lwg5;", "getKind", "()Lwg5;", "kind", "", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "ids", "Lwx4;", com.huawei.hms.push.e.a, "Lbk6;", "()Lwx4;", "inAppGeoRepositoryImpl", "<init>", "(Ljava/lang/String;Lwg5;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$a */
    /* loaded from: classes.dex */
    public static final class a extends smb {
        static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(a.class, "inAppGeoRepositoryImpl", "getInAppGeoRepositoryImpl()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/InAppGeoRepository;", 0))};
        private final String b;
        private final wg5 c;
        private final List<String> d;
        private final bk6 e;

        /* compiled from: TreeTargeting.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lwx4;", "a", "(Lgo;)Lwx4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: smb$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0667a extends ej5 implements Function1<go, wx4> {
            public static final C0667a a = new C0667a();

            C0667a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final wx4 invoke(go goVar) {
                z65.h(goVar, "$this$mindboxInject");
                return goVar.U0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, wg5 wg5Var, List<String> list) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(wg5Var, "kind");
            z65.h(list, "ids");
            this.b = str;
            this.c = wg5Var;
            this.d = list;
            this.e = ck6.a(C0667a.a);
        }

        private final wx4 e() {
            return (wx4) this.e.a(this, f[0]);
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            z65.h(s6bVar, "data");
            if (e().c() != he4.GEO_FETCH_SUCCESS) {
                return false;
            }
            String a = e().b().a();
            if (this.c == wg5.POSITIVE) {
                return this.d.contains(a);
            }
            if (this.d.contains(a)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.t6b
        public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
            Object d;
            if (e().c() == he4.GEO_NOT_FETCHED) {
                Object a = e().a(cv1Var);
                d = c75.d();
                if (a == d) {
                    return a;
                }
                return Unit.a;
            }
            return Unit.a;
        }

        @Override // defpackage.t6b
        public Object c(cv1<? super Set<String>> cv1Var) {
            Set e;
            e = sfa.e();
            return e;
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.b, aVar.b) && this.c == aVar.c && z65.c(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "CityNode(type=" + this.b + ", kind=" + this.c + ", ids=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lsmb$b;", "Lsmb;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "Lwg5;", "Lwg5;", "getKind", "()Lwg5;", "kind", "", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "ids", "Lwx4;", com.huawei.hms.push.e.a, "Lbk6;", "()Lwx4;", "inAppGeoRepositoryImpl", "<init>", "(Ljava/lang/String;Lwg5;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$b */
    /* loaded from: classes.dex */
    public static final class b extends smb {
        static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(b.class, "inAppGeoRepositoryImpl", "getInAppGeoRepositoryImpl()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/InAppGeoRepository;", 0))};
        private final String b;
        private final wg5 c;
        private final List<String> d;
        private final bk6 e;

        /* compiled from: TreeTargeting.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lwx4;", "a", "(Lgo;)Lwx4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: smb$b$a */
        /* loaded from: classes.dex */
        static final class a extends ej5 implements Function1<go, wx4> {
            public static final a a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final wx4 invoke(go goVar) {
                z65.h(goVar, "$this$mindboxInject");
                return goVar.U0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, wg5 wg5Var, List<String> list) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(wg5Var, "kind");
            z65.h(list, "ids");
            this.b = str;
            this.c = wg5Var;
            this.d = list;
            this.e = ck6.a(a.a);
        }

        private final wx4 e() {
            return (wx4) this.e.a(this, f[0]);
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            z65.h(s6bVar, "data");
            if (e().c() != he4.GEO_FETCH_SUCCESS) {
                return false;
            }
            String b = e().b().b();
            if (this.c == wg5.POSITIVE) {
                return this.d.contains(b);
            }
            if (this.d.contains(b)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.t6b
        public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
            Object d;
            if (e().c() == he4.GEO_NOT_FETCHED) {
                Object a2 = e().a(cv1Var);
                d = c75.d();
                if (a2 == d) {
                    return a2;
                }
                return Unit.a;
            }
            return Unit.a;
        }

        @Override // defpackage.t6b
        public Object c(cv1<? super Set<String>> cv1Var) {
            Set e;
            e = sfa.e();
            return e;
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.b, bVar.b) && this.c == bVar.c && z65.c(this.d, bVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "CountryNode(type=" + this.b + ", kind=" + this.c + ", ids=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lsmb$c;", "Lsmb;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "", "Ljava/util/List;", com.huawei.hms.push.e.a, "()Ljava/util/List;", "nodes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$c */
    /* loaded from: classes.dex */
    public static final class c extends smb {
        private final String b;
        private final List<smb> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TreeTargeting.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.TreeTargeting$IntersectionNode", f = "TreeTargeting.kt", l = {215}, m = "fetchTargetingInfo")
        /* renamed from: smb$c$a */
        /* loaded from: classes.dex */
        public static final class a extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            int e;

            a(cv1<? super a> cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TreeTargeting.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.TreeTargeting$IntersectionNode", f = "TreeTargeting.kt", l = {209}, m = "getOperationsSet")
        /* renamed from: smb$c$b */
        /* loaded from: classes.dex */
        public static final class b extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            int e;

            b(cv1<? super b> cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return c.this.c(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, List<? extends smb> list) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(list, "nodes");
            this.b = str;
            this.c = list;
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            z65.h(s6bVar, "data");
            boolean z = true;
            for (smb smbVar : this.c) {
                if (!smbVar.a(s6bVar)) {
                    z = false;
                }
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // defpackage.t6b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(defpackage.s6b r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.smb.c.a
                if (r0 == 0) goto L13
                r0 = r7
                smb$c$a r0 = (defpackage.smb.c.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                smb$c$a r0 = new smb$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.b
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.a
                s6b r2 = (defpackage.s6b) r2
                defpackage.vk9.b(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                defpackage.vk9.b(r7)
                java.util.List<smb> r7 = r5.c
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r6.next()
                smb r2 = (defpackage.smb) r2
                r0.a = r7
                r0.b = r6
                r0.e = r3
                java.lang.Object r2 = r2.b(r7, r0)
                if (r2 != r1) goto L46
                return r1
            L5f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.smb.c.b(s6b, cv1):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:20:0x0064). Please submit an issue!!! */
        @Override // defpackage.t6b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(defpackage.cv1<? super java.util.Set<java.lang.String>> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof defpackage.smb.c.b
                if (r0 == 0) goto L13
                r0 = r6
                smb$c$b r0 = (defpackage.smb.c.b) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                smb$c$b r0 = new smb$c$b
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r2 = r0.b
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.a
                java.util.Collection r4 = (java.util.Collection) r4
                defpackage.vk9.b(r6)
                goto L64
            L31:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L39:
                defpackage.vk9.b(r6)
                java.util.List<smb> r6 = r5.c
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r6 = r6.iterator()
                r4 = r2
                r2 = r6
            L4b:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L6c
                java.lang.Object r6 = r2.next()
                smb r6 = (defpackage.smb) r6
                r0.a = r4
                r0.b = r2
                r0.e = r3
                java.lang.Object r6 = r6.c(r0)
                if (r6 != r1) goto L64
                return r1
            L64:
                java.util.Set r6 = (java.util.Set) r6
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                defpackage.ic1.C(r4, r6)
                goto L4b
            L6c:
                java.util.List r4 = (java.util.List) r4
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Set r6 = defpackage.ic1.K0(r4)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.smb.c.c(cv1):java.lang.Object");
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public final List<smb> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.b, cVar.b) && z65.c(this.c, cVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "IntersectionNode(type=" + this.b + ", nodes=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lsmb$d;", "Lsmb;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "Lwg5;", "Lwg5;", "getKind", "()Lwg5;", "kind", "", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "ids", "Lwx4;", com.huawei.hms.push.e.a, "Lbk6;", "()Lwx4;", "inAppGeoRepositoryImpl", "<init>", "(Ljava/lang/String;Lwg5;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$d */
    /* loaded from: classes.dex */
    public static final class d extends smb {
        static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(d.class, "inAppGeoRepositoryImpl", "getInAppGeoRepositoryImpl()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/InAppGeoRepository;", 0))};
        private final String b;
        private final wg5 c;
        private final List<String> d;
        private final bk6 e;

        /* compiled from: TreeTargeting.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lwx4;", "a", "(Lgo;)Lwx4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: smb$d$a */
        /* loaded from: classes.dex */
        static final class a extends ej5 implements Function1<go, wx4> {
            public static final a a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final wx4 invoke(go goVar) {
                z65.h(goVar, "$this$mindboxInject");
                return goVar.U0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, wg5 wg5Var, List<String> list) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(wg5Var, "kind");
            z65.h(list, "ids");
            this.b = str;
            this.c = wg5Var;
            this.d = list;
            this.e = ck6.a(a.a);
        }

        private final wx4 e() {
            return (wx4) this.e.a(this, f[0]);
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            z65.h(s6bVar, "data");
            if (e().c() != he4.GEO_FETCH_SUCCESS) {
                return false;
            }
            String c = e().b().c();
            if (this.c == wg5.POSITIVE) {
                return this.d.contains(c);
            }
            if (this.d.contains(c)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.t6b
        public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
            Object d;
            if (e().c() == he4.GEO_NOT_FETCHED) {
                Object a2 = e().a(cv1Var);
                d = c75.d();
                if (a2 == d) {
                    return a2;
                }
                return Unit.a;
            }
            return Unit.a;
        }

        @Override // defpackage.t6b
        public Object c(cv1<? super Set<String>> cv1Var) {
            Set e;
            e = sfa.e();
            return e;
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (z65.c(this.b, dVar.b) && this.c == dVar.c && z65.c(this.d, dVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "RegionNode(type=" + this.b + ", kind=" + this.c + ", ids=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001b\u0010$\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001e\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lsmb$e;", "Lsmb;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "Lwg5;", "Lwg5;", "getKind", "()Lwg5;", "kind", "f", "segmentationExternalId", com.huawei.hms.push.e.a, "getSegmentExternalId", "segmentExternalId", "Lyy4;", "Lbk6;", "()Lyy4;", "inAppSegmentationRepository", "<init>", "(Ljava/lang/String;Lwg5;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$e */
    /* loaded from: classes.dex */
    public static final class e extends smb {
        static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(e.class, "inAppSegmentationRepository", "getInAppSegmentationRepository()Lcloud/mindbox/mobile_sdk/inapp/domain/interfaces/repositories/InAppSegmentationRepository;", 0))};
        private final String b;
        private final wg5 c;
        private final String d;
        private final String e;
        private final bk6 f;

        /* compiled from: TreeTargeting.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: smb$e$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[wg5.values().length];
                try {
                    iArr[wg5.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wg5.NEGATIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* compiled from: TreeTargeting.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lyy4;", "a", "(Lgo;)Lyy4;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: smb$e$b */
        /* loaded from: classes.dex */
        static final class b extends ej5 implements Function1<go, yy4> {
            public static final b a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final yy4 invoke(go goVar) {
                z65.h(goVar, "$this$mindboxInject");
                return goVar.W0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, wg5 wg5Var, String str2, String str3) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(wg5Var, "kind");
            z65.h(str2, "segmentationExternalId");
            z65.h(str3, "segmentExternalId");
            this.b = str;
            this.c = wg5Var;
            this.d = str2;
            this.e = str3;
            this.f = ck6.a(b.a);
        }

        private final yy4 e() {
            return (yy4) this.f.a(this, g[0]);
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            Object obj;
            String a2;
            z65.h(s6bVar, "data");
            if (e().c() != q52.SEGMENTATION_FETCH_SUCCESS) {
                return false;
            }
            List<r52> h = e().h();
            int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
            Object obj2 = null;
            if (i != 1) {
                if (i == 2) {
                    Iterator<T> it = h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (z65.c(((r52) next).b(), this.d)) {
                            obj2 = next;
                            break;
                        }
                    }
                    r52 r52Var = (r52) obj2;
                    if (r52Var == null || (a2 = r52Var.a()) == null || !(!z65.c(a2, this.e))) {
                        return false;
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it2 = h.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (z65.c(((r52) obj).b(), this.d)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r52 r52Var2 = (r52) obj;
            if (r52Var2 != null) {
                obj2 = r52Var2.a();
            }
            return z65.c(obj2, this.e);
        }

        @Override // defpackage.t6b
        public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
            Object d;
            if (e().c() == q52.SEGMENTATION_NOT_FETCHED) {
                Object e = e().e(cv1Var);
                d = c75.d();
                if (e == d) {
                    return e;
                }
                return Unit.a;
            }
            return Unit.a;
        }

        @Override // defpackage.t6b
        public Object c(cv1<? super Set<String>> cv1Var) {
            Set e;
            e = sfa.e();
            return e;
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (z65.c(this.b, eVar.b) && this.c == eVar.c && z65.c(this.d, eVar.d) && z65.c(this.e, eVar.e)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "SegmentNode(type=" + this.b + ", kind=" + this.c + ", segmentationExternalId=" + this.d + ", segmentExternalId=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lsmb$f;", "Lsmb;", "Ls6b;", "data", "", "a", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$f */
    /* loaded from: classes.dex */
    public static final class f extends smb {
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            this.b = str;
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            z65.h(s6bVar, "data");
            return true;
        }

        @Override // defpackage.t6b
        public Object b(s6b s6bVar, cv1<? super Unit> cv1Var) {
            return Unit.a;
        }

        @Override // defpackage.t6b
        public Object c(cv1<? super Set<String>> cv1Var) {
            Set e;
            e = sfa.e();
            return e;
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && z65.c(this.b, ((f) obj).b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "TrueNode(type=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: TreeTargeting.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lsmb$g;", "Lsmb;", "Ls6b;", "data", "", "a", "", "", com.huawei.hms.opendevice.c.a, "(Lcv1;)Ljava/lang/Object;", "", "b", "(Ls6b;Lcv1;)Ljava/lang/Object;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.TYPE, "", "Ljava/util/List;", com.huawei.hms.push.e.a, "()Ljava/util/List;", "nodes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: smb$g */
    /* loaded from: classes.dex */
    public static final class g extends smb {
        private final String b;
        private final List<smb> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TreeTargeting.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.TreeTargeting$UnionNode", f = "TreeTargeting.kt", l = {269}, m = "fetchTargetingInfo")
        /* renamed from: smb$g$a */
        /* loaded from: classes.dex */
        public static final class a extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            int e;

            a(cv1<? super a> cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return g.this.b(null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TreeTargeting.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.models.TreeTargeting$UnionNode", f = "TreeTargeting.kt", l = {263}, m = "getOperationsSet")
        /* renamed from: smb$g$b */
        /* loaded from: classes.dex */
        public static final class b extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            int e;

            b(cv1<? super b> cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return g.this.c(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, List<? extends smb> list) {
            super(str, null);
            z65.h(str, MessageAttributes.TYPE);
            z65.h(list, "nodes");
            this.b = str;
            this.c = list;
        }

        @Override // defpackage.ct4
        public boolean a(s6b s6bVar) {
            z65.h(s6bVar, "data");
            boolean z = false;
            for (smb smbVar : this.c) {
                boolean a2 = smbVar.a(s6bVar);
                gk6.a(this, "Check UnionNode " + smbVar.d() + ": " + a2);
                if (a2) {
                    z = true;
                }
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // defpackage.t6b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(defpackage.s6b r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.smb.g.a
                if (r0 == 0) goto L13
                r0 = r7
                smb$g$a r0 = (defpackage.smb.g.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                smb$g$a r0 = new smb$g$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.b
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.a
                s6b r2 = (defpackage.s6b) r2
                defpackage.vk9.b(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                defpackage.vk9.b(r7)
                java.util.List<smb> r7 = r5.c
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r6.next()
                smb r2 = (defpackage.smb) r2
                r0.a = r7
                r0.b = r6
                r0.e = r3
                java.lang.Object r2 = r2.b(r7, r0)
                if (r2 != r1) goto L46
                return r1
            L5f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.smb.g.b(s6b, cv1):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:20:0x0064). Please submit an issue!!! */
        @Override // defpackage.t6b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object c(defpackage.cv1<? super java.util.Set<java.lang.String>> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof defpackage.smb.g.b
                if (r0 == 0) goto L13
                r0 = r6
                smb$g$b r0 = (defpackage.smb.g.b) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                smb$g$b r0 = new smb$g$b
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r2 = r0.b
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r4 = r0.a
                java.util.Collection r4 = (java.util.Collection) r4
                defpackage.vk9.b(r6)
                goto L64
            L31:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L39:
                defpackage.vk9.b(r6)
                java.util.List<smb> r6 = r5.c
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r6 = r6.iterator()
                r4 = r2
                r2 = r6
            L4b:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L6c
                java.lang.Object r6 = r2.next()
                smb r6 = (defpackage.smb) r6
                r0.a = r4
                r0.b = r2
                r0.e = r3
                java.lang.Object r6 = r6.c(r0)
                if (r6 != r1) goto L64
                return r1
            L64:
                java.util.Set r6 = (java.util.Set) r6
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                defpackage.ic1.C(r4, r6)
                goto L4b
            L6c:
                java.util.List r4 = (java.util.List) r4
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Set r6 = defpackage.ic1.K0(r4)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.smb.g.c(cv1):java.lang.Object");
        }

        @Override // defpackage.smb
        public String d() {
            return this.b;
        }

        public final List<smb> e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (z65.c(this.b, gVar.b) && z65.c(this.c, gVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "UnionNode(type=" + this.b + ", nodes=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ smb(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String d() {
        return this.a;
    }

    private smb(String str) {
        this.a = str;
    }
}
