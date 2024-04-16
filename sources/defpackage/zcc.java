package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.zone.ZoneRulesException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZoneRegion.java */
/* renamed from: zcc  reason: default package */
/* loaded from: classes3.dex */
public final class zcc extends vcc implements Serializable {
    private static final Pattern e = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private final String c;
    private final transient adc d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zcc(String str, adc adcVar) {
        this.c = str;
        this.d = adcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zcc Q(String str, boolean z) {
        adc adcVar;
        g95.i(str, "zoneId");
        if (str.length() >= 2 && e.matcher(str).matches()) {
            try {
                adcVar = cdc.c(str, true);
            } catch (ZoneRulesException e2) {
                if (str.equals("GMT0")) {
                    adcVar = wcc.h.u();
                } else if (!z) {
                    adcVar = null;
                } else {
                    throw e2;
                }
            }
            return new zcc(str, adcVar);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    private static zcc T(String str) {
        if (!str.equals("Z") && !str.startsWith(Marker.ANY_NON_NULL_MARKER) && !str.startsWith("-")) {
            if (!str.equals("UTC") && !str.equals("GMT") && !str.equals("UT")) {
                if (!str.startsWith("UTC+") && !str.startsWith("GMT+") && !str.startsWith("UTC-") && !str.startsWith("GMT-")) {
                    if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                        return Q(str, false);
                    }
                    wcc e0 = wcc.e0(str.substring(2));
                    if (e0.b0() == 0) {
                        return new zcc("UT", e0.u());
                    }
                    return new zcc("UT" + e0.getId(), e0.u());
                }
                wcc e02 = wcc.e0(str.substring(3));
                if (e02.b0() == 0) {
                    return new zcc(str.substring(0, 3), e02.u());
                }
                return new zcc(str.substring(0, 3) + e02.getId(), e02.u());
            }
            return new zcc(str, wcc.h.u());
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vcc W(DataInput dataInput) throws IOException {
        return T(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new jca((byte) 7, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.vcc
    public void P(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        b0(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.c);
    }

    @Override // defpackage.vcc
    public String getId() {
        return this.c;
    }

    @Override // defpackage.vcc
    public adc u() {
        adc adcVar = this.d;
        if (adcVar == null) {
            return cdc.c(this.c, false);
        }
        return adcVar;
    }
}
