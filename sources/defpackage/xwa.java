package defpackage;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
/* compiled from: StdJdkSerializers.java */
/* renamed from: xwa  reason: default package */
/* loaded from: classes2.dex */
public class xwa {

    /* compiled from: StdJdkSerializers.java */
    /* renamed from: xwa$a */
    /* loaded from: classes2.dex */
    public static class a extends bxa<AtomicBoolean> {
        public a() {
            super(AtomicBoolean.class, false);
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: G */
        public void f(AtomicBoolean atomicBoolean, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.T(atomicBoolean.get());
        }
    }

    /* compiled from: StdJdkSerializers.java */
    /* renamed from: xwa$b */
    /* loaded from: classes2.dex */
    public static class b extends bxa<AtomicInteger> {
        public b() {
            super(AtomicInteger.class, false);
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: G */
        public void f(AtomicInteger atomicInteger, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.o0(atomicInteger.get());
        }
    }

    /* compiled from: StdJdkSerializers.java */
    /* renamed from: xwa$c */
    /* loaded from: classes2.dex */
    public static class c extends bxa<AtomicLong> {
        public c() {
            super(AtomicLong.class, false);
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: G */
        public void f(AtomicLong atomicLong, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.p0(atomicLong.get());
        }
    }

    public static Collection<Map.Entry<Class<?>, Object>> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(URL.class, new uhb(URL.class));
        hashMap.put(URI.class, new uhb(URI.class));
        hashMap.put(Currency.class, new uhb(Currency.class));
        hashMap.put(UUID.class, new xpb());
        hashMap.put(Pattern.class, new uhb(Pattern.class));
        hashMap.put(Locale.class, new uhb(Locale.class));
        hashMap.put(AtomicBoolean.class, a.class);
        hashMap.put(AtomicInteger.class, b.class);
        hashMap.put(AtomicLong.class, c.class);
        hashMap.put(File.class, fu3.class);
        hashMap.put(Class.class, o81.class);
        s37 s37Var = s37.c;
        hashMap.put(Void.class, s37Var);
        hashMap.put(Void.TYPE, s37Var);
        return hashMap.entrySet();
    }
}
