package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: ZoneOffset.java */
/* renamed from: wcc  reason: default package */
/* loaded from: classes3.dex */
public final class wcc extends vcc implements q8b, r8b, Comparable<wcc>, Serializable {
    public static final w8b<wcc> e = new a();
    private static final ConcurrentMap<Integer, wcc> f = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap<String, wcc> g = new ConcurrentHashMap(16, 0.75f, 4);
    public static final wcc h = h0(0);
    public static final wcc i = h0(-64800);
    public static final wcc j = h0(64800);
    private final int c;
    private final transient String d;

    /* compiled from: ZoneOffset.java */
    /* renamed from: wcc$a */
    /* loaded from: classes3.dex */
    class a implements w8b<wcc> {
        a() {
        }

        @Override // defpackage.w8b
        /* renamed from: b */
        public wcc a(q8b q8bVar) {
            return wcc.W(q8bVar);
        }
    }

    private wcc(int i2) {
        this.c = i2;
        this.d = Q(i2);
    }

    private static String Q(int i2) {
        String str;
        String str2;
        String str3;
        if (i2 == 0) {
            return "Z";
        }
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder();
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        if (i2 < 0) {
            str = "-";
        } else {
            str = Marker.ANY_NON_NULL_MARKER;
        }
        sb.append(str);
        if (i3 < 10) {
            str2 = "0";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(i3);
        String str4 = ":";
        if (i4 >= 10) {
            str3 = ":";
        } else {
            str3 = ":0";
        }
        sb.append(str3);
        sb.append(i4);
        int i5 = abs % 60;
        if (i5 != 0) {
            if (i5 < 10) {
                str4 = ":0";
            }
            sb.append(str4);
            sb.append(i5);
        }
        return sb.toString();
    }

    public static wcc W(q8b q8bVar) {
        wcc wccVar = (wcc) q8bVar.M(v8b.d());
        if (wccVar != null) {
            return wccVar;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + q8bVar + ", type " + q8bVar.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wcc e0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            defpackage.g95.i(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, wcc> r0 = defpackage.wcc.g
            java.lang.Object r0 = r0.get(r7)
            wcc r0 = (defpackage.wcc) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6e
            r1 = 3
            if (r0 == r1) goto L8a
            r4 = 5
            if (r0 == r4) goto L65
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5b
            r5 = 7
            if (r0 == r5) goto L4e
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r6, r2)
            int r2 = l0(r7, r5, r2)
            goto L90
        L37:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L4e:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r1, r3)
            int r2 = l0(r7, r4, r3)
            goto L90
        L5b:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r6, r2)
        L63:
            r2 = 0
            goto L90
        L65:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r1, r3)
            goto L63
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L8a:
            int r0 = l0(r7, r2, r3)
            r1 = 0
            goto L63
        L90:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb4
            if (r3 != r5) goto L9d
            goto Lb4
        L9d:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        Lb4:
            if (r3 != r5) goto Lbe
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            wcc r7 = f0(r7, r0, r1)
            return r7
        Lbe:
            wcc r7 = f0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcc.e0(java.lang.String):wcc");
    }

    public static wcc f0(int i2, int i3, int i4) {
        o0(i2, i3, i4);
        return h0(n0(i2, i3, i4));
    }

    public static wcc h0(int i2) {
        if (Math.abs(i2) <= 64800) {
            if (i2 % 900 == 0) {
                Integer valueOf = Integer.valueOf(i2);
                ConcurrentMap<Integer, wcc> concurrentMap = f;
                wcc wccVar = concurrentMap.get(valueOf);
                if (wccVar == null) {
                    concurrentMap.putIfAbsent(valueOf, new wcc(i2));
                    wcc wccVar2 = concurrentMap.get(valueOf);
                    g.putIfAbsent(wccVar2.getId(), wccVar2);
                    return wccVar2;
                }
                return wccVar;
            }
            return new wcc(i2);
        }
        throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    private static int l0(CharSequence charSequence, int i2, boolean z) {
        if (z && charSequence.charAt(i2 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i2);
        char charAt2 = charSequence.charAt(i2 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return ((charAt - '0') * 10) + (charAt2 - '0');
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wcc m0(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return h0(dataInput.readInt());
        }
        return h0(readByte * 900);
    }

    private static int n0(int i2, int i3, int i4) {
        return (i2 * 3600) + (i3 * 60) + i4;
    }

    private static void o0(int i2, int i3, int i4) {
        if (i2 >= -18 && i2 <= 18) {
            if (i2 > 0) {
                if (i3 < 0 || i4 < 0) {
                    throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
                }
            } else if (i2 < 0) {
                if (i3 > 0 || i4 > 0) {
                    throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
                }
            } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
                throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
            }
            if (Math.abs(i3) <= 59) {
                if (Math.abs(i4) <= 59) {
                    if (Math.abs(i2) == 18) {
                        if (Math.abs(i3) > 0 || Math.abs(i4) > 0) {
                            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
                        }
                        return;
                    }
                    return;
                }
                throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i4) + " is not in the range 0 to 59");
            }
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        }
        throw new DateTimeException("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 8, this);
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.T4) {
                return false;
            }
            return true;
        } else if (u8bVar == null || !u8bVar.i(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar == h71.T4) {
            return u8bVar.s();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar != v8b.d() && w8bVar != v8b.f()) {
            if (w8bVar != v8b.b() && w8bVar != v8b.c() && w8bVar != v8b.e() && w8bVar != v8b.a() && w8bVar != v8b.g()) {
                return w8bVar.a(this);
            }
            return null;
        }
        return this;
    }

    @Override // defpackage.vcc
    void P(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        p0(dataOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: T */
    public int compareTo(wcc wccVar) {
        return wccVar.c - this.c;
    }

    public int b0() {
        return this.c;
    }

    @Override // defpackage.vcc
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wcc) && this.c == ((wcc) obj).c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vcc
    public String getId() {
        return this.d;
    }

    @Override // defpackage.vcc
    public int hashCode() {
        return this.c;
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.T4, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0(DataOutput dataOutput) throws IOException {
        int i2;
        int i3 = this.c;
        if (i3 % 900 == 0) {
            i2 = i3 / 900;
        } else {
            i2 = 127;
        }
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i3);
        }
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar == h71.T4) {
            return this.c;
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.q(this);
        }
        throw new DateTimeException("Unsupported field: " + u8bVar);
    }

    @Override // defpackage.vcc
    public String toString() {
        return this.d;
    }

    @Override // defpackage.vcc
    public adc u() {
        return adc.i(this);
    }

    @Override // defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar == h71.T4) {
            return this.c;
        }
        if (!(u8bVar instanceof h71)) {
            return K(u8bVar).a(q(u8bVar), u8bVar);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }
}
