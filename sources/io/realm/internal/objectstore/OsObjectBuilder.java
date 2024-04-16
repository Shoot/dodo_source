package io.realm.internal.objectstore;

import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes3.dex */
public class OsObjectBuilder implements Closeable {
    private final Table a;
    private final long b;
    private final long c;
    private final long d;
    private final io.realm.internal.c e;
    private final boolean f;
    private static s0<? extends o89> g = new k();
    private static s0<String> h = new v();
    private static s0<Byte> i = new g0();
    private static s0<Short> j = new m0();
    private static s0<Integer> k = new n0();
    private static s0<Long> l = new o0();
    private static s0<Boolean> m = new p0();
    private static s0<Float> n = new q0();
    private static s0<Double> o = new r0();
    private static s0<Date> p = new a();
    private static s0<byte[]> q = new b();
    private static s0<yq6> r = new c();
    private static s0<Decimal128> s = new d();
    private static s0<ObjectId> t = new e();
    private static s0<UUID> u = new f();
    private static s0<Map.Entry<String, Boolean>> v = new g();
    private static s0<Map.Entry<String, String>> w = new h();
    private static s0<Map.Entry<String, Integer>> x = new i();
    private static s0<Map.Entry<String, Float>> y = new j();
    private static s0<Map.Entry<String, Long>> z = new l();
    private static s0<Map.Entry<String, Short>> A = new m();
    private static s0<Map.Entry<String, Byte>> B = new n();
    private static s0<Map.Entry<String, Double>> I = new o();
    private static s0<Map.Entry<String, byte[]>> X = new p();
    private static s0<Map.Entry<String, Date>> Y = new q();
    private static s0<Map.Entry<String, Decimal128>> Z = new r();
    private static s0<Map.Entry<String, ObjectId>> S4 = new s();
    private static s0<Map.Entry<String, UUID>> T4 = new t();
    private static s0<Map.Entry<String, io.realm.e0>> U4 = new u();
    private static s0<io.realm.e0> V4 = new w();
    private static s0<String> W4 = new x();
    private static s0<Boolean> X4 = new y();
    private static s0<Integer> Y4 = new z();
    private static s0<Long> Z4 = new a0();
    private static s0<Short> a5 = new b0();
    private static s0<Byte> b5 = new c0();
    private static s0<Float> c5 = new d0();
    private static s0<Double> d5 = new e0();
    private static s0<byte[]> e5 = new f0();
    private static s0<Date> f5 = new h0();
    private static s0<Decimal128> g5 = new i0();
    private static s0<ObjectId> h5 = new j0();
    private static s0<UUID> i5 = new k0();
    private static s0<io.realm.e0> j5 = new l0();

