package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: CCTDestination.java */
/* loaded from: classes2.dex */
public final class a implements yg3 {
    static final String c;
    static final String d;
    private static final String e;
    private static final Set<eh3> f;
    public static final a g;
    public static final a h;
    @NonNull
    private final String a;
    private final String b;

    static {
        String a = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d = a2;
        String a3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = a3;
        f = Collections.unmodifiableSet(new HashSet(Arrays.asList(eh3.b("proto"), eh3.b("json"))));
        g = new a(a, null);
        h = new a(a2, a3);
    }

    public a(@NonNull String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @NonNull
    public static a c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // defpackage.yg3
    public Set<eh3> a() {
        return f;
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    @NonNull
    public String e() {
        return this.a;
    }

    @Override // defpackage.k13
    public byte[] getExtras() {
        return b();
    }

    @Override // defpackage.k13
    @NonNull
    public String getName() {
        return "cct";
    }
}
