package io.realm;

import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* compiled from: RealmObjectSchema.java */
/* loaded from: classes3.dex */
public abstract class o0 {
    static final Map<Class<?>, b> e;
    static final Map<Class<?>, b> f;
    static final Map<Class<?>, b> g;
    static final Map<Class<?>, b> h;
    final q0 a;
    final io.realm.a b;
    final Table c;
    final sf1 d;

    /* compiled from: RealmObjectSchema.java */
    /* loaded from: classes3.dex */
    static final class a extends sf1 {
        private final Table e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Table table) {
            super((sf1) null, false);
            this.e = table;
        }

        @Override // defpackage.sf1
        protected void b(sf1 sf1Var, sf1 sf1Var2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }

        @Override // defpackage.sf1
        public void c(sf1 sf1Var) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }
    }

    /* compiled from: RealmObjectSchema.java */
    /* loaded from: classes3.dex */
    static final class b {
        final RealmFieldType a;
        final RealmFieldType b;
        final boolean c;

        b(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z) {
            this.a = realmFieldType;
            this.b = realmFieldType2;
            this.c = z;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        hashMap.put(String.class, new b(realmFieldType, RealmFieldType.STRING_LIST, true));
        Class cls = Short.TYPE;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        hashMap.put(cls, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Short.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls2 = Integer.TYPE;
        hashMap.put(cls2, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Integer.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls3 = Long.TYPE;
        hashMap.put(cls3, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Long.class, new b(realmFieldType2, realmFieldType3, true));
        Class cls4 = Float.TYPE;
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        hashMap.put(cls4, new b(realmFieldType4, realmFieldType5, false));
        hashMap.put(Float.class, new b(realmFieldType4, realmFieldType5, true));
        Class cls5 = Double.TYPE;
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        hashMap.put(cls5, new b(realmFieldType6, realmFieldType7, false));
        hashMap.put(Double.class, new b(realmFieldType6, realmFieldType7, true));
        Class cls6 = Boolean.TYPE;
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        hashMap.put(cls6, new b(realmFieldType8, realmFieldType9, false));
        hashMap.put(Boolean.class, new b(realmFieldType8, realmFieldType9, true));
        Class cls7 = Byte.TYPE;
        hashMap.put(cls7, new b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Byte.class, new b(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        hashMap.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        hashMap.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        hashMap.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        hashMap.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        hashMap.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        hashMap.put(e0.class, new b(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        e = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class, new b(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        hashMap2.put(cls, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Short.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls2, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Integer.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls3, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Long.class, new b(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        hashMap2.put(cls4, new b(realmFieldType4, realmFieldType17, false));
        hashMap2.put(Float.class, new b(realmFieldType4, realmFieldType17, true));
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        hashMap2.put(cls5, new b(realmFieldType6, realmFieldType18, false));
        hashMap2.put(Double.class, new b(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        hashMap2.put(cls6, new b(realmFieldType8, realmFieldType19, false));
        hashMap2.put(Boolean.class, new b(realmFieldType8, realmFieldType19, true));
        hashMap2.put(cls7, new b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Byte.class, new b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(byte[].class, new b(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        hashMap2.put(Date.class, new b(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        hashMap2.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        hashMap2.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        hashMap2.put(UUID.class, new b(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        hashMap2.put(e0.class, new b(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        f = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(String.class, new b(realmFieldType, RealmFieldType.STRING_SET, true));
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        hashMap3.put(cls, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Short.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls2, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Integer.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls3, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Long.class, new b(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        hashMap3.put(cls4, new b(realmFieldType4, realmFieldType21, false));
        hashMap3.put(Float.class, new b(realmFieldType4, realmFieldType21, true));
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        hashMap3.put(cls5, new b(realmFieldType6, realmFieldType22, false));
        hashMap3.put(Double.class, new b(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        hashMap3.put(cls6, new b(realmFieldType8, realmFieldType23, false));
        hashMap3.put(Boolean.class, new b(realmFieldType8, realmFieldType23, true));
        hashMap3.put(cls7, new b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Byte.class, new b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(byte[].class, new b(realmFieldType10, RealmFieldType.BINARY_SET, true));
        hashMap3.put(Date.class, new b(realmFieldType11, RealmFieldType.DATE_SET, true));
        hashMap3.put(ObjectId.class, new b(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        hashMap3.put(Decimal128.class, new b(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        hashMap3.put(UUID.class, new b(realmFieldType14, RealmFieldType.UUID_SET, true));
        hashMap3.put(e0.class, new b(realmFieldType15, RealmFieldType.MIXED_SET, true));
        g = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(n0.class, new b(RealmFieldType.OBJECT, null, false));
        hashMap4.put(k0.class, new b(RealmFieldType.LIST, null, false));
        hashMap4.put(i89.class, new b(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        hashMap4.put(u89.class, new b(RealmFieldType.LINK_SET, null, false));
        h = Collections.unmodifiableMap(hashMap4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(io.realm.a aVar, q0 q0Var, Table table, sf1 sf1Var) {
        this.a = q0Var;
        this.b = aVar;
        this.c = table;
        this.d = sf1Var;
    }

    public String a() {
        return this.c.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table b() {
        return this.c;
    }

    public boolean c() {
        return this.c.u();
    }
}
