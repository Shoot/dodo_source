package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.zone.ZoneRulesException;
/* compiled from: TzdbZoneRulesProvider.java */
/* renamed from: gpb  reason: default package */
/* loaded from: classes3.dex */
public final class gpb extends cdc {
    private List<String> c;
    private final ConcurrentNavigableMap<String, a> d = new ConcurrentSkipListMap();
    private Set<String> e = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TzdbZoneRulesProvider.java */
    /* renamed from: gpb$a */
    /* loaded from: classes3.dex */
    public static class a {
        private final String a;
        private final String[] b;
        private final short[] c;
        private final AtomicReferenceArray<Object> d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.c = sArr;
        }

        adc b(short s) throws Exception {
            Object obj = this.d.get(s);
            if (obj instanceof byte[]) {
                obj = ica.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.d.set(s, obj);
            }
            return (adc) obj;
        }

        adc c(String str) {
            int binarySearch = Arrays.binarySearch(this.b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return b(this.c[binarySearch]);
            } catch (Exception e) {
                throw new ZoneRulesException("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.a, e);
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public gpb(InputStream inputStream) {
        try {
            h(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    private boolean h(InputStream inputStream) throws IOException, StreamCorruptedException {
        boolean z = false;
        for (a aVar : i(inputStream)) {
            a putIfAbsent = this.d.putIfAbsent(aVar.a, aVar);
            if (putIfAbsent != null && !putIfAbsent.a.equals(aVar.a)) {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + aVar.a);
            }
            z = true;
        }
        return z;
    }

    private Iterable<a> i(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() == 1) {
            if ("TZDB".equals(dataInputStream.readUTF())) {
                int readShort = dataInputStream.readShort();
                String[] strArr = new String[readShort];
                for (int i = 0; i < readShort; i++) {
                    strArr[i] = dataInputStream.readUTF();
                }
                int readShort2 = dataInputStream.readShort();
                String[] strArr2 = new String[readShort2];
                for (int i2 = 0; i2 < readShort2; i2++) {
                    strArr2[i2] = dataInputStream.readUTF();
                }
                this.c = Arrays.asList(strArr2);
                int readShort3 = dataInputStream.readShort();
                Object[] objArr = new Object[readShort3];
                for (int i3 = 0; i3 < readShort3; i3++) {
                    byte[] bArr = new byte[dataInputStream.readShort()];
                    dataInputStream.readFully(bArr);
                    objArr[i3] = bArr;
                }
                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
                HashSet hashSet = new HashSet(readShort);
                for (int i4 = 0; i4 < readShort; i4++) {
                    int readShort4 = dataInputStream.readShort();
                    String[] strArr3 = new String[readShort4];
                    short[] sArr = new short[readShort4];
                    for (int i5 = 0; i5 < readShort4; i5++) {
                        strArr3[i5] = strArr2[dataInputStream.readShort()];
                        sArr[i5] = dataInputStream.readShort();
                    }
                    hashSet.add(new a(strArr[i4], strArr3, sArr, atomicReferenceArray));
                }
                return hashSet;
            }
            throw new StreamCorruptedException("File format not recognised");
        }
        throw new StreamCorruptedException("File format not recognised");
    }

    @Override // defpackage.cdc
    protected adc d(String str, boolean z) {
        g95.i(str, "zoneId");
        adc c = this.d.lastEntry().getValue().c(str);
        if (c != null) {
            return c;
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    @Override // defpackage.cdc
    protected Set<String> e() {
        return new HashSet(this.c);
    }

    public String toString() {
        return "TZDB";
    }
}
