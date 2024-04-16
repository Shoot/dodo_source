package io.realm;

import ch.qos.logback.classic.spi.CallerData;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes3.dex */
public class DynamicRealmObject extends n0 implements r89 {
    private final c0<DynamicRealmObject> b;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            a = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                a[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                a[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                a[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                a[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                a[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                a[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                a[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    /* loaded from: classes3.dex */
    private enum b {
        LIST,
        DICTIONARY,
        SET
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicRealmObject(io.realm.a aVar, fp9 fp9Var) {
        c0<DynamicRealmObject> c0Var = new c0<>(this);
        this.b = c0Var;
        c0Var.r(aVar);
        c0Var.s(fp9Var);
        c0Var.p();
    }

    private e0 d(long j) {
        return new e0(h0.b(this.b.f(), this.b.g().E(j)));
    }

    @Override // defpackage.r89
    public c0 a() {
        return this.b;
    }

    public String[] c() {
        this.b.f().c();
        return this.b.g().getColumnNames();
    }

    public boolean equals(Object obj) {
        this.b.f().c();
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
        String path = this.b.f().getPath();
        String path2 = dynamicRealmObject.b.f().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String o = this.b.g().o().o();
        String o2 = dynamicRealmObject.b.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.b.g().E0() == dynamicRealmObject.b.g().E0()) {
            return true;
        }
        return false;
    }

    public String getType() {
        this.b.f().c();
        return this.b.g().o().g();
    }

    public int hashCode() {
        int i;
        this.b.f().c();
        String path = this.b.f().getPath();
        String o = this.b.g().o().o();
        long E0 = this.b.g().E0();
        int i2 = 0;
        if (path != null) {
            i = path.hashCode();
        } else {
            i = 0;
        }
        int i3 = (527 + i) * 31;
        if (o != null) {
            i2 = o.hashCode();
        }
        return ((i3 + i2) * 31) + ((int) ((E0 >>> 32) ^ E0));
    }

    public String toString() {
        String[] c;
        this.b.f().c();
        if (this.b.g().a()) {
            StringBuilder sb = new StringBuilder(this.b.g().o().g() + " = dynamic[");
            for (String str : c()) {
                long m0 = this.b.g().m0(str);
                RealmFieldType r0 = this.b.g().r0(m0);
                sb.append("{");
                sb.append(str);
                sb.append(":");
                String str2 = "null";
                switch (a.a[r0.ordinal()]) {
                    case 1:
                        Boolean bool = str2;
                        if (!this.b.g().w(m0)) {
                            bool = Boolean.valueOf(this.b.g().b0(m0));
                        }
                        sb.append(bool);
                        break;
                    case 2:
                        Long l = str2;
                        if (!this.b.g().w(m0)) {
                            l = Long.valueOf(this.b.g().e0(m0));
                        }
                        sb.append(l);
                        break;
                    case 3:
                        Float f = str2;
                        if (!this.b.g().w(m0)) {
                            f = Float.valueOf(this.b.g().M(m0));
                        }
                        sb.append(f);
                        break;
                    case 4:
                        Double d = str2;
                        if (!this.b.g().w(m0)) {
                            d = Double.valueOf(this.b.g().K(m0));
                        }
                        sb.append(d);
                        break;
                    case 5:
                        sb.append(this.b.g().p0(m0));
                        break;
                    case 6:
                        sb.append(Arrays.toString(this.b.g().H(m0)));
                        break;
                    case 7:
                        Date date = str2;
                        if (!this.b.g().w(m0)) {
                            date = this.b.g().h0(m0);
                        }
                        sb.append(date);
                        break;
                    case 8:
                        Decimal128 decimal128 = str2;
                        if (!this.b.g().w(m0)) {
                            decimal128 = this.b.g().P(m0);
                        }
                        sb.append(decimal128);
                        break;
                    case 9:
                        ObjectId objectId = str2;
                        if (!this.b.g().w(m0)) {
                            objectId = this.b.g().W(m0);
                        }
                        sb.append(objectId);
                        break;
                    case 10:
                        String str3 = str2;
                        if (!this.b.g().w(m0)) {
                            str3 = d(m0);
                        }
                        sb.append(str3);
                        break;
                    case 11:
                        UUID uuid = str2;
                        if (!this.b.g().w(m0)) {
                            uuid = this.b.g().q(m0);
                        }
                        sb.append(uuid);
                        break;
                    case 12:
                        String str4 = str2;
                        if (!this.b.g().o0(m0)) {
                            str4 = this.b.g().o().n(m0).g();
                        }
                        sb.append(str4);
                        break;
                    case 13:
                        sb.append(String.format(Locale.US, "RealmList<%s>[%s]", this.b.g().o().n(m0).g(), Long.valueOf(this.b.g().f0(m0).X())));
                        break;
                    case 14:
                        sb.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 15:
                        sb.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 16:
                        sb.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 17:
                        sb.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 18:
                        sb.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 19:
                        sb.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 20:
                        sb.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 21:
                        sb.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 22:
                        sb.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 23:
                        sb.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 24:
                        sb.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.b.g().q0(m0, r0).a())));
                        break;
                    case 25:
                        sb.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.b.g().o().n(m0).g(), Long.valueOf(this.b.g().n0(m0).a())));
                        break;
                    case 26:
                        sb.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 27:
                        sb.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 28:
                        sb.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 29:
                        sb.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 30:
                        sb.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 31:
                        sb.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 32:
                        sb.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 33:
                        sb.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 34:
                        sb.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 35:
                        sb.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 36:
                        sb.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.b.g().o().n(m0).g(), Long.valueOf(this.b.g().T(m0).a())));
                        break;
                    case 37:
                        sb.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.b.g().x(m0, r0).a())));
                        break;
                    case 38:
                    default:
                        sb.append(CallerData.NA);
                        break;
                    case 39:
                        sb.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 40:
                        sb.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 41:
                        sb.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 42:
                        sb.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 43:
                        sb.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 44:
                        sb.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 45:
                        sb.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 46:
                        sb.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 47:
                        sb.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 48:
                        sb.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                    case 49:
                        sb.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.b.g().N(m0, r0).X())));
                        break;
                }
                sb.append("},");
            }
            sb.replace(sb.length() - 1, sb.length(), "");
            sb.append("]");
            return sb.toString();
        }
        return "Invalid object";
    }

    @Override // defpackage.r89
    public void b() {
    }
}
