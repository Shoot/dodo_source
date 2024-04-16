package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.k;
/* loaded from: classes3.dex */
public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set shake128 = new HashSet();
    private static Set shake256 = new HashSet();
    private static Map oids = new HashMap();

    static {
        md5.add("MD5");
        Set set = md5;
        k kVar = co7.C0;
        set.add(kVar.H());
        sha1.add("SHA1");
        sha1.add("SHA-1");
        Set set2 = sha1;
        k kVar2 = g47.i;
        set2.add(kVar2.H());
        sha224.add("SHA224");
        sha224.add("SHA-224");
        Set set3 = sha224;
        k kVar3 = ms6.f;
        set3.add(kVar3.H());
        sha256.add("SHA256");
        sha256.add("SHA-256");
        Set set4 = sha256;
        k kVar4 = ms6.c;
        set4.add(kVar4.H());
        sha384.add("SHA384");
        sha384.add("SHA-384");
        Set set5 = sha384;
        k kVar5 = ms6.d;
        set5.add(kVar5.H());
        sha512.add("SHA512");
        sha512.add("SHA-512");
        Set set6 = sha512;
        k kVar6 = ms6.e;
        set6.add(kVar6.H());
        sha512_224.add("SHA512(224)");
        sha512_224.add("SHA-512(224)");
        Set set7 = sha512_224;
        k kVar7 = ms6.g;
        set7.add(kVar7.H());
        sha512_256.add("SHA512(256)");
        sha512_256.add("SHA-512(256)");
        Set set8 = sha512_256;
        k kVar8 = ms6.h;
        set8.add(kVar8.H());
        sha3_224.add("SHA3-224");
        Set set9 = sha3_224;
        k kVar9 = ms6.i;
        set9.add(kVar9.H());
        sha3_256.add("SHA3-256");
        Set set10 = sha3_256;
        k kVar10 = ms6.j;
        set10.add(kVar10.H());
        sha3_384.add("SHA3-384");
        Set set11 = sha3_384;
        k kVar11 = ms6.k;
        set11.add(kVar11.H());
        sha3_512.add("SHA3-512");
        Set set12 = sha3_512;
        k kVar12 = ms6.l;
        set12.add(kVar12.H());
        shake128.add("SHAKE128");
        Set set13 = shake128;
        k kVar13 = ms6.m;
        set13.add(kVar13.H());
        shake256.add("SHAKE256");
        Set set14 = shake256;
        k kVar14 = ms6.n;
        set14.add(kVar14.H());
        oids.put("MD5", kVar);
        oids.put(kVar.H(), kVar);
        oids.put("SHA1", kVar2);
        oids.put("SHA-1", kVar2);
        oids.put(kVar2.H(), kVar2);
        oids.put("SHA224", kVar3);
        oids.put("SHA-224", kVar3);
        oids.put(kVar3.H(), kVar3);
        oids.put("SHA256", kVar4);
        oids.put("SHA-256", kVar4);
        oids.put(kVar4.H(), kVar4);
        oids.put("SHA384", kVar5);
        oids.put("SHA-384", kVar5);
        oids.put(kVar5.H(), kVar5);
        oids.put("SHA512", kVar6);
        oids.put("SHA-512", kVar6);
        oids.put(kVar6.H(), kVar6);
        oids.put("SHA512(224)", kVar7);
        oids.put("SHA-512(224)", kVar7);
        oids.put(kVar7.H(), kVar7);
        oids.put("SHA512(256)", kVar8);
        oids.put("SHA-512(256)", kVar8);
        oids.put(kVar8.H(), kVar8);
        oids.put("SHA3-224", kVar9);
        oids.put(kVar9.H(), kVar9);
        oids.put("SHA3-256", kVar10);
        oids.put(kVar10.H(), kVar10);
        oids.put("SHA3-384", kVar11);
        oids.put(kVar11.H(), kVar11);
        oids.put("SHA3-512", kVar12);
        oids.put(kVar12.H(), kVar12);
        oids.put("SHAKE128", kVar13);
        oids.put(kVar13.H(), kVar13);
        oids.put("SHAKE256", kVar14);
        oids.put(kVar14.H(), kVar14);
    }

    public static e23 getDigest(String str) {
        String j = a0b.j(str);
        if (sha1.contains(j)) {
            return f23.b();
        }
        if (md5.contains(j)) {
            return f23.a();
        }
        if (sha224.contains(j)) {
            return f23.c();
        }
        if (sha256.contains(j)) {
            return f23.d();
        }
        if (sha384.contains(j)) {
            return f23.e();
        }
        if (sha512.contains(j)) {
            return f23.j();
        }
        if (sha512_224.contains(j)) {
            return f23.k();
        }
        if (sha512_256.contains(j)) {
            return f23.l();
        }
        if (sha3_224.contains(j)) {
            return f23.f();
        }
        if (sha3_256.contains(j)) {
            return f23.g();
        }
        if (sha3_384.contains(j)) {
            return f23.h();
        }
        if (sha3_512.contains(j)) {
            return f23.i();
        }
        if (shake128.contains(j)) {
            return f23.m();
        }
        if (shake256.contains(j)) {
            return f23.n();
        }
        return null;
    }

    public static k getOID(String str) {
        return (k) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        if ((sha1.contains(str) && sha1.contains(str2)) || ((sha224.contains(str) && sha224.contains(str2)) || ((sha256.contains(str) && sha256.contains(str2)) || ((sha384.contains(str) && sha384.contains(str2)) || ((sha512.contains(str) && sha512.contains(str2)) || ((sha512_224.contains(str) && sha512_224.contains(str2)) || ((sha512_256.contains(str) && sha512_256.contains(str2)) || ((sha3_224.contains(str) && sha3_224.contains(str2)) || ((sha3_256.contains(str) && sha3_256.contains(str2)) || ((sha3_384.contains(str) && sha3_384.contains(str2)) || ((sha3_512.contains(str) && sha3_512.contains(str2)) || (md5.contains(str) && md5.contains(str2))))))))))))) {
            return true;
        }
        return false;
    }
}
