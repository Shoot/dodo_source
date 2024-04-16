package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cj3;
import io.realm.RealmQuery;
import io.realm.d0;
import io.realm.internal.OsRealmConfig;
import io.realm.j0;
import io.realm.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: RealmDatabaseConnectionDriver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0006\u0004\bB\u001f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lg89;", "Lam2;", "Lg89$a;", "", "b", "", "a", "Lbm2;", com.huawei.hms.opendevice.c.a, "Lio/realm/j0;", "Lio/realm/j0;", "realmConfiguration", "Lbm2;", "connectionFactory", "<init>", "(Lio/realm/j0;Lbm2;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: g89  reason: default package */
/* loaded from: classes2.dex */
public final class g89 implements am2<a> {
    private final j0 a;
    private final bm2<a> b;

    /* compiled from: RealmDatabaseConnectionDriver.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b.\u0010/J$\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t*\u00020\bH\u0002J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J \u0010\u001c\u001a\u00020\u0013\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J)\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J&\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001a\u0010!\u001a\u00020\u0013\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016J@\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u001e\u0010#\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\"H\u0016R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u001c\u0010+\u001a\n )*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010,\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lg89$a;", "Lbm4;", "Lyi3;", "T", "Lvu8;", "Lio/realm/RealmQuery;", "Lo89;", DateTokenConverter.CONVERTER_KEY, "Lcj3;", "Ljava/lang/Class;", com.huawei.hms.opendevice.c.a, "entityInformation", "entity", "", "a", "(Lcj3;Lyi3;)Ljava/util/List;", "", "entities", "b", "", "close", "invalidate", "", Image.TYPE_HIGH, "beginTransaction", "p", "o", SearchIntents.EXTRA_QUERY, "l", "i", "(Lcj3;Lyi3;)Lyi3;", Image.TYPE_MEDIUM, "j", "k", "Lkotlin/Function1;", "queryBuilder", "n", "Lio/realm/d0;", "Lio/realm/d0;", "realmInstance", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "isClosed", "()Z", "<init>", "(Lio/realm/d0;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: g89$a */
    /* loaded from: classes2.dex */
    public static final class a implements bm4 {
        private final d0 a;
        private final Logger b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: RealmDatabaseConnectionDriver.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lyi3;", "T", "Lvu8;", "q", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: g89$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0322a<T> extends ej5 implements Function1<vu8<T>, vu8<T>> {
            public static final C0322a a = new C0322a();

            C0322a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final vu8<T> invoke(vu8<T> vu8Var) {
                z65.h(vu8Var, "q");
                return vu8Var;
            }
        }

        public a(d0 d0Var) {
            z65.h(d0Var, "realmInstance");
            this.a = d0Var;
            this.b = LoggerFactory.getLogger("RealmDatabaseConnection");
        }

        private final <T extends yi3> List<T> a(cj3 cj3Var, T t) {
            List<T> f;
            List<T> l;
            String id = t.getId();
            if (id == null) {
                f = null;
            } else {
                RealmQuery Y0 = this.a.Y0(c(cj3Var));
                if (Y0 != null) {
                    f = new c(Y0).b(yi3.a.a(), id).f();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type io.realm.RealmQuery<T of com.dodopizza.persistence.realm.RealmDatabaseConnectionDriver.RealmDatabaseConnection.getManagedEntities$lambda-3>");
                }
            }
            if (f == null) {
                l = kc1.l();
                return l;
            }
            return f;
        }

        private final <T extends yi3> List<T> b(cj3 cj3Var, Collection<? extends T> collection) {
            int w;
            List<T> l;
            ArrayList<yi3> arrayList = new ArrayList();
            for (Object obj : collection) {
                if (((yi3) obj).getId() != null) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (yi3 yi3Var : arrayList) {
                String id = yi3Var.getId();
                z65.e(id);
                arrayList2.add(id);
            }
            if (arrayList2.isEmpty()) {
                l = kc1.l();
                return l;
            }
            RealmQuery Y0 = this.a.Y0(c(cj3Var));
            if (Y0 != null) {
                c cVar = new c(Y0);
                String a = yi3.a.a();
                Object[] array = arrayList2.toArray(new String[0]);
                if (array != null) {
                    return cVar.d(a, (String[]) array).f();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type io.realm.RealmQuery<T of com.dodopizza.persistence.realm.RealmDatabaseConnectionDriver.RealmDatabaseConnection.getManagedEntities>");
        }

        private final Class<o89> c(cj3 cj3Var) {
            Class cls;
            if (cj3Var instanceof cj3.a) {
                cls = Class.forName(((cj3.a) cj3Var).a());
            } else if (cj3Var instanceof cj3.c) {
                cls = gd5.a(((cj3.c) cj3Var).a());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (cls != null) {
                return cls;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<io.realm.RealmModel>");
        }

        private final <T extends yi3> RealmQuery<? extends o89> d(vu8<T> vu8Var) {
            return ((c) vu8Var).g();
        }

        @Override // defpackage.zl2
        public void beginTransaction() {
            this.a.beginTransaction();
        }

        @Override // defpackage.bm4
        public void close() {
            this.a.close();
        }

        @Override // defpackage.zl2
        public boolean h() {
            return this.a.H();
        }

        @Override // defpackage.zl2
        public <T extends yi3> T i(cj3 cj3Var, T t) {
            z65.h(cj3Var, "entityInformation");
            z65.h(t, "entity");
            k89.a(this.a, a(cj3Var, t));
            d0 d0Var = this.a;
            d0Var.S(d0Var.j0((o89) t, new ex4[0]));
            return t;
        }

        @Override // defpackage.bm4
        public void invalidate() {
            this.a.K();
        }

        @Override // defpackage.bm4
        public boolean isClosed() {
            return this.a.isClosed();
        }

        @Override // defpackage.zl2
        public <T extends yi3> List<T> j(vu8<T> vu8Var) {
            z65.h(vu8Var, SearchIntents.EXTRA_QUERY);
            List<T> W = this.a.W(d(vu8Var).g());
            if (W != null) {
                return W;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<T of com.dodopizza.persistence.realm.RealmDatabaseConnectionDriver.RealmDatabaseConnection.select>");
        }

        @Override // defpackage.zl2
        public <T extends yi3> void k(cj3 cj3Var) {
            z65.h(cj3Var, "entityInformation");
            d0 d0Var = this.a;
            p0<? extends o89> g = d(n(cj3Var, C0322a.a)).g();
            z65.g(g, "createQuery<T>(entityInf…\n              .findAll()");
            k89.a(d0Var, g);
        }

        @Override // defpackage.zl2
        public <T extends yi3> void l(vu8<T> vu8Var) {
            z65.h(vu8Var, SearchIntents.EXTRA_QUERY);
            d0 d0Var = this.a;
            p0<? extends o89> g = d(vu8Var).g();
            z65.g(g, "query.toRealmQuery()\n              .findAll()");
            k89.a(d0Var, g);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.zl2
        public <T extends yi3> Collection<T> m(cj3 cj3Var, Collection<? extends T> collection) {
            int w;
            z65.h(cj3Var, "entityInformation");
            z65.h(collection, "entities");
            k89.a(this.a, b(cj3Var, collection));
            d0 d0Var = this.a;
            Collection<? extends T> collection2 = collection;
            w = lc1.w(collection2, 10);
            ArrayList arrayList = new ArrayList(w);
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add((o89) ((yi3) it.next()));
            }
            d0Var.W(d0Var.l0(arrayList, new ex4[0]));
            return collection;
        }

        @Override // defpackage.zl2
        public <T extends yi3> vu8<T> n(cj3 cj3Var, Function1<? super vu8<T>, ? extends vu8<T>> function1) {
            z65.h(cj3Var, "entityInformation");
            z65.h(function1, "queryBuilder");
            RealmQuery Y0 = this.a.Y0(c(cj3Var));
            if (Y0 != null) {
                return function1.invoke(new c(Y0));
            }
            throw new NullPointerException("null cannot be cast to non-null type io.realm.RealmQuery<T of com.dodopizza.persistence.realm.RealmDatabaseConnectionDriver.RealmDatabaseConnection.createQuery>");
        }

        @Override // defpackage.zl2
        public void o() {
            this.a.a();
        }

        @Override // defpackage.zl2
        public void p() {
            this.a.i();
            k33 k33Var = k33.a;
            j0 s = this.a.s();
            z65.g(s, "realmInstance.configuration");
            long c = k33Var.c(s);
            Logger logger = this.b;
            logger.trace("realmDBSize [db size = " + k33Var.a(c) + ']');
        }
    }

    /* compiled from: RealmDatabaseConnectionDriver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lg89$b;", "Lbm2;", "Lg89$a;", "b", "Lio/realm/j0;", "a", "Lio/realm/j0;", "realmConfiguration", "<init>", "(Lio/realm/j0;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: g89$b */
    /* loaded from: classes2.dex */
    public static final class b implements bm2<a> {
        private final j0 a;

        public b(j0 j0Var) {
            z65.h(j0Var, "realmConfiguration");
            this.a = j0Var;
        }

        @Override // defpackage.bm2
        /* renamed from: b */
        public a a() {
            d0 F0 = d0.F0(this.a);
            z65.g(F0, "getInstance(realmConfiguration)");
            return new a(F0);
        }
    }

    /* compiled from: RealmDatabaseConnectionDriver.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \r*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0010B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u0011\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001e"}, d2 = {"Lg89$c;", "Lyi3;", "T", "Lvu8;", "Lio/realm/p0;", "", com.huawei.hms.opendevice.c.a, "", "field", "value", e.a, "", "values", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;[Ljava/lang/String;)Lg89$c;", "f", "a", "()Lyi3;", "Lio/realm/RealmQuery;", "Lio/realm/RealmQuery;", "g", "()Lio/realm/RealmQuery;", "realmQuery", "", "b", "I", "offset", "count", "<init>", "(Lio/realm/RealmQuery;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: g89$c */
    /* loaded from: classes2.dex */
    public static final class c<T extends yi3> implements vu8<T> {
        private static final int e = 0;
        private final RealmQuery<T> a;
        private int b;
        private int c;
        public static final a d = new a(null);
        private static final int f = -1;

        /* compiled from: RealmDatabaseConnectionDriver.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg89$c$a;", "", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: g89$c$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public c(RealmQuery<T> realmQuery) {
            z65.h(realmQuery, "realmQuery");
            this.a = realmQuery;
            this.b = e;
            this.c = f;
        }

        private final List<T> c(p0<T> p0Var) {
            int intValue;
            int intValue2 = Integer.valueOf(this.c).intValue();
            Integer num = (intValue2 == f || intValue2 >= p0Var.size()) ? null : null;
            if (num == null) {
                intValue = p0Var.size();
            } else {
                intValue = num.intValue();
            }
            List<T> subList = p0Var.subList(this.b, intValue);
            z65.g(subList, "let { result ->\n        …offset, endIndex)\n      }");
            return subList;
        }

        @Override // defpackage.vu8
        public T a() {
            return this.a.h();
        }

        public c<T> d(String str, String[] strArr) {
            z65.h(str, "field");
            z65.h(strArr, "values");
            g().j(str, strArr);
            return this;
        }

        @Override // defpackage.vu8
        /* renamed from: e */
        public c<T> b(String str, String str2) {
            z65.h(str, "field");
            z65.h(str2, "value");
            g().e(str, str2);
            return this;
        }

        public List<T> f() {
            p0<T> g = this.a.g();
            z65.g(g, "realmQuery.findAll()");
            return c(g);
        }

        public final RealmQuery<T> g() {
            return this.a;
        }
    }

    public g89(j0 j0Var, bm2<a> bm2Var) {
        z65.h(j0Var, "realmConfiguration");
        z65.h(bm2Var, "connectionFactory");
        this.a = j0Var;
        this.b = bm2Var;
    }

    @Override // defpackage.am2
    public int a() {
        return d0.E0(this.a);
    }

    @Override // defpackage.am2
    public void b() {
        if (this.a.e() == OsRealmConfig.c.FULL) {
            d0.j(this.a);
        }
    }

    @Override // defpackage.am2
    public bm2<a> c() {
        return this.b;
    }

    public /* synthetic */ g89(j0 j0Var, bm2 bm2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j0Var, (i & 2) != 0 ? new b(j0Var) : bm2Var);
    }
}
