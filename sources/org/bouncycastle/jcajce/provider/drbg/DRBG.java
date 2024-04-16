package org.bouncycastle.jcajce.provider.drbg;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
/* loaded from: classes3.dex */
public class DRBG {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class CoreSecureRandom extends SecureRandom {
        CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    /* loaded from: classes3.dex */
    private static class HybridRandomProvider extends Provider {
        protected HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class HybridSecureRandom extends SecureRandom {
        private final SecureRandom baseRandom;
        private final xq9 drbg;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        /* loaded from: classes3.dex */
        private class SignallingEntropySource implements hj3 {
            private final int byteLength;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            /* loaded from: classes3.dex */
            private class EntropyGatherer implements Runnable {
                private final int numBytes;

                EntropyGatherer(int i) {
                    this.numBytes = i;
                }

                private void sleep(long j) {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    String b = pq8.b("org.bouncycastle.drbg.gather_pause_secs");
                    long j = 5000;
                    if (b != null) {
                        try {
                            j = Long.parseLong(b) * 1000;
                        } catch (Exception unused) {
                        }
                    }
                    int i = this.numBytes;
                    byte[] bArr = new byte[i];
                    for (int i2 = 0; i2 < SignallingEntropySource.this.byteLength / 8; i2++) {
                        sleep(j);
                        byte[] generateSeed = HybridSecureRandom.this.baseRandom.generateSeed(8);
                        System.arraycopy(generateSeed, 0, bArr, i2 * 8, generateSeed.length);
                    }
                    int i3 = SignallingEntropySource.this.byteLength - ((SignallingEntropySource.this.byteLength / 8) * 8);
                    if (i3 != 0) {
                        sleep(j);
                        byte[] generateSeed2 = HybridSecureRandom.this.baseRandom.generateSeed(i3);
                        System.arraycopy(generateSeed2, 0, bArr, i - generateSeed2.length, generateSeed2.length);
                    }
                    SignallingEntropySource.this.entropy.set(bArr);
                    HybridSecureRandom.this.seedAvailable.set(true);
                }
            }

            SignallingEntropySource(int i) {
                this.byteLength = (i + 7) / 8;
            }

            @Override // defpackage.hj3
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // defpackage.hj3
            public byte[] getEntropy() {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr != null && bArr.length == this.byteLength) {
                    this.scheduled.set(false);
                } else {
                    bArr = HybridSecureRandom.this.baseRandom.generateSeed(this.byteLength);
                }
                if (!this.scheduled.getAndSet(true)) {
                    Thread thread = new Thread(new EntropyGatherer(this.byteLength));
                    thread.setDaemon(true);
                    thread.start();
                }
                return bArr;
            }

            public boolean isPredictionResistant() {
                return true;
            }
        }

        HybridSecureRandom() {
            super(null, new HybridRandomProvider());
            this.seedAvailable = new AtomicBoolean(false);
            this.samples = new AtomicInteger(0);
            SecureRandom access$400 = DRBG.access$400();
            this.baseRandom = access$400;
            this.drbg = new yq9(new ij3() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.1
                @Override // defpackage.ij3
                public hj3 get(int i) {
                    return new SignallingEntropySource(i);
                }
            }).g(a0b.e("Bouncy Castle Hybrid Entropy Source")).c(new qj4(new gq9()), access$400.generateSeed(32), false);
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.samples.getAndIncrement() > 20 && this.seedAvailable.getAndSet(false)) {
                this.samples.set(0);
                this.drbg.a(null);
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
            xq9 xq9Var = this.drbg;
            if (xq9Var != null) {
                xq9Var.setSeed(j);
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            xq9 xq9Var = this.drbg;
            if (xq9Var != null) {
                xq9Var.setSeed(bArr);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    /* loaded from: classes3.dex */
    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class URLSeededSecureRandom extends SecureRandom {
        private final InputStream seedStream;

        URLSeededSecureRandom(final URL url) {
            super(null, new HybridRandomProvider());
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return FirebasePerfUrlConnection.openStream(url);
                    } catch (IOException unused) {
                        throw new IllegalStateException("unable to open random source");
                    }
                }
            });
        }

