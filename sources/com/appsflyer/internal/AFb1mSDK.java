package com.appsflyer.internal;
/* loaded from: classes.dex */
public class AFb1mSDK {
    public static byte[] onPause = null;
    public static final byte[] setAndroidIdData = null;
    private static int setCustomerUserId = 0;
    private static Object setDebugLog = null;
    public static int setImeiData = 0;
    public static int setOaidData = 0;
    public static final int setPhoneNumber = 0;
    public static byte[] stop = null;
    private static Object updateServerUninstallToken = null;
    private static int waitForCustomerUserId = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:11:0x006f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, int r8, int r9) {
        /*
            int r0 = com.appsflyer.internal.AFb1mSDK.waitForCustomerUserId
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1mSDK.setCustomerUserId = r1
            int r0 = r0 % 2
            byte[] r0 = com.appsflyer.internal.AFb1mSDK.setAndroidIdData
            int r9 = -r9
            int r9 = ~r9
            int r9 = 1054 - r9
            int r8 = -r8
            r2 = r8 | 119(0x77, float:1.67E-43)
            int r2 = r2 << 1
            r8 = r8 ^ 119(0x77, float:1.67E-43)
            int r2 = r2 - r8
            int r7 = -r7
            r8 = r7 | 36
            int r8 = r8 << 1
            r7 = r7 ^ 36
            int r8 = r8 - r7
            byte[] r7 = new byte[r8]
            r3 = r8 | (-119(0xffffffffffffff89, float:NaN))
            int r3 = r3 << 1
            r8 = r8 ^ (-119(0xffffffffffffff89, float:NaN))
            int r3 = r3 - r8
            r8 = r3 & 118(0x76, float:1.65E-43)
            r3 = r3 | 118(0x76, float:1.65E-43)
            int r8 = r8 + r3
            r3 = 0
            if (r0 != 0) goto L4c
            int r1 = r1 + 105
            int r4 = r1 % 128
            com.appsflyer.internal.AFb1mSDK.waitForCustomerUserId = r4
            int r1 = r1 % 2
            r1 = r4 | 113(0x71, float:1.58E-43)
            int r1 = r1 << 1
            r4 = r4 ^ 113(0x71, float:1.58E-43)
            int r1 = r1 - r4
            int r4 = r1 % 128
            com.appsflyer.internal.AFb1mSDK.setCustomerUserId = r4
            int r1 = r1 % 2
            r1 = r0
            r4 = r2
            r2 = 0
            r0 = r9
            r9 = r8
            goto L6f
        L4c:
            r1 = 0
        L4d:
            byte r4 = (byte) r2
            r7[r1] = r4
            if (r1 != r8) goto L62
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7, r3)
            int r7 = com.appsflyer.internal.AFb1mSDK.setCustomerUserId
            int r7 = r7 + 49
            int r9 = r7 % 128
            com.appsflyer.internal.AFb1mSDK.waitForCustomerUserId = r9
            int r7 = r7 % 2
            return r8
        L62:
            int r9 = r9 + 1
            int r1 = r1 + 1
            r4 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r6
        L6f:
            int r8 = -r8
            int r8 = -r8
            int r8 = -r8
            r5 = r4 | r8
            int r5 = r5 << 1
            r8 = r8 ^ r4
            int r5 = r5 - r8
            int r8 = ~r5
            int r4 = r5 << 1
            int r8 = r8 + r4
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r6
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1mSDK.$$c(short, int, int):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:1|2|3|(1:5)(1:662)|6|7|8|(35:10|(34:652|653|(32:648|649|(30:644|645|17|(2:19|(2:634|635))(1:(1:641)(2:642|643))|(3:22|23|24)|(3:27|28|29)|30|31|32|33|34|(18:632|38|(1:40)(1:629)|41|(1:43)(1:628)|44|45|(2:47|(9:49|50|51|(1:53)(1:626)|54|55|(5:59|(20:65|66|67|(3:69|70|(5:(7:73|74|75|76|77|78|(1:592))(2:607|608)|593|594|595|596)(3:609|610|611))(1:614)|(14:489|490|491|492|493|494|495|496|497|498|499|(14:(1:502)(2:568|(1:570)(1:(1:572)(1:573)))|503|504|505|506|507|508|(2:(6:511|512|513|(1:515)(1:519)|516|517)(2:522|523)|518)|524|525|(3:527|528|529)(2:533|(2:535|(2:537|538)(3:539|540|541))(1:(3:543|544|545)(9:546|547|548|549|550|551|552|553|532)))|530|531|532)|574|575)(1:81)|82|83|84|85|86|87|88|89|90|91|92|93|94|95|(13:96|97|98|99|100|101|(13:103|104|105|106|107|108|109|110|111|112|113|114|115)(8:464|465|466|467|468|469|470|471)|116|117|118|(39:330|331|(1:333)(1:447)|(1:335)(1:446)|336|337|338|339|340|(1:(10:342|343|344|345|346|347|348|349|350|(4:352|353|354|355)(1:357))(2:441|442))|358|359|360|361|362|363|364|365|366|367|368|369|370|371|372|373|374|375|376|377|378|379|380|381|382|383|384|(4:386|387|388|389)|390)(37:120|121|122|123|124|125|126|127|128|129|(7:130|131|132|133|134|135|(5:137|138|139|140|(7:142|143|144|145|146|147|148)(1:160))(1:316))|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|(3:182|183|184)|207|208|209|(1:211)|212)|(12:261|262|263|264|265|266|267|268|269|270|(1:272)|273)(4:214|215|216|217)|(15:219|220|221|222|223|224|225|226|227|228|229|230|231|232|233)(3:249|250|251)))(1:61)|62|63|64)|619|(1:621)(2:622|623)))|627|50|51|(0)(0)|54|55|(6:57|59|(0)(0)|62|63|64)|624|619|(0)(0))|37|38|(0)(0)|41|(0)(0)|44|45|(0)|627|50|51|(0)(0)|54|55|(0)|624|619|(0)(0))|16|17|(0)(0)|(0)|(3:27|28|29)|30|31|32|33|34|(1:36)(19:630|632|38|(0)(0)|41|(0)(0)|44|45|(0)|627|50|51|(0)(0)|54|55|(0)|624|619|(0)(0))|37|38|(0)(0)|41|(0)(0)|44|45|(0)|627|50|51|(0)(0)|54|55|(0)|624|619|(0)(0))|14|(0)|16|17|(0)(0)|(0)|(0)|30|31|32|33|34|(0)(0)|37|38|(0)(0)|41|(0)(0)|44|45|(0)|627|50|51|(0)(0)|54|55|(0)|624|619|(0)(0))|12|(0)|14|(0)|16|17|(0)(0)|(0)|(0)|30|31|32|33|34|(0)(0)|37|38|(0)(0)|41|(0)(0)|44|45|(0)|627|50|51|(0)(0)|54|55|(0)|624|619|(0)(0))|656|657|(0)|12|(0)|14|(0)|16|17|(0)(0)|(0)|(0)|30|31|32|33|34|(0)(0)|37|38|(0)(0)|41|(0)(0)|44|45|(0)|627|50|51|(0)(0)|54|55|(0)|624|619|(0)(0)|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018b A[Catch: Exception -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #100 {Exception -> 0x003b, blocks: (B:3:0x000f, B:5:0x0029, B:38:0x0137, B:48:0x018b, B:53:0x01ff, B:64:0x028a, B:66:0x02d7, B:73:0x030f, B:77:0x0318, B:81:0x0321, B:89:0x0338, B:93:0x0341, B:100:0x034f, B:714:0x174c, B:716:0x1750, B:717:0x175a, B:718:0x1760, B:44:0x013f, B:720:0x1774, B:721:0x17a8, B:63:0x0256, B:50:0x01d8, B:49:0x019e, B:45:0x0165, B:55:0x0213), top: B:810:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x174c A[Catch: Exception -> 0x003b, TRY_ENTER, TryCatch #100 {Exception -> 0x003b, blocks: (B:3:0x000f, B:5:0x0029, B:38:0x0137, B:48:0x018b, B:53:0x01ff, B:64:0x028a, B:66:0x02d7, B:73:0x030f, B:77:0x0318, B:81:0x0321, B:89:0x0338, B:93:0x0341, B:100:0x034f, B:714:0x174c, B:716:0x1750, B:717:0x175a, B:718:0x1760, B:44:0x013f, B:720:0x1774, B:721:0x17a8, B:63:0x0256, B:50:0x01d8, B:49:0x019e, B:45:0x0165, B:55:0x0213), top: B:810:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x17b3  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x17ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x1800  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:829:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034b  */
    static {
        /*
            Method dump skipped, instructions count: 6221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1mSDK.<clinit>():void");
    }

    private AFb1mSDK() {
    }

    public static int AFInAppEventParameterName(Object obj) {
        int i = waitForCustomerUserId + 71;
        int i2 = i % 128;
        setCustomerUserId = i2;
        int i3 = i % 2;
        Object obj2 = updateServerUninstallToken;
        int i4 = i2 + 79;
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 121;
        waitForCustomerUserId = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {obj};
            byte[] bArr = setAndroidIdData;
            int intValue = ((Integer) Class.forName($$c(bArr[7], bArr[44], (short) 345), true, (ClassLoader) setDebugLog).getMethod($$c(bArr[44], bArr[41], (short) 721), Object.class).invoke(obj2, objArr)).intValue();
            int i8 = waitForCustomerUserId;
            int i9 = ((i8 | 111) << 1) - (i8 ^ 111);
            setCustomerUserId = i9 % 128;
            if (i9 % 2 == 0) {
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

    static void init$0() {
        int i = waitForCustomerUserId + 73;
        setCustomerUserId = i % 128;
        int i2 = i % 2;
        byte[] bArr = new byte[1074];
        System.arraycopy("Dþ3Bó\u0001ü\u0003\u0006ì#ä(Ùü\rìËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<Ê6\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷í\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000òø\nðü\r\u0000\u0011ì\u0003ô÷\nû\u0007ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003ó\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\f\u0003ü\u001dÐ\bÿò\u0001ð-Üü\u0006ñ.Úöú\tþì(è\u0004\bô\u000e\u0001ð0áýú\u0002 Úö\f\u0003ü\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ó\nþ\u0005û\u0001ýú\u0002\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u0001ð0Ó\nþ!áýú\u0002 Úöù\n\núüÚ,Ðÿ*Î\u0010öù\u001fÚ\b\n\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0014ù\u0015÷\u0014û\u0013÷\u0014÷\u0017÷úüÚ,Ðÿ*Î\u0010öù#îî\u0010ó\u0007ð\u000eò#ìó\u0007\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþòò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð.Ì\u0003\u000eò\u0003\fô\u0018Þ\u0004ü\u0010ù\u0001 Úö\f\u0001î\u0004üø\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003óü\rü\u001fÞì\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óò\tñ\u0002\u0005\u00045¾ûDèÖ÷\fö\u0002\u0000\u0000\u0007öù\u0014ôö\u000fñò\tñ\u0002\u0005\u00045¾ûDÚÙ\u0005þ\u000e÷)Öü\u000b÷\u0007\u0001ø\u0001ð0Ö\níÿ&Ü\rüþòÊ\u0002ì\u00121Ê\u0002ì\u00121þø\u0006ð\u000eó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0Æ\u0016\u000eø&ÿ\u0001ð-\u0001\u000eøë\u0015úù\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000öüû\ró\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0Ã\u0019\u000eø&®ó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0Æ\u0016\u000eø&ÿËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<Ë5\bê\u00142Äù@¹\u0006ü\u000búö\u0001ð#Ý\u0002þ\nòýú\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003ü\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0001ò\u0016ä\bô\u000e\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000ò\tñ\u0002\u0005\u00045¹\u000eì\u0003EÙîì\u0003\u001eà\nüø\u000eì\u000b\u001bâõþ\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\bê\u00142Äù@çÜü\u0006\u0014ü\u0012÷ò\tñ\u0002\u0005\u00045¸\u0000\nü=ÙÚ\b\n\u0000\rôôö\u000fí\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004ü\u0004,È\u0004\u000e#Îÿ\u0010çü\rü Ö\níÿó\u0001>Ìðÿü\fùò\u0013ò\u0004\u0010ð\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó".getBytes("ISO-8859-1"), 0, bArr, 0, 1074);
        setAndroidIdData = bArr;
        setPhoneNumber = 205;
        int i3 = setCustomerUserId;
        int i4 = ((i3 | 63) << 1) - (i3 ^ 63);
        waitForCustomerUserId = i4 % 128;
        int i5 = i4 % 2;
    }

    public static int valueOf(int i) {
        int i2 = setCustomerUserId + 91;
        int i3 = i2 % 128;
        waitForCustomerUserId = i3;
        if (i2 % 2 != 0) {
            Object obj = updateServerUninstallToken;
            int i4 = (i3 & 99) + (i3 | 99);
            setCustomerUserId = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 55;
            setCustomerUserId = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr = {Integer.valueOf(i)};
                byte[] bArr = setAndroidIdData;
                return ((Integer) Class.forName($$c(bArr[7], bArr[44], (short) 345), true, (ClassLoader) setDebugLog).getMethod($$c(bArr[144], bArr[41], (short) 672), Integer.TYPE).invoke(obj, objArr)).intValue();
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

    public static Object values(int i, char c, int i2) {
        int i3 = setCustomerUserId;
        int i4 = ((i3 | 79) << 1) - (i3 ^ 79);
        waitForCustomerUserId = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = updateServerUninstallToken;
            int i5 = i3 + 101;
            waitForCustomerUserId = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr = {Integer.valueOf(i), Character.valueOf(c), Integer.valueOf(i2)};
                byte[] bArr = setAndroidIdData;
                Class<?> cls = Class.forName($$c(bArr[7], bArr[44], (short) 345), true, (ClassLoader) setDebugLog);
                String $$c = $$c(bArr[894], bArr[5], (short) 504);
                Class<?> cls2 = Integer.TYPE;
                Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
                int i7 = setCustomerUserId + 81;
                waitForCustomerUserId = i7 % 128;
                int i8 = i7 % 2;
                return invoke;
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
