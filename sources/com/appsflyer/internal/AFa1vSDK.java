package com.appsflyer.internal;
/* loaded from: classes.dex */
public class AFa1vSDK {
    public static byte AppsFlyer2dXConversionCallback = 0;
    public static byte[] afErrorLogForExcManagerOnly = null;
    private static Object init = null;
    public static byte[] onAppOpenAttributionNative = null;
    private static int onConversionDataSuccess = 0;
    public static final int onDeepLinkingNative = 0;
    public static long onInstallConversionDataLoadedNative = 0;
    private static Object onInstallConversionFailureNative = null;
    public static final byte[] onResponseErrorNative = null;
    private static int onResponseNative = 1;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0078 -> B:24:0x008a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r9, short r10, short r11) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.$$c(byte, short, short):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:531:0x13f9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    private AFa1vSDK() {
    }

    public static int AFInAppEventParameterName(int i) {
        int i2 = onConversionDataSuccess;
        int i3 = (i2 ^ 95) + ((i2 & 95) << 1);
        int i4 = i3 % 128;
        onResponseNative = i4;
        if (i3 % 2 != 0) {
            Object obj = init;
            int i5 = ((i4 | 41) << 1) - (i4 ^ 41);
            int i6 = i5 % 128;
            onConversionDataSuccess = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 33;
            onResponseNative = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr = {Integer.valueOf(i)};
                byte[] bArr = onResponseErrorNative;
                int intValue = ((Integer) Class.forName($$c(bArr[71], (short) 882, bArr[14]), true, (ClassLoader) onInstallConversionFailureNative).getMethod($$c((byte) 77, (short) 235, bArr[585]), Integer.TYPE).invoke(obj, objArr)).intValue();
                int i10 = onConversionDataSuccess;
                int i11 = ((i10 | 73) << 1) - (i10 ^ 73);
                onResponseNative = i11 % 128;
                if (i11 % 2 != 0) {
                    return intValue;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    public static int AFInAppEventType(Object obj) {
        int i = onResponseNative;
        int i2 = (i ^ 41) + ((i & 41) << 1);
        int i3 = i2 % 128;
        onConversionDataSuccess = i3;
        if (i2 % 2 == 0) {
            Object obj2 = init;
            int i4 = i3 + 59;
            onResponseNative = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 63;
            onResponseNative = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr = {obj};
                byte[] bArr = onResponseErrorNative;
                Class<?> cls = Class.forName($$c(bArr[71], (short) 882, bArr[14]), true, (ClassLoader) onInstallConversionFailureNative);
                byte b = bArr[5];
                int intValue = ((Integer) cls.getMethod($$c(b, (short) ((b ^ 674) | (b & 674)), bArr[515]), Object.class).invoke(obj2, objArr)).intValue();
                int i8 = onResponseNative + 27;
                onConversionDataSuccess = i8 % 128;
                if (i8 % 2 == 0) {
                    return intValue;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    static void init$0() {
        int i;
        int i2 = onConversionDataSuccess;
        int i3 = (i2 & 103) + (i2 | 103);
        onResponseNative = i3 % 128;
        if (i3 % 2 == 0) {
            byte[] bArr = new byte[1087];
            System.arraycopy("\bóØ\u001eú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\nø\u0012\u0006õ\u0002ñ\u0016ÿ\u000e\u000bø\u0007û\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓIßô\nÜ\u0003\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓIßô\nÜ\u0003\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\b\u0006(Ö2\u0003Ø4ò\f\tã(úøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓHàô\nÜAú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016\u0010ù\u0011\u0000ýþÍKöÿ\u0015º \u001d\u0017Ï4ò\f\tú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\tý\u0017Í/ø\u0004ä/\u0000\u0001é$\u0001ú\bü\u0010ù\u0011\u0000ýþÍD\u0007¾()ý\u0004ô\u000bÙ,\u0006÷\u000bû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\tö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006î\u000e\fóí\u001aö\u0011ÿ\u0000\ròñ\u0019\u0014îú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0010ù\u0011\u0000ýþÍIô\u0016ÿ½)\u0014\u0016ÿä\"ø\u0006\nô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0001\u0012ã!ú\u0007\u0003û\u0002ë\u001c\fü\u0010÷\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1087);
            onResponseErrorNative = bArr;
            i = 94;
        } else {
            byte[] bArr2 = new byte[1087];
            System.arraycopy("\bóØ\u001eú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\nø\u0012\u0006õ\u0002ñ\u0016ÿ\u000e\u000bø\u0007û\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓIßô\nÜ\u0003\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓIßô\nÜ\u0003\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\tøø\b\u0006(Ö2\u0003Ø4ò\f\tã(úøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓHàô\nÜAú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016\u0010ù\u0011\u0000ýþÍKöÿ\u0015º \u001d\u0017Ï4ò\f\tú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\tý\u0017Í/ø\u0004ä/\u0000\u0001é$\u0001ú\bü\u0010ù\u0011\u0000ýþÍD\u0007¾()ý\u0004ô\u000bÙ,\u0006÷\u000bû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\tö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006î\u000e\fóí\u001aö\u0011ÿ\u0000\ròñ\u0019\u0014îú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0010ù\u0011\u0000ýþÍIô\u0016ÿ½)\u0014\u0016ÿä\"ø\u0006\nô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0001\u0012ã!ú\u0007\u0003û\u0002ë\u001c\fü\u0010÷\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1087);
            onResponseErrorNative = bArr2;
            i = 45;
        }
        onDeepLinkingNative = i;
        int i4 = onResponseNative;
        int i5 = (i4 ^ 83) + ((i4 & 83) << 1);
        onConversionDataSuccess = i5 % 128;
        int i6 = i5 % 2;
    }

    public static Object AFInAppEventType(int i, int i2, char c) {
        int i3 = onConversionDataSuccess;
        int i4 = i3 + 101;
        onResponseNative = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = init;
            int i5 = (i3 & 107) + (i3 | 107);
            onResponseNative = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
                byte[] bArr = onResponseErrorNative;
                Class<?> cls = Class.forName($$c(bArr[71], (short) 882, bArr[14]), true, (ClassLoader) onInstallConversionFailureNative);
                byte b = bArr[5];
                String $$c = $$c(b, (short) ((b ^ 674) | (b & 674)), bArr[515]);
                Class<?> cls2 = Integer.TYPE;
                return cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }
}