        private int privilegedRead(final byte[] bArr, final int i, final int i2) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededSecureRandom.this.seedStream.read(bArr, i, i2));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            byte[] bArr;
            synchronized (this) {
                try {
                    bArr = new byte[i];
                    int i2 = 0;
                    while (i2 != i) {
                        int privilegedRead = privilegedRead(bArr, i2, i - i2);
                        if (privilegedRead <= -1) {
                            break;
                        }
                        i2 += privilegedRead;
                    }
                    if (i2 != i) {
                        throw new InternalError("unable to fully read random source");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j) {
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
        }
    }

    static /* synthetic */ SecureRandom access$000() {
        return createCoreSecureRandom();
    }

    static /* synthetic */ SecureRandom access$400() {
        return createInitialEntropySource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z) {
        byte[] generateNonceIVPersonalizationString;
        byte[] generateNonceIVPersonalizationString2;
        if (pq8.b("org.bouncycastle.drbg.entropysource") != null) {
            ij3 createEntropySource = createEntropySource();
            hj3 hj3Var = createEntropySource.get(128);
            byte[] entropy = hj3Var.getEntropy();
            if (z) {
                generateNonceIVPersonalizationString2 = generateDefaultPersonalizationString(entropy);
            } else {
                generateNonceIVPersonalizationString2 = generateNonceIVPersonalizationString(entropy);
            }
            return new yq9(createEntropySource).g(generateNonceIVPersonalizationString2).d(new gq9(), tr.p(hj3Var.getEntropy(), hj3Var.getEntropy()), z);
        }
        HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
        byte[] generateSeed = hybridSecureRandom.generateSeed(16);
        if (z) {
            generateNonceIVPersonalizationString = generateDefaultPersonalizationString(generateSeed);
        } else {
            generateNonceIVPersonalizationString = generateNonceIVPersonalizationString(generateSeed);
        }
        return new yq9(hybridSecureRandom, true).g(generateNonceIVPersonalizationString).d(new gq9(), hybridSecureRandom.generateSeed(32), z);
    }

    private static SecureRandom createCoreSecureRandom() {
        if (Security.getProperty("securerandom.source") == null) {
            return new CoreSecureRandom(findSource());
        }
        try {
            return new URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception unused) {
            return new CoreSecureRandom(findSource());
        }
    }

    private static ij3 createEntropySource() {
        final String b = pq8.b("org.bouncycastle.drbg.entropysource");
        return (ij3) AccessController.doPrivileged(new PrivilegedAction<ij3>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ij3 run() {
                try {
                    return (ij3) ClassUtil.loadClass(DRBG.class, b).newInstance();
                } catch (Exception e) {
                    throw new IllegalStateException("entropy source " + b + " not created: " + e.getMessage(), e);
                }
            }
        });
    }

    private static SecureRandom createInitialEntropySource() {
        if (((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue()) {
            return (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
                @Override // java.security.PrivilegedAction
                public SecureRandom run() {
                    try {
                        return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
                    } catch (Exception unused) {
                        return DRBG.access$000();
                    }
                }
            });
        }
        return createCoreSecureRandom();
    }

    private static final Object[] findSource() {
        int i = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i < strArr.length) {
                String[] strArr2 = strArr[i];
                try {
                    return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
                } catch (Throwable unused) {
                    i++;
                }
            } else {
                return null;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return tr.r(a0b.e("Default"), bArr, mo7.u(Thread.currentThread().getId()), mo7.u(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return tr.r(a0b.e("Nonce"), bArr, mo7.y(Thread.currentThread().getId()), mo7.y(System.currentTimeMillis()));
    }
}