    /* loaded from: classes3.dex */
    class a implements s0<Date> {
        a() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Date date) {
            OsObjectBuilder.nativeAddDateListItem(j, date.getTime());
        }
    }

    /* loaded from: classes3.dex */
    class a0 implements s0<Long> {
        a0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Long l) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, l.longValue());
        }
    }

    /* loaded from: classes3.dex */
    class b implements s0<byte[]> {
        b() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, byte[] bArr) {
            OsObjectBuilder.nativeAddByteArrayListItem(j, bArr);
        }
    }

    /* loaded from: classes3.dex */
    class b0 implements s0<Short> {
        b0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Short sh) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, sh.shortValue());
        }
    }

    /* loaded from: classes3.dex */
    class c implements s0<yq6> {
        c() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, yq6 yq6Var) {
            Long g = yq6Var.g();
            if (g == null) {
                OsObjectBuilder.nativeAddNullListItem(j);
            } else {
                OsObjectBuilder.nativeAddIntegerListItem(j, g.longValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    class c0 implements s0<Byte> {
        c0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Byte b) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, b.byteValue());
        }
    }

    /* loaded from: classes3.dex */
    class d implements s0<Decimal128> {
        d() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Decimal128 decimal128) {
            OsObjectBuilder.nativeAddDecimal128ListItem(j, decimal128.s(), decimal128.q());
        }
    }

    /* loaded from: classes3.dex */
    class d0 implements s0<Float> {
        d0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Float f) {
            OsObjectBuilder.nativeAddFloatSetItem(j, f.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    class e implements s0<ObjectId> {
        e() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, ObjectId objectId) {
            OsObjectBuilder.nativeAddObjectIdListItem(j, objectId.toString());
        }
    }

    /* loaded from: classes3.dex */
    class e0 implements s0<Double> {
        e0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Double d) {
            OsObjectBuilder.nativeAddDoubleSetItem(j, d.doubleValue());
        }
    }

    /* loaded from: classes3.dex */
    class f implements s0<UUID> {
        f() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, UUID uuid) {
            OsObjectBuilder.nativeAddUUIDListItem(j, uuid.toString());
        }
    }

    /* loaded from: classes3.dex */
    class f0 implements s0<byte[]> {
        f0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, byte[] bArr) {
            OsObjectBuilder.nativeAddByteArraySetItem(j, bArr);
        }
    }

    /* loaded from: classes3.dex */
    class g implements s0<Map.Entry<String, Boolean>> {
        g() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Boolean> entry) {
            OsObjectBuilder.nativeAddBooleanDictionaryEntry(j, entry.getKey(), entry.getValue().booleanValue());
        }
    }

    /* loaded from: classes3.dex */
    class g0 implements s0<Byte> {
        g0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Byte b) {
            OsObjectBuilder.nativeAddIntegerListItem(j, b.longValue());
        }
    }

    /* loaded from: classes3.dex */
    class h implements s0<Map.Entry<String, String>> {
        h() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, String> entry) {
            OsObjectBuilder.nativeAddStringDictionaryEntry(j, entry.getKey(), entry.getValue());
        }
    }

    /* loaded from: classes3.dex */
    class h0 implements s0<Date> {
        h0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Date date) {
            OsObjectBuilder.nativeAddDateSetItem(j, date.getTime());
        }
    }

    /* loaded from: classes3.dex */
    class i implements s0<Map.Entry<String, Integer>> {
        i() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Integer> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, entry.getKey(), entry.getValue().intValue());
        }
    }

    /* loaded from: classes3.dex */
    class i0 implements s0<Decimal128> {
        i0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Decimal128 decimal128) {
            OsObjectBuilder.nativeAddDecimal128SetItem(j, decimal128.s(), decimal128.q());
        }
    }

    /* loaded from: classes3.dex */
    class j implements s0<Map.Entry<String, Float>> {
        j() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Float> entry) {
            OsObjectBuilder.nativeAddFloatDictionaryEntry(j, entry.getKey(), entry.getValue().floatValue());
        }
    }

    /* loaded from: classes3.dex */
    class j0 implements s0<ObjectId> {
        j0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, ObjectId objectId) {
            OsObjectBuilder.nativeAddObjectIdSetItem(j, objectId.toString());
        }
    }

    /* loaded from: classes3.dex */
    class k implements s0<o89> {
        k() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, o89 o89Var) {
            OsObjectBuilder.nativeAddIntegerListItem(j, ((UncheckedRow) ((r89) o89Var).a().g()).getNativePtr());
        }
    }

    /* loaded from: classes3.dex */
    class k0 implements s0<UUID> {
        k0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, UUID uuid) {
            OsObjectBuilder.nativeAddUUIDSetItem(j, uuid.toString());
        }
    }

    /* loaded from: classes3.dex */
    class l implements s0<Map.Entry<String, Long>> {
        l() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Long> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, entry.getKey(), entry.getValue().longValue());
        }
    }

    /* loaded from: classes3.dex */
    class l0 implements s0<io.realm.e0> {
        private final c89 a = new io.realm.g0();

        l0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, io.realm.e0 e0Var) {
            this.a.b(j, e0Var);
        }
    }

    /* loaded from: classes3.dex */
    class m implements s0<Map.Entry<String, Short>> {
        m() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Short> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, entry.getKey(), entry.getValue().shortValue());
        }
    }

    /* loaded from: classes3.dex */
    class m0 implements s0<Short> {
        m0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Short sh) {
            OsObjectBuilder.nativeAddIntegerListItem(j, sh.shortValue());
        }
    }

    /* loaded from: classes3.dex */
    class n implements s0<Map.Entry<String, Byte>> {
        n() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Byte> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, entry.getKey(), entry.getValue().byteValue());
        }
    }

    /* loaded from: classes3.dex */
    class n0 implements s0<Integer> {
        n0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Integer num) {
            OsObjectBuilder.nativeAddIntegerListItem(j, num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    class o implements s0<Map.Entry<String, Double>> {
        o() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Double> entry) {
            OsObjectBuilder.nativeAddDoubleDictionaryEntry(j, entry.getKey(), entry.getValue().doubleValue());
        }
    }

    /* loaded from: classes3.dex */
    class o0 implements s0<Long> {
        o0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Long l) {
            OsObjectBuilder.nativeAddIntegerListItem(j, l.longValue());
        }
    }

    /* loaded from: classes3.dex */
    class p implements s0<Map.Entry<String, byte[]>> {
        p() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, byte[]> entry) {
            OsObjectBuilder.nativeAddBinaryDictionaryEntry(j, entry.getKey(), entry.getValue());
        }
    }

    /* loaded from: classes3.dex */
    class p0 implements s0<Boolean> {
        p0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Boolean bool) {
            OsObjectBuilder.nativeAddBooleanListItem(j, bool.booleanValue());
        }
    }

    /* loaded from: classes3.dex */
    class q implements s0<Map.Entry<String, Date>> {
        q() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Date> entry) {
            OsObjectBuilder.nativeAddDateDictionaryEntry(j, entry.getKey(), entry.getValue().getTime());
        }
    }

    /* loaded from: classes3.dex */
    class q0 implements s0<Float> {
        q0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Float f) {
            OsObjectBuilder.nativeAddFloatListItem(j, f.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    class r implements s0<Map.Entry<String, Decimal128>> {
        r() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, Decimal128> entry) {
            OsObjectBuilder.nativeAddDecimal128DictionaryEntry(j, entry.getKey(), entry.getValue().q(), entry.getValue().s());
        }
    }

    /* loaded from: classes3.dex */
    class r0 implements s0<Double> {
        r0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Double d) {
            OsObjectBuilder.nativeAddDoubleListItem(j, d.doubleValue());
        }
    }

    /* loaded from: classes3.dex */
    class s implements s0<Map.Entry<String, ObjectId>> {
        s() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, ObjectId> entry) {
            OsObjectBuilder.nativeAddObjectIdDictionaryEntry(j, entry.getKey(), entry.getValue().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface s0<T> {
        void a(long j, T t);
    }

    /* loaded from: classes3.dex */
    class t implements s0<Map.Entry<String, UUID>> {
        t() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, UUID> entry) {
            OsObjectBuilder.nativeAddUUIDDictionaryEntry(j, entry.getKey(), entry.getValue().toString());
        }
    }

    /* loaded from: classes3.dex */
    class u implements s0<Map.Entry<String, io.realm.e0>> {
        private final c89 a = new io.realm.g0();

        u() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Map.Entry<String, io.realm.e0> entry) {
            this.a.a(j, entry);
        }
    }

    /* loaded from: classes3.dex */
    class v implements s0<String> {
        v() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, String str) {
            OsObjectBuilder.nativeAddStringListItem(j, str);
        }
    }

    /* loaded from: classes3.dex */
    class w implements s0<io.realm.e0> {
        private final c89 a = new io.realm.g0();

        w() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, io.realm.e0 e0Var) {
            this.a.b(j, e0Var);
        }
    }

    /* loaded from: classes3.dex */
    class x implements s0<String> {
        x() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, String str) {
            OsObjectBuilder.nativeAddStringSetItem(j, str);
        }
    }

    /* loaded from: classes3.dex */
    class y implements s0<Boolean> {
        y() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Boolean bool) {
            OsObjectBuilder.nativeAddBooleanSetItem(j, bool.booleanValue());
        }
    }

    /* loaded from: classes3.dex */
    class z implements s0<Integer> {
        z() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b */
        public void a(long j, Integer num) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, num.intValue());
        }
    }

    public OsObjectBuilder(Table table, Set<ex4> set) {
        OsSharedRealm p2 = table.p();
        this.b = p2.getNativePtr();
        this.a = table;
        table.l();
        this.d = table.getNativePtr();
        this.c = nativeCreateBuilder();
        this.e = p2.context;
        this.f = set.contains(ex4.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private void m0(long j2) {
        nativeStopList(this.c, j2, nativeStartList(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBinaryDictionaryEntry(long j2, String str, byte[] bArr);

    private static native void nativeAddBoolean(long j2, long j3, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanDictionaryEntry(long j2, String str, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanListItem(long j2, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanSetItem(long j2, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddByteArrayListItem(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddByteArraySetItem(long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateDictionaryEntry(long j2, String str, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateListItem(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateSetItem(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128DictionaryEntry(long j2, String str, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128ListItem(long j2, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128SetItem(long j2, long j3, long j4);

    private static native void nativeAddDouble(long j2, long j3, double d2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleDictionaryEntry(long j2, String str, double d2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleListItem(long j2, double d2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleSetItem(long j2, double d2);

    private static native void nativeAddFloat(long j2, long j3, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatDictionaryEntry(long j2, String str, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatListItem(long j2, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatSetItem(long j2, float f2);

    private static native void nativeAddInteger(long j2, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerDictionaryEntry(long j2, String str, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerListItem(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerSetItem(long j2, long j3);

    private static native void nativeAddNull(long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddNullListItem(long j2);

    private static native void nativeAddObject(long j2, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdDictionaryEntry(long j2, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdListItem(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdSetItem(long j2, String str);

    private static native void nativeAddObjectList(long j2, long j3, long[] jArr);

    public static native void nativeAddRealmAnyDictionaryEntry(long j2, String str, long j3);

    public static native void nativeAddRealmAnyListItem(long j2, long j3);

    private static native void nativeAddString(long j2, long j3, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringDictionaryEntry(long j2, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringListItem(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringSetItem(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDDictionaryEntry(long j2, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDListItem(long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDSetItem(long j2, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j2, long j3, long j4, boolean z2, boolean z3);

    private static native void nativeDestroyBuilder(long j2);

    private static native long nativeStartList(long j2);

    private static native void nativeStopList(long j2, long j3, long j4);

    private <T> void q0(long j2, long j3, List<T> list, s0<T> s0Var) {
        boolean z2;
        if (list != null) {
            long nativeStartList = nativeStartList(list.size());
            if (j3 != 0 && !this.a.t(j3)) {
                z2 = false;
            } else {
                z2 = true;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                T t2 = list.get(i2);
                if (t2 == null) {
                    if (z2) {
                        nativeAddNullListItem(nativeStartList);
                    } else {
                        throw new IllegalArgumentException("This 'RealmList' is not nullable. A non-null value is expected.");
                    }
                } else {
                    s0Var.a(nativeStartList, t2);
                }
            }
            nativeStopList(j2, j3, nativeStartList);
            return;
        }
        m0(j3);
    }

    public void E0(long j2, String str) {
        if (str == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddString(this.c, j2, str);
        }
    }

    public void F0(long j2, io.realm.k0<String> k0Var) {
        q0(this.c, j2, k0Var, h);
    }

    public UncheckedRow I0() {
        try {
            return new UncheckedRow(this.e, this.a, nativeCreateOrUpdateTopLevelObject(this.b, this.d, this.c, false, false));
        } finally {
            close();
        }
    }

    public void K0() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.b, this.d, this.c, true, this.f);
        } finally {
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroyBuilder(this.c);
    }

    public void j0(long j2, Boolean bool) {
        if (bool == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddBoolean(this.c, j2, bool.booleanValue());
        }
    }

    public void l0(long j2, Double d2) {
        if (d2 == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddDouble(this.c, j2, d2.doubleValue());
        }
    }

    public void n0(long j2, Float f2) {
        if (f2 == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddFloat(this.c, j2, f2.floatValue());
        }
    }

    public void o0(long j2, Integer num) {
        if (num == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddInteger(this.c, j2, num.intValue());
        }
    }

    public void p0(long j2, Long l2) {
        if (l2 == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddInteger(this.c, j2, l2.longValue());
        }
    }

    public void r0(long j2) {
        nativeAddNull(this.c, j2);
    }

    public void x0(long j2, o89 o89Var) {
        if (o89Var == null) {
            nativeAddNull(this.c, j2);
        } else {
            nativeAddObject(this.c, j2, ((UncheckedRow) ((r89) o89Var).a().g()).getNativePtr());
        }
    }

    public <T extends o89> void z0(long j2, io.realm.k0<T> k0Var) {
        if (k0Var != null) {
            long[] jArr = new long[k0Var.size()];
            for (int i2 = 0; i2 < k0Var.size(); i2++) {
                r89 r89Var = (r89) k0Var.get(i2);
                if (r89Var != null) {
                    jArr[i2] = ((UncheckedRow) r89Var.a().g()).getNativePtr();
                } else {
                    throw new IllegalArgumentException("Null values are not allowed in RealmLists containing Realm models");
                }
            }
            nativeAddObjectList(this.c, j2, jArr);
            return;
        }
        nativeAddObjectList(this.c, j2, new long[0]);
    }
}
