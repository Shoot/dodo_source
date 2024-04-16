package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.zone.ZoneRulesException;
/* compiled from: ZoneRulesProvider.java */
/* renamed from: cdc  reason: default package */
/* loaded from: classes3.dex */
public abstract class cdc {
    private static final CopyOnWriteArrayList<cdc> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, cdc> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        bdc.a();
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(b.keySet());
    }

    private static cdc b(String str) {
        ConcurrentMap<String, cdc> concurrentMap = b;
        cdc cdcVar = concurrentMap.get(str);
        if (cdcVar == null) {
            if (concurrentMap.isEmpty()) {
                throw new ZoneRulesException("No time-zone data files registered");
            }
            throw new ZoneRulesException("Unknown time-zone ID: " + str);
        }
        return cdcVar;
    }

    public static adc c(String str, boolean z) {
        g95.i(str, "zoneId");
        return b(str).d(str, z);
    }

    public static void f(cdc cdcVar) {
        g95.i(cdcVar, "provider");
        g(cdcVar);
        a.add(cdcVar);
    }

    private static void g(cdc cdcVar) {
        for (String str : cdcVar.e()) {
            g95.i(str, "zoneId");
            if (b.putIfAbsent(str, cdcVar) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + cdcVar);
            }
        }
    }

    protected abstract adc d(String str, boolean z);

    protected abstract Set<String> e();
}
